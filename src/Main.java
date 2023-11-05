import java.util.jar.JarOutputStream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hey");
    }
    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String str) {
        int leftcounter=0;
        int rightcounter=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                leftcounter++;
            } else if (str.charAt(i) == ')') {
                rightcounter++;
            }
        }
        return (rightcounter == leftcounter);
    }

    // 2. reverseInteger
    public static String reverseInteger(int number){
        String output = "";
        String str =  String.valueOf(number);
        int numberlength = str.length();

        for(int i = numberlength-1; i >= 0; i--){
            output += str.charAt(i);
        }
        return output;
    }


    // 3. encryptThis
    public static String encryptThis(String message) {
        String[] words = message.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                result.append(" ");
            }

            String word = words[i];
            int length = word.length();

            if (length == 1) {
                result.append((int) word.charAt(0));
            } else if (length == 2) {
                result.append((int) word.charAt(0));
                result.append(word.charAt(1));
            } else {
                int firstChar = (int) word.charAt(0);
                char secondChar = word.charAt(1);
                char lastChar = word.charAt(length - 1);
                String middleChars = word.substring(2, length - 1);

                result.append(firstChar);
                result.append(lastChar);
                if (!middleChars.isEmpty()) {
                    result.append(middleChars);
                }
                result.append(secondChar);
            }
        }

        return result.toString();
    }




    // 4. decipherThis
    public static String decipherThis(String message) {
        String[] words = message.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                result.append(" ");
            }

            String word = words[i];
            int length = word.length();

            if (length == 1) {
                result.append((char) Integer.parseInt(word));
            } else if (length == 2) {
                result.append(word.charAt(1));
                result.append((char) Integer.parseInt(String.valueOf(word.charAt(0) + word.charAt(1))));
            } else {
                int code = Integer.parseInt(word.substring(0, 3));
                char secondChar = word.charAt(1);
                char lastChar = word.charAt(length - 1);
                String middleChars = word.substring(3, length - 1);

                result.append((char) code);
                result.append(secondChar);
                result.append(middleChars);
                result.append(lastChar);
            }
        }

        return result.toString();
    }
    }

