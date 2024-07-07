/*🔸 Here we are creating user-defined Thread class and calling constructor of superclass "Thread" to name the thread */

package Multithreading.MethodsOfThreadClass;

class MyThread extends Thread
{
    public MyThread(String name){
        super(name);
    }
}

public class NamingThread {
    public static void main(String[] args) {

        MyThread t = new MyThread("Thread1");

        System.out.println("ID Name: " + t.threadId());                 //1️⃣ getID() method has been deprecated from version 19, and now we'll be using threadID() method.

        System.out.println("Name of thread : " + t.getName());          //2️⃣ getName() method return the name of thread.

        System.out.println("Priority of thread: " + t.getPriority());   //3️⃣ getPriority() method return the priority of thread which is 5 by default and ranges between 1 and 10.

        System.out.println("State of Thread: " + t.getState());         //4️⃣ getState() method return the current state of thread (new, ready, running, terminated)
    }
}

/*
🔶 Output:

ID Name: 21
Name of thread: Thread1
Priority of thread: 5
State of Thread: NEW

*/