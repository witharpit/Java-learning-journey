import java.util.Random;
public class randomClass {
    public static void main(String[] args) {
        //here we are learning to operate Random numbers.

        Random random = new Random();

        int num1;
        double num2;
        boolean ishead;

        num1 = random.nextInt(1, 7);//second number is exclusive.
        System.out.println(num1);

        num2 = random.nextDouble();
        System.out.println(num2);

        ishead = random.nextBoolean();

        if (ishead)
            System.out.println("it is head");

        else {
            System.out.println("it is tail.");
        }
    }
}
