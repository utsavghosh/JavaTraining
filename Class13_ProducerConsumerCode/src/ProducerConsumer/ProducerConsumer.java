package ProducerConsumer;

import java.util.LinkedList;
//Producer task
class Producer implements Runnable{
LinkedList<Integer> list;
Producer(LinkedList<Integer> list){
 this.list = list;
}
@Override
public void run() {
 for(int i = 1; i <= 5; i++){
   synchronized(list) {
     // If there is already an element in the list wait
     while(list.size() >= 1){
       System.out.println("Queue full. Waiting for consumer to consume");
       try {
         list.wait();
       } catch (InterruptedException e) {
         e.printStackTrace();
       }
     }
     System.out.println("Adding to queue- " + Thread.currentThread().getName() + " " + i);
     list.add(i);
     list.notify();    
   }
 }		
}
}
//Consumer task
class Consumer implements Runnable{
LinkedList<Integer> list;
Consumer(LinkedList<Integer> list){
 this.list = list;
}
@Override
public void run() {
 for(int i = 1; i <= 5; i++){
   synchronized(list) {
     // if there is no element in the list wait
     while(list.size() < 1){
       System.out.println("Queue empty. Waiting for producer to produce");
       try {
         list.wait();
       } catch (InterruptedException e) {
         e.printStackTrace();
       }
     }
     // if there is element in the list then retrieve it
     System.out.println("Consuming from queue- " + Thread.currentThread().getName() + " " + list.remove());
     list.notify();  
   }
 }		
}
}

public class ProducerConsumer {
public static void main(String[] args) {
 // shared list
 LinkedList<Integer> list = new LinkedList<Integer>();
 Thread t1 = new Thread(new Producer(list), "Producer");
 Thread t2 = new Thread(new Consumer(list), "Consumer");
 t1.start();
 t2.start(); 
}
}
