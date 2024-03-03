import java.util.*;

public class Functions {
    public static int add(int a, int b){
        return a+b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the numbers to add & multiply: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = add(a,b);
        int pro = mul(a,b);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + pro);
    }
}
