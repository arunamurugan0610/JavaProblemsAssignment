	package javaSampleProblemsAssignment;

public class SecondLargestElementInAnArray {
    int num[]={5,1,2,24,67,33,9};
    public static void main(String[] args) {
    	SecondLargestElementInAnArray obj = new SecondLargestElementInAnArray();
        int secondLargest = obj.findSecondLargest();
        System.out.println("The second largest element is: " + secondLargest);
    }
    public int findSecondLargest() {
        int largest = Integer.MIN_VALUE; // Initialize with the smallest possible value
        int secondLargest = Integer.MIN_VALUE; // Initialize with the smallest possible value

        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                secondLargest = largest;
                largest = num[i];
            } else if (num[i] > secondLargest && num[i] != largest) {
                secondLargest = num[i];
            }
        }

        return secondLargest;
    }
}
