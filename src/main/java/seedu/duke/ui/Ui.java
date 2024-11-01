package seedu.duke.ui;
import java.util.List;
import java.util.Scanner;

import seedu.duke.common.Messages;
import seedu.duke.data.hospital.Hospital;
import seedu.duke.data.hospital.Patient;
import seedu.duke.data.task.TaskList;

/**
 * The Ui class handles the user interface for the task management application.
 * It provides methods for displaying messages and interacting with the user.
 */
public class Ui {
    private Scanner scanner;

    /**
     * Constructs a Ui object and initializes the scanner for user input.
     */
    public Ui() {
        this.scanner = new Scanner(System.in);
    }

    public void showMainScreen() {
        showLine();
        System.out.print(Messages.MESSAGE_MAIN_PROMPT);
    }

    public void showTaskScreen(Patient patient) {
        showLine();
        System.out.println("Patient: " + patient.getName() + patient.getFormattedTag());
        System.out.print(Messages.MESSAGE_MAIN_PROMPT);
    }

    public void showToUser(String message) {
        System.out.println(message);
    }


    public void showTaskList(Patient patient) {
        showLine();
        //retrieve and display completion rate
        TaskList taskList = patient.getTaskList();
        String completionPercentage = taskList.completionRatePercentageToString();
        //display info with completion rate
        System.out.printf("%sPatient:%s %s %s [Tasks Completed: %s%s%s]%n",
                Colors.ANSI_BLUE, Colors.ANSI_RESET,
                patient.getName(), patient.getFormattedTag(),
                Colors.ANSI_GREEN, completionPercentage, Colors.ANSI_RESET);
        System.out.println(Colors.ANSI_BLUE + "Here are the tasks in your list!" + Colors.ANSI_RESET);
        System.out.println(taskList); //use TaskList's toString method to print the list of tasks
    }

    public void showPatientListWithCompletionRate(Hospital hospital) {
        showLine();

        //calculate and display the overall task completion rate
        double completionRate = hospital.calculateOverallCompletionRate();
        System.out.printf("%s%.0f%% of tasks are completed.%s%n", Colors.ANSI_GREEN, completionRate, Colors.ANSI_RESET);
        //display each patient
        System.out.println(Colors.ANSI_BLUE + "Here are the patients in your list:" + Colors.ANSI_RESET);
        List<Patient> patients = hospital.getPatients();
        for (int i = 0; i < patients.size(); i++) {
            Patient patient = patients.get(i);
            System.out.printf("%s%d.%s %s %s%n",
                    Colors.ANSI_BLUE, i + 1, Colors.ANSI_RESET,
                    patient.getName(), patient.getFormattedTag());
        }
    }

    /**
     * Reads a command inputted by the user.
     *
     * @return the user input as a String
     */
    public String readCommand() {
        assert scanner != null;
        if (scanner.hasNextLine()) {
            return scanner.nextLine();
        } else {
            return null;
        }
    }

    /**
     * Displays a horizontal line to the console.
     */
    public void showLine() {
        System.out.println(Messages.MESSAGE_BREAKLINE);
    }

    /**
     * Displays a welcome message to the user.
     */
    public void showWelcome() {
        showLine();
        System.out.println(Messages.LOGO);
        System.out.println(Messages.MESSAGE_WELCOME);
    }

    /**
     * Closes the scanner
     */
    public void closeScanner() {
        scanner.close();
    }

}
