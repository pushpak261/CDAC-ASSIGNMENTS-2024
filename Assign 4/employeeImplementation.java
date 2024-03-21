class employeeImplementation{
	public static void main(String[] arg){
	Employee emp = new Employee();                //Creates an instance of the Employee class named emp.

	emp.addDetails("Pushpak",67,75.54f);    //Invokes the addDetails() method on the emp object to add details with parameters for name, roll number, and percentage.
	emp.display();                                  //Invokes the display() method on the emp object to display the details of the employee.

	emp.addDetails(67,75.54f);                //Invokes the overloaded addDetails() method on the emp object to add details with parameters for roll number and percentage only.
	emp.display();                                 //Invokes the display() method again to display the updated details of the employee.
	}
}


//Overall, this code demonstrates how to use the Employee class by creating instances, adding details using overloaded methods, and displaying the details of the employee.




