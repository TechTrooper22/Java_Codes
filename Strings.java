import java.util.*;

public class Strings {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

//        String name = "Tejas";
//        System.out.println(name);
//
//        String fullName = scan.nextLine();
//        System.out.println("Your name is " + fullName);
//

        // Concatenation
//            String nameFirst = "Tejas";
//            String nameLast = "Shrikhande";
//            String nameFull = nameFirst + " " + nameLast;
//            System.out.println(nameFull);

        // .length()
//            System.out.println(nameFull.length());

        // .charAt()
//            for(int i=0; i<nameFirst.length(); i++){
//                System.out.println(nameFirst.charAt(i));
//            }

        // str1.compareTo(str2)
            // str1 > str2 --> +ve value
            // str1 < str2 --> -ve value
            // str1 == str2 --> 0

//            if(nameFirst.compareTo(nameLast) == 0){
//                System.out.println("Strings are equal.");
//            }
//            else{
//                System.out.println("Strings are not equal.");
//                System.out.println(nameFirst.compareTo(nameLast) );
//            }

        // .substring(start idx, end idx)
//            String sentence = "My name is Tejas Shrikhande";
//            String name = sentence.substring(11, 16);
//            System.out.println(name);


        // String Builder.

            StringBuilder sb = new StringBuilder("Tejas");
            // .charAt()
//                System.out.println(sb.charAt(0));

            // .setCharAt(idx, char)
//                sb.setCharAt(0,'O');
//                System.out.println(sb);

            // .insert(idx, char)
//                sb.insert(0,'T');
//                System.out.println(sb);

            // .delete(start idx,end idx)
//                sb.delete(1,2);
//                System.out.println(sb);

            // .append(char)
//                sb.append(" ");
//                sb.append("S");
//                sb.append("h");
//                sb.append("r");
//                sb.append("i");
//                sb.append("k");
//                sb.append("h");
//                sb.append("a");
//                sb.append("n");
//                sb.append("d");
//                sb.append("e");
//                System.out.println(sb);

        // Reverse String
            for(int i=0; i<sb.length()/2; i++){
                    int front = i;
                    int back = sb.length()-(i+1);

                    char frontChar = sb.charAt(front);
                    char backChar = sb.charAt(back);

                    sb.setCharAt(front, backChar);
                    sb.setCharAt(back, frontChar);
            }
            System.out.println(sb);


    }
}
