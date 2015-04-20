package alunos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class print extends JFrame {

	public JPanel contentPane;
	JLabel titleLabel = new JLabel("Title");
	JLabel firstNameLabel = new JLabel("First Name");
	JLabel lastNameLabel = new JLabel("Last Name");
	JLabel birthdateLabel = new JLabel("Birthdate");
	JLabel emailLabel = new JLabel("Email");
	JLabel cpfLabel = new JLabel("CPF");
	JLabel phoneLabel = new JLabel("Phone");
	JLabel address1Label = new JLabel("Address 1");
	JLabel address2Label = new JLabel("Address 2");
	JLabel cepLabel = new JLabel("CEP");
	JLabel cityLabel = new JLabel("City");
	JLabel stateLabel = new JLabel("State");
	JLabel countryLabel = new JLabel("Country");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					print frame = new print();					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public print() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		firstNameLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		firstNameLabel.setBounds(102, 82, 216, 15);
		contentPane.add(firstNameLabel);		
		
		lastNameLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lastNameLabel.setBounds(102, 109, 216, 15);
		contentPane.add(lastNameLabel);
		
		birthdateLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		birthdateLabel.setBounds(102, 136, 216, 15);
		contentPane.add(birthdateLabel);
		
		emailLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		emailLabel.setBounds(102, 163, 216, 15);
		contentPane.add(emailLabel);
		
		cpfLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		cpfLabel.setBounds(102, 190, 216, 15);
		contentPane.add(cpfLabel);
		
		phoneLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		phoneLabel.setBounds(102, 217, 216, 15);
		contentPane.add(phoneLabel);
		
		address1Label.setFont(new Font("Dialog", Font.PLAIN, 12));
		address1Label.setBounds(102, 244, 216, 15);
		contentPane.add(address1Label);
		
		address2Label.setFont(new Font("Dialog", Font.PLAIN, 12));
		address2Label.setBounds(102, 271, 216, 15);
		contentPane.add(address2Label);
		
		cepLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		cepLabel.setBounds(102, 298, 216, 15);
		contentPane.add(cepLabel);
		
		cityLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		cityLabel.setBounds(102, 325, 216, 15);
		contentPane.add(cityLabel);
		
		stateLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		stateLabel.setBounds(102, 352, 216, 15);
		contentPane.add(stateLabel);
		
		countryLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		countryLabel.setBounds(102, 379, 216, 15);
		contentPane.add(countryLabel);
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setBounds(12, 82, 106, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name:");
		lblNewLabel_1.setBounds(12, 109, 98, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Title:");
		lblNewLabel_2.setBounds(12, 55, 70, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Birthdate:");
		lblNewLabel_4.setBounds(12, 136, 98, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email:");
		lblNewLabel_5.setBounds(12, 163, 98, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("CPF:");
		lblNewLabel_6.setBounds(12, 190, 98, 15);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Phone:");
		lblNewLabel_7.setBounds(12, 217, 98, 15);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Address 1:");
		lblNewLabel_8.setBounds(12, 244, 98, 15);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Address 2:");
		lblNewLabel_9.setBounds(12, 271, 98, 15);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("CEP:");
		lblNewLabel_10.setBounds(12, 298, 98, 15);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("City:");
		lblNewLabel_11.setBounds(12, 325, 98, 15);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("State:");
		lblNewLabel_12.setBounds(12, 352, 98, 15);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Country:");
		lblNewLabel_13.setBounds(12, 379, 98, 15);
		contentPane.add(lblNewLabel_13);
		
		titleLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		titleLabel.setBounds(62, 55, 216, 15);
		contentPane.add(titleLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Form Printed");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_3.setBounds(139, 12, 159, 31);
		contentPane.add(lblNewLabel_3);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(12, 453, 117, 25);
		contentPane.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

}
