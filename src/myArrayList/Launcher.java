package myArrayList;

/**
 * Created by Андрій on 15.07.2015.
 */
public class Launcher {
    public static void main (String [] args){
        SimplArrayList simplArrayList = new SimplArrayList();
        simplArrayList.addFirst("Test 1");
        simplArrayList.addFirst("Test 2");
        simplArrayList.addFirst("Test 3");
        simplArrayList.addLast("Test 6");
        simplArrayList.addLast("Test 5");
        simplArrayList.addLast("Test 4");
        simplArrayList.addInt("Test 7", 4);
        simplArrayList.printArrayList();
        System.out.println("remove");
        System.out.println();
        simplArrayList.remove(2);
        simplArrayList.remove("Test 5");
        System.out.println();
        simplArrayList.printArrayList();
        System.out.println();
        simplArrayList.remove("Test 9");

        simplArrayList.printArrayList();
    }
}
