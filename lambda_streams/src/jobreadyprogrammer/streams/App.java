package jobreadyprogrammer.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws IOException {
        IntStream.range(1,10).skip(5).forEach(x -> System.out.println(x));

        int val = IntStream.range(1,5).sum();
        System.out.println(val);

        Stream.of("Hello", "bottle", "Africa")
                .sorted()
                .findFirst() //terminal operation
                .ifPresent(x -> System.out.println(x)); //to prevent null pointer exception. in case 1st one is null

        String[] items = {"car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy"};
        Stream.of(items)
                .filter(x -> x.startsWith("t"))
                .sorted()
                .forEach(x -> System.out.println(x + ", "));

        Arrays.stream(new int[] {2,4,6,8,10})
                .map(x -> x*x)
                .average() //terminal operation
                .ifPresent(n -> System.out.println(n)); //prevent null pointer exception

        List<String> items2 = Arrays.asList("Computer", "Toothpaste", "Box", "Pencil", "Car", "Tent", "Dove");
        items2.stream().map(x -> x.toLowerCase())
                .filter(x -> x.startsWith("c"))
                .sorted()
                .forEach(x -> System.out.println(x + ", "));

        System.out.println(Paths.get("data/wordFile.txt"));
        Path path = Paths.get("data/wordFile.txt");
        Stream<String> lines = Files.lines(path);

//        lines.sorted().filter(l -> l.length() > 6).forEach(l -> System.out.println(l + ", ")); //if sort first, then filter, takes more time
        lines.filter(l -> l.length() > 6).sorted().forEach(l -> System.out.println(l + ", "));
        lines.close();

        Path path2 = Paths.get("data/wordFile.txt");
        Stream<String> wordstream = Files.lines(path2);
        wordstream.filter(w -> w.contains("th")).collect(Collectors.toList());
        System.out.println(wordstream);

        Stream<String> famStream = Files.lines(Paths.get("data/fam.txt"));
        List<String> famList = famStream.collect(Collectors.toList());
        System.out.println(famList);
        famList.forEach(w -> System.out.println(w));

        Path stockPath = Paths.get("data/stocks.txt");
        Stream<String> stockstream = Files.lines(stockPath);
        List<String> stocks = stockstream.collect(Collectors.toList());
        System.out.println(stocks);
        stockstream.close();

        Stream<String> stockstream2 = Files.lines(stockPath);
        int rowCount = (int) stockstream2
                .map(s -> s.split(","))
                .filter(s -> s.length > 3)
                .count(); //count returns a long.
        System.out.println(rowCount + " good rows");

        Path famPath = Paths.get("data/fam.txt");
        Stream<String> stockstreamy = Files.lines(stockPath);
        List<String> stocky = stockstreamy.collect(Collectors.toList());
        System.out.println(stocky);
//        List<String[]> stocky = stockstreamy.map(s -> s.split(",")).collect(Collectors.toList());
//        System.out.println(Arrays.toString(stocky));


        Stream<String> stockstream3 = Files.lines(stockPath);
        List<String> stocklisty = stockstream3.map(s -> Arrays.toString(s.split(","))).collect(Collectors.toList());
        System.out.println(stocklisty);

        Stream<String> stockstream4 = Files.lines(stockPath);
        stockstream4.map(s -> s.split(",")).filter(row -> row.length > 3)
                .forEach(s -> System.out.println(s[0].trim() + " " + s[2].trim() + " " + s[3].trim()));
//                .forEach(s -> System.out.println(Arrays.toString(s)));












    }
}
