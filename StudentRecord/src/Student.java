import javax.swing.JOptionPane;

public class Student {
	private int ID;
	private String fName = "";
	private String lName = "";
	private String major = "";
	private double gpa;
	
	public Student()
	{
		ID = 0;
		gpa = 0.0;
	}
	public Student(int id, String fName, String lName, String major, double gpa)
	{
		this.ID = id;
		this.fName = fName;
		this.lName = lName;
		this.major = major;
		this.gpa = gpa;
	}
	
	//Getters
	public int getID() {return ID;}
	public String getFirst() {return fName;}
	public String getLast() {return lName;}
	public String getMajor() {return major;}
	public double getGPA() {return gpa;}
	
	//Setters
	public void setID(int id) {this.ID = id;}
	public void setFirst(String first) {fName = first;}
	public void setLast(String last) {lName = last;}
	public void setMajor(String major) {this.major = major;}
	public void setGPA(double gpa) {this.gpa = gpa;}
	
	
	//Display info
	public void showInfo()
	{
		JOptionPane.showInternalMessageDialog(null, "ID: " + ID + "\n" +
											  "Name: " + lName + " " + fName + "\n" +
											   "Major: " + major + "\n" +
											   "GPA: " + gpa,
				"information", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
