import org.testng.annotations.Test;

import java.util.*;

import static java.lang.Math.max;

public class code_interview {
    @Test(enabled = false)
    public String reverseString(String s) {
//        String str = "Hello World";
        String str = s;
        String RevStr = "";
        String temp = str.replaceAll(" ", "");
        char[] charArr = temp.toCharArray();
        for (int i = charArr.length - 1; i >= 0; i--) {

            RevStr += charArr[i];
        }
        System.out.println("The input string is : " + str);
        System.out.println("The reversed string is : " + RevStr);
        return RevStr;
    }

    @Test(enabled = true)
    public void checkPalindrome() {
        String inputStr = "mama";
        String rString = reverseString(inputStr);
        if (inputStr.contentEquals(rString)) {
            System.out.println("The given string is a palindrome");
        } else {
            System.out.println("The given string is not a palindrome");
        }

    }

    // Optimized way to check palindrom
    @Test
    public boolean optCheckPalindrome(String str) {
        String input = str;
        char[] charInput = input.toCharArray();
        for (int i = 0; i < input.length() / 2; i++) {
            if (charInput[i] != charInput[charInput.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void checkOptPalidrome() {
        String in = "madam";
        boolean output = optCheckPalindrome(in);
        if (output == true) {
            System.out.println("The given input : " + in + " is a palindrome");
        } else {
            System.out.println("The given input : " + in + " is not a palindrome");

        }

    }

    //    This code finds the number of times a unique word is present in a string
    @Test
    public void getNumberOfInstance() {
        String input = "This this is written in JAVA JAVA JAVA java in this";
        String[] inArr = input.split(" ");
        HashMap<String, Integer> hash = new HashMap<>();

        for (String in : inArr) {
//            System.out.println(in);
            if (!hash.containsKey(in)) {
                hash.put(in, 1);
            } else {
                int curr = hash.get(in);
                curr += 1;
                hash.put(in, curr);

            }
        }
        for (String key : hash.keySet()) {
            System.out.println(key + ":" + hash.get(key));
        }
    }


    public void findArmstrongNum(int i) {
//        int input=1534;
        int input = i;
        int sum = 0;
        int temp = input;
        int reminder;
        while (temp > 0) {
            reminder = temp % 10;
            sum += reminder * reminder * reminder;
            temp = (int) (Math.floor(temp / 10));

        }
        if (sum == input) {
            System.out.println("The given number : " + input + " is an Armstrong number");
        } else {
//            System.out.println("The given number : "+input+ " is not an Armstrong number");
        }
    }

    @Test
    public void loopAmstrong() {
        int limit = 1000;
        for (int i = 0; i <= limit; i++) {
            findArmstrongNum(i);
        }
    }

    @Test
    public void collections() {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("orange");
        System.out.println("The FruitSets are : " + fruits);

        List<String> fruitList = new ArrayList<>();
        fruitList.add("apple");
        fruitList.add("apple");
        fruitList.add("apple");
        fruitList.add("orange");
        System.out.println("The FruitLists are : " + fruitList + "\n");

        HashMap<Integer, String> fruitMap = new HashMap<>();
        for (int i = 0; i <= fruitList.size() - 1; i++) {
            fruitMap.put(i, fruitList.get(i));
        }
        for (Integer key : fruitMap.keySet()) {
            System.out.println(key + ":" + fruitMap.get(key));
        }
//        for (String key1:fruitList)
//        {
//            System.out.println(key1);
//        }
        Iterator<String> iterator = fruitList.iterator();
        while (iterator.hasNext()) {
            List item = Collections.singletonList(iterator.next());
            System.out.println(item);
        }
    }

    /*Take an array as input eg [10,5,3,1] and split in two different array combination and find how many combinations
   are having sum of left array greater than right array. eg left : [10] = 10 right :[5,3,1] =9 so this is one
   combination like this need find how many such combination from the function. */

    public void array_comparator(List<Integer> n) {
//        List<Integer> input = new ArrayList<>(List.of(10, 5, 3, 1));
        List<Integer> input = new ArrayList<>();
        input = n;
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        int arr1_sum = 0;
        int arr2_sum = 0;
        int counter = 0;
        System.out.println("The input array is: " + input);
        for (int i = 0; i < input.size() - 1; i++) {
            arr2.clear();
            arr2_sum = 0;
            arr1.add(input.get(i));
            arr1_sum += input.get(i);
            for (int j = i + 1; j < input.size(); j++) {
                arr2.add(input.get(j));
                arr2_sum += input.get(j);

            }
            System.out.println("The value of arr1 is: " + arr1 + " and sum is: " + arr1_sum + " the value of arr2 is: " + arr2 + " and sum is: " + arr2_sum);
            if (arr1_sum > arr2_sum) {
                counter += 1;
            }
        }
        System.out.println("The number of times sum of arr1 greater than arr2 is :" + counter);
    }

    @Test
    public void test_array_comparator() {
        List<Integer> n = new ArrayList<>(List.of(3, 10, -5, 6));
        array_comparator(n);
    }

    /*
 Interview questions asked during the Aspire first round.
 Total gift card value is 10000 and if there are duplicate products in the list then user should be informed
 and the duplicate entires to be removed, should allow user to purchase only the amount available in the gift card.
 */

    public void validateCart(List<Integer> Prod, int qty, int value) {
        int giftCardValue = 1000;
        Collections.sort(Prod);

        boolean outOfValue = false;
        for (int i = 0; i <= Prod.size() - 1; i++) {

            if (Prod.get(i) == Prod.get(i + 1)) {
                System.out.println("The product " + Prod.get(i + 1) + " is duplicate hence removed from your cart");
                Prod.remove(i + 1);
            }
        }
        System.out.println("The final list of products in your cart is :" + Prod);
        for (int i = 0; i <= Prod.size() - 1; i++) {
            if (giftCardValue > value) {
                giftCardValue -= value;
            } else {
                outOfValue = true;
                System.out.println("There is no enough balance in your gift card to purchase all the items in the cart");
                break;
            }
        }

        if (outOfValue == false) {
            System.out.println("All products purchased and the balance in the card is : " + giftCardValue);
        }

    }

    @Test
    public void testValidateCart() {
        List<Integer> prod = new ArrayList<>(List.of(1, 3, 5, 3, 5));
        int qty = 1;
        int value = 1000;
        validateCart(prod, qty, value);


    }


    public void stripChar(String str, int seq) {
        int count = 0;
        StringBuilder nwStr = new StringBuilder();
        char[] input = str.toCharArray();
        char prevChar = input[input.length - 1];
        for (int i = 0; i < input.length; i++) {
            if (input[i] == prevChar) {
                count += 1;
                if (count <= 2) {
                    nwStr.append(input[i]);
                }
                prevChar = input[i];
            } else if ((input[i] != prevChar)) {
//                nwStr.append(input[i]);
                nwStr.append(input[i]);
                count = 1;
                prevChar = input[i];
            }
        }
        System.out.println("The given Sting is : " + str + " the sequence is :" + seq);
        System.out.println("The formatted output as per the given sequence is : " + nwStr);

    }

    @Test
    public void testStripChar() {
//        aaaabbcdddaaa
        String input = "aaaabbcdddaaa";
        int seq = 2;
        stripChar(input, seq);
    }

    /*
    Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

11 2  4
2  5  6
10 8 -12
The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .

Explanation

The primary diagonal is:

11
   5
     -12
Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:

     4
   5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19
Difference: |4 - 19| = 15
     */

    public void diagonalDifference(int[][] val) {
        int rightdiff = 0;
        int leftdiff = 0;
        int absdiff = 0;
        for (int i = 0; i < val.length; i++) {
            rightdiff += val[i][i];
            leftdiff += val[i][val.length - i - 1];

        }
        absdiff = Math.abs(rightdiff - leftdiff);
        System.out.println("The absolute difference between the right and left diagonal values of the array is: " + absdiff);
    }

    @Test
    public void testDiagonalDifference() {
        int[][] input = {
                {11, 2, 4},
                {2, 5, 6},
                {10, 8, -12}
        };
        diagonalDifference(input);
    }
    
/*Caesar's cipher shifts each letter by a number of letters. If the shift takes you past the end of the alphabet, 
just rotate back to the front of the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, 
b and c. 

Original alphabet:      abcdefghijklmnopqrstuvwxyz
Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
*/

    @Test

    public String cipherText(String message, int shift) {
        final String alpha = "abcdefghijklmnopqrstuvwxyz";
        String msg = message.toLowerCase();
        String cipheredTxt = "";
        for (int i = 0; i < msg.length(); i++) {
            int charPos = alpha.indexOf(msg.charAt(i));
            int keyVal = (charPos + shift) % 26;
            char replaceVal = alpha.charAt(keyVal);
            cipheredTxt += replaceVal;
        }

        return cipheredTxt;

    }

    @Test
    public void testCipherText() {
        String input = "Aabdw.xyzZ";
        int shiftBy = 3;
        String ciphered = cipherText(input, shiftBy);
        System.out.println("The given input : " + input + " is ciphered into :" + ciphered);

    }


    public static int NumberManipulator(int num) {
        // Convert negative numbers to positive
        int originalNum = num;
        boolean isNegative = false;
        if (num < 0) {
            num = Math.abs(num);
            isNegative = true;
        }

        String numString = Integer.toString(num);
        int maxLength = numString.length();
        int biggestNumber = num;
        System.out.println("The possible combinations are : ");
        for (int i = 0; i <= maxLength; i++) {
            StringBuilder sb = new StringBuilder(numString);
            sb.insert(i, '5');
            int currentNumber = Integer.parseInt(sb.toString());
            System.out.println(currentNumber);
            biggestNumber = Math.max(biggestNumber, currentNumber);
        }

        // Convert back to negative if the original number was negative
        if (isNegative) {
            biggestNumber *= -1;
        }

        return biggestNumber;
    }

    @Test
    public static void TestNumberManupulator() {
        int input = -623787;
        System.out.println("The given input number is : " + input);
        int biggestNumber = NumberManipulator(input);
        System.out.println("The Biggest number  among  the combination is : " + biggestNumber);
    }
/* Question asked during Data.ai technical interview.
# add 5 to each decimal places from left to right of a given number and find which number among that combination is the greatest. -5000 to 5000 range could be given as input.
            # eg. given number : 1356 add 5 to the left 51356, then move 5
            # to the next decimal place 15356, 13556, 13556,13565.

 */

    /*
    Given an integer array nums, find the
subarray
 with the largest sum, and return its sum.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
     */

    public int maxSumArray(int[] nums) {
//        int[] arr = {1, 2, -5, 7, -3, 5};
        int curr_sum = 0;
        int max_sum = 0;

        if (nums.length == 1) {
            return nums[0];
        }

        for (int i : nums) {
            curr_sum += i;
            max_sum = max(max_sum, curr_sum);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }

        return max_sum;
    }


    @Test
    public void test_maxSumArray() {
//        int[] nums = {-2,1,-3,4,-1,2,1,-5,4}; // output:  6
//        int[] nums={1}; //Output: 1
        int[] nums = {5, 4, -1, 7, 8}; //Output: 23
//
        System.out.println("The maximum sum of the array is :" + maxSumArray(nums));

    }

    public ArrayList<Integer> two_sum(int[] data, int target) {
        int difference = 0;
        Map<Integer, Integer> dict = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < data.length; i++) {
            difference = target - data[i];
            if (!dict.containsKey(difference)) {
                dict.put(data[i], i);

            } else {
                result.add(0, dict.get(difference));
                result.add(1, i);

                return result;
            }

        }
        return null;
    }

    /*
      Two Sums: An array will be given and a target will be given. Find the two digits in the array wich will sum up to give
    the target. eg. array={1, 3, 2, 4, 7, 2, 8} target = 4. Then we should return 0,1 (position) values is 1,3=4

       */
    @Test
    public void test_two_sum() {

        int[] data = {1, 3, 2, 4, 7, 2, 8};
        int target = 11;
        List<Integer> result = new ArrayList<>();

        result = two_sum(data, target);
        System.out.println("The numbers : " + data[result.get(0)] + " and " + data[result.get(1)] + " will addup to get: " + target);

    }

    /*
    Reverse the given string, except the special characters. Special characters should be in the same position as the given
    string. Eg. Hell#$O*World should be returned as dlro#$W*OlleH
     */
    public StringBuilder reverse_string(String str1) {
        StringBuilder reverse = new StringBuilder();
        Map<Integer, Character> map = new HashMap<>();
        for (int i = str1.length() - 1; i >= 0; i--) {
            Character ch = str1.charAt(i);
            if (Character.isAlphabetic(ch)) {

                reverse.append(ch);
            } else {
                map.put(i, ch);
            }
        }
        for (Integer entry : map.keySet()) {
            reverse.insert(entry, Character.toString(map.get(entry)));
        }
//        for (Map.Entry<Integer, Character> entry : map.entrySet()) {
//            System.out.println("The Key is : " + entry.getKey()+" and the Value is : " + entry.getValue());
//        }


        return reverse;
    }

    @Test
    public void Test_revese_String() {
        String str = "Hell#$O*World";
        String reverse;
        reverse = String.valueOf(reverse_string(str));
        System.out.println("The reversed string except the special characters is: " + reverse + " and the given string is: " + str);
    }

    /*
    If the given string has matching closing brackets then return True else false
    eg. Str1="{{{}}}" - True
    Str2="{{{}}}}"- False
    Str3="{{{}}}[[]]"-True
    Str4="{{{}}}[[][]"-False
     */



/*
# Leet code question -Longest substring without repeating characters
Longest substring # s3 = "pwwkew" #ans should be : 4
s3 = 'abababcabcd'  # ans should be : 4
 */

public int longestSubstring(String str1)
{
    int len=str1.length();
    Map<Character,Integer> dict = new HashMap<>();
    int maxlen =0;
    int left=0;
    for(int right=0;right<len;right++)
    {
        if(dict.containsKey(str1.charAt(right))&& dict.get(str1.charAt(right))>=left)
        {
            left=(dict.get(str1.charAt(right)))+1;

        }
        else {
            dict.put(str1.charAt(right),right);
        }
        maxlen=max(maxlen,right-left+1);
    }

    return maxlen;
}
@Test
public void TestLongestSubstring()
{
//    String s3 = "pwwkew"; //ans should be : 3
    String s3 = "abcdabcabcde";  // ans should be : 4
    int output=longestSubstring(s3);
    System.out.println("The length of the longest substring without repeating character is: " + output);

}

}

