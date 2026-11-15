package factory.tickets;

public class IMAXITicket extends BaseTicket{

    private static final double IMAX_BASE_PRICE = 2500.0;

    public IMAXITicket(String movieName, int hallNumber, int row, int seat, double price){
        super(movieName, hallNumber, row, seat, IMAX_BASE_PRICE);
    }

    @Override
    public double getPrice() {
        return IMAX_BASE_PRICE;
    }

    @Override
    public void printTicketInfo(){
        System.out.println("Type: IMAXTicket");
        System.out.println("Movie: " + getMovieName());
        System.out.println("Hall: " + getHallNumber());
        System.out.println("Row: " + getRow());
        System.out.println("Seat: " + getSeat());
        System.out.println("Price: " + getPrice());
    };

    @Override
    public String toString() {
        return "IMAXITicket{" +
                "movieName='" + movieName + '\'' +
                ", hallNumber=" + hallNumber +
                ", row=" + row +
                ", seat=" + seat +
                ", price=" + price +
                '}';
    }
}
