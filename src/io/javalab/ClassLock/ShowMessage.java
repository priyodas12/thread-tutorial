package io.javalab.ClassLock;

import java.util.stream.IntStream;

public class ShowMessage {

    String name;

    public ShowMessage(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static synchronized void wishMe(String name){
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
