import java.util.Scanner;
import java.util.Random;

public class UserSurvey {
    // static void mainCaller() {
    // main(null);
    // }

    public static void askQuestions() {

        UserSurvey survey = new UserSurvey();

        Scanner userInput = new Scanner(System.in);

        String carColor = survey.userCarColor(userInput);

        String petName = survey.userFavoritePet(userInput);

        int petAge = survey.userFavoritePetAge(userInput);

        int luckyNumber = survey.userLuckyNumber(userInput);

        int favoriteQuarterback = survey.userFavoriteQuarterbackNumber(userInput);

        int modelCarYear = survey.userCarModel(userInput);

        String favoriteActorActress = survey.userFavoriteActorActress(userInput);

        int randomNumber = survey.userRandomNumber(userInput);

        Random random = new Random();

        int rand_1 = random.nextInt(75);
        int rand_2 = random.nextInt(65);

        int magicBall = 0;

        if (rand_1 < 32) {
            magicBall = favoriteQuarterback * rand_1;
            while (magicBall > 75) {
                magicBall -= 75;
            }
        } else {
            magicBall = luckyNumber * rand_1;
            while (magicBall > 75) {
                magicBall -= 75;
            }
            // System.out.println(magicBall);
        }

        int nonRand1 = petName.charAt(2);
        while (nonRand1 > 65) {
            nonRand1 -= 65;
        }
        // System.out.println(nonRand1);

        int nonRand2 = modelCarYear + luckyNumber;
        while (nonRand2 > 65) {
            nonRand2 -= 65;
            // System.out.println(nonRand2);
        }
        int nonRand3 = 42;
        // System.out.println(nonRand3);

        int nonRand4 = favoriteActorActress.charAt(favoriteActorActress.length() - 1);
        while (nonRand4 > 65) {
            nonRand4 -= 65;
            // System.out.println(nonRand4);
        }
        int nonRand5 = favoriteQuarterback + petAge + luckyNumber;
        while (nonRand5 > 65) {
            nonRand5 -= 65;
            // System.out.println(nonRand5);
        }

        System.out.println("Lottery Numbers: " + nonRand1 + "," + nonRand2 + "," + nonRand3 + "," + nonRand4 + ","
                + nonRand5 + "," + "MagicBall: " + magicBall);

    }

    public String userCarColor(Scanner userInput) {
        System.out.println("Do you have a red car? (yes, no):");

        return userInput.nextLine();
    }

    public String userFavoritePet(Scanner userInput) {
        System.out.println("What is the name of your favorite pet?");

        return userInput.nextLine();
    }

    public int userFavoritePetAge(Scanner userInput) {
        System.out.println("What is the age of your favorite pet?");

        return userInput.nextInt();
    }

    public int userLuckyNumber(Scanner userInput) {
        System.out.println("What is your lucky number?");

        return userInput.nextInt();
    }

    public int userFavoriteQuarterbackNumber(Scanner userInput) {
        System.out.println("What is your favorite quarterback's jersey number?");

        return userInput.nextInt();
    }

    public int userCarModel(Scanner userInput) {
        System.out.println("What is the two-digit model of your car?");

        return userInput.nextInt();
    }

    public String userFavoriteActorActress(Scanner userInput) {
        userInput.nextLine();
        System.out.println("what is the first name of your favorite Actor or Actress");

        return userInput.nextLine();
    }

    public int userRandomNumber(Scanner userInput) {
        System.out.println("Pick a number between 1 and 50");

        return userInput.nextInt();
    }
}
