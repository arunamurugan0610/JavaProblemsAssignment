package javaSampleProblemsAssignment;

import java.util.Scanner;

public class OddOrEven {
    int num;

    public int number() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println(num+" is a even number");
        }else{
            System.out.println(num+" is odd number");
        }
        return num;
    }

    public static void main(String[] args) {
        OddOrEven obj = new OddOrEven();
        obj.number();
    }
}
