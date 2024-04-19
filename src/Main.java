public class Main {
    public static void main(String[] args) {

        ChildTask childthread1 = new ChildTask();
        childthread1.start();

        for(int i=0; i < 1000; i++) {
            System.out.println("Main Thread");
        }


    }
}