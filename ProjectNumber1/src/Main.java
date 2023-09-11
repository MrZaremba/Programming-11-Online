import java.util.Scanner;



/* Not sure why but tests wont be detected unless the 'TestClass' file is run. I'm unsure if thats just because
   I imported it to MacOS or not.
 */


public class Main {
    static int problemOne(String s){
        //TODO:
        int counter = 0;
        for (int i =0; i<s.length(); i++){
            char character = s.charAt(i);
            if (character == 'a' || character == 'e'|| character== 'i'|| character=='o'||character =='u'){
                counter += 1;
            }
        }
        //System.out.println(counter);
        return counter;
    }
    static int problemTwo(String s){
        int counter = 0;
        for (int i =0; i < s.length()-2; i++){
            if (s.charAt(i) == 'b' && s.charAt(i+1) == 'o' && s.charAt(i+2) == 'b') {
                counter += 1;
            }
        }
        return counter;
    }

    static String problemThree(String s){
        int max_size = 0;
        int match_start = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                int match_size = j - i;
                if (s.charAt(j) < s.charAt(j - 1)) {
                    if (match_size > max_size) {
                        max_size = match_size;
                        match_start = i;
                    }
                    break;
                }
            }
        }
        return s.substring(match_start, match_start + max_size);
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s = "iueuaondjmhoiuxj";
        System.out.println(problemOne(s));
        System.out.println(problemTwo(s));
        System.out.println(problemThree(s));
    }
}