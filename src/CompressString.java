public class CompressString {

    //Since this is a simple task, I chose an easy approach and avoided functional programming.

        public static String compress(String s) {
            // To check if the input is empty or contains only spaces, return an empty string.
            if (s.trim().isEmpty()) return "";

            //Because the input consists only of lowercase letters, I did not add a validation for it.
            //I chose StringBuilder because it is mutable and allows me to use the append method.
            StringBuilder compressed = new StringBuilder();
            // Since I will check from the first char, the character at index 0 starts with a count of 1.
            int count = 1;

            // decide to use simple for loop to check each char in the string and append it with the count.
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    count++; // Increment count if the char is the same
                } else {
                    // Append the char and its count, then reset count
                    compressed.append(s.charAt(i - 1)).append(count);
                    count = 1; // Reset count for the new char
                }
            }
            // Append the last character and its count
            compressed.append(s.charAt(s.length() - 1)).append(count);
            return compressed.toString();
        }
}

