
public class ClosuresExample {
    public static void main(String[] args) {
        int a = 10;
        final int b = 20; // Should be final, then it will be passed

        doProcess(a, p -> System.out.println(a + b));
    }
    private static void doProcess(int i, Process p){
        p.process(i);
    }

    interface Process {
        void process(int i);
    }
}