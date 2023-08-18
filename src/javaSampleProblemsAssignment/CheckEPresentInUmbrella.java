package javaSampleProblemsAssignment;

public class CheckEPresentInUmbrella
{
    String s="Umbrella";
    boolean flag=false;
    public void eInUmbrella() {

        char ch[]=s.toCharArray();
        for(char c: ch) {
            if(c=='e') {
                flag=true;
            }
        }
        if(flag==true) {
            System.out.println("e present in Umbrella");
        }else {
            System.out.println("e not present in Umbrella");
        }
    }
    public static void main(String[] args) {
        CheckEPresentInUmbrella obj= new CheckEPresentInUmbrella();
        obj.eInUmbrella();
    }
}
