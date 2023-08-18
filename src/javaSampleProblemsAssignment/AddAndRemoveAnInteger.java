package javaSampleProblemsAssignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddAndRemoveAnInteger {
	List<Integer> numbers = new ArrayList<>(Arrays.asList(25, 14, 56, 15, 36, 56, 77, 18, 29, 49));

    public void addNumber(int num) {
        numbers.add(num);
        System.out.println("Added " + num + " to the list.");
    }

    public void removeNumber(int num) {
        if (numbers.contains(num)) {
            numbers.remove(Integer.valueOf(num)); // Removes the first occurrence of the value
            System.out.println("Removed " + num + " from the list.");
        } else {
            System.out.println(num + " not found in the list.");
        }
    }

    public static void main(String[] args) {
        AddAndRemoveAnInteger obj = new AddAndRemoveAnInteger();

        System.out.println("Original array: " + obj.numbers);
        
        obj.addNumber(10);
        obj.removeNumber(15);

        System.out.println("Modified array: " + obj.numbers);
    }
}