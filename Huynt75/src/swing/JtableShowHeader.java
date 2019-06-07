package swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RootPaneContainer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JtableShowHeader {
	JTable table;
	private JFrame frame;
	Object[][] rowData= {{"Adam","30","male"},{"Json","25","male"},{"sharkj","12","female"}};
    Object[] columnNames= {"Name","Age","Gender"};
    private JTable table_1;
    private JTable table_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JtableShowHeader window = new JtableShowHeader();
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
	public JtableShowHeader() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(600, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
// Cach 1	
//		JPanel panel = new JPanel(new BorderLayout());
//		panel.setBounds(0, 0, 584, 161);
//		frame.getContentPane().add(panel);
//		
//		table_2 = new JTable();
//		table_2.setModel(new DefaultTableModel(
//			new Object[][] {
//				{null, null, null},
//				{null, null, null},
//			},
//			new String[] {
//				"New column", "New column", "New column"
//			}
//		));
//
//		panel.add(table_2.getTableHeader(),BorderLayout.NORTH);
//		panel.add(table_2,BorderLayout.CENTER);

	/*
	 * cho table chua 1 container, va container setsize cho no
	 * */
		
		table = new JTable(new DefaultTableModel(rowData,columnNames));// bat buoc phai new Defa de sau nay add them hang 
		
		//jTable = new JTable(rowData,columnNames);
		JScrollPane jScrollPane = new JScrollPane(table);
		jScrollPane.setSize(500, 100);// bat buoc co
		frame.getContentPane().add(jScrollPane);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{"", "", ""});
			}
	});
		btnNewButton.setBounds(207, 127, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
