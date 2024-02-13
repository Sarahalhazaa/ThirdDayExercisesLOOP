import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//-Q1-----------------------------------------------------------------

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            System.out.println(i);
        }

//-Q2-----------------------------------------------------------------

        System.out.printf("%n Enter a sentence:");
        String sentence = scanner.nextLine();
        String reversed = "";
        for (int q = sentence.length()-1; q>=0; q--) {
            reversed += sentence.charAt(q);}
        System.out.println(" Reverse string:" +reversed);

//-Q3----------------------------------------------------------------
        System.out.println("Enter Number:");
        double num1 = scanner.nextDouble();
        System.out.println("Factorial value:" + (num1 + (num1 * 15 / 100)));
//-Q4----------------------------------------------------------------
        System.out.println("Enter First Number:");
        double num2 = scanner.nextDouble();
        System.out.println("Enter second Number:");
        double num3 = scanner.nextDouble();
        double Total = 1;
        for (int j = 0; j < num3; j++) {
            Total *= num2;
        }
        System.out.println(Total);

//Q5----------------------------------------------------------------
        int num4 = 0;
        int SumOfEven = 0;
        int SumOfodd = 0;
        do {
            System.out.println("Enter a number, if to exit enter 0");
            num4 = scanner.nextInt();
            if (num4 % 2 == 0) {
                SumOfEven += num4;
            } else {
                SumOfodd += num4;
            }
        } while (num4 != 0);
        System.out.printf("%n Sum Of Even:" + SumOfEven + "%n Sum Of odd:" + SumOfodd + "%n");
//Q6---------------------------------------------------------------
        System.out.println("Enter a positive number:");
        int num5 = scanner.nextInt();
        if (num5 <= 1) {
            System.out.println(num5 + " This number is not prime");
        }
        else if (num5 % num5 ==0 && num5 % 2 == 0 ) {
            System.out.println(num5 + " This number is not prime");
        }else System.out.printf("%n"+num5 + " This number is  prime %n %n");

//Q7----------------------------------------------------------------


        for (int W = 1; W <= 4; W++) {
            System.out.println("Week" + W);
            for (int D = 1; D <= 7; D++) {
                System.out.println("Day" + D);
            }}
//Q8---------------------------------------------------------------


//            System.out.printf("%n %n Enter a sentence:");
//            String sentence1 = scanner.nextLine();
//            String reversed1 = "";
//            for (int q = sentence1.length()-1; q>=0; q--) {
//                    reversed1 += sentence1.charAt(q);}
//
//                if (sentence1.equals(reversed1)){
//                    System.out.println(sentence1 + " is a palindrome");}
//               else  System.out.println(sentence1 + " is not a palindrome");
            }}




