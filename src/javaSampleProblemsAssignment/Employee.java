package javaSampleProblemsAssignment;

public class Employee {
    int salary,workingHours;
    public int getinfo(int salary, int workingHours) {
        this.salary=salary;
        this.workingHours=workingHours;
        return salary;
    }

    public void addSal() {
        if (salary<500) {
            System.out.println("add 10 dollars");
            salary=salary+10;
            System.out.println(salary);
        }else {
            System.out.println("no increment");
        }
    }
    public void addWorkingHours() {
        if(workingHours>6) {
            System.out.println("add 5 dollars");
            salary=salary+5;
            System.out.println(salary);
        }else {
            System.out.println("no increment");
        }
    }
    public static void main(String[] args) {
        Employee obj=new Employee();
        System.out.println(obj.getinfo(200, 8));
        obj.addSal();
        obj.addWorkingHours();
    }
}
