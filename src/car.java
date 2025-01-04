public class car extends Vehicle{
    private boolean hasAirConditioning;
    public car(String vehicleID,String model,double baseRentalRate,
               boolean isAvailable, boolean hasAirConditioning){
        super(vehicleID,model,baseRentalRate,isAvailable);
        this.hasAirConditioning = hasAirConditioning;
    }
    @Override
    public double calculateRentalCost(int days){
        double rate = getBaseRentalRate();
        if(hasAirConditioning){
            rate += 5;
        }
        return rate * days;
    }
}
