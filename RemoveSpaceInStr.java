import java.util.Scanner;

public class RemoveSpaceInStr {
    public static void main(String[] args) {
        System.out.print("Enetr the string :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] cArr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : cArr){
            if(!Character.isWhitespace(c)){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }   
}
