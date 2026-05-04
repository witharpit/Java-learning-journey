import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = input.nextLine();

        if(name.isEmpty()){
            System.out.println("you haven't enter your name.");
        }
        else{
            System.out.println("Yo "+name+"!");
        }


        input.close();
    }
}
