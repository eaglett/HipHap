package src;

import java.util.Scanner;

public class Helper {

    static final String USER_NOT_FOUND = ">>>>>  User not found <<<<<";
    static final String PASSWORD_INCORRECT = ">>>> Incorrect password  <<<<";
    static final String LOGOUT_SUCCESS = "> Successfully Logged out <";
    static final String LOGOUT = "Logout";
    static final String ADD_EVENT = "Add event";
    static final String CHANGE_DATE = "Change date";
    static final String SELECT_EVENT = "Select event";
    static final String SHOW_CUSTOMERS = "Show customers";
    static final String SHOW_EMPLOYEES = "Show employees";
    static final String SHOW_PARTNERS = "Show partners";
    static final String SHOW_DASHBOARD = "Main menu";


    static Scanner scn = new Scanner(System.in);

    /**
     * Choosing specified option between 0 and provided limit
     * @param limit (int) upper limit of possible integer input
     * @return
     */
    public static int selectOption (int limit){
        int selectedOption = 0;

        try {
            selectedOption = getInt("Option: ");
        } catch (Exception e) {
            System.out.print("Input error occurred: " + e.getMessage());
        }

        if ((selectedOption >= 0) && (selectedOption < limit))
            return selectedOption;

        else {
            System.out.println("Wrong option. Please try again.");
            return selectOption(limit);
        }
    }

    /**
     * Prints provided message and waits for String from user
     * @param msg (String) - message to be displayed
     * @return user input (String)
     */
    public static String getString(String msg) {
        System.out.print(msg);
        String inputString = scn.nextLine();
        return inputString;
    }

    /**
     * Prints provided message and waits for integer from user
     * @param msg (String) - message to be displayed
     * @return user input (int)
     */
    public static int getInt(String msg) {
        System.out.print(msg);
        int inputInt = scn.nextInt();

        // consume buffer line reminder
        scn.nextLine();

        return inputInt;
    }

    /**
     * method for joining String of comma separated options with array of String
     * @param arr1 [String[]] array to combine
     * @param optionsString [String] of options to convert and concat with arr1
     * @return combined array arr1 with provided String of options
     */
    static String[] arrayJoinString(String[] arr1, String optionsString) {
        String[] arr2 = optionsString.split(", ");

        int length = arr1.length + arr2.length;
        String[] joined = new String[length];

        System.arraycopy(arr1, 0, joined, 0, arr1.length);
        System.arraycopy(arr2, 0, joined, arr1.length, arr2.length);

        return joined;
    }
}
