package inheritance;
/* 
  A HighSchool application has two classes: the Person superclass and the Student subclass. Using inheritance,
  in this lab you will create two new classes, Teacher and CollegeStudent.
  A Teacher will be like Person but will have additional properties such as salary (the amount the teacher earns) and
  subject (e.g. “Computer Science”, “Chemistry”,  “English”, “Other”).
  The CollegeStudent class will extend the Student class by adding a year (current level in college) and
   major (e.g. “Electrical Engineering”, “Communications”, “Undeclared”).
 */
public class Student extends Person {
	
}
class Teacher extends Person{
	double salary;
	String subject;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
class CollegeStudent extends Student{
	int year;
	String major;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
}