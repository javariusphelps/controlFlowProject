import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String myName = userInput.nextLine();
        System.out.printf("Hello %s,\n", myName);

        System.out.println("Would you like to continue to the interactive portion? Y/yes/no");
        String response = userInput.nextLine();

        switch (response) {

            case "y":
            case "Y":
            case "yes":
            case "Yes":
            case "YES":

                System.out.println("Continue to next portion");
                UserSurvey.askQuestions();
                System.out.println();
                System.out.println("Do you wish to play again?");
                String answer = userInput.nextLine();

                switch (answer) {

                    case "y":
                    case "Y":
                    case "yes":
                    case "Yes":
                    case "YES":

                        UserSurvey.askQuestions();
                        break;
                    default:
                        System.out.println("Have a great day!");
                        userInput.close();
                        break;
                }
                break;
            default:
                System.out.println("Please return later to complete the survey");
                userInput.close();
                break;

        }

    }

    // public static void askQuestions() {

    // String[] myQuestions = { "Do you have a red car? (yes, no):", "What is the
    // name of your favorite pet?", "What is the age of your favorite pet?", };

    // int i = 0;
    // for (i = 0; i < myQuestions.length; i++) {
    // System.out.println(myQuestions[i]);
    // }
    // }
}