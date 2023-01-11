package S3T1N2;

public class PhoneNumberFactory extends AbstractFactory {
    @Override
    Contact getAddress(String country) {
        return null;
    }

    @Override
    Contact getPhoneNumber(String country) {
        if(country.equalsIgnoreCase("CHINA")){
            return new ChinaPhoneNumber();
        }else if(country.equalsIgnoreCase("SPAIN")){
            return new SpainPhoneNumber();
        }
        return null;
    }
}
