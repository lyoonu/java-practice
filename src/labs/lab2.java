package labs;

public class lab2 {

	public static void main(String[] args) {
		
		Student stu1 = new Student("Jane","321456987");
		Student stu2 = new Student("Tom","3214445447");
		Student stu3 = new Student("Eli","3222226987");
		
		stu1.enroll("Math151");
		stu1.enroll("English255");
		stu1.enroll("History11");
		
		stu1.showCourses();
		stu1.checkBalance();
		stu1.payTuition(600);
		stu1.checkBalance();
		
		System.out.println(stu1.toString());
		
	}

}

class Student {
	// Properties
	private static int iD = 10;
	private String userId;
	
	private String name;
	private String ssn;
	private String email;
	private String courses = "";
	private static final int costOfCourses = 800;
	private int balance = 0;
	
	
	public Student(String name, String ssn) {
		iD++;
		
		this.name = name;
		this.ssn = ssn;
		setUserID();
		setEmail();
	}
	
	private void setEmail() {
		email = name.toLowerCase() + "." + iD + "@sdetuniversity.com";
		System.out.println("Your Email: " + email);
	}
	
	private void setUserID() {
		int max = 9000;
		int min = 1000;
		
		int randNum = (int) (Math.random() * (max - min));
		randNum = randNum + min;
		
		userId = iD + "" + randNum + ssn.substring(5);
		
		System.out.println("Your User ID: " + userId);
	}
	
	public void enroll(String course) {
		this.courses = this.courses + "\n" + course;
		balance = balance + costOfCourses;
	}
	
	public void payTuition(int amount) {
		System.out.println("Payment: $" + amount);
		balance = balance - amount;		
	}
	
	public void checkBalance() {
		System.out.println("Balance: $" + balance);		
	}
	
	public void showCourses() {
		System.out.println(courses);
	}
	
	public String toString() {
		return "[Name: " + name + "]\n[Courses: " + courses + "]\n[Balance: $" + balance + "]";
	}
	
	
	
	
}