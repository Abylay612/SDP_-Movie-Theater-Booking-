package factory.factories;

import factory.tickets.ITicket;

public abstract class TicketFactory {

    public abstract ITicket createTicket(String movieName, int hallNumber, int row, int seat, double price);

    public void createAndShowTicket(String movieName, int hallNumber, int row, int seat, double price){
        ITicket ticket = createTicket(movieName, hallNumber, row, seat, price);
        ticket.printTicketInfo();
    }
}
