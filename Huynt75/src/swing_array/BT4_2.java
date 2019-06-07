package swing_array;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;

public class BT4_2 {
	int  [] s;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNhpX;
	private JTextArea textField_4;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BT4_2 window = new BT4_2();
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
	public BT4_2() {
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
				s = new int [numberArray];
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
		btnNewButton.setBounds(249, 129, 89, 23);
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

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "T\u00ECm ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));

		panel.setBounds(10, 156, 414, 105);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		btnNewButton_1 = new JButton("LookFor");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sMe="";
				int index=0;
				int count=0;
				String sMaxCompare=" ";
				String sMinCompare="";
				for(int i=0;i<s.length;i++) {
					if(s[i]==Integer.parseInt(textField_3.getText())) {
						count++;
						index=i;

					}

					if(Integer.parseInt(textField_3.getText())<s[i]) {
						sMinCompare=sMinCompare+" "+String.valueOf(s[i]);
					}

				}

				if(count>0) {
					sMe = " Tìm thấy tại vị trí  "+index;	
				}else {
					sMe = " Không tìm thấy phần tử!";	
				}

				textField_4.setText(sMe+"\n"+"X nhỏ hơn: "+sMinCompare);

			}
		});
		btnNewButton_1.setBounds(80, 79, 89, 23);
		panel.add(btnNewButton_1);

		textField_4 = new JTextArea();
		textField_4.setBounds(188, 11, 216, 91);
		panel.add(textField_4);
		textField_4.setColumns(10);

		lblNhpX = new JLabel("Nh\u1EADp x :");
		lblNhpX.setBounds(10, 28, 68, 14);
		panel.add(lblNhpX);

		textField_3 = new JTextField();
		textField_3.setBounds(83, 25, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
	}
}
