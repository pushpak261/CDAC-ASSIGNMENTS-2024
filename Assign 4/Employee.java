class Employee{                                               //Declares instance variables to store the name, roll number, and percentage of the employee
	String name;
	int rollNo;
	double percentage;

	void display(){                                             //Defines a method named display() to display the details of the employee.
		System.out.println("Name : "+name);
		System.out.println("Roll No : "+rollNo);
		System.out.println("Percentage : "+percentage);
	}

	void addDetails(String n, int rn, double p){                 //Defines a method named addDetails() to add details of the employee with parameters for name, roll number, and percentage.
		name=n;
		rollNo=rn;
		percentage=p;
	}


	void addDetails(int rn, double p){                          //Defines a method named addDetails() to add details of the employee with parameters for name, roll number, and percentage.
		rollNo=rn;
		percentage=p;
	}
}