class Vehicle{
    String regNo;
    int dailyRate;
    Vehicle(String regNo, int dailyRate) {
        this.regNo = regNo;
        this.dailyRate = dailyRate;
    }
    double computeRent(int days){
        return dailyRate * days;
    }
}

class Car extends Vehicle {
    int numDoors;

    Car(String regNo, int dailyRate, int numDoors) {
        super(regNo, dailyRate);
        this.numDoors = numDoors;
    }

    @Override
    double computeRent(int days) {
        return super.computeRent(days) + 200;
    }

    public class VehicleRental{
        public static void main(String[] args){
            Car c = new Car("KL63J6371", 2000, 4);
            System.out.println("Total Rent : " + c.computeRent(4));
        }
    }