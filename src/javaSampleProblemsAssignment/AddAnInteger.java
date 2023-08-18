package javaSampleProblemsAssignment;

public class AddAnInteger {
    int num,sum=0;
    int n=135;
    int i;
    public void addInteger(){
        while(n>0){
            num=n%10;
            sum=sum+num;
            n=n/10;
        }
        System.out.println("the sum of an integer is "+sum);
    }
    public static void main(String[] args) {
      AddAnInteger obj=new AddAnInteger();
      obj.addInteger();
    }
}
