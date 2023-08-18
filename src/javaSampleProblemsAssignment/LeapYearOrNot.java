package javaSampleProblemsAssignment;

import java.util.Scanner;

public class LeapYearOrNot {
int year;
public void leapYear(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a year");
    int year=sc.nextInt();
   
    
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
      System.out.println(year+ " is a leap year");

}
    else{
    	System.out.println(year+" Not a leap year");
    }
}
    public static void main(String[] args) {
        LeapYearOrNot obj= new LeapYearOrNot();
        obj.leapYear();
    }

}

