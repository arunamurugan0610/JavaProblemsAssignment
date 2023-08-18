package javaSampleProblemsAssignment;

public class Rectangle {
int l,b,w;
int area,perimeter;

    public void area(int l,int b) {
    area = l*b;
        System.out.println("Area of the rectangle is "+area);
    }
    public void perimeter(int l,int w) {
        perimeter = 2*(l+w);
        System.out.println("perimeter of the rectangle is "+perimeter);
    }
    public static void main(String[] args) {
        Rectangle obj= new Rectangle();
        obj.area(2,4);
        obj.perimeter(3,5);
    }
}
