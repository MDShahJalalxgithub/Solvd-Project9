import java.util.function.*;

public class FunctionalExamples {
    public static void main(String[] args) {
        // Predicate
        Predicate<String> isLongerThan5 = s -> s.length() > 5;
        System.out.println(isLongerThan5.test("HelloWorld"));

        // Consumer
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        printUpperCase.accept("hello");

        // Supplier
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

        // Function
        Function<Integer, String> intToString = i -> "Number: " + i;
        System.out.println(intToString.apply(10));

        // BiFunction
        BiFunction<Integer, Integer, String> sumToString = (a, b) -> "Sum: " + (a + b);
        System.out.println(sumToString.apply(3, 7));
    }
}