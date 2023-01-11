package S3T1N2;

public class AddressFactory extends AbstractFactory {

    @Override
    Contact getAddress(String country) {
        if(country.equalsIgnoreCase("CHINA")){
            return new ChinaAddress();
        }else if(country.equalsIgnoreCase("SPAIN")){
            return new SpainAdress();
        }
        return null;
    }

    @Override
    Contact getPhoneNumber(String country) {
        return null;
    }
}
