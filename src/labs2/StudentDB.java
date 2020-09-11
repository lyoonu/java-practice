package labs2;

public class StudentDB {

	public static void main(String[] args) {
		
		StudentInfo info1 = new StudentInfo("Jason", "12345678");
		
		info1.setPhone("010-7777-7711");
		info1.setCity("Sinlim");
		info1.setState("Seoul");
		info1.enroll("Math", 150);
		info1.enroll("Accounting", 150);
		info1.enroll("Taxation Law", 150);
		info1.checkBalance(200);
		
		System.out.println(info1.toString());
		System.out.println("***********************");

	}

}

class StudentInfo {
	
	private static final String iD = "2020";
	private String userId;
	
	private String name;
	private String SSN;
	private String email;
	
	private String phone;
	private String city;
	private String state;
	
	private double balance;
	private String courses;
	
	
	
	
	// Constructor
	public StudentInfo (String name, String SSN) {
		
		this.name = name;
		this.SSN = SSN;
		
		setCreateEmail();
		setUserId();
	}
	
	
	// Create EmailId based on the name
	private void setCreateEmail() {
		
		email = name.toLowerCase() + "@naver.com";
		System.out.println("Your Email: " + email);
		
	}
	
	private void setUserId() {
		
		int random = (int)(Math.random() * 10000);
		if(random < 1000) {
			random = (int)(Math.random() * 10000);
		}
		else if(random > 9000) {
			random = (int)(Math.random() * 10000);
		}
				
		userId = iD + random + SSN.substring(4,8);
		
		System.out.println("UserId: " + userId);

	}
	
	
	public void setPhone(String phone) {
		this.phone = phone;
		System.out.println("PhoneNumber: " + getPhone());
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setCity(String city) {
		this.city = city;
		System.out.println("City: " + getCity());
	}
	
	public String getCity() {
		return city;
	}
	
	public void setState(String state) {
		this.state = state;
		System.out.println("State: " + getState());
	}
	
	public String getState() {
		return state;
	}
	
	public void enroll(String enrollCourse, double amount) {
		
		this.balance = balance + amount;
		
		if(courses == null) {
			courses = enrollCourse;
		}else {
			courses = courses + ", " + enrollCourse;
		}

		showCourses();
		pay(balance);
	}
	
	public void pay(double amount) {
		System.out.println("You need to pay: $" + balance);
		
	}
	
	public void checkBalance(double payment) {
		
		double afterPay = payment - balance;
		
		if(afterPay < 0) {
			afterPay = 0;
		}else {
			afterPay = payment - balance;
		}
		System.out.println("After pay, Your balance: " + afterPay);
	}
	
	public void showCourses() {
		System.out.println("Your courses are " + courses);
	}
	
	public String toString() {
		
		String totalInfo = "[Name: " + name +"]\n["+"Email: " + email + "]\n[" + "PhoneNumber: " + phone + "]\n[" + "Courses: " + courses + "]";
		return totalInfo;
	}
	
}