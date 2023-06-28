import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class DisplayMenu {
	static JButton first = new JButton("Show all students");
	static JButton second = new JButton("Highest GPA student");
	static JButton third = new JButton("Find a Student");	
	static JButton fourth = new JButton("Exit");	
	public void test(ActionEvent e)
	{
		if(e.getSource() == first)
			System.out.println("TEST TEST TEST");
	}
	public static void menu(StudentList s)
	{
						
		first.setBounds(50, 100, 280, 30);
		first.addActionListener(e -> {s.printList();});	
		
		second.setBounds(50, 150, 280, 30);	
		second.addActionListener(e -> {int id = s.highestGPA();
										s.printStudent(id);});
		third.setBounds(50, 200, 280, 30);		
		third.addActionListener(e -> {int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Student ID"));
									 if(s.searchStudent(id))
										 s.printStudent(id);});
		
		fourth.setBounds(50, 250, 280, 30);
		fourth.addActionListener(e -> {System.exit(0);});
		
		JLabel title = new JLabel();
		title.setText("STUDENTS RECORD");
		title.setBounds(60, 30, 280, 30);
		title.setForeground(Color.BLACK);
		title.setFont(new Font("Cambria", Font.PLAIN, 30));
		
		
		JFrame frame = new JFrame();
		frame.setTitle("Student Record");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(400,600);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.add(first);
		frame.add(second);
		frame.add(third);
		frame.add(fourth);
		frame.add(title);
	}
	
	
}
