package btvn2
class MyDate {
	int day;
	int month;
	int year;

	MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	void display() {
		System.out.println(day + "/" + month + "/" + year);
	}
}

class Employee {
	String name;
	MyDate birthday;

	Employee(String name, MyDate birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	Employee(Employee other) {
		this.name = other.name;

		this.birthday = new MyDate(other.birthday.day, other.birthday.month, other.birthday.year);
	}
}

public class b4 {
	public static void main(String[] args) {

		Employee emp1 = new Employee("NgTAQ", new MyDate(1, 1, 2000));

		Employee emp2 = new Employee(emp1);

		emp1.birthday.day = 2;
		emp1.birthday.month = 2;
		emp1.birthday.year = 2022;
		System.out.print("Ngay sinh : ");
		emp2.birthday.display();
	}
}
