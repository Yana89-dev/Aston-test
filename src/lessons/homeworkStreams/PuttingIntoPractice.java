package lessons.homeworkStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PuttingIntoPractice {

    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );


        // 1. Найти все транзакции за 2011 год и отсортировать их по сумме (от меньшей к большей).
        List<Transaction> transactionList = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted((t1, t2) -> (t1.getValue() - t2.getValue()))
                .toList();

        System.out.println(transactionList);
        System.out.println();

        // 2. Вывести список неповторяющихся городов, в которых работают трейдеры.
        List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);
        traders.stream()
                .map(t -> t.getCity())
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        // 3. Найти всех трейдеров из Кембриджа и отсортировать их по именам.
        List<Trader> tradersFromCambridge =  traders.stream()
                .filter(t -> t.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .toList();
        System.out.println(tradersFromCambridge);
        System.out.println();

        // 4. Вернуть строку со всеми именами трейдеров, отсортированными в алфавитном порядке.
        String traderNames = traders.stream()
                .map(t -> t.getName())
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(traderNames);
        System.out.println();

        // 5. Выяснить, существует ли хоть один трейдер из Милана.
        boolean traderFromMilan = traders.stream()
                .anyMatch(t -> t.getCity().equals("Milan"));
        System.out.println(traderFromMilan);
        System.out.println();

        // 6. Вывести суммы всех транзакций трейдеров из Кембриджа.
        transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(t -> t.getValue())
                .forEach(System.out::println);
        System.out.println();

        // 7. Какова максимальная сумма среди всех транзакций?
        int maxSum = transactions.stream()
                .map(t -> t.getValue())
                .max(Integer::compare).get();
        System.out.println(maxSum);
        System.out.println();

        // 8. Найти транзакцию с минимальной суммой.
        Transaction transactionWithMinSum = transactions.stream()
                .min((t1, t2) -> (t1.getValue() - t2.getValue())).get();

        System.out.println(transactionWithMinSum.toString());
        System.out.println();
    }
}
