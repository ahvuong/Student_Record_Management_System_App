import java.util.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class StudentList {
	private List<Student> students = new LinkedList<Student>();
	public Student s;
	
	//constructor
	public StudentList() {}
	
	//Add a student
	public void addStudent(Student s)
	{
		students.add(s);
	}
	
	//is Empty
	public boolean isEmpty()
	{
		return students.isEmpty();
	}
	
	//highest gpa
	public int highestGPA()
	{
		int id = 0;
		if(isEmpty())
			JOptionPane.showMessageDialog(null, "List is empty", "alert", JOptionPane.ERROR_MESSAGE);
		else
		{
			double highest = 0.0;			
			for(Student s:students)
			{
				if(s.getGPA() > highest)
				{
					highest = s.getGPA();
					id = s.getID();
				}
			}			
		}
			return id;
	}
	
	//search for student
	public boolean searchStudent(int ID)
	{
		s = new Student();
		return searchStudent(ID, s);
	}
	
	public boolean searchStudent(int ID, Student a)
	{
		if(isEmpty())
			JOptionPane.showMessageDialog(null, "List is empty", "alert", JOptionPane.ERROR_MESSAGE);
		else
		{
			for(Student e:students)
			{
				if(e.getID() == ID)
				{
					s = e;
					return true;
				}
			}
			JOptionPane.showMessageDialog(null, "ID is not on the list", "alert", JOptionPane.ERROR_MESSAGE);
		}
		return false;
	}
	
	// Print a student
	public void printStudent(int ID)
	{
		if(searchStudent(ID, s))
			s.showInfo();
	}
	
	//show list
	public void printList()
	{
		int size = students.size();
		String[] columnNames = {"ID", "Last Name", "First Name", "Major", "GPA"};
		Object[][] data = new Object[size][5];
		int i = 0;
		int j = 0;
		for(Student s:students)
		{
			data[i][j] = s.getID();
			j++;
			data[i][j] = s.getLast();
			j++;
			data[i][j] = s.getFirst();
			j++;
			data[i][j] = s.getMajor();
			j++;
			data[i][j] = s.getGPA();
			j = 0;
			i++;
		}
		JFrame frame = Main.createFrame();
		JTable table =  new JTable(data, columnNames);
		table.setVisible(true);
		table.setSize(400, 600);
		table.setColumnSelectionAllowed(false);
		table.setRowSelectionAllowed(false);
	
		frame.setResizable(false);
		frame.add(table);
	}
	
}
