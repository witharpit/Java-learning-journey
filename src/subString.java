public class subString {
    public static void main(String[] args){
        //.subString() = A method used to extract portion of a string
        // string.subtring(start,end)
         String email = "arpitpoudel@gmail.com";
         String username = email.substring(0,11);
        System.out.println(username);
         String domain = email.substring(12,21);
        System.out.println(domain);

    }
}
