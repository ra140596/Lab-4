package alunos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form extends JFrame {

	public JPanel contentPane;
	public JTextField textfirstName;
	public JTextField textlastName;
	public JTextField textbirthdate;
	public JTextField textemail;
	public JTextField textcpf;
	public JTextField textphone;
	public JTextField textaddress1;
	public JTextField textaddress2;
	public JTextField textcep;
	public JTextField textcity;
	public JTextField textstate;
	public JTextField textcountry;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form frame = new form();
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
	public form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textfirstName = new JTextField();
		textfirstName.setBounds(99, 58, 114, 19);
		contentPane.add(textfirstName);
		textfirstName.setColumns(10);
		
		textlastName = new JTextField();
		textlastName.setBounds(99, 89, 114, 19);
		contentPane.add(textlastName);
		textlastName.setColumns(10);
		
		textbirthdate = new JTextField();
		textbirthdate.setBounds(99, 120, 114, 19);
		contentPane.add(textbirthdate);
		textbirthdate.setColumns(10);
		
		textemail = new JTextField();
		textemail.setBounds(99, 151, 114, 19);
		contentPane.add(textemail);
		textemail.setColumns(10);
		
		textcpf = new JTextField();
		textcpf.setBounds(99, 182, 114, 19);
		contentPane.add(textcpf);
		textcpf.setColumns(10);
		
		textphone = new JTextField();
		textphone.setBounds(99, 213, 114, 19);
		contentPane.add(textphone);
		textphone.setColumns(10);
		
		textaddress1 = new JTextField();
		textaddress1.setBounds(99, 244, 114, 19);
		contentPane.add(textaddress1);
		textaddress1.setColumns(10);
		
		textaddress2 = new JTextField();
		textaddress2.setBounds(99, 275, 114, 19);
		contentPane.add(textaddress2);
		textaddress2.setColumns(10);
		
		textcep = new JTextField();
		textcep.setBounds(99, 306, 114, 19);
		contentPane.add(textcep);
		textcep.setColumns(10);
		
		textcity = new JTextField();
		textcity.setBounds(99, 337, 114, 19);
		contentPane.add(textcity);
		textcity.setColumns(10);
		
		textstate = new JTextField();
		textstate.setBounds(99, 368, 114, 19);
		contentPane.add(textstate);
		textstate.setColumns(10);
		
		textcountry = new JTextField();
		textcountry.setBounds(99, 399, 114, 19);
		contentPane.add(textcountry);
		textcountry.setColumns(10);
		
		final JComboBox comboTitle = new JComboBox();
		comboTitle.setModel(new DefaultComboBoxModel(new String[] {"Mr.", "Mrs.", "Miss.", "Ms.", "Dr.", "Other"}));
		comboTitle.setToolTipText("");
		comboTitle.setBounds(58, 12, 81, 24);
		contentPane.add(comboTitle);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(12, 60, 90, 15);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(12, 91, 90, 15);
		contentPane.add(lblLastName);
		
		JLabel lblbirthdate = new JLabel("Data Nascimento:");
		lblbirthdate.setBounds(12, 122, 90, 15);
		contentPane.add(lblbirthdate);
		
		JLabel lblemail = new JLabel("Email:");
		lblemail.setBounds(12, 153, 90, 15);
		contentPane.add(lblemail);
		
		JLabel lblcpf = new JLabel("CPF:");
		lblcpf.setBounds(12, 184, 90, 15);
		contentPane.add(lblcpf);
		
		JLabel lblphone = new JLabel("Phone:");
		lblphone.setBounds(12, 215, 90, 15);
		contentPane.add(lblphone);
		
		JLabel lbladdress1 = new JLabel("Address 1:");
		lbladdress1.setBounds(12, 246, 90, 15);
		contentPane.add(lbladdress1);
		
		JLabel lbladdress2 = new JLabel("Address 2:");
		lbladdress2.setBounds(12, 277, 90, 15);
		contentPane.add(lbladdress2);
		
		JLabel lblcep = new JLabel("CEP:");
		lblcep.setBounds(12, 308, 90, 15);
		contentPane.add(lblcep);
		
		JLabel lblcity = new JLabel("City:");
		lblcity.setBounds(12, 339, 90, 15);
		contentPane.add(lblcity);
		
		JLabel lblstate = new JLabel("State:");
		lblstate.setBounds(12, 370, 90, 15);
		contentPane.add(lblstate);
		
		JLabel lblcountry = new JLabel("Country:");
		lblcountry.setBounds(12, 401, 90, 15);
		contentPane.add(lblcountry);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(12, 17, 90, 15);
		contentPane.add(lblTitle);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {		
				//contentPane.setVisible(false);
				print printForm = new print();
				printForm.titleLabel.setText((String) comboTitle.getSelectedItem());
				printForm.firstNameLabel.setText(textfirstName.getText());
				printForm.lastNameLabel.setText(textlastName.getText());
				printForm.birthdateLabel.setText(textbirthdate.getText());
				printForm.emailLabel.setText(textemail.getText());
				printForm.cpfLabel.setText(textcpf.getText());
				printForm.phoneLabel.setText(textphone.getText());
				printForm.address1Label.setText(textaddress1.getText());
				printForm.address2Label.setText(textaddress2.getText());
				printForm.cepLabel.setText(textcep.getText());
				printForm.cityLabel.setText(textcity.getText());
				printForm.stateLabel.setText(textstate.getText());
				printForm.countryLabel.setText(textcountry.getText());
				//printForm.contentPane.setVisible(true);				
				printForm.show();	
			}
		});
		btnPrint.setBounds(12, 459, 74, 25);
		contentPane.add(btnPrint);
	}
}
