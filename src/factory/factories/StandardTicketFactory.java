package factory.factories;

import factory.tickets.ITicket;
import factory.tickets.StandardITicket;

public class StandardTicketFactory extends TicketFactory{

    @Override
    public ITicket createTicket(String movieName, int hallNumber, int row, int seat, double price) {
        return new StandardITicket(movieName, hallNumber, row, seat, price);
    }
}
