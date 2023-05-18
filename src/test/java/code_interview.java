import org.testng.annotations.Test;

import java.util.*;

public class code_interview
{
    @Test(enabled = false)
    public String reverseString(String s) {
//        String str = "Hello World";
        String str=s;
        String RevStr = "";
        String temp = str.replaceAll(" ","");
        char[] charArr = temp.toCharArray();
        for (int i=charArr.length-1; i>=0; i--)
        {
            RevStr +=charArr[i];
        }
        System.out.println("The input string is : "+str);
        System.out.println("The reversed string is : "+RevStr);
        return RevStr;
    }
    @Test(enabled = true)
    public void checkPalindrome()
    {
        String inputStr="mama";
        String rString= reverseString(inputStr);
        if (inputStr.contentEquals(rString))
        {
            System.out.println("The given string is a palindrome");
        }
        else
        {
            System.out.println("The given string is not a palindrome");
        }

    }
//    This code finds the number of times a unique word is present in a string
    @Test
    public void getNumberOfInstance()
    {
        String input="This this is written in JAVA JAVA JAVA java in this";
        String[] inArr= input.split(" ");
        HashMap<String,Integer> hash=new HashMap<>();

        for(String in:inArr)
        {
//            System.out.println(in);
            if(!hash.containsKey(in))
            {
                hash.put(in,1);
            }
            else
            {
//                for(String key:hash.keySet())
//                {
////                    hash.computeIfPresent(key,(k,v)->v=v+1);
//                    int curr=hash.get(key);
//                    curr+=1;
//                    hash.put(key,curr);
//                }
                int curr=hash.get(in);
                curr+=1;
                hash.put(in,curr);
            }
        }
        for(String key:hash.keySet())
        {
            System.out.println(key +":"+hash.get(key));
        }
    }
    @Test
    public void findArmstrongNum(int i)
    {
//        int input=1534;
        int input=i;
        int sum=0;
        int temp=input;
        int reminder;
        while (temp>0)
        {
            reminder=temp%10;
            sum +=reminder*reminder*reminder;
            temp =(int)(Math.floor(temp/10));

        }
        if (sum==input)
        {
            System.out.println("The given number : "+input+ " is an Armstrong number");
        }
        else
        {
//            System.out.println("The given number : "+input+ " is not an Armstrong number");
        }
    }
    @Test
    public void loopAmstrong()
    {
        int limit = 1000    ;
        for(int i=0;i<=limit;i++)
        {
            findArmstrongNum(i);
        }
    }
    @Test
    public void collections()
    {
        Set<String> fruits= new HashSet<>();
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("orange");
        System.out.println("The FruitSets are : "+fruits);

        List<String> fruitList= new ArrayList<>();
        fruitList.add("apple");
        fruitList.add("apple");
        fruitList.add("apple");
        fruitList.add("orange");
        System.out.println("The FruitLists are : "+fruitList+"\n");

        HashMap<Integer,String> fruitMap=new HashMap<>();
        for(int i=0;i<=fruitList.size()-1;i++)
        {
            fruitMap.put(i,fruitList.get(i));
        }
        for(Integer key:fruitMap.keySet())
        {
            System.out.println(key +":"+fruitMap.get(key));
        }
    }
}
