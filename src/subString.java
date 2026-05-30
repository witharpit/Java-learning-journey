import java.util.Scanner;
public class subString {
    public static void main(String[] args){
        //.subString() = A method used to extract portion of a string
        // string.subtring(start,end)

        Scanner input = new Scanner(System.in);

        String email,username,domain;
        System.out.print("Enter email: ");
        email = input.nextLine();

        if(email.contains("@")) {
            username = email.substring(0, email.indexOf('@'));
            domain = email.substring(email.indexOf('@') + 1);

            System.out.println("The username is " + username + ".");
            System.out.println("The domain of the email is " + domain + ".");
        }
        else {
            System.out.println("The email is not valid.");
        }

    }
}
