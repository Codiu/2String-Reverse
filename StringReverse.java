import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        // The point is this: we get the string from Scanner. And parse it in reverse

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the String please to reverse it: ");
        String text = myObj.nextLine();

        for (int i = text.length()-1; i >= 0; i--) {
            System.out.println(text.charAt(i));
        }
    }
}