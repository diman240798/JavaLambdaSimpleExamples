import java.util.function.BiConsumer;

public class LambaWrapperExample {
    public static void main(String[] args) {
        int[] someNumbers = {1,2,3,4};
        int key = 0;

        process(someNumbers, key, lambaWrapper((v,k) ->  System.out.println(v / k)));
    }
    private static void process(int[] someNumbers, int key, BiConsumer<Integer,Integer> biConsumer) {
        for (int i : someNumbers){
            biConsumer.accept(i, key);
        }
    }
    private static BiConsumer<Integer, Integer> lambaWrapper(BiConsumer<Integer, Integer> biConsumer) {
        return (v,k) -> {
            try {
                biConsumer.accept(v,k);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        };
    }
}
