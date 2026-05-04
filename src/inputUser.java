import java.sql.SQLOutput;
import java.util.Scanner;
public class inputUser {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String adj1;
        System.out.println("it is so ____ to have the purpose.");
        System.out.print("enter the follwing words: ");
        adj1 = input.nextLine();
        System.out.println("it is so "+ adj1 +" to have the purpose.");

        int x = 1;
        x--;
        x--;
        System.out.println(x);
         input.close();
    }
}
