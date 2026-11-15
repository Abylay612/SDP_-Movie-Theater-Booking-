package factory.tickets;

public class VIPITicket extends BaseTicket implements ITicket {
    public VIPITicket(String movieName, int hallNumber, int row, int seat, double price) {
        super(movieName, hallNumber, row, seat, price);
    }

    @Override
    public void printTicketInfo() {
        System.out.println("Type: VIPTicket | " + "Movie: " + getMovieName() +
                "Hall: " + getHallNumber() +
                " | Row: " + getRow() +
                " | Seat: " + getSeat() + " | Price: " + getPrice());
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
