/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 *
 * @author hp15 ac
 */
public class Q2 {

    public static void main(String[] args) {

        Pattern p = Pattern.compile("");
        String path = System.getProperty("user.dir") + "\\src\\test.txt";//(Ismail Abu Al-Abd)-->this in  file
        try {
            Files.lines(Paths.get(path)).flatMap(text -> p.splitAsStream(text))
                 .collect(Collectors.groupingBy(String::toString, TreeMap::new, Collectors.counting()))
                 .forEach((character, count) -> System.out.println(character + " : " + count));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
