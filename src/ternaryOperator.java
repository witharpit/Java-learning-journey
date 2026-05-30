public class ternaryOperator {
    public static void main(String[] args){
        // It is the simpler version of if else statement.
        // Ternary operator ? return 1 of 2 values if a condition is true.
        // variable = (condition) ? ifTrue : ifFalse;

        // to check a number if it is even or odd

//        int num = 4;
//        String evenOrOdd = (num % 2 == 0) ? "The number is even.":"The number is odd.";
//        System.out.println(evenOrOdd);

        // program to let know am and pm of the day.

        int hour = 13;
        String hourOfDay = ( hour > 12 )? "PM" : "AM";
        System.out.println(hourOfDay);


    }
}
