public class Main {
    public static void main(String[] args) {

        // Lets Discuss Break

        int k = 1;
        while (k<=20){
            System.out.println(k);
            k++;
            if (k>15){
                break;
            }

            //Continue Done

            if (k==3){
                k++;
                continue;
            }

            if (k==6){
                k++;
                continue;
            }

            if (k==9){
                k++;
                continue;
            }

        }


    }
}