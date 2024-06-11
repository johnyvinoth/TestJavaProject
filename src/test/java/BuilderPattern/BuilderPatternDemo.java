package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class BuilderPatternDemo {

    public static void main(String[] args)
    {
        Phone p1=new MobilePhoneBuilder()
                .setBatteryCapacity(5000)
                .setModelName(CommonEnums.ModelName.SAMSUNG_S24)
                .setProcessor(CommonEnums.Processor.SNAPDRAGON_GEN3)
                .getPhone();

        System.out.println(p1);
    }

}
