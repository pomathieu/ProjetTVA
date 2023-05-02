package vatjava;
import java.util.Scanner;
import javax.xml.ws.Holder;
import javax.xml.datatype.XMLGregorianCalendar;


public class Main {

    public static void main(String[] args) {
        // Create a CheckVatTestService instance
        CheckVatService service = new CheckVatService();

        // Get the CheckVatPortType instance
        CheckVatPortType port = service.getCheckVatPort();

        // Read the VAT code
       try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Please enter the country code:");
        String countryCode = scanner.nextLine().trim().toUpperCase();
        System.out.println("Please enter the VAT number:");
        String vatNumber = scanner.nextLine().trim();

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
            System.out.println("The VAT code is valid.");
            System.out.println("Name: " + nameHolder.value);
            System.out.println("Address: " + addressHolder.value);
        } else {
            System.out.println("The VAT code is invalid.");
        }
    }
}   

}