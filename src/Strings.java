import java.util.Scanner;
public class Strings {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = "   Arpit Poudel";
        String lastName="  ";

//        int length = name.length();
//        System.out.println("The length is "+ length+".");
//
//        char letter = name.charAt(3);
//        System.out.println("The char at index 4 is "+letter+"." );
//
//        int index = name.indexOf('p');
//        System.out.println("The index of char p is "+index+".");
//        int lastIndex = name.lastIndexOf('e');
//        System.out.println(lastIndex);
//
//        String upper =name.toUpperCase();
//        System.out.println(upper);
//        String lower = name.toLowerCase();
//        System.out.println(lower);
//        System.out.println(name);
//        String names = name.trim();
//        System.out.println(names);
//        String replace = name.replace("p","a");
//        System.out.println(replace);
//        if(lastName.isBlank()){
//            System.out.println("it is empty");
//        }
//        else{
//            System.out.println(lastName);
//        }
//        if(name.contains("o")){
//            System.out.println("it contains o.");
//        }
//        else {
//            System.out.println("it doesnot contain o.");
//        }
        if(name.equals(lastName)){
            System.out.println("you name cannot be your password.");
        }
        else {
            System.out.println("hello"+name);
        }


    }
}
