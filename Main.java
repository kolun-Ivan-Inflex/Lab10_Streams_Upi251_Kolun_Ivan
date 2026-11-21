import java.util.*;
import java.util.stream.Collectors;
public class Main {
    // Завдання 1.
    public static List<Integer> doubling(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }
        // Завдання 2.
        public static List<Integer> square(List<Integer> numbers) {
            return numbers.stream()
                    .map(n -> n * n)
                    .collect(Collectors.toList());
        }
            // Завдання 3.
            public static List<String> moreY(List<String> words) {
                return words.stream()
                        .map(s -> "y" + s + "y")
                        .collect(Collectors.toList());
            }
                // Завдання 4.
                public static List<Integer> noNeg(List<Integer> numbers) {
                    return numbers.stream()
                            .filter(n -> n >= 0)
                            .collect(Collectors.toList());
                }
                    // Завдання 5.
                    public static List<Integer> no9(List<Integer> numbers) {
                        return numbers.stream()
                                .filter(n -> Math.abs(n % 10) != 9)
                                .collect(Collectors.toList());
                    }
                        // Завдання 6.
                        public static List<String> noZ(List<String> words) {
                            return words.stream()
                                    .filter(s -> !s.toLowerCase().contains("z"))
                                    .collect(Collectors.toList());
                        }
                            // Завдання 7.
                            public static List<String> refinedStrings(List<String> words) {
                                return words.stream()
                                        .distinct()
                                        .sorted(Comparator.comparingInt(String::length).reversed())
                                        .collect(Collectors.toList());
                            }
                                // Завдання 8.
                                public static List<String> flatten(List<String> names) {
                                    return names.stream()
                                            .filter(s -> !s.trim().isEmpty())
                                            .flatMap(s -> Arrays.stream(s.trim().split("\\s+")))
                                            .collect(Collectors.toList());
                                }
    public static void main(String[] args) {
        System.out.println("Лабораторна робота №10");
        System.out.println("Потоки даних в Java\n");
            System.out.println("Завдання 1:");
            System.out.println(doubling(Arrays.asList(1, 2, 3)));
                System.out.println("\nЗавдання 2:");
                System.out.println(square(Arrays.asList(1, 2, 3)));
                    System.out.println("\nЗавдання 3:");
                    System.out.println(moreY(Arrays.asList("a", "b", "c")));
                        System.out.println("\nЗавдання 4:");
                        System.out.println(noNeg(Arrays.asList(1, -2, 3, -4)));
                            System.out.println("\nЗавдання 5:");
                            System.out.println(no9(Arrays.asList(1, 2, 19, 29, 3)));
                                System.out.println("\nЗавдання 6:");
                                System.out.println(noZ(Arrays.asList("aaa", "bbb", "aza")));
                                    System.out.println("\nЗавдання 7:");
                                    System.out.println(refinedStrings(Arrays.asList("aa", "c", "aa", "bbb")));
                                        System.out.println("\nЗавдання 8:");
                                        System.out.println(flatten(Arrays.asList(
                                                "John Wick", "John Snow", "AlexMurphy"
                                        )));
    }
}
