public class Book {
    // describe a book, create all the variables we need
    // name, author, ID, price in USD, availability
    // using conversion rate, calculate EUR Price of book
    // using conversion rate, calculate RUB Price of book
    // print all the book details including prices

    String euro = "EUR";
    String ruble = "RUB";

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.createNewBook("Harry Potter", "J.K. Rowling", 1, 10.5, false);
        book1.createNewBook("Anna Karenina", "L. Tolstoy", 2, 20.0, true);
    }

    public void createNewBook(String bookName, String authorName, int ID, double priceInUSD, boolean isAvailable) {
        double priceInEUR = calculatePrice(priceInUSD, euro);
        double priceInRUB = calculatePrice(priceInUSD, ruble);

        System.out.println("Book name is: " + bookName);
        System.out.println("Book ID is: " + ID);
        System.out.println("Book price: " + priceInUSD + " USD, " + priceInEUR + " EUR, " + priceInRUB + " RUB");
        System.out.println("Book is available " + isAvailable);
    }

    public double calculatePrice(double priceInUSD, String currency) {
        double rate = 1;
        if (currency.equals(euro)) {
            rate = 1.1;
        } else if (currency.equals(ruble)) {
            rate = 70.00;
        } else {
            System.out.println("Error: unknown currency, USD price will be return");
        }
        double priceAfterConversion = priceInUSD * rate;
        return priceAfterConversion;
    }


}
