package javaSampleProblemsAssignment;

import java.util.Scanner;

public class ArmStrongNumber {
    int num, sum = 0;
    int n,i;
    public void armstrongNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        n = sc.nextInt();
        int temp =n;
        while (n != 0) {
                num = n % 10;
                i = num * num * num;
                sum = sum + i;
                n = n / 10;
            }
            System.out.println(sum);
            if (sum == temp) {
                System.out.println(temp + " is a armstrong number");
            } else {
                System.out.println(temp + " is not a armstrong number");
            }
        }
    public static void main(String[] args) {
        ArmStrongNumber obj=new ArmStrongNumber();
        obj.armstrongNumber();
    }
}
