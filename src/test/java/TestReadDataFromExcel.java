import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestReadDataFromExcel {
    @Test
    public void printDataFromExcel() throws Exception {
        int listnumber = 1;
        List<List<String>> excelData = new ArrayList<>();
        String filepath = "src/test/resources/UserDetails.xlsx";


        excelData = ReadFromExcel.readFromExcel(filepath);
        for (int i = 1; i < excelData.size(); i++) {

//            System.out.println("The value in the list "+listnumber+" :"+excelData.get(i).toString());
            System.out.println("The user id :" + Integer.parseInt(excelData.get(i).get(0).replace(".0", "")) + " First Name : " + excelData.get(i).get(2) + " Last Name : " + excelData.get(i).get(3) + " Salary is: " + Integer.parseInt(excelData.get(i).get(4).replace(".0", "")));
            listnumber++;
        }

    }


    public <arg1> void  test(int... arg1) {
        for(int arg:arg1) {

        System.out.println(arg);
        }
    }
    @Test
    public void test1()
    {
        test(1,3,4,5);
    }


}
