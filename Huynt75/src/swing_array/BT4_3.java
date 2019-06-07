package swing_array;

import java.awt.EventQueue;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;

public class BT4_3 {
	private int[][] iNumberArray;
	private JFrame frmXLMng;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblCtJ;
	private JTextArea textArea;
	private JTextArea textArea_1;
	int iRowArray;
	int jRowArray;
	int eRound,eUneven,eMax,eMin,eTemp;
	String s;
	String sResult;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BT4_3 window = new BT4_3();
					window.frmXLMng.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BT4_3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmXLMng = new JFrame();
		frmXLMng.setTitle("Xử lý mảng");
		frmXLMng.setBounds(100, 100, 546, 351);
		frmXLMng.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmXLMng.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(110, 11, 86, 20);
		frmXLMng.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(363, 11, 86, 20);
		textField_1.setColumns(10);
		frmXLMng.getContentPane().add(textField_1);

		JLabel lblNewLabel = new JLabel("C\u1ED9t i");
		lblNewLabel.setBounds(10, 14, 46, 14);
		frmXLMng.getContentPane().add(lblNewLabel);

		lblCtJ = new JLabel("C\u1ED9t J");
		lblCtJ.setBounds(259, 14, 46, 14);
		frmXLMng.getContentPane().add(lblCtJ);

		textArea = new JTextArea();
		textArea.setBorder(new LineBorder(Color.blue));
		textArea.setBounds(109, 42, 340, 85);
		frmXLMng.getContentPane().add(textArea);

		JLabel lblPsMng = new JLabel("PS M\u1EA3ng");
		lblPsMng.setBounds(10, 39, 89, 14);
		frmXLMng.getContentPane().add(lblPsMng);

		JLabel lblKtQu = new JLabel("K\u1EBFt qu\u1EA3");
		lblKtQu.setBounds(10, 138, 90, 14);
		frmXLMng.getContentPane().add(lblKtQu);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBounds(245, 254, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iRowArray =Integer.parseInt(textField.getText());
				jRowArray = Integer.parseInt(textField_1.getText());
				// số phần tử lẻ, chẵn mx min	
				iNumberArray = new int[iRowArray][jRowArray];
				NumberRandom();
				DisplayArrayToTextArea();
				ProcessMaxMin();
				ProcessElement();
				DisplayResultToTextArea();
			}
		});
		frmXLMng.getContentPane().add(btnNewButton);

		textArea_1 = new JTextArea();

		ScrollPane pane = new ScrollPane();
		pane.setBounds(120, 154, 296, 67);
		pane.add(textArea_1);
		frmXLMng.getContentPane().add(pane);
	}
	/* tao mang ngau nhien cho UD
	 * */
	public void NumberRandom() {
		s="";
		Random random = new Random();
		for(int i=0;i<iRowArray;i++) {
			for(int j=0;j<jRowArray;j++) {
				iNumberArray[i][j]=random.nextInt(100);
				//System.out.println(iNumberArray[0][0]);
				s=s+iNumberArray[i][j]+" ";
			}
			s=s+"\n";
		}

	}
	/* hiển thị mảng lên textarea trong UD
	 * */
	public void DisplayArrayToTextArea() {
		textArea.setText(s);
	}
	/* xử lý PT chẳn lẻ trong mảng
	 * */
	public void ProcessElement() {
		eRound=0;
		eUneven=0;
		for(int i=0;i<iRowArray;i++) {
			for(int j=0;j<jRowArray;j++) {
				if(iNumberArray[i][j]%2==0) {
					eRound++;
				}else {eUneven++;};
			}
			sResult ="Số phần tử chẳn :"+eRound+"\n"+"Số phần tử lẻ :"+eUneven+"\n"
					+"Số lớn nhất :"+eMax+"\n"+"Số nhỏ nhất :"+eMin;
		}

	}
	/* hiển thị kq lên textarea trong UD
	 * */
	public void DisplayResultToTextArea() {
		textArea_1.setText(sResult);
	}
	/* tính toán giá trị min max trong mảng
	 * */
	public void ProcessMaxMin() {
		eMax=iNumberArray[0][0];
		for(int i=0;i<iRowArray;i++) {
			for(int j=0;j<jRowArray;j++) {
				if(eMax>iNumberArray[i][j]) {

				}else {
					//eMin=eMax;
                  eMax=iNumberArray[i][j];
				}
			}

		}
	}
}
