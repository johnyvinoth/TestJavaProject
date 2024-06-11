import org.testng.annotations.Test;

import java.util.*;

public class collections_TryOut {

    @Test(enabled = false)
    public void ArrayList_Test() {
        ArrayList list = new ArrayList<>();
        list.add("Apple");
        list.add("Orance");
        list.add("Dragon Fruit");

        System.out.println(list);

        list.add(1, "Papaya");
        System.out.println(list);

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        String element1 = list.listIterator(1).toString();
        System.out.println(element1);

    }

    @Test(enabled = false)
    public void LinkedList_Test() {
        LinkedList lnk_list = new LinkedList<>();
        lnk_list.add("Apple");
        lnk_list.add("Orange");
        lnk_list.add("Dragon Fruit");

        System.out.println(lnk_list);

        lnk_list.remove(1);
        System.out.println(lnk_list);

        lnk_list.add(1, "Mango");
        System.out.println(lnk_list);
    }

    @Test(enabled = false)
    public void HashSet_test() {
        HashSet<String> hash_set = new HashSet<>();
        hash_set.add("apple");
        hash_set.add("apple");
        hash_set.add("Mango");
        hash_set.add("Mango");
        System.out.println(hash_set);

        hash_set.remove("Mango");
        hash_set.remove("Mango");
        System.out.println(hash_set);
        System.out.println(hash_set.contains("apple"));


        HashSet<Integer> hashSet = new HashSet<>();

        // Add some elements to the HashSet
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(50);

        // Get a Spliterator for the HashSet
        Spliterator<Integer> spliterator = hashSet.spliterator();

        // Perform sequential traversal and printing of elements
        System.out.println("Sequential traversal:");
        spliterator.forEachRemaining(System.out::println);

        // Get a new Spliterator for parallel traversal
        spliterator = hashSet.spliterator();

        // Perform parallel traversal and printing of elements
        System.out.println("\nParallel traversal:");
        spliterator.forEachRemaining(System.out::println);

    }

    @Test(enabled = false)
    public void test_bubblesort() {
        int[] arr = {555, 1, 2, 13, 61, 19};
        int len = arr.length;
        System.out.println("initial array is: " + Arrays.toString(arr));

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array is: " + Arrays.toString(arr));

    }

    @Test(enabled = false)
    public void test_string() {
        String str = "madam";
        StringBuilder rev = new StringBuilder();
        str = str.replaceAll(" ", "");
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));

        }
        System.out.println("The reversed string is:"+rev);
        if(str.contentEquals(rev))
        {
            System.out.println("The entered string:"+str+" is a palindrome");
        }
        else
        {
            System.out.println("The entered string:"+str+" is not a palindrome");
        }
    }
    @Test
    public void printpattern() {
        int rows = 3;
        int cols = 4;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Condition to determine whether to print '0' or '1'
             if (j % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }


}


