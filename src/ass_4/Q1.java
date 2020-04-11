/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass_4;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 *
 * @author hp15 ac
 */
public class Q1 {

    public static void main(String[] args) {

        //a
        Consumer<Integer> print = (a) -> System.out.println(a);
        print.accept(5);

        //b
        Function<String, String> toUpperCase = String::toUpperCase;
        System.out.println(toUpperCase.apply("z"));

        //c
        Runnable JustRutern = () -> System.out.println("Welcome to lambdas!");
        JustRutern.run();

        //d
        Function<Integer, Integer> cubeNum = a -> (a * a * a);
        System.out.println(cubeNum.apply(3));

    }

}
