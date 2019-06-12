package swing_Object_BT5_4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmInformationPayment {

	private JFrame frame;
	private JTextField txtCardNumber;
	private JTextField txtFullName;
	private JTextField txtAdress;
	private JTextField txtCountry;
	private JTextField txtZipcode;
	Object[] listCombobox = {"Visa/Master Card","MBBank","ViettinBank","ViecomBank","AgrBank"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmInformationPayment window = new FrmInformationPayment();
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
	public FrmInformationPayment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox(listCombobox);
		comboBox.setBounds(152, 11, 118, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblCardType = new JLabel("Card Type");
		lblCardType.setBounds(20, 14, 86, 14);
		frame.getContentPane().add(lblCardType);
		
		txtCardNumber = new JTextField();
		txtCardNumber.setBounds(152, 46, 181, 20);
		frame.getContentPane().add(txtCardNumber);
		txtCardNumber.setColumns(10);
		
		JLabel lblCardNumber = new JLabel("Card Number");
		lblCardNumber.setBounds(20, 49, 86, 14);
		frame.getContentPane().add(lblCardNumber);
		
		JLabel lblNewLabel = new JLabel("BILL INFORMATION");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		lblNewLabel.setBounds(128, 97, 241, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFullName = new JLabel("Full Name");
		lblFullName.setBounds(20, 141, 86, 14);
		frame.getContentPane().add(lblFullName);
		
		txtFullName = new JTextField();
		txtFullName.setColumns(10);
		txtFullName.setBounds(152, 138, 181, 20);
		frame.getContentPane().add(txtFullName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(20, 169, 86, 14);
		frame.getContentPane().add(lblAddress);
		
		txtAdress = new JTextField();
		txtAdress.setColumns(10);
		txtAdress.setBounds(152, 166, 181, 20);
		frame.getContentPane().add(txtAdress);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(20, 197, 86, 14);
		frame.getContentPane().add(lblCountry);
		
		txtCountry = new JTextField();
		txtCountry.setColumns(10);
		txtCountry.setBounds(152, 194, 181, 20);
		frame.getContentPane().add(txtCountry);
		
		JLabel lblZipCode = new JLabel("Zip Code");
		lblZipCode.setBounds(20, 225, 86, 14);
		frame.getContentPane().add(lblZipCode);
		
		txtZipcode = new JTextField();
		txtZipcode.setColumns(10);
		txtZipcode.setBounds(152, 222, 181, 20);
		frame.getContentPane().add(txtZipcode);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(frame, "Chúc mừng bạn đã thanh toán thành công .");
				frame.setVisible(false);
				
			}
		});
		btnSubmit.setBounds(205, 267, 89, 23);
		frame.getContentPane().add(btnSubmit);
	}
}
