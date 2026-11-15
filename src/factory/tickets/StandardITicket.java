package factory.tickets;

public class StandardITicket extends BaseTicket {

    private static final double STANDARD_BASE_PRICE = 1500.0;

    public StandardITicket(String movieName, int hallNumber, int row, int seat, double price){
        super(movieName, hallNumber, row, seat, STANDARD_BASE_PRICE);
    }

    @Override
    public double getPrice() {
        return STANDARD_BASE_PRICE;
    }

    @Override
    public void printTicketInfo() {
        System.out.println("Type: StandardTicket");
        System.out.println("Movie: " + getMovieName());
        System.out.println("Hall: " + getHallNumber());
        System.out.println("Row: " + getRow());
        System.out.println("Seat: " + getSeat());
        System.out.println("Price: " + getPrice());
    }

    @Override
    public String toString() {
        return "StandardTicket" +
                "movieName='" + movieName + '\'' +
                ", hallNumber=" + hallNumber +
                ", row=" + row +
                ", seat=" + seat +
                ", price=" + price +
                '}';
    }
}
