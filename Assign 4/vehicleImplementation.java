class vehicleImplementation {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();                             //Creates an instance of the Vehicle class named v
        v.displayDetails();

        v.setDetails();                                       
        v.displayDetails();                                 

        v.setDetails("Hummer", 3500000);                    // Invokes the setDetails() method on the v object to set its details interactively via user input.
        v.displayDetails();                                       // Invokes the displayDetails() method on the v object to display its initial details.

        v.setDetails("Cruiz", 1600000, "Sedan");
        v.displayDetails();
    }
}

