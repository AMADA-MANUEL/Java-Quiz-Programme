import java.util.Scanner;

public class MultipleChoice {
    public static void main (String[] args) {


        Scanner scan = new Scanner(System.in);

        String[] responses = {"", "", ""};


        String[] answers = {"c" , "c" ,"a"};




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


//
//        System.out.println(responses[0]);
//        System.out.println(responses[1]);
//        System.out.println(responses[2]);

        responses[0] = scan.next();
        responses[1] = scan.next();
        responses[2] = scan.next();

        int score = 0;
        for (int i = 0; i < 3; i++) {
              if (responses[i].equalsIgnoreCase(answers[i])){
                score++;
                 //if (responses[i].equalsIgnoreCase(answers[i]))
            }

        }
        System.out.print("Score:" + score + "/3");
    }
}





