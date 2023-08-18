package javaSampleProblemsAssignment;

public class CheckOccurence {
	public static void main(String[] args) {
    String str="Hello World";
    String targetWord = "l"; // The word to count
    
    int occurrences = countWordOccurrences(str, targetWord);
    System.out.println("The word '" + targetWord + "' appears " + occurrences + " times in the text.");
}

public static int countWordOccurrences(String text, String targetWord) {
    int count = 0;
    int index = text.indexOf(targetWord);
    
    while (index != -1) {
        count++;
        index = text.indexOf(targetWord, index + targetWord.length());
    }
    
    return count;
}

    }

