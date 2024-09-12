public class LambdaExamples {
    public static void main(String[] args) {
        // Generic Transformer
        Transformer<String, Integer> stringLength = s -> s.length();
        System.out.println("Length: " + stringLength.transform("Hello"));

        // Generic Processor
        Processor<Integer> printSquare = x -> System.out.println("Square: " + (x * x));
        printSquare.process(4);

        // Generic Combiner
        Combiner<Double> sumDoubles = (a, b) -> a + b;
        System.out.println("Sum: " + sumDoubles.combine(5.5, 6.5));
    }
}