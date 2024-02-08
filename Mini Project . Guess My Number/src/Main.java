import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int myNumber = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Guess My Number from ( 1 to 100 ) : ");
            int userNumber = sc.nextInt();

            if (userNumber==myNumber){
                System.out.println("Wooohhh You Reached and Your Number is Correct ");
                break;
            }
            if (userNumber>myNumber){
                System.out.println("Your Number is Too Large");
            }

            if (userNumber<myNumber){
                System.out.println("Your Number is Too Small");
            }

            if (userNumber<0){
                System.out.println("You End Up The Game By Negative Mark");
                break;
            }
        }while(myNumber>=0);
        System.out.println("Here is My Number");
        System.out.println("My Number is :"+myNumber);
    }
}