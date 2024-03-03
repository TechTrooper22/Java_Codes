//import java.util.*;
import  java.util.ArrayList;
import java.util.Collections;

class ArrayLists {
    public static void main(String[] args) {

        // Declaration
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        // or --> ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        // Add Elements --> .add(value)
            list1.add(1);
            list1.add(2);
            list1.add(3);
            System.out.println(list1);

        // Add in between elements --> .add(idx, value)
            list1.add(1, 5);
            System.out.println(list1);

        // Change an Item --> .set(idx, value)
            list1.set(0, 22);

        // Get Elements --> .get(idx)
            int element = list1.get(1);
            System.out.println(element);

        // Delete Element --> .remove(idx)
            list1.remove(1);
            System.out.println(list1);

        // Size --> .size()
            System.out.println(list1.size());

        // Loops
            for(int i=0; i<list1.size(); i++){
                System.out.print(list1.get(i) + " ");
            }
            System.out.println();

        // Sorting
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(4);
            list.add(7);
            list.add(2);
            list.add(8);
            list.add(5);
            list.add(3);
            System.out.println(list);
            Collections.sort(list);
            System.out.println(list);

    }
}
