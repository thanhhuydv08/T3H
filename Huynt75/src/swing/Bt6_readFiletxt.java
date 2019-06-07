package swing;

import java.awt.EventQueue;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bt6_readFiletxt {
   public  String [] film = null;
	private JFrame frame;
	String [] temp;
	String url1="E:/APLICATION_WORKING/JAVACORE & SQL SERVER/KHTN/film.txt";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bt6_readFiletxt window = new Bt6_readFiletxt();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public Bt6_readFiletxt() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Movies");
		lblNewLabel.setBounds(10, 131, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox(new ReadFileTXT().Film(url1));
	
		comboBox.setBounds(83, 128, 160, 101);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
			}
			
		});
		btnNewButton.setBounds(304, 62, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
