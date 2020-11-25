package io.javalab.ClassLock;

public class ThreadTwo extends Thread{

    ShowMessage showMessage;
    String name;

    public ThreadTwo(ShowMessage showMessage, String name) {
        this.showMessage = showMessage;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("thread accessing "+showMessage.toString()+" object");
        ShowMessage.wishMe(name);
    }
}
