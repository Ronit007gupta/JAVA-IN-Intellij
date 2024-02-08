import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Number1 = new Scanner(System.in);
        System.out.print("a = ");
      int a = Number1.nextInt();

        Scanner Number2 = new Scanner(System.in);
        System.out.print("b = ");
        int b = Number2.nextInt();

        System.out.print("Sum Is");
        System.out.println(a+b);

        if (a+b>10 && a+b<1000){
            System.out.println("You Are Under Thousand");
        }

        else {
            System.out.println("You Are Above 1000");
        }


    }
}