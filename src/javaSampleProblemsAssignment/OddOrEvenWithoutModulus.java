package javaSampleProblemsAssignment;

import java.util.Scanner;

public class OddOrEvenWithoutModulus {
    int a,num;
    public void oddOrEven(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
num=a/2;
        if(num*2==a){
            System.out.println(a+" is a even number");
        }else{
            System.out.println(a+" is odd number");
        }
    }

    public static void main(String[] args) {
        OddOrEvenWithoutModulus obj = new OddOrEvenWithoutModulus();
        obj.oddOrEven();
    }
}
