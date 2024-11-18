import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enetr int value : ");
        Scanner sc = new Scanner(System.in);
        int inputInt = sc.nextInt();
        int factOp = 1;
        if (inputInt > 0) {
            for (int i = 2; i <= inputInt; i++) {
                factOp *= i;
            }
        }
        System.out.println(factOp);
        sc.close();
    }
}

// input 1 : 2
// output : 2

// input 2 : 6
// output : 720
