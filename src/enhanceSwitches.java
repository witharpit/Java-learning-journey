import java.util.Scanner;
public class enhanceSwitches {
    public static void main(String[] args){
        //enhanced switches = replacement to many else if statement
        //  (Java14)
        Scanner input = new Scanner(System.in);

        System.out.print("enter a day: ");
        String day = input.nextLine();

//        switch(day){//examine the value or variable inside a paranthesis.
//            case "monday" -> System.out.println("it is a week day");
//            //arrow means do something
//            case "tuesday" -> System.out.println("it is a week day");
//            case "wednesday" -> System.out.println("it is a week day");
//            case "thrusday" -> System.out.println("it is a week day");
//            case "friday" -> System.out.println("it is a week day");
//            case "saturday" -> System.out.println("it is a weekend");
//            case "sunday" -> System.out.println("it is a weekend");
//
//            default -> System.out.println("it is not a day");

        //consolidate
            switch(day){//examine the value or variable inside a paranthesis.

                case "monday","tuesday","wednesday","thrusday","friday" ->
                        System.out.println("it is the week day");

                case "saturday","sunday" ->
                        System.out.println("it is the weekend");

                default -> System.out.println("it is not any day.   ");


        }


    }
}
