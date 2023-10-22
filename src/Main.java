/**
 * @Author: Rezvee Rahman
 * @Date: 10-21-2023
 * 
 * Description: This is the main java runner which will call 
 * Design Pattern class.
 */


import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class Main {

    /* ----------------------------------------------------------
     * -- Main Runner
     * ---------------------------------------------------------- */
    
    /**
     * Method `main` will run a certain java class based on flags
     * @param args
     */
    public static void main(String[] args) {
        
        Pattern pattern1;
        Matcher matches;

        pattern1 = Pattern.compile("-[\\w\\d]");    
    
        for(String argument : args) {
            matches = pattern1.matcher(argument); 
            if(matches.matches()) {
                System.out.println("found an argument");
            }
            else {
                System.out.println("No args. ");
            }
        }
    }
}