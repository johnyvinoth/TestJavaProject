import org.testng.annotations.Test;

import java.util.*;

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
//                for(String key:hash.keySet())
//                {
////                    hash.computeIfPresent(key,(k,v)->v=v+1);
//                    int curr=hash.get(key);
//                    curr+=1;
//                    hash.put(key,curr);
//                }
                int curr = hash.get(in);
                curr += 1;
                hash.put(in, curr);
            }
        }
        for (String key : hash.keySet()) {
            System.out.println(key + ":" + hash.get(key));
        }
    }

    @Test
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
    @Test
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
        for (int i = 0; i <= input.size() - 2; i++) {
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
        List<Integer> n = new ArrayList<>(List.of(3,10,-5,6));
        array_comparator(n);
    }

    /*
 Interview questions asked during the Aspire first round.
 Total gift card value is 10000 and if there are duplicate products in the list then user should be informed and the duplicate entires to be removed, should allow user to purchase only the amount available in the gift card.
 */
    @Test
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

    @Test
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
    @Test
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
                {2 ,5, 6},
                {10, 8, - 12}
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

    public String cipherText(String message, int shift)
    {
        final String alpha="abcdefghijklmnopqrstuvwxyz";
        String msg=message.toLowerCase();
        String cipheredTxt="";
        for (int i=0;i<msg.length();i++)
        {
            int charPos=alpha.indexOf(msg.charAt(i));
            int keyVal= (charPos+shift)%26;
            char replaceVal= alpha.charAt(keyVal);
            cipheredTxt +=replaceVal;
        }
        return cipheredTxt;
        
    }
    @Test
    public void testCipherText()
    {
        String input="Aabdw.xyzZ";
        int shiftBy=3;
        String ciphered=cipherText(input,shiftBy);
        System.out.println("The given input : "+input+" is ciphered into :"+ciphered);

    }

}


