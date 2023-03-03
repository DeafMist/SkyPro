package course4.lesson1;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task {
    public static void main(String[] args) {

    }

    private static <T> void findMinMax(Stream<? extends T> stream,
                           Comparator<? super T> order,
                           BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> temp = stream.collect(Collectors.toList());
        T min = stream.min(order).orElse(null);
        T max = stream.max(order).orElse(null);
        minMaxConsumer.accept(min, max);
    }

    private static void getEvenNumbers(List<Integer> numbers) {
        numbers.stream().filter(i -> i % 2 == 0).map(Object::toString).forEach(System.out::println);
    }
}
