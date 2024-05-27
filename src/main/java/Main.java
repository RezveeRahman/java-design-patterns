import java.util.Scanner;

import com.example.patterns.behavioral.observer.ObserverExample;

public class Main {

    private static int choice = 0;
    private static int options = 3;

    /**
     * This should take in standard in (stdin) for the input.
     */

    private static String START_INTRO =
    """
    \t\tWELCOME TO DESIGN PATTERN DEMONSTRATION (JAVA)
    \t\tThis program is used to demonstrate the different
    \t\tand common design patterns found in Java.
    """;

    /**
     * Main execution of the program
     * @param args
     */
    public static void main(String args[]) {
        System.out.println(Ansi.FG_BLUE + START_INTRO + Ansi.RESET);
        System.out.flush();

        while (true) {
            choice = ControlFlow.menuSelection(options);

            switch (choice) {
                case 1:
                    ObserverExample.executeObserver();
                    break;
                default:
                    break;
            }

            if(choice == 3) {
                break;
            }
        }

        ControlFlow.exitProgram();
    }

    /**
     * Until I get a proper Logging system I decided
     * it was acceptable to homebrew some colors for
     * the system out
     */
    private interface Ansi {

        String RESET       = "\033[0;0;0m";

        /**
         * Colors
         */
        String FG_RED       = "\033[38;5;1m";
        String FG_BLUE      = "\033[38;5;4m";
        String FG_GREEN     = "\033[38;5;2m";
        String FG_YELLOW    = "\033[38;5;3m";
        String FG_PINK      = "\033[38;5;5m";
    }

    private class ControlFlow {

        private static Scanner stdinput = new Scanner(System.in);

        /**
         * Description: `menuSelection` is a method that will
         * simply return an int value. It basically checks
         * user input. Should the user give a valid input
         * then it is further processed. If the input is not
         * valid then we return 0 by default. The parameter
         * options is simply the upper limit of the values
         * e.g. options -> 4, our options can be [0 - 4]
         * @param options
         * @return int
         */
        public static int menuSelection(int options) {
            int returnValue = 0;
            try {
                while (true) {
                    System.out.print("Please enter a value between [0 - " + options +"]: ");
                    returnValue = (int)stdinput.nextInt();
                    if (returnValue > options || returnValue < 0) {
                        System.out.println(Ansi.FG_PINK +
                                "Entry is out of bounds!"
                                + Ansi.RESET);
                        System.out.flush();
                    } else {
                        break;
                    }
                }
            } catch (Exception e) {
                System.err.println(Ansi.FG_RED + "We got an Error" + Ansi.RESET);
                System.err.flush();
                stdinput.next();
                return (0);
            } finally {
                // stdinput.next(); /* Required to avoid an infinite loop */
            }
            return (returnValue);
        }

        /**
         *
         */
        public static void executeProgram() {

        }

        /**
         * Exit program and leave an exit message
         */
        public static void exitProgram() {
            stdinput.close();
            System.out.println(Ansi.FG_GREEN + "Exiting Program." + Ansi.RESET);
            System.out.flush();
            System.exit(0);
        }

    }
}


