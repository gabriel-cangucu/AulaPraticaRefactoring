import java.util.Enumeration;

public class TextStatement extends Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();

        String result = resultTop(aCustomer);

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            //show figures for each rental
            result += resultMid(each);
        }

        //add footer lines
        result += resultBottom(aCustomer);

        return result;
    }

    public String resultTop(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    public String resultMid(Rental each) {
        return "\t" + each.getMovie().getTitle()+ "\t" +
               String.valueOf(each.getCharge()) + "\n";
    }

    public String resultBottom(Customer aCustomer) {
        return "Amount owed is " +
               String.valueOf(aCustomer.getTotalCharge()) + "\n" +
               "You earned " +
               String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
               " frequent renter points";
    }
}