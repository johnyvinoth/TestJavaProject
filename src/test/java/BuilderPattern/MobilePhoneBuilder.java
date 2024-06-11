package BuilderPattern;

public class MobilePhoneBuilder {
    private CommonEnums.PhoneType phoneType;
    private CommonEnums.Processor processor;
    private CommonEnums.ModelName modelName;
    Integer batteryCapacity;

//    public MobilePhoneBuilder(CommonEnums.PhoneType phoneType, CommonEnums.Processor processor, CommonEnums.ModelName modelName, Integer batteryCapacity) {
//    }

    public MobilePhoneBuilder setPhoneType(CommonEnums.PhoneType phoneType) {
        this.phoneType = phoneType;
        return this;
    }

    public MobilePhoneBuilder setProcessor(CommonEnums.Processor processor) {
        this.processor = processor;
        return this;
    }

    public MobilePhoneBuilder setModelName(CommonEnums.ModelName modelName) {
        this.modelName = modelName;
        return this;
    }

    public MobilePhoneBuilder setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    public Phone getPhone() {
        return new Phone(phoneType, processor, modelName, batteryCapacity);
    }
}
