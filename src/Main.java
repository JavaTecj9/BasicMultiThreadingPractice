public class Main {
    public static void main(String[] args){

        //Starting thread from a class that extends Thread class:
        ChildTask childthread1 = new ChildTask("Thread A");
        childthread1.start();

        ChildTask childthread2 = new ChildTask("Thread B");
        childthread2.start();

        ChildTask childthread3 = new ChildTask("Thread C");
        childthread3.start();
        }



    }

