import java.util.Scanner;

public class weightConversion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Weight converting program.
        //declare variables
        //Welcome message
        // Prompt for user choice
        // option 1 convert lbs into kg
        // option 2 convert kg into lbs
        // else print not a valid choice

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight conversion program");
        System.out.println("1: convert lbs into kgs.");
        System.out.println("2: convert kgs into lbs.");

        System.out.print("choose an option: ");
        choice = input.nextInt();

        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = input.nextDouble();

            newWeight = weight * 0.45;
            System.out.println("Conversion: "+ weight + "lbs is "+newWeight+"kgs.");
        }
         else if (choice == 2) {
            System.out.print("Enter the weight in kgs: ");
            weight = input.nextDouble();

            newWeight = weight * 2.2;
            System.out.println("Conversion: "+ weight + "kgs is "+newWeight+"lbs.");

        }
         else{
            System.out.println("The choice is not valid.");
        }

        System.out.println("Thankyou for using our service.");

    }
}
