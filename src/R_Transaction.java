public class R_Transaction {
    private Vehicle vehicle;
    private Customer customer;
    private int rentalDays;
    private double cost;

    public R_Transaction(Vehicle vehicle, Customer customer, int rentalDays) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
        this.cost = vehicle.calculateRentalCost(rentalDays);
    }

    @Override
    public String toString() {
        return "Transaction: " + customer.getName() + " rented " + vehicle.getModel() + " for " + rentalDays + " days at a cost of ₵" + cost;
    }
}
