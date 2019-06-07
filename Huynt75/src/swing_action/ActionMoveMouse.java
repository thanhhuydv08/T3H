package swing_action;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ActionMoveMouse {

	private JFrame frame;
	private JTextField txtTiMunThay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActionMoveMouse window = new ActionMoveMouse();
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
	public ActionMoveMouse() {
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
		
		JButton btnNewButton = new JButton("click chance color");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton.setForeground(Color.red);
				btnNewButton.setBackground(Color.PINK);
				txtTiMunThay.setBackground(Color.YELLOW);
				txtTiMunThay.setFont(new Font(Font.SERIF, Font.ITALIC, 12));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setForeground(Color.blue);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setForeground(Color.black);
			}
		});
		btnNewButton.setBounds(102, 124, 150, 23);
		frame.getContentPane().add(btnNewButton);
		
		txtTiMunThay = new JTextField();
		txtTiMunThay.setText("t\u00F4i mu\u1ED1n thay \u0111\u1ED5i font or color khi click button");
		txtTiMunThay.setBounds(102, 42, 248, 45);
		frame.getContentPane().add(txtTiMunThay);
		txtTiMunThay.setColumns(10);
	}
}
