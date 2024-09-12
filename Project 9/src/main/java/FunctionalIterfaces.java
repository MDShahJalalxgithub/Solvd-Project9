@FunctionalInterface
interface Transformer<T, R> {
    R transform(T input);
}

@FunctionalInterface
interface Processor<T> {
    void process(T input);
}

@FunctionalInterface
interface Combiner<T> {
    T combine(T a, T b);
}