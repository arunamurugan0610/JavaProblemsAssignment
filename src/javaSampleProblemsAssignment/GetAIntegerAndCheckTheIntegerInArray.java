package javaSampleProblemsAssignment;

import java.util.Scanner;

public class GetAIntegerAndCheckTheIntegerInArray {
    int a[]=new int[5];

    int i,b;
    boolean flag=false;
    public void arrayNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of array");
        for (i=0;i<a.length;i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a number");
        int b=sc.nextInt();
        {
            for (int c:a)
                if (b == c) {
                    flag = true;
                }
            if(flag==true) {
                System.out.println("present in array list");
            }else {
                System.out.println("not present in array list");
            }
        }
    }
    public static void main(String[] args) {
        GetAIntegerAndCheckTheIntegerInArray obj = new
                GetAIntegerAndCheckTheIntegerInArray();

        obj.arrayNumber();
    }
}
