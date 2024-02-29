package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ecommerceapp {

	private JFrame frame;
	int itams=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecommerceapp window = new ecommerceapp();
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
	public ecommerceapp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Rs.700");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(60, 229, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Rs.600");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(236, 236, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton b1 = new JButton("New button");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b1.isSelected())
				{
					L1=setText("CART");
				}
			}
		});
		b1.setIcon(new ImageIcon("C:\\Users\\admim\\Downloads\\b2.jpg"));
		b1.setBounds(60, 56, 115, 147);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("New button");
		b2.setIcon(new ImageIcon("C:\\Users\\admim\\Downloads\\b3.jfif"));
		b2.setBounds(211, 56, 102, 147);
		frame.getContentPane().add(b2);
		
		JLabel lblNewLabel_1 = new JLabel("Cart:0");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(339, 26, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("BUY");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(319, 203, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("E COMMERCE APP");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(132, 11, 181, 14);
		frame.getContentPane().add(lblNewLabel_2);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
