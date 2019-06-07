package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import java.awt.Button;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Bt5_viewImage {
  JButton btn1,btn2,btn3;
  String s1="E:\\PICTURE\\logo5.png",s2="E:\\PICTURE\\logo6.png",s3="E:\\PICTURE\\logo8.png";
  JLabel lb1;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bt5_viewImage window = new Bt5_viewImage();
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
	public Bt5_viewImage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 596, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "ImageIcon", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		panel.setBounds(10, 11, 130, 369);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		btn1 = new JButton("");
		btn1.setIcon(new ImageIcon(s1));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb1.setIcon(new ImageIcon(s1));
				
			}
		});
		btn1.setBounds(10, 29, 110, 81);
		panel.add(btn1);
		
		btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb1.setIcon(new ImageIcon(s2));
			}
		});
		btn2.setIcon(new ImageIcon(s2));
		btn2.setBounds(10, 121, 110, 81);
		panel.add(btn2);
		
		btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb1.setIcon(new ImageIcon(s3));
			}
		});
		btn3.setIcon(new ImageIcon(s3));
		btn3.setBounds(10, 213, 110, 81);
		panel.add(btn3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Zoom Picture", TitledBorder.LEADING, TitledBorder.TOP, null, Color.GREEN));
		panel_1.setBounds(153, 11, 417, 369);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lb1 = new JLabel("");
		lb1.setBounds(10, 21, 397, 337);
		panel_1.add(lb1);
	}
}
