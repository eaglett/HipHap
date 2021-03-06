package src;



import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.*;



public class Screen {
    private static SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy '-' HH:mm");

    private static Scanner scn = new Scanner(System.in);

    public void Screen(){ }

    // TODO: fix methods below

    /**
     * prints nicely formatted header of the screen
     * @param heading (String) - message to be nicely formatted as a header
     */
    public static void showHeader(String heading) {
        System.out.println("___________________________");
        System.out.println("|    " + heading + "   |");
        System.out.println("===========================");
    }

    /**
     * prints nicely formatted header with today's date
     */
    public static void showHeader() {
        showHeader(ft.format(new Date()));
    }


    /**
     * prints formated header of application
     * Logo of HipHapOrg
     */
    public static void showLogo() {
        showHeader("    HipHapOrg     ");
    }


    public static void clearScreen() {
        for (int i = 0; i < 15; i++)
            System.out.println();
    }

    public static String[] getOptions(int userID) {
        // check if user is manager from provided id
        boolean isManager = userID == 1111;
        // default main options
        String[] mainOptions = {"Logout", "Add event", "Change date"};

        // options for the dashboard
        String[] mainManagerOptions = Helper.arrayJoinString(mainOptions, "Show all Events, Show customers, Show employees, Show partners");
        String[] mainEmployeeOptions = Helper.arrayJoinString(mainOptions, "Show my events, Show partners");

        // todo: dashboard options - String passed to method?
        return isManager ? mainManagerOptions: mainEmployeeOptions;

    }

    public static void listOptions(String[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println(i + ". " + options[i]);
        }
    }


}

