package Chapter7;

public class Vehicle {
    //Class /Instance Variables
    private String color;
    private String model;
    private int year;
    private String registrationNumber;
    private double mileage;
    private String transmissionType;

    /**
     * constructor with default values
     */
    public Vehicle() {
        this.color = "White";
        this.transmissionType = "Manual";
        this.mileage = 0;
        this.year = 2000;
        this.registrationNumber = "None";
        this.model = "None";
    }

    /**
     * Overloaded constructor with initial values
     * @param theRegistrationNumber Vehicles registration number
     * @param theModel Model of the vehicle
     * @param theYear Manufacture's year
     * @param theColor Vehicles color
     * @param theMileage Vehicles mileage
     * @param theTransmissionType the Vehicles transmission type
     */
    public Vehicle(String theColor, String theTransmissionType, double theMileage, int theYear, String theRegistrationNumber, String theModel) {

        this.color = theColor;
        this.transmissionType = theTransmissionType;
        this.mileage = theMileage;
        this.year = theYear;
        this.registrationNumber = theRegistrationNumber;
        this.model = theModel;
    }

    /**
    *Method to display vehicle details
     */
    public void display() {
        System.out.println("Reg#: " + registrationNumber);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Transmission Type: " + transmissionType);
        System.out.println("Mileage: " + mileage);
    }
}
