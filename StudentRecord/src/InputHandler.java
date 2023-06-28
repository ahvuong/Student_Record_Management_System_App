import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
public class InputHandler {
	public static StudentList s = new StudentList();
	public static void createStudentList() throws FileNotFoundException 
	{
		Scanner in = new Scanner(new File("StudentData.txt"));
		int id = 0;
		String fName, lName, major;
		double gpa = 0.0;
		id = in.nextInt();
		while(id != -999)
		{
			fName = in.next();
			lName = in.next();
			major = in.next();
			gpa = in.nextDouble();
			Student newStudent = new Student(id, fName, lName, major, gpa);
			in.nextLine();
			s.addStudent(newStudent);
			id = in.nextInt();
		}
		in.close();
	}
	public static StudentList list() {return s;}
}
