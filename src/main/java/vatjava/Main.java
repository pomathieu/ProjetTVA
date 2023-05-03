package src.main.java.vatjava;

import javax.xml.ws.Holder;
import javax.xml.datatype.XMLGregorianCalendar;


public class Main {

    public static void main(String[] args) {
        // Check that the number of command-line arguments is correct
        if (args.length != 2) {
            System.err.println("Usage: java -jar projettva-1.0-SNAPSHOT.jar [countryCode] [vatNumber]");
            System.exit(1);
        }
   
        // Create a CheckVatTestService instance
        CheckVatService service = new CheckVatService();

        // Get the CheckVatPortType instance
        CheckVatPortType port = service.getCheckVatPort();

        // Read the VAT code
        String countryCode = args[0].trim().toUpperCase();
        String vatNumber = args[1].trim();

        // Check the VAT code
        CheckVat checkVat = new CheckVat();
        checkVat.setCountryCode(countryCode);
        checkVat.setVatNumber(vatNumber);
        
        Holder<String> countryCodeHolder = new Holder<>(checkVat.getCountryCode());
        Holder<String> vatNumberHolder = new Holder<>(checkVat.getVatNumber());
        Holder<XMLGregorianCalendar> requestDateHolder = new Holder<>();
        Holder<Boolean> validHolder = new Holder<>();
        Holder<String> nameHolder = new Holder<>();
        Holder<String> addressHolder = new Holder<>();
        
        port.checkVat(countryCodeHolder, vatNumberHolder, requestDateHolder, validHolder, nameHolder, addressHolder);
        
        if (validHolder.value) {
            System.out.println("The VAT code is valid." + System.lineSeparator());
            System.out.println("Name: " + nameHolder.value + System.lineSeparator());
            System.out.println("Address: " + addressHolder.value + System.lineSeparator());
        } else {
            System.out.println("The VAT code is invalid." + System.lineSeparator());
        }
        
    }
}   
