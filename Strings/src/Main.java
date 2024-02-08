
public class Main {
    public static void main(String[] args) {
      //Topic Strings
      //How to store Data in String
      String name = "Ronit";

      //Types of Strings
        //concatenate - Adding Two Strings Value
        String name1 = "Ronit";
        String name2 = "Ronak";
        String name3 = name1+ " and " +name2;
        System.out.println(name3);

        //charAt - To find character at position
        String name4 = "Ronit Gupta";
        System.out.println(name4.charAt(0));
        System.out.println(name4.charAt(1));
        System.out.println(name4.charAt(2));
        System.out.println(name4.charAt(3));
        System.out.println(name4.charAt(4));
        System.out.println(name4.charAt(5));
        System.out.println(name4.charAt(6));
        System.out.println(name4.charAt(7));
        System.out.println(name4.charAt(8));
        System.out.println(name4.charAt(9));
        System.out.println(name4.charAt(10));

        //length - To find total no. of words in String
        String name5 = "Hello World There is some secrets Of Universe";
        String result = "+"+name5.length();
        System.out.println(result); //or ye bhi
        System.out.println(name5.length());

        //Replace - To replace some words in String
        String para = "Iss duniya Mein Chamatkar Bohot Hote Hai";
        String para1 = para.replace("Chamatkar" , "balatkar");
        System.out.println(para1);
        System.out.println(para);
        System.out.println(para.replace("Bohot", "kam"));

        //Substring - To pick/take short word from a long string
        String good = "Hi there How are you";
        System.out.println(good.substring(3,9));
        System.out.println(good.substring(12,16));
        System.out.println(good.substring(0,2));
        System.out.println(good.substring(8,12));


    }
}