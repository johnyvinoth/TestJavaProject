package BuilderPattern;

public class Phone {
    private CommonEnums.PhoneType phoneType;
    private CommonEnums.Processor processor;
    private CommonEnums.ModelName modelName;
    Integer batteryCapacity;

    public Phone(CommonEnums.PhoneType phoneType, CommonEnums.Processor processor, CommonEnums.ModelName modelName, Integer batteryCapacity)
    {
        this.phoneType = phoneType;
        this.processor = processor;
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneType=" + phoneType +
                ", processor=" + processor +
                ", modelName=" + modelName +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}
