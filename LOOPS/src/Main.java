
public class Main {
    public static void main(String[] args) {
        //For Loops
        //For Counting 1 to 100
        for (int i = 1; i<=100;i++){
            System.out.println(i);
        }

        //For Counting 100 to 1
        for (int i = 100; i>=1;i--){
            System.out.println(i);
        }

        // 2 .. While Loops
        //counting 1 to 100

        int k = 1;
        while (k<=100){
            System.out.println(k);
            k=k+1;
        }

        //counting 100 to 1

        int p = 100;
        while (p>=1){
            System.out.println(p);
            p=p-1;
        }


        //Do- While Loop

        int a = 1;
        do {
            System.out.println(a);
            a = a + 1;
        }while (a<=100);
 

    }
}