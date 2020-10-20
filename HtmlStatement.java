public class HtmlStatement extends Statement {
    public String resultTop(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() +
               "</EM></H1><P>\n";
    }

    public String resultMid(Rental each) {
        return "\t" + each.getMovie().getTitle()+ ": " +
               String.valueOf(each.getCharge()) + "<BR>\n";
    }

    public String resultBottom(Customer aCustomer) {
        return "<P>You owe <EM>" +
               String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n" +
               "On this rental you earned <EM>" + 
               String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
               "</EM> frequent renter points<P>";
    }
}