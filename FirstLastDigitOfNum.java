import java.util.Scanner;

public class FirstLastDigitOfNum {
    public static void main(String[] args) {
        System.out.print("Enetr int value : ");
        Scanner sc = new Scanner(System.in);
        int inputInt = sc.nextInt();
        if(inputInt > 9){
            System.out.println("Last digit : "+inputInt % 10);
            while(inputInt > 10){
                inputInt /= 10;
            }
            System.out.println("First digit : "+inputInt);
        }else{
            System.out.println("Last digit : "+inputInt);
            System.out.println("First digit : "+inputInt);
        }
        sc.close();
    }
}
