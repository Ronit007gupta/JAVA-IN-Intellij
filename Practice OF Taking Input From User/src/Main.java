import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Input Practice

        Scanner cash = new Scanner(System.in);
        System.out.println("Car Price = 2000000 To 2.5 Crore" + "Petrol Price = 10000 Rs");

        System.out.print("How Much Cash Do You Have : ");
        int Money = cash.nextInt();

        if(Money<1000000){
            System.out.println("The End");
            System.out.println("You Can't Purchase Car");
        }
        if (Money>5000000 && Money<10000000){
            System.out.println("Yeahh You Can Gotta Many Cars ");
        }

        else {
            System.out.println("You Can Purchase Anything That You Want");
        }





    }
}