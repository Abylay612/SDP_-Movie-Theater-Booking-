package builder;

import factory.tickets.ITicket;

public class OrderBuilder {
    // Fields that would get passed to BookingOrder
    protected final ITicket ticket;

    protected boolean hasPopcorn = false;
    protected boolean hasDrink = false;
    protected boolean hasInsurance = false;
    protected String promoCode = null;
    protected double finalPrice;

    // 1. Necessary fields of Builders constructor
    public OrderBuilder(ITicket ticket) {
        this.ticket = ticket;
        this.finalPrice = ticket.getPrice();
    }

    // 2. Methods for adding options (returns `this` to call method chaining)
    public OrderBuilder addPopcorn() {
        this.hasPopcorn = true;
        this.finalPrice += 800.0;
        return this;
    }

    public OrderBuilder addDrink() {
        this.hasDrink = true;
        this.finalPrice += 500.0;
        return this;
    }

    public OrderBuilder addInsurance() {
        this.hasInsurance = true;
        this.finalPrice += 300.0;
        return this;
    }

    public OrderBuilder applyPromo(String code) {
        this.promoCode = code;
        this.finalPrice *= 0.9;
        return this;
    }

    // 3. Method for building object
    public BookingOrder build() {

        return new BookingOrder(this);
    }
}
