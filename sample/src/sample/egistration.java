package sample;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class egistration {

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
					egistration window = new egistration();
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
	public egistration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(30, 80, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Registration");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(84, 38, 168, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("branch");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(30, 136, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("gender");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(30, 161, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("password");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(30, 105, 74, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("city");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(47, 209, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		tb1 = new JTextField();
		tb1.setBounds(114, 78, 93, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		p1 = new JPasswordField();
		p1.setBounds(114, 103, 93, 20);
		frame.getContentPane().add(p1);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"CSE", "MECH", "ECE", "EEE"}));
		cb1.setBounds(114, 132, 93, 22);
		frame.getContentPane().add(cb1);
		
		JRadioButton r1 = new JRadioButton("female");
		r1.setBounds(114, 161, 93, 19);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("male");
		r2.setBounds(223, 161, 109, 19);
		frame.getContentPane().add(r2);
		
		ButtonGroup rgb=new ButtonGroup();
		rgb.add(r1);
		rgb.add(r2);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"HYD", "VIJ", "TN"}));
		cb2.setBounds(114, 205, 64, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=tb1.getText();
				String branch=(String) cb1.getSelectedItem();
				String city=(String) cb2.getSelectedItem()
;
				
				String gender=" ";
				if(r1.isSelected())
					{
					gender="male";
					}
				if(r2.isSelected())
				{
					gender="female";
				}
				JOptionPane.showMessageDialog(btnNewButton,"name "+user+"\n branch "+branch+"\ncity "+city+"\n gender " +gender);
					}
		});
		btnNewButton.setBounds(163, 238, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\admim\\Desktop\\welcome.png"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel);
	}
}
