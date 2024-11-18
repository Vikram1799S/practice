import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enetr the string :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.equals(new StringBuilder(str).reverse().toString()) ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}