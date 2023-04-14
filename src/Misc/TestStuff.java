package Misc;

import java.util.Random;
import java.util.StringJoiner;
import java.util.function.Function;

public class TestStuff {
    public static void main(String[] args) {
        Measurable a = String::length;
        System.out.println(a.length("abc"));


        Function <String, Integer> toInteger = Integer::valueOf;
        Function <String, String> backToString = toInteger.andThen(String::valueOf);
        backToString.apply("123");

        StringJoiner joiner = new StringJoiner(".", "prefix-", "-suffix");
        for (String s : "Hello the brave world".split(" ")) {
            joiner.add(s);
        }
        System.out.println(joiner); //prefix-Hello.the.brave.world-suffix

        (new Random())
                .ints()
                .limit(10)
                .forEach(System.out::println);
    }

}

interface Measurable {
    public int length(String string);
}