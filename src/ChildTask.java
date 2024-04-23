public class ChildTask extends Thread {

    public String name;

    public ChildTask(String name) {
        this.name = name;
    }

    //OverRides Run in Thread class
    public void run() {
        for (int i = 0; i < 100; i++) {
            Thread.currentThread().setName(this.name);
            System.out.println("Number: " + i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    }
