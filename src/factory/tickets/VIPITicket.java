package factory.tickets;

public class VIPITicket extends BaseTicket {

    private static final double VIP_BASE_PRICE = 4000.0;

    public VIPITicket(String movieName, int hallNumber, int row, int seat, double price) {
        super(movieName, hallNumber, row, seat, VIP_BASE_PRICE);
    }

    @Override
    public double getPrice() {
        return VIP_BASE_PRICE;
    }

    @Override
    public void printTicketInfo() {
        System.out.println("Type: VIPTicket");
        System.out.println("Movie: " + getMovieName());
        System.out.println("Hall: " + getHallNumber());
        System.out.println("Row: " + getRow());
        System.out.println("Seat: " + getSeat());
        System.out.println("Price: " + getPrice());
    }

    @Override
    public String toString() {
        return "VIPTicket{" +
                "movieName='" + movieName + '\'' +
                ", hallNumber=" + hallNumber +
                ", row=" + row +
                ", seat=" + seat +
                ", price=" + price +
                '}';
    }
}
