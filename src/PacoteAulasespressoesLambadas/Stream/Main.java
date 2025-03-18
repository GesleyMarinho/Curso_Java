package PacoteAulasEspressoesLambadas.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String args[]) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria", "bob","Alex");

        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        int y = 0;
        int a = 1;

        Stream<Long> st4 = Stream.iterate(new Long[]{0l, 1l}, p -> new Long[] {p[1], p[0] + p[1]}).map(p-> p[0]).limit(10);

        System.out.println(Arrays.toString(st4.limit(10).toArray()));
    }
}
