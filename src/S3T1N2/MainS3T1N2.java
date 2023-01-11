package S3T1N2;

import java.util.Scanner;

public class MainS3T1N2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
		/*Abstract Factory
		 * https://www.youtube.com/watch?v=yQ4omlezvlE&t=84s

		Crea un petit gestor de direccions i números de telèfon internacionals.

		L'aplicació ha de permetre afegir a l'agenda, adreces i números de telèfon internacionals.
		Tenint en compte els diferents formats dels diferents països, construeix l'agenda,
		les adreces i els telèfons implementant un patró Abstract Factory.*/

        int optionAdd;

        do {
            System.out.println("1- Add Telephone Number.\n" +
                    "2- Add Address.\n" +
                    "0- Exit.");
            optionAdd = scan.nextInt();
            scan.nextLine();

            switch(optionAdd){
                case 1:
                    addContact("PHONE");
                    break;
                case 2:
                    addContact("ADDRESS");
                    break;
                default:
                    break;
            }
        }while(optionAdd != 0);
    }

    private static void addContact(String tipeContact) {
        /*AbstractFactory contactFactory = FactoryProducer.getFactory("ADDRESS");
        Contact addContact = contactFactory.getAddress("SPAIN");
        addContact.save();*/

        String personalContact;
        String internationalOption;

        System.out.println("Write country option:\n" +
                "CHINA.\n" +
                "SPAIN.");
        internationalOption = scan.nextLine();
        System.out.println("Write " + tipeContact + ":");
        scan.nextLine();

        AbstractFactory contactFactory = FactoryProducer.getFactory(tipeContact);
        if(tipeContact.equalsIgnoreCase("ADDRESS")){
            Contact addingContact = contactFactory.getAddress(internationalOption);
            addingContact.save();
        }else{
            Contact addingContact = contactFactory.getPhoneNumber(internationalOption);
            addingContact.save();
        }
    }
}
