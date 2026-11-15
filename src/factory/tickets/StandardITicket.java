package factory.tickets;

public class StandardITicket extends BaseTicket implements ITicket {
    public StandardITicket(String movieName, int hallNumber, int row, int seat, double price){
        super(movieName, hallNumber, row, seat, price);
    }

    @Override
    public void printTicketInfo() {
        System.out.println("Type: StandardTicket | " + "Movie: " + getMovieName() +
                "Hall: " + getHallNumber() +
                " | Row: " + getRow() +
                " | Seat: " + getSeat() + " | Price: " + getPrice());
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
