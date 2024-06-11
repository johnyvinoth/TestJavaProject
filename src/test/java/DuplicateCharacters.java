import org.asynchttpclient.Response;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "Hello World";
        findDuplicateCharacters(str);
    }

    public static void findDuplicateCharacters(String str) {
        // Convert the string to lowercase to ignore case sensitivity
        str = str.toLowerCase();

        // Initialize an array to count occurrences of characters
        int[] count = new int[256]; // Assuming ASCII characters

        // Count occurrences of each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') { // Exclude spaces
                count[ch]++;
            }
        }

        // Print duplicate characters and their occurrences
        System.out.println("Duplicate characters in the string \"" + str + "\" are:");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                System.out.println((char) i + " - " + count[i] + " times");
            }


        }
    }
}
