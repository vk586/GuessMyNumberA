import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int secret = (int) (Math.random() * 100 + 1);
        boolean found = false;

        // System.out.println(secret);

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your guess.");
        int guess = reader.nextInt();

        do {
            if (secret == guess) {
                System.out.println("Correct!");
                found = true;
            }
            else if (guess > secret) {
                System.out.println("Incorrect. Number too high. Try again.");
                guess = reader.nextInt();
                found = false;
            }
            else {
                System.out.println("Incorrect. Number too low. Try again.");
                guess = reader.nextInt();
                found = false;
            }
        } while (!found);

        }
    }