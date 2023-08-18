package javaSampleProblemsAssignment;

import java.util.Scanner;

public class PositiveOrNegative {
int a;
public int number(){
    Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        if(a>0){
            System.out.println(a+" is a positive number");
        }else if(a<0){
            System.out.println(a+" is a negative number");
        }else{
            System.out.println(a+" is zero");
        }
    return a;
}
    public static void main(String[] args) {
        PositiveOrNegative obj = new PositiveOrNegative();
        obj.number();
    }
}
