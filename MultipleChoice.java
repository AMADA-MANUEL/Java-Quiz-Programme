import java.util.Scanner;

public class MultipleChoice {
    public static void main (String[] args) {


        Scanner scan = new Scanner(System.in);
        String[] responses1 = {""};
        String[] responses2 = {""};
        String[] responses3 = {""};






        System.out.println("How many legs do spiders have ?");

        System.out.println("a) 7");
        System.out.println("b) 6");
        System.out.println("c) 8");
        System.out.println();

        System.out.println("What was the historic event tha happend in South Africa In The year 2026?");
        System.out.println("a) World cup");
        System.out.println("b) World Economic Forum");
        System.out.println("c) G20 Summit");




        System.out.println("What historic moment happend in the markets in the year 2026 January");
        System.out.println("a Gold hit 5600)");
        System.out.println("b The dollar hit R21)");
        System.out.println("cThe dollar hit R15 to Rands)");



       responses1[0] = scan.next();
       responses2[0] =scan.next();
       responses3[0] = scan.next();
        System.out.println(responses1[0]);
        System.out.println(responses3[0]);
        System.out.println(responses2[0]);

    }

}
