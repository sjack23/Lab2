import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        String answer = "yes";

        while (answer.equals ("yes")) {
            System.out.print("Please enter a number from 1 to 100 ");
            number = scan.nextInt();



            //if the number is odd and less than 60
            if ((number % 2 == 1) && (number < 60)) {
                System.out.println("odd");
                //if the number is Even and less than 25
            } else if ((number % 2 == 0) && (number >= 2) && (number <= 25)) {
                System.out.println("Even and less than 25.");
                //If the number is Even and greater than 60
            } else if ((number % 2 == 0) && (number >= 26) && (number >= 60)) {
                System.out.println(number + " Even");
                //If the number is Even and greater than 60
            } else if ((number % 2 == 0) && (number >= 60)) {
                System.out.println(number + " Even");
                //If the number is odd and greater than 60
            } else if ((number % 2 == 1) && (number >= 60)) {
                System.out.println(number + " Odd ");
            } else {
                System.out.println("exit");

            }

            //zask user Do you want to continue?
            System.out.println("continue? yes/no");
            answer = scan.next();
        }
    }

}