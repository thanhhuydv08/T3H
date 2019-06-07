package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bt1 {

	private JFrame frmThoo;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTextField txtPicture;
	private JTextField textField_3;
	private JButton btnNewButton;
	private JPanel panel;
	JLabel lbName, lbPhone,lbPicture;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bt1 window = new Bt1();
					window.frmThoo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bt1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmThoo = new JFrame();
		frmThoo.setTitle("T\u00F4ng tin li\u00EAn h\u1EC7");
		frmThoo.setBounds(100, 100, 477, 428);
		frmThoo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmThoo.getContentPane().setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(181, 11, 235, 20);
		frmThoo.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(181, 42, 111, 20);
		frmThoo.getContentPane().add(txtPhone);
		
		txtPicture = new JTextField();
		txtPicture.setColumns(10);
		txtPicture.setBounds(181, 74, 270, 20);
		frmThoo.getContentPane().add(txtPicture);
		
		JLabel lblNewLabel = new JLabel("H\u1ECD T\u00EAn");
		lblNewLabel.setBounds(10, 14, 46, 14);
		frmThoo.getContentPane().add(lblNewLabel);
		
		JLabel lbltd = new JLabel("\u0110TD\u0110");
		lbltd.setBounds(10, 45, 46, 14);
		frmThoo.getContentPane().add(lbltd);
		
		JLabel lblnh = new JLabel("\u1EA2nh");
		lblnh.setBounds(10, 77, 46, 14);
		frmThoo.getContentPane().add(lblnh);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 157, 441, 5);
		frmThoo.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		btnNewButton = new JButton("X\u00E1c Nh\u1EADn L\u01B0u");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel.setVisible(true);
				lbName.setText(txtName.getText());
				lbPhone.setText(txtPhone.getText());
				lbPicture.setIcon(new ImageIcon(txtPicture.getText()));
                
			}
		});
		btnNewButton.setBounds(181, 128, 143, 23);
		frmThoo.getContentPane().add(btnNewButton);
		
		panel = new JPanel();
		panel.setVisible(false);
		panel.setBounds(10, 173, 441, 205);
		frmThoo.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("H\u1ECD T\u00EAn");
		label.setBounds(0, 0, 46, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u0110TD\u0110");
		label_1.setBounds(0, 31, 46, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\u1EA2nh");
		label_2.setBounds(0, 63, 46, 14);
		panel.add(label_2);
		
		lbName = new JLabel("");
		lbName.setBounds(173, 0, 207, 14);
		panel.add(lbName);
		
		lbPhone = new JLabel("");
		lbPhone.setBounds(173, 31, 122, 14);
		panel.add(lbPhone);
		
		lbPicture = new JLabel("");
		lbPicture.setBounds(173, 63, 166, 142);
		panel.add(lbPicture);
	}
}
