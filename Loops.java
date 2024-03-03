
import java.util.*;
public class Loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // for loop.
            for(int i = 0; i < 5; i++){
                System.out.println("Hello");
            }

        // while loop.
            int a = 5;
            while(a > 0){
                System.out.println("Bye");
                a--;
            }

        // do-while
            int b = 0;
            do{
                System.out.println("Hi !");
                b++;
            }while(b<5);

            int c = 6;
            do{
                System.out.println("Hey !");
                c++;
            }while(c < 5);
    }
}
