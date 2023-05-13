package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/decagon/IdeaProjects/Projects/WordCount/src/main/java/gutenberg.txt");
        Scanner scanner = new Scanner(file);
        int wordCount = 0;
       while (scanner.hasNextLine()){
           String line = scanner.nextLine();
           wordCount += line.split(" ").length;
       }
        System.out.println(wordCount);
    }
}