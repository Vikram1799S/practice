import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.print("Enter the value : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// fibonacci formula Fn = Fn-1 + Fn-2
		// Ref Link : https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.cuemath.com%2Fnumbers%2Ffibonacci-sequence%2F&psig=AOvVaw09ZqtcTAUfidDmJorUOavB&ust=1732119217871000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCMD_gp_l6IkDFQAAAAAdAAAAABAE
		for (int i = 0; i < n; i++) {
			if (i < 2){
				System.out.print(i); 
				if(i!=(n-1))
					System.out.print(", ");
			}
			else{
				System.out.print(((i - 1) + (i - 2)));
				if(i!=(n-1)) 
					System.out.print(", ");
			}
		}
		sc.close();
	}
}