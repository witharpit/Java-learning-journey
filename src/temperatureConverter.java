import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double temp;
        String unit;
        double newTemp;

        System.out.print("Enter the temperature: ");
        temp = input.nextDouble();

        input.nextLine();

        System.out.print("Convert to celsius to farenhiet (C or F):  ");
        unit = input.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp-32)*5.0/9.0 : (temp*5.0/9.0)+32;
        System.out.printf("The converted temperature is %.1f°%s.", newTemp,unit);

        input.close();

    }
}
