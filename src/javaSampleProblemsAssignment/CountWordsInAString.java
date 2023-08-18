package javaSampleProblemsAssignment;

import java.util.Scanner;

public class CountWordsInAString {
    static String text;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a text");
       String Text=sc.nextLine();
       int wordCount = countWords(text);
       System.out.println("Number of words in the text: " + wordCount);
   }

   public static int countWords(String text) {
       if (text == null || text.isEmpty()) {
           return 0;
       }

       // Split the text by whitespace to count words
       String[] words = text.trim().split("\\s+");
       return words.length;
   }
    }


