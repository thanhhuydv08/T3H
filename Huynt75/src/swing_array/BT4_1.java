package swing_array;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class BT4_1 {
    
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BT4_1 window = new BT4_1();
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
	public BT4_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Phat sinh mang");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numberArray= Integer.parseInt(textField.getText());
				int sum=0;
				String showString="";
				int  [] s = new int [numberArray];
				Random random = new Random();
				for(int i=0;i<numberArray;i++) {
					s[i]=random.nextInt(100);
					System.out.println(s[i]+" ");
					sum=sum+s[i];
					showString = showString+String.valueOf(s[i])+" ";
					textField_1.setText(showString);
				}
				textField_2.setText(String.valueOf(sum));
				
			}
			
		});
		btnNewButton.setBounds(135, 193, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(135, 11, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(135, 46, 278, 72);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(138, 129, 86, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel = new JLabel("T\u1ED5ng []");
		lblNewLabel.setBounds(10, 132, 68, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPsMng = new JLabel("PS m\u1EA3ng :");
		lblPsMng.setBounds(10, 46, 68, 14);
		frame.getContentPane().add(lblPsMng);
		
		JLabel lblNhpN = new JLabel("Nh\u1EADp n :");
		lblNhpN.setBounds(10, 14, 68, 14);
		frame.getContentPane().add(lblNhpN);
	}
}
