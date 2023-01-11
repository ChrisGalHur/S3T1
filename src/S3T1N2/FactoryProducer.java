package S3T1N2;

public class FactoryProducer {
    public static AbstractFactory getFactory(String contactTipe){
        if(contactTipe.equalsIgnoreCase("ADDRESS")){
            return new AddressFactory();
        }else if(contactTipe.equalsIgnoreCase("PHONE")){
            return new PhoneNumberFactory();
        }else{
            return null;
        }
    }
}
