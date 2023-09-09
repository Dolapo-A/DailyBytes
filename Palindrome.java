import java.util.Scanner;

public class Palindrome {

    public static boolean Palindromebool(String palin) {
        // initializing both pointers for counting from front and back of string to determine whether or not it is a palindrome
        int i = 0;
        int j = palin.length() - 1;

        while (i < j) {
            if (palin.charAt(i) != palin.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
    public static void main(String[] args) {
        String str1;
        // String str2 = "Ambient";
        // String str3 = "Racecar";

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter any word of your choice, let's see if it's a palindrome");
            str1 = input.nextLine();
        }
        str1 = str1.toLowerCase();

        if (Palindromebool(str1)) {
            System.out.println(str1 + " Is a palindrome");
        } else {
            System.out.println(" Unfortunately, " + str1 +  " Is not a palindrome");
        }

    }
}
