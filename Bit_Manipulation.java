import java.util.*;

public class Bit_Manipulation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // Get Bit.
//            int n = 5;  // (0101)
//            int pos = 2;
//            int bitMask = 1<<pos;
//            if((bitMask & n) == 0 ){
//                System.out.println("Bit was zero");
//            }
//            else{
//                System.out.println("Bit was one");
//            }

        // Set Bit.
//            int n = 5;
//            int pos = 1;
//            int bitMask = 1 << pos;
//            int newNumber = bitMask | n;
//            System.out.println(newNumber);

        // Clear Bit.
//            int n = 5;
//            int pos = 2;
//            int bitMask = 1 << pos;
//            int notBitMask = ~ (bitMask);
//            int newNumber = notBitMask & n;
//            System.out.println(newNumber);

        // Update Bit.
            int oper = scan.nextInt();
            int n = 5;
            int pos = 1;
            int bitMask = 1 << pos;
            if(oper == 1){
                int newNumber = bitMask | n;
                System.out.println(newNumber);
            }
            else{
                int notBitMask = ~ (bitMask);
                int newNumber = notBitMask & n;
                System.out.println(newNumber);
            }

    }
}
