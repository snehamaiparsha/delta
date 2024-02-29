package sample;

import java.awt.EventQueue;
//new change  567
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField p1;

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
		frame.getContentPane().setBackground(new Color(128, 128, 192));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(191, 22, 56, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(79, 75, 77, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel p = new JLabel("password");
		p.setFont(new Font("Tahoma", Font.BOLD, 13));
		p.setBounds(79, 152, 77, 14);
		frame.getContentPane().add(p);
		
		tb1 = new JTextField();
		tb1.setBounds(194, 84, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		p1 = new JPasswordField();
		p1.setBounds(191, 152, 89, 20);
		frame.getContentPane().add(p1);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=tb1.getText();
				String password= p1.getText();
				//JOptionPane.showMessageDialog(btnNewButton,"hello "+username+"\n password is "+password);
				if(username.equals("sneha")&& password.equals("1234") ) 
				{
					JOptionPane.showMessageDialog(btnNewButton,"vaid user");
				}
				else{
					JOptionPane.showMessageDialog(btnNewButton,"user invalid");
				}
			}
		});
		btnNewButton.setBounds(191, 211, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
