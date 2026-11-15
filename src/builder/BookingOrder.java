package builder;

import factory.tickets.ITicket;

public class BookingOrder {
    //Main fields
    private final ITicket ticket;

    // Extra fields (Can be false/null by default)
    private final boolean hasPopcorn;
    private final boolean hasDrink;
    private final boolean hasInsurance;
    private final String promoCode;
    private final double finalPrice;

    // Private constructor that accepts Builder
    protected BookingOrder(OrderBuilder builder) {
        this.ticket = builder.ticket;
        this.hasPopcorn = builder.hasPopcorn;
        this.hasDrink = builder.hasDrink;
        this.hasInsurance = builder.hasInsurance;
        this.promoCode = builder.promoCode;
        this.finalPrice = builder.finalPrice;
    }

    //Getters
    public ITicket getTicket() {return ticket; }
    public double getFinalPrice() { return finalPrice; }


    public void printOrderDetails() {
        System.out.println("=== ORDER DETAILS (Builder) ===");
        ticket.printTicketInfo();
        System.out.println("Base ticket price: " + ticket.getPrice());
        System.out.println("Popcorn: " + (hasPopcorn ? "Yes" : "No"));
        System.out.println("Drink: " + (hasDrink ? "Yes" : "No"));
        System.out.println("Insurance: " + (hasInsurance ? "Yes" : "No"));
        if (promoCode != null) {
            System.out.println("Promo code: " + promoCode);
        }
        System.out.println("Final price: " + finalPrice + " KZT\n");
    }
}