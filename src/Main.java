public class Main {
    public static void main(String[] args){
        RentalAgency agency = new RentalAgency();
        car car = new car("53","69 CHEVY cHEVERLLE SS 396",500.00,true,true);
        Motorcycle motorcycle = new Motorcycle("F3 800","Mercedes-AMG GT",200.0,true,false);
        Truck truck =  new Truck("Arocs 6×6","Mercedes-Benz",400.00,true,1500);

        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        Customer customer = new Customer("Ayda");
        try{
            agency.rentVehicle("53",customer,5);
            agency.rentVehicle("201",customer,3);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        agency.returnVehicle(car,customer);
    }
}