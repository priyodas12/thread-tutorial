package io.javalab.ObjectLock;

import java.util.stream.IntStream;

public class Display {

    //object lock: single thread can access at a time of the display object.

    public synchronized void wish(String name){
        IntStream.range(0,3).forEach(i->{
            System.out.println("good morning..."+name+" by "+Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
