
public class Maths {
    public static void main(String[] args){

        System.out.println(Math.PI);//prints value of pi. It is available in maths class
        System.out.println(Math.E);// exponential value.

        double result;

        result = Math.pow(2,4);//pow meaning power
        System.out.println(result);

        result = Math.abs(-6);// this is for absoulate value
        System.out.println(result);

        result = Math.sqrt(9);//for square root.
        System.out.println(result);

        result = Math.round(5.55);//rounding to integer.
        System.out.println(result);

        result =  Math.ceil(5.2);//round up even when it should not.
        result = Math.floor(5.9);//round down even when it should not.
        result =  Math.max(5,4);// look maximun value
        result =  Math.min(5,2);// look minimum values

    }
}
