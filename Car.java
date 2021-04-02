package car.rent;

import java.awt.EventQueue;
import java.awt.Image;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;

import javax.swing.JFrame;

import com.toedter.calendar.JCalendar;

import java.awt.BorderLayout;

import javax.swing.JMenuBar;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDayChooser;

import javax.swing.JPasswordField;

import java.awt.GridLayout;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JLabel;

import com.toedter.components.JSpinField;

import javax.swing.JTextArea;
import javax.swing.JList;

import java.awt.Color;

import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;

public class Car extends JFrame{

	private JFrame frame;
	private JTextField txtCar;
	private JTextField txtCar_1;
	private JTextField txtCar_2;
	private JTextField txtRent;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Car window = new Car();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Car() {
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setLayout(null);
		
		
		
		txtCar = new JTextField();
		txtCar.setBorder(null);
		txtCar.setHorizontalAlignment(SwingConstants.LEFT);
		txtCar.setFont(new Font("Serif", Font.PLAIN, 18));
		txtCar.setText(" Car 1 - Toyota Supra \r\n");
		txtCar.setEditable(false);
		txtCar.setBounds(192, 120, 183, 93);
		getContentPane().add(txtCar);
		txtCar.setColumns(10);
		
		txtCar_1 = new JTextField();
		txtCar_1.setBorder(null);
		txtCar_1.setHorizontalAlignment(SwingConstants.LEFT);
		txtCar_1.setFont(new Font("Serif", Font.PLAIN, 18));
		txtCar_1.setText(" Car 2 - Nissag Gtr\r\n");
		txtCar_1.setEditable(false);
		txtCar_1.setColumns(10);
		txtCar_1.setBounds(192, 257, 183, 93);
		getContentPane().add(txtCar_1);
		
		txtCar_2 = new JTextField();
		txtCar_2.setBorder(null);
		txtCar_2.setHorizontalAlignment(SwingConstants.LEFT);
		txtCar_2.setFont(new Font("Serif", Font.PLAIN, 18));
		txtCar_2.setText(" Car 3 - Dodge\r\n");
		txtCar_2.setEditable(false);
		txtCar_2.setColumns(10);
		txtCar_2.setBounds(192, 382, 183, 93);
		getContentPane().add(txtCar_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(null);
		textArea.setEditable(false);
		textArea.setFont(new Font("Calibri", Font.PLAIN, 20));
		textArea.setBounds(515, 438, 252, 37);
		getContentPane().add(textArea);
		
		String week[]= { "Car 1","Car 2","Car 3"};
		
		JList list = new JList(week);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {" Car 1", " Car 2", " Car 3"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBackground(new Color(0, 139, 139));
		list.setForeground(Color.WHITE);
		list.setFont(new Font("Tahoma", Font.PLAIN, 23));
		list.setBounds(515, 120, 73, 90);
		
		
		
		JList list_1 = new JList();
		list_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"1 hour", "2 hours", "3 hours", "4 hours", "5 hours"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setBounds(515, 257, 73, 93);
		getContentPane().add(list_1);
		
		
		
		getContentPane().add(list);
		
		txtRent = new JTextField();
		txtRent.setForeground(Color.WHITE);
		txtRent.setSelectedTextColor(Color.PINK);
		txtRent.setBackground(new Color(0, 128, 128));
		txtRent.setCaretColor(Color.WHITE);
		txtRent.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtRent.setEditable(false);
		txtRent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				textArea.setText("Thank you");
				try {
				      FileWriter myWriter = new FileWriter("D:\\results.txt");
				      String selectedCars = (String) list.getSelectedValue();
				      String selectedHours = (String)list_1.getSelectedValue();
				      
				      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
				      LocalDateTime now = LocalDateTime.now(); 
				      String dateString = dtf.format(now);
				      
				      myWriter.write("You rented"+selectedCars+" for "+selectedHours);				      			      			    
				      myWriter.write(System.getProperty( "line.separator" ));
				      
				      myWriter.write(dateString);
				      myWriter.write(System.getProperty( "line.separator" ));				      				      				  
				      myWriter.write("--------------------------------------");
				      myWriter.write(System.getProperty( "line.separator" ));
				      myWriter.write("Drive with passion");
				      
				      myWriter.close();
				      System.out.println("Successfully wrote to the file.");
				    } catch (IOException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
				
				
				
				
			}
		});
		txtRent.setHorizontalAlignment(SwingConstants.CENTER);
		txtRent.setText("RENT");
		txtRent.setBounds(515, 382, 73, 37);
		getContentPane().add(txtRent);
		txtRent.setColumns(10);
		
		
		
		
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon imageIcon = new ImageIcon("C:\\Users\\Andrei\\workspace\\CarRentSystem\\toyota.jpg"); // load the image to a imageIcon
		Image image = imageIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(172,93,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		lblNewLabel.setIcon(new ImageIcon(newimg));
		
		lblNewLabel.setBounds(10, 120, 172, 93);
		getContentPane().add(lblNewLabel);
		
		
		
		
		
		
		
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Andrei\\workspace\\CarRentSystem\\nissan.jpg"));
		lblNewLabel_1.setBounds(10, 257, 172, 93);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Andrei\\workspace\\CarRentSystem\\dodge.jpg"));
		lblNewLabel_2.setBounds(10, 382, 172, 93);
		getContentPane().add(lblNewLabel_2);
		
		
	
		
		
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
	}
}
