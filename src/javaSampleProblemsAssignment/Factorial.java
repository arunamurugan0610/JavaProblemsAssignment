package javaSampleProblemsAssignment;

import java.util.Scanner;

public class Factorial {
        int n,i;
        int num=1;
        public void factorial() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            n = sc.nextInt();
            for(i=1;i<=n;i++) {
                num=num*i;
            }
            System.out.println("the factorial of "+ n+" is "+ num);
        }
        public static void main(String[] args) {
            Factorial obj=new Factorial();
            obj.factorial();
        }
}
