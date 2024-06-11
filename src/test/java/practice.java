import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.w3c.dom.css.Counter;

import java.util.*;

import static java.lang.Math.max;


public class practice {

    @Test
    public void test_Array() {

        int[] test = new int[10];
        test[0] = 1;
        test[1] = 2;


        System.out.println("test_Array:" + Arrays.toString(test));

        int[] test2 = {1, 2, 3, 4, 5, 6, 7, 8};
    }

    @Test
    public void test_Arraylist() {
        List<String> array = new ArrayList<>();
        array.add(0, "Test 0");
        array.add(1, "Test 1");
        array.add(2, "Test 2");
        array.add(3, "Test 3");
        System.out.println(array);

        array.remove(2);
        System.out.println(array);
        System.out.println(array.get(2));
        System.out.println("The index of the element Test 1 is: " + array.indexOf("Test 1"));
        array.remove("Test 1");
        System.out.println(array);

    }

    @Test
    public void test_Linkedlist() {
        List<String> array = new LinkedList<>();
        array.add(0, "Test 0");
        array.add(1, "Test 1");
        array.add(2, "Test 2");
        array.add(3, "Test 3");
        System.out.println(array);

        array.remove(2);
        System.out.println(array);
        System.out.println(array.get(2));

    }

    @Test
    public void test_linkeHashMap() {
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("Test1", 1);
        linkedMap.put("Test4", 4);
        linkedMap.put("Test3", 2);
        linkedMap.put("Test2", 1);

        for (Map.Entry<String, Integer> entry : linkedMap.entrySet()) {
            System.out.println("Linked HashMap Key:" + entry.getKey() + " Value:" + entry.getValue());

        }

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Test1", 1);
        hashMap.put("Test4", 4);
        hashMap.put("Test2", 1);
        hashMap.put("Test3", 2);

        for (Map.Entry<String, Integer> entry1 : hashMap.entrySet()) {
            System.out.println("HashMap Key: " + entry1.getKey() + " Value: " + entry1.getValue());
        }

    }

    @Test
    public void checkDuplicateString() {
        String str2 = "findduplicateelementsinarray";
        String[] strArray = str2.split("");
        List<String> strList = new ArrayList<>(Arrays.asList(strArray));
        List<String> duplicate = new ArrayList<>();
        System.out.println(strList);

        Set<String> strSet = new HashSet<>();
        for (String str : strList) {
            if (!strSet.add(str) == true) {
                duplicate.add(str);
            }


        }
        for (String unq : strSet) {
            System.out.println("The char :" + unq + " were duplicated for :" + Collections.frequency(strList, unq));

        }
        System.out.println("The unique chars are : " + strSet);
        System.out.println("The chars which were duplicate are :" + duplicate);

    }

    @Test
    public void test_webUI() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement element = driver.findElement(By.xpath("(//img)[100]"));


    }

    @Test
    public void test_maxSumArray() {
        int[] arr = {1, 2, -5, 7, -3, 5};
        int curr_sum = 0;
        int max_sum = 0;

        for (int i : arr) {
            curr_sum += i;
            max_sum = max(max_sum, curr_sum);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        System.out.println("The maximum sum of the array is :" + max_sum);

    }


    public Boolean palindrome(String str) {

        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if (!(str.charAt(i) == str.charAt(len-1 - i))) {
                System.out.println("The entered string is not a palindrome");
                return false;
            }

        }
        return true;
    }

    @Test
    public void test_palindrome() {
        String str = "madam";
        Boolean result = palindrome(str);
        System.out.println("The given string : " + str + " is a palindrome or not : " + result);
    }
//    abstract void test_webUI_1();

}
