package Stream.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> plueOneList = list.stream().map(n -> {return n + 1;}).collect(Collectors.toList());
        System.out.println(plueOneList);
    }
}
