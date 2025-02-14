public class DecompressString {


    public static String decompress(String s) {

        // To check if the input is empty or contains only spaces, return an empty string.
        if (s.trim().isEmpty()) return "";

        //Because the input consists only of lowercase letters, I did not add a validation for it.
        //I chose StringBuilder because it is mutable and allows me to use the append method.
        StringBuilder decompressed = new StringBuilder();

        for (int i = 0; i < s.length(); i+=2) {
            // In each loop, get the character at even indices (0, 2, 4...) which will be the letter.
            // The character at odd indices (1, 3, 5...) will be the number indicating the repetition count.
            char letter = s.charAt(i);
            int num = Character.getNumericValue(s.charAt(i+1));

            // Append the letter repeated 'num' times to the decompressed string.
            decompressed.append(String.valueOf(letter).repeat(num));
        }

        return decompressed.toString();
    }
}
