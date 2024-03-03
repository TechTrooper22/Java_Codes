import java.util.*;

public class Basic {
    public static void main(String[] args) {
        // println() - prints the content & new line.
        // "\n" - new line.
        // sout - System.out.println();

            System.out.print("One");
            System.out.println("Two");
            System.out.print("Three\n");
            System.out.println("Four");

            System.out.println("*");
            System.out.println("**");
            System.out.println("***");

        // Data Types.

            int a = 5;
            double b = 22.7;
            String name = "Tejas";

        // Variables.

            int c = 10;
            System.out.println(a+c);
            System.out.println(a*c);

        // Input. --> Scanner 'variable1' = new Scanner(System.in);
        //        --> Scanner variable2 = variable1.next();

            // .next() - Reads input up to null value.
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter name : ");
                String name1 = scan.next();
                System.out.println(name1);

            // .nextLine() - Reads whole input.
                Scanner scan1 = new Scanner(System.in);
                System.out.print("Enter full name : ");
                String name2 = scan1.nextLine();
                System.out.println(name2);

            // .nextInt() - Reads integer value.
                Scanner no = new Scanner(System.in);
                System.out.print("Enter number : ");
                int num = no.nextInt();
                System.out.println(num);

            // .nextFloat() - Reads float value.
                Scanner no1 = new Scanner(System.in);
                System.out.print("Enter number : ");
                float num1 = no1.nextFloat();
                System.out.println(num1);




        Scanner number = new Scanner(System.in);
        System.out.println("Enter any two numbers : ");
        int numb1 = number.nextInt();
        int numb2 = number.nextInt();
        System.out.println(numb1 + numb2);
    }
}