
import java.util.Scanner;

class Vehicle {
    String name ="wr-v";                                          //Declares instance variables to store the name, price, and category of the vehicle.
    int price=1050000;
    String category="SUV";

    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
        System.out.println("Category : " + category);
    }

    public void setDetails() {                                                 //This method allows the user to set the details of the vehicle interactively via the console.
        Scanner sc = new Scanner(System.in);                                     //It creates a Scanner object to read input from the user.
        
        System.out.println("Enter Vehicle Name");
        name = sc.nextLine();                                                      //Reads the input values and assigns them to the instance variables of the Vehicle object.

        System.out.println("Enter price");
        price=sc.nextInt();

        System.out.println("Enter category");
        category=sc.next();

        sc.close();
    }

    public void setDetails(String name, int price, String category){                
        this.name=name;                                                                                                       
        this.price=price;
        this.category=category;
    }

    public void setDetails(String n, int p){
        this.name=n;
        this.price=p;
    }
}


/*
 Overloaded setDetails() Methods:

There are two overloaded versions of the setDetails() method.
The first overloaded method takes input parameters for the name, price, and category, allowing the caller to set these details programmatically.
The second overloaded method takes input parameters for the name and price only, allowing the caller to set these details without specifying the category.
 */