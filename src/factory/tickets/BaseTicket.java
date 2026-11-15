package factory.tickets;

public abstract class BaseTicket{
    protected String movieName;
    protected int hallNumber;
    protected int row;
    protected int seat;
    protected double price;

    public BaseTicket(String movieName, int hallNumber, int row, int seat, double price) {
        setMovieName(movieName);
        setHallNumber(hallNumber);
        setRow(row);
        setSeat(seat);
        setPrice(price);
    }

    //Getters
    public String getMovieName(){
        return movieName;
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public int getRow() {
        return row;
    }

    public int getSeat() {
        return seat;
    }

    public double getPrice() {
        return price;
    }

    //Setters
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public abstract String toString();
}
