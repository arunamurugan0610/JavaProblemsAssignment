package javaSampleProblemsAssignment;

import java.util.Scanner;

public class ReverseOrderArray {
    int a[] = new int[5];


    public void reverseOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        for(int i =a.length-1;i>=0;i--){
             System.out.println(a[i]);
    }
}
    public static void main(String[] args) {
        ReverseOrderArray obj = new ReverseOrderArray();
        obj.reverseOrder();
    }
}
