import java.util.Scanner;

public class VowelsCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the value : ");
        System.out.println(sc.nextLine().matches(".*[aeiouAEIOU].*"));
        sc.close();
    }
}