import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[] names = new int[3];
//        names[0] = 10;
//        names[1] = 20;
//        names[2] = 30;
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);

//        int[] numbers = {1,2,3,4,5};
//        for(int i=0; i<5; i++){
//            System.out.println(numbers[i]);
//        }

        //  linear Search
//            int[] arr = {10, 20, 30, 40, 50};
//            System.out.print("Enter key to search: ");
//            int k = sc.nextInt();
//            for(int i=0; i<arr.length; i++){
//                if(arr[i] == k){
//                    System.out.println("Found at index " + i);
//                }
//            }

        // 2-D Arrays.
//            int row = 2;
//            int col = 3;
//            int[][] arr = new int[row][col];
//            for(int i=0; i<row; i++){
//                for(int j=0; j<col; j++){
//                    arr[i][j] = sc.nextInt();
//                }
//            }
//            for(int i=0; i<row; i++){
//                for(int j=0; j<col; j++){
//                    System.out.print(arr[i][j] + " ");
//                }
//                System.out.println();
//            }

            int row = 2;
            int col = 3;
            int[][] arr = new int[row][col];
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.print("Enter key to search: ");
            int k = sc.nextInt();
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    if(arr[i][j] == k){
                        System.out.println("Found at index (" + i + ", " + j + ")" );
                    }
                }
            }
    }
}
