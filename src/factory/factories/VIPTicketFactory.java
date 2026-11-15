package factory.factories;

import factory.tickets.ITicket;
import factory.tickets.VIPITicket;

public class VIPTicketFactory extends TicketFactory{

    @Override
    public ITicket createTicket(String movieName, int hallNumber, int row, int seat, double price) {
        return new VIPITicket(movieName, hallNumber, row, seat, price);
    }
}
