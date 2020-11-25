package io.javalab.ClassLock;

public class TestClassLock {
    public static void main(String[] args) {

        ShowMessage s1=new ShowMessage("s1");
        ShowMessage s2=new ShowMessage("s2");
        ShowMessage s3=new ShowMessage("s3");

        ThreadTwo t1=new ThreadTwo(s1,"abc");
        ThreadTwo t2=new ThreadTwo(s2,"bca");
        ThreadTwo t3=new ThreadTwo(s3,"cab");

        t1.start();
        t2.start();
        t3.start();
    }
}
