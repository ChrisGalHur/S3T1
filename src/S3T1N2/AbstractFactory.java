package S3T1N2;

public abstract  class AbstractFactory {
    abstract Contact getAddress(String country);
    abstract Contact getPhoneNumber(String country);

    public static class ChinaAddress implements Contact {
        @Override
        public void save() {
            System.out.println("Contact saved: ChinaContact Address.");
        }
    }
}
