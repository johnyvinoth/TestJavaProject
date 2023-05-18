import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Demo_Latest {

//    interview question asked during the Data.ai interview.
    public  static void main(String[] args)
    {
        System.out.println("Please enter the Value for which integer to be added: ");
        Scanner scanner=new Scanner(System.in);
        int Limit=scanner.nextInt();
        add(Integer.toString(Limit));
    }
    public static void add(String Num)
    {
        StringBuffer stringBuffer=new StringBuffer(Num);
        String[] arrStr=new String[stringBuffer.length()+1];
        Integer[] Number=new Integer[stringBuffer.length()+1];
        boolean isNegative=false;
        //Condition check to remove '-' when the input is Negative.
        if(stringBuffer.substring(0,1).equals("-"))
        {
           isNegative=true;
           stringBuffer= new StringBuffer(stringBuffer.substring(1)) ;
           Num=stringBuffer.toString();
           Number=new Integer[stringBuffer.length()+1]; //Redefine the length to include '-'
        }
        for(int i=0;i<=Num.length();i++)
        {
            stringBuffer.insert(i, "5");

            if(isNegative)
            {
                stringBuffer.insert(0, "-"); //add '-' before every result
            }
            System.out.println("The possible combination of values are : "+stringBuffer+ " Value of i :"+i);
            arrStr[i]=stringBuffer.toString();
            Number[i]=Integer.parseInt(arrStr[i]) ;
            stringBuffer=new StringBuffer(Num);
        }
        System.out.println("The Biggest number is "+ Collections.max(Arrays.asList(Number)));
    }
}