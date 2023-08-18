package javaSampleProblemsAssignment;

import java.util.Scanner;

public class GetStudentNameAndGrade {
String studentName;
int grade;

    public void getStudentName(String studentName) {
        this.studentName=studentName;
        System.out.println("the student name is "+ studentName);
    }
    public void getgrade() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter percentage");
        int percentage;
        percentage = sc.nextInt();
        if(percentage<=90){
    System.out.println("grade of "+ studentName+" is A");
}else if((70>=percentage)&&(percentage<=89)){
    System.out.println("grade of "+ studentName+" is B");
}else if((88>=percentage)&&(percentage<=60)){
    System.out.println("grade of "+ studentName+" is C");
}else if((59>=percentage)&&(percentage<=40)){
    System.out.println("grade of "+ studentName+" is D");
}else{
    System.out.println("grade of "+ studentName+" is E");
}

    }
    public static void main(String[] args) {
        GetStudentNameAndGrade obj = new GetStudentNameAndGrade();
        obj.getStudentName("dhanush");
        obj.getgrade();
    }
}
