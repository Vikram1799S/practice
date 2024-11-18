import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the value : ");
        int inputInt = sc.nextInt();
        if (inputInt == 0 || inputInt == 1) {
            System.out.println(false);
        } else if (inputInt == 2) {
            System.out.println(true);
        } else {
            System.out.println(checkPrime(inputInt));
        }
        sc.close();
    }

    static boolean checkPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
