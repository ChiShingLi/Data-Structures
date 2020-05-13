import com.sun.security.jgss.GSSUtil;

public class Main {

    public static void main(String[] args) {
        reverseString("Hello"); //"olleH"
    }

    public static void reverseString(String word) {
        //base case: if word is null or only have one character left
        if (word == null || word.length() <= 1) {
            System.out.println(word);
        } else {
            System.out.print(word.charAt(word.length()-1)); //print of the last letter of the string
            reverseString(word.substring(0, word.length() - 1)); //remove the last letter of the string & call itself again
        }

    }

}
