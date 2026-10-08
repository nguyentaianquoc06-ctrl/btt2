class student {
	private String id;
	private String name;
	private String email;
	private double gpa;

	public student() {
		this.id = "";
		this.name = "";
		this.email = "";
		this.gpa = 0.0;
	}

	public student(String id, String name) {
		this.id = id;
		this.name = name;
		this.email = "";
		this.gpa = 0.0;
	}

	public student(String id, String name, String email, double gpa) {
		this.id = id;
		this.name = name;
		this.email = email;

		if (gpa >= 0.0 && gpa <= 4.0) {
			this.gpa = gpa;
		} else {
			System.out.println("Lỗi: GPA phải từ 0.0 đến 4.0!");
			this.gpa = 0.0;
		}
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public double getGpa() {
		return gpa;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGpa(double gpa) {
		if (gpa >= 0.0 && gpa <= 4.0) {
			this.gpa = gpa;
		} else {
			System.out.println("Lỗi: GPA phải từ 0.0 đến 4.0!");
		}
	}

	public void display() {
		System.out.println("ID: " + id);
		System.out.println("Tên: " + name);
		System.out.println("Email: " + email);
		System.out.println("GPA: " + gpa);
		System.out.println("--------------------");
	}
}

public class b2 {
	public static void main(String[] args) {

		student sv1 = new student();
		sv1.setId("SV001");
		sv1.setName("Nguyen Van A");
		sv1.setEmail("a@gmail.com");
		sv1.setGpa(3.5);

		sv1.setGpa(-1);

		student sv2 = new student("SV002", "Nguyen Van B");
		sv2.setEmail("b@gmail.com");
		sv2.setGpa(3.2);

		student sv3 = new student("SV003", "Nguyen Van C", "c@gmail.com", 3.8);

		System.out.println("Sinh viên 1:");
		sv1.display();
	}
}
