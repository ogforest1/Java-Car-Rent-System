package car.rent;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class login {

	private JFrame frame;
	private JTextField txtLogin;
	private JTextField username;
	private JPasswordField passwordField;
	private JTextField txtLogin_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 651, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtLogin = new JTextField();
		txtLogin.setEditable(false);
		txtLogin.setFont(new Font("Tahoma", Font.PLAIN, 21));
		txtLogin.setForeground(new Color(255, 255, 255));
		txtLogin.setBackground(new Color(30, 144, 255));
		txtLogin.setText("authentication");
		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogin.setBounds(210, 111, 186, 40);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		username = new JTextField();
		username.setBorder(null);
		username.setForeground(Color.WHITE);
		username.setHorizontalAlignment(SwingConstants.CENTER);
		username.setFont(new Font("Tahoma", Font.PLAIN, 16));
		username.setBackground(new Color(30, 144, 255));
		username.setBounds(210, 183, 186, 29);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(null);
		passwordField.setForeground(Color.WHITE);
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBackground(new Color(30, 144, 255));
		passwordField.setBounds(210, 240, 186, 29);
		frame.getContentPane().add(passwordField);
		
		txtLogin_1 = new JTextField();
		txtLogin_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
				if(username.getText().equals("admin") && passwordField.getText().equals("admin"))
				{
					JOptionPane.showMessageDialog(null,"Login Sucessfull");
					frame.dispose();
					Car car =new Car();
					car.setVisible(true);
					car.setExtendedState(JFrame.MAXIMIZED_BOTH);
				}
				else
				{
					
				}
				
			}
		});
		txtLogin_1.setEditable(false);
		txtLogin_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogin_1.setBackground(new Color(30, 144, 255));
		txtLogin_1.setText("LOGIN");
		txtLogin_1.setForeground(Color.WHITE);
		txtLogin_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtLogin_1.setBounds(210, 301, 186, 29);
		frame.getContentPane().add(txtLogin_1);
		txtLogin_1.setColumns(10);
		
		
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon imageIcon = new ImageIcon("C:\\Users\\Andrei\\workspace\\CarRentSystem\\login.png"); // load the image to a imageIcon
		Image image = imageIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(30,30,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		lblNewLabel_1.setIcon(new ImageIcon(newimg));
		lblNewLabel_1.setBounds(170, 183, 30, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		
		ImageIcon imageIcon2 = new ImageIcon("C:\\Users\\Andrei\\workspace\\CarRentSystem\\password.png"); // load the image to a imageIcon
		Image image2 = imageIcon2.getImage(); // transform it 
		Image newimg2 = image2.getScaledInstance(20,20,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Andrei\\workspace\\CarRentSystem\\password.png"));
		
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(170, 239, 30, 30);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
