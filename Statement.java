import java.util.Enumeration;

abstract class Statement {
    abstract String resultTop(Customer aCustomer);
    abstract String resultMid(Rental each);
    abstract String resultBottom(Customer aCustomer);
    
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
}