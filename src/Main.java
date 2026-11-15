import builder.BookingOrder;
import builder.OrderBuilder;
import factory.factories.IMAXTicketFactory;
import factory.factories.StandardTicketFactory;
import factory.factories.TicketFactory;
import factory.tickets.ITicket;

void main() {
    //FACTORY METHOD
    System.out.println("=== LAUNCHING MOVIE THEATRE BOOKING SYSTEM ===");
    System.out.println("--- FACTORY METHOD ---\n");

    // 1. Creating ticket with IMAX Ticket factory
    TicketFactory imaxFactory = new IMAXTicketFactory();
    ITicket imaxTicket = imaxFactory.createTicket("Interstellar", 1, 4, 10, 2500.0);
    System.out.print("Ticket created: \n");
    imaxTicket.printTicketInfo();
    System.out.println();

    // 2. Creating ticket with Standard Ticket factory
    TicketFactory standardFactory = new StandardTicketFactory();
    ITicket standardTicket = standardFactory.createTicket("Avatar 2", 2, 7, 15, 1500.0);
    System.out.print("Ticket created: \n");
    standardTicket.printTicketInfo();
    System.out.println();


    //BUILDER PATTERN
    System.out.println("--- BUILDER PATTERN ---\n");

    // 1. Putting together a complex order for an IMAX ticket (including popcorn, a drink, and a promo code)
    BookingOrder imaxOrder = new OrderBuilder(imaxTicket)
            .addPopcorn()
            .addDrink()
            .applyPromo("STUDENT2026")
            .build();

    imaxOrder.printOrderDetails();

    // 2. Putting together a simple order for a standard ticket (with insurance only)
    BookingOrder standardOrder = new OrderBuilder(standardTicket)
            .addInsurance()
            .build();

    standardOrder.printOrderDetails();
}