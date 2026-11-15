package factory.factories;

import factory.tickets.IMAXITicket;
import factory.tickets.ITicket;

public class IMAXTicketFactory extends TicketFactory{
    @Override
    public ITicket createTicket(String movieName, int hallNumber, int row, int seat, double price) {
        return new IMAXITicket(movieName, hallNumber, row, seat, price);
    }
}
