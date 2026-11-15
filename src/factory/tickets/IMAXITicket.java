package factory.tickets;

public class IMAXITicket extends BaseTicket implements ITicket {

    public IMAXITicket(String movieName, int hallNumber, int row, int seat, double price){
        super(movieName, hallNumber, row, seat, price);
    }


    @Override
    public void printTicketInfo(){
        System.out.println("Type: IMAXITicket | " + "Movie: " + getMovieName() +
                "Hall: " + getHallNumber() +
                " | Row: " + getRow() +
                " | Seat: " + getSeat() + " | Price: " + getPrice());
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
