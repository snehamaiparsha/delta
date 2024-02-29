package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ticketbooking {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticketbooking window = new ticketbooking();
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
	public ticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 782, 494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(198, 21, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tb1 = new JTextField();
		tb1.setBounds(193, 72, 262, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SALAAR", "RRR", "DEMON SLAYER"}));
		cb1.setBounds(198, 140, 224, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		cb2.setBounds(204, 209, 234, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String user=tb1.getText();
			String movie=(String) cb1.getSelectedItem();
			String ticketsno=(String) cb2.getSelectedItem();
			int
			nt= Integer.parseInt(ticketsno);
			int bill=0;
			if(movie.equals("SALAAR"))
			{
				bill=nt*150;
			}
			if(movie.equals("RRR"))
			{
				bill=nt*200;
			}
			if(movie.equals("DEMON SLAYER"))
			{
				bill=nt*250;
			}
			int res=0;
			res=JOptionPane.showConfirmDialog(btnNewButton,"Name"+user+"\n movie "+movie+"no of tickets"+ticketsno+"\n bill "+bill/);
			if(res==JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(btnNewButton, "boooking confirmed");
			}
			else {
				JOptionPane.showMessageDialog(btnNewButton, "boooking cancelled");
			}
			
		}});
		btnNewButton.setBounds(174, 318, 127, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel Name = new JLabel("name");
		Name.setForeground(new Color(255, 255, 255));
		Name.setFont(new Font("Tahoma", Font.BOLD, 12));
		Name.setBounds(95, 74, 46, 14);
		frame.getContentPane().add(Name);
		
		JLabel movie = new JLabel("movie");
		movie.setForeground(new Color(255, 255, 255));
		movie.setFont(new Font("Tahoma", Font.BOLD, 12));
		movie.setBounds(95, 143, 46, 14);
		frame.getContentPane().add(movie);
		
		JLabel ticketsno = new JLabel("no of tickets");
		ticketsno.setForeground(new Color(255, 255, 255));
		ticketsno.setBackground(new Color(255, 255, 255));
		ticketsno.setFont(new Font("Tahoma", Font.BOLD, 12));
		ticketsno.setBounds(67, 212, 127, 14);
		frame.getContentPane().add(ticketsno);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\admim\\Downloads\\BOOK.jpg"));
		lblNewLabel_1.setBounds(0, 0, 776, 455);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(35, 75, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
