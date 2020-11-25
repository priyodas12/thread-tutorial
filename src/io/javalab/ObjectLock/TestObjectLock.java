package io.javalab.ObjectLock;

public class TestObjectLock {
    public static void main(String[] args) {

        // different thread will try to access single object resource almost in same time.

        Display d1=new Display();

        ThreadOne t1=new ThreadOne(d1,"abc");
        ThreadOne t2=new ThreadOne(d1,"bca");
        ThreadOne t3=new ThreadOne(d1,"cab");

        t1.start();
        t2.start();
        t3.start();

    }
}
