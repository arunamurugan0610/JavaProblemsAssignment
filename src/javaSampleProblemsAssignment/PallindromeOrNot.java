package javaSampleProblemsAssignment;

import java.util.Scanner;

public class PallindromeOrNot {
    String name;
    boolean flag=true;
    int i;
    public void pallindrome() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name");
        name = sc.nextLine();
        name=name.toLowerCase();
        boolean isPalindrome = true;
        int length = name.length();
        
        for (int i = 0; i < length / 2; i++) {
            if (name.charAt(i) != name.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        PallindromeOrNot obj= new PallindromeOrNot();
        obj.pallindrome();
    }
}
