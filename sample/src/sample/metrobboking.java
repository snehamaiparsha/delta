package sample;

import java.awt.EventQueue;
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metrobboking {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metrobboking window = new metrobboking();
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
	public metrobboking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 817, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(126, 127, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("source");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(107, 184, 65, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("destination");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(107, 257, 113, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel tickets = new JLabel("tickets");
		tickets.setForeground(new Color(255, 255, 255));
		tickets.setFont(new Font("Tahoma", Font.BOLD, 15));
		tickets.setBounds(107, 322, 113, 25);
		frame.getContentPane().add(tickets);
		
		tb1 = new JTextField();
		tb1.setBounds(246, 125, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"RAIDURG", "HITEX", "MADHAPUR"}));
		cb1.setBounds(246, 184, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"JNTU", "RAIDURG", "AMEERPET", "UPPAL"}));
		cb2.setBounds(246, 259, 86, 22);
		frame.getContentPane().add(cb2);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
		cb3.setBounds(246, 324, 86, 22);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String source=(String) cb1.getSelectedItem();
				String destination=(String) cb2.getSelectedItem();
				String tickets=(String) cb3.getSelectedItem();
				int nt= Integer.parseInt(tickets);
			int bill=0;
			if(source.equals(destination))
			{
				JOptionPane.showMessageDialog(btnNewButton, "pls enter correct station");
			}
			else {
				bill=bill+45*nt;
				JOptionPane.showMessageDialog(btnNewButton, "name "+name+"\n source "+source+"\n destination "+destination+"no of tickets "+nt+"amount "+bill);
			}
			}
			
		});
		btnNewButton.setBounds(158, 418, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("name");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\admim\\Desktop\\metro.jpg"));
		lblNewLabel.setBounds(10, 0, 791, 484);
		frame.getContentPane().add(lblNewLabel);
	}

}
