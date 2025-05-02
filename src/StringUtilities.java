public class StringUtilities {

    static boolean isPalindrome(String input) {
        String inpuString = new String(input).toLowerCase().replaceAll("\\s", "");

        StringBuilder s = new StringBuilder(inpuString);

        s.reverse();

        if (inpuString.equals(s.toString()) || inpuString.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    static String compress(String originalString) {
        if (originalString == null || originalString.isEmpty()) {
            System.out.println("Input string is empty.");
            return originalString;
        }

        StringBuilder compressedString = new StringBuilder();
        int count = 1;

        for (int i = 0; i < originalString.length(); i++) {
            if (i + 1 < originalString.length() && originalString.charAt(i) == originalString.charAt(i + 1)) {
                count++;
            } else {
                compressedString.append(originalString.charAt(i));
                if (count > 1) {
                    compressedString.append(count);
                }
                count = 1;
            }
        }

        String result = compressedString.toString();
        if (result.length() < originalString.length()) {
            return result;
        } else {
            System.out.println("Compressed string is not shorter than the original string!");
            return originalString;
        }
    }

    static String reverseWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            System.out.println("Input string is empty.");
            return sentence;
        }
        String[] words = sentence.split(" ");
        StringBuilder reversedWords = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversedWords.append(words[i].charAt(j));
            }
            reversedWords.append(" ");

        }
        return reversedWords.toString();
    }

    static String removeVowels(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input string is empty.");
            return input;
        }

        String regex = "[aeiouAEIOU]";
        String resultString = input.replaceAll(regex, "");
        return resultString;
    }

    static boolean isStrongPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Password must have at least 8 characters.");
            return false;
        }

        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }

        if (hasDigit && hasSpecialChar) {
            return true;
        } else {
            System.out.println("Password must contain at least a digit and a special character.");
            return false;
        }
    }
}