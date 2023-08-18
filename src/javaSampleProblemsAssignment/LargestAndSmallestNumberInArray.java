package javaSampleProblemsAssignment;

public class LargestAndSmallestNumberInArray {
    int num[]={4,6,1,12};
    int large=num[0];

    int small=num[0];
    public void largestAndSmallest() {
        int i;
        for(i=1;i<num.length;i++) {
            if (num[i]>large) {
                large=num[i];
            }else if(num[i]<small) {
                small=num[i];
            }
        }
        System.out.println("the larger number in the array is "+ large);
        System.out.println("the smaller number in the array is "+ small);
    }
    public static void main(String[] args) {
        LargestAndSmallestNumberInArray obj = new LargestAndSmallestNumberInArray() ;
        obj.largestAndSmallest();
    }
}
