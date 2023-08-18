package javaSampleProblemsAssignment;

public class LargestAndSmallest3Numbers {
int a,b,c;
public void largestNumber(int a,int b,int c){
    if(a>b&&a>c){
        System.out.println(a+" is bigger");
    }else if(b>a&&b>c){
        System.out.println(b+" is bigger");
    }else{
        System.out.println(c+" is bigger");
    }
}
public void smallestNumber(int a,int b,int c){
    if(a<b&&a<c){
        System.out.println(a+" is smaller");
    }else if(b<a&&b<c){
        System.out.println(b+" is smaller");
    }else{
        System.out.println(c+" is smaller");
    }
}
    public static void main(String[] args) {
        LargestAndSmallest3Numbers obj= new LargestAndSmallest3Numbers();
        obj.largestNumber(5,7,3);
        obj.smallestNumber(7,5,3);
    }
}
