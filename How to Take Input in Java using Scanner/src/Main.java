import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //  We Write Integer Value
        System.out.println("Input Your Number : ");
        Scanner integer = new Scanner (System.in);
        int x = integer.nextInt();
        System.out.println(x);

        //  We Write Float Value
        System.out.println("Input Your Float Integer Number : ");
        Scanner floating  = new Scanner(System.in);
        float a = floating.nextFloat();
        System.out.println(a);

        //  We Write String Name Value
        System.out.println("Input Your Name : ");
        Scanner name  = new Scanner(System.in);
        String names = name.next();
        System.out.println("The King" + names);

        //  We Write String lines Value
        System.out.println("Type A Sentence : ");
        Scanner sentence  = new Scanner(System.in);
        String lines = sentence.nextLine();
        System.out.println(lines);




    }
}