import java.util.Scanner;

class Course{
	private String courseCode,courseName,department,timeSlot;
	private int maxStudents,enrollStudents;
	Professor professor;
	public Course(String courseCode, String courseName, String department,
				String timeSlot, int maxStudents) {
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.department = department;
		this.timeSlot = timeSlot;
		this.maxStudents = maxStudents;
		this.enrollStudents = 0;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public String getCourseName() {
		return courseName;
	}
	public String getDepartment() {
		return department;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public int getMaxStudents() {
		return maxStudents;
	}
	public int getEnrollStudents() {
	return enrollStudents;
	}
	public Professor getProfessor() {
		return professor;
	}
	
	public boolean enrollStudent() {
		if(this.enrollStudents<this.maxStudents)
		{
			this.enrollStudents++;
			return true;
		}
		else
			return false;
	}
	
	public void assignProfessor(Professor prof)
	{
		this.professor = prof;
	}
	@Override
	public String toString() {
		return "Course [courseCode=" + courseCode + ", courseName=" + courseName + ", department=" + department
				+ ", timeSlot=" + timeSlot + ", maxStudents=" + maxStudents + ", enrollStudents=" + enrollStudents
				+ ", professor=" + ((professor==null)?null:professor.getName()) + "]";
	}
}
class Professor{
	private String name;
	private Course assignedCourse;
	public Professor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public Course getAssignedCourse() {
		return assignedCourse;
	}
	public void setAssignedCourse(Course assignedCourse) {
		this.assignedCourse = assignedCourse;
	}
}

class Student{
	private String name;
	private Course enrolledCourse;
	public Student(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public Course getEnrolledCourse() {
		return enrolledCourse;
	}
	
	public boolean enrollCourse(Course course)
	{
		if(enrolledCourse == null && course.enrollStudent())
		{
			this.enrolledCourse = course;
			return true;
		}
		else
		{
			System.out.println("Student Already Registered");
			return false;
		}
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", enrolledCourse=" + enrolledCourse + "]";
	}
	
}
public class University {
	private static Scanner sc = new Scanner(System.in);
	private static Course ECE411 = new Course("ECE411","MPMC","ECE","11:00Am", 2);
	
	private static Course CSE510 = new Course("CSE510","DBMS","CSE","9:00Am", 2);
	
	private static Course MECH312 = new Course("MECH312","FM","MECH","10:00Am", 2);
	
	private static Course EEE206 = new Course("EEE206","NA","EEE","2:00Pm", 2);
	
	private static Course CIV101 = new Course("CIV101","SM","CIV","3:00Pm", 2);
	
	private static Professor prem = new Professor("Prem");
	private static Professor naresh = new Professor("Naresh");
	
	public static void main(String[] args) {
		while(true)
		{
			System.out.println("1.Display Courses\t2.Assign Proff\t3.Enroll Student\t4.Exit  ::");
			switch(Integer.parseInt(sc.nextLine()))
			{
			case 1:
				System.out.println(ECE411.toString());
				System.out.println(CSE510.toString());
				System.out.println(MECH312.toString());
				System.out.println(EEE206.toString());
				System.out.println(CIV101.toString());
				break;
			case 2:
				assignProftoCourse();
				break;
			case 3:
				enrollStudentinCourse();
				break;
			case 4:
				System.out.println("Thankyou..!");
				sc.close();
				System.exit(0);
			}
		}
	}



	private static void assignProftoCourse() {
		System.out.println("Enter Professor Name : ");
		String profname = sc.nextLine();
		Professor prof = findprofbyName(profname);
		if(prof==null)
		{
			System.out.println("Professor Not Found");
			return;
		}
		System.out.println("Enter Course to Assign :: ");
		Course cou = findCoursebyName(sc.nextLine());
		
		if(cou == null)
		{
			System.out.println("No Course Found");
			return;
		}
		cou.assignProfessor(prof);
		prof.setAssignedCourse(cou);
		
	}

	private static Course findCoursebyName(String name) {
		if(name.equalsIgnoreCase(CIV101.getCourseName()))
			return CIV101;
		else if(name.equalsIgnoreCase(CSE510.getCourseName()))
			return CSE510;
		else if(name.equalsIgnoreCase(ECE411.getCourseName()))
			return ECE411;
		else if(name.equalsIgnoreCase(EEE206.getCourseName()))
			return EEE206;
		else if(name.equalsIgnoreCase(MECH312.getCourseName()))
			return MECH312;
		else
			return null;
	}

	private static Professor findprofbyName(String profname) {
		if(profname.equalsIgnoreCase(naresh.getName()))
			return naresh;
		else if (profname.equalsIgnoreCase(prem.getName()))
			return prem;
		return null;
	}

	private static void enrollStudentinCourse() {
		System.out.println("Enter Student : ");
		Student st = new Student(sc.nextLine());
		System.out.println("Enter Course: ");
		Course cou = findCoursebyName(sc.nextLine());
		if(cou == null)
		{
			System.out.println("No Course Found");
			return;
		}
		if(st.enrollCourse(cou))
		{
			System.out.println(st.toString());
		}
		else
			System.out.print("Student Already Enrolled OR Class Full");
	}
}
