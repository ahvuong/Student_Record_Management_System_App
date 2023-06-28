import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JOptionPane;


import java.text.SimpleDateFormat;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
public class Main {
	public static JFrame createFrame()
	{
		JFrame frame = new JFrame();
		frame.setSize(400,600);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.WHITE);
		return frame;
	}

	
	public static void main(String[] args) throws FileNotFoundException 
	{
		InputHandler.createStudentList();
		StudentList newList = InputHandler.list();
		DisplayMenu.menu(newList);		
	}

}
