package app.task1;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        HashSet<String> products = getInitData();
        getOutput("Initial data:", products);
        updateData(products);
        getOutput("Updated data:", products);
    }

    public static void updateData(Set<String> data) {
        data.add("grape");
    }

    public static HashSet<String> getInitData() {
        return new HashSet<>(Set.of("orange", "apple", "kiwi", "strawberry", "mango"));
    }

    public static void getOutput(String title, Set<String> products) {
        System.out.println(title);
        AtomicInteger counter = new AtomicInteger(1);
        products.forEach(product -> System.out.println(counter.getAndIncrement() + ") " + product));
        System.out.println();
    }
}
