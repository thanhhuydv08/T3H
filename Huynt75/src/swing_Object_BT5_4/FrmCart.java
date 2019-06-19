package swing_Object_BT5_4;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmCart extends DefaultTableCellRenderer {
    Object [] arrayColums = {"Product","Price"};
   static ArrayList<Product> tempIndex;
   static Object[] dataValue= new Object[2];
	private JFrame frmGiHngCa;
	Product product1;
	Product product2;
	Product product3;
	Product product4;
	Product product5;
	Product product6;
	JScrollPane scrollPane;
    JTable jTable;
    DefaultTableModel dtm = new DefaultTableModel(arrayColums,0);
    private JButton btnPayment;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					FrmCart window = new FrmCart(tempIndex);
//					window.frmGiHngCa.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public FrmCart(ArrayList arrayList) {
		this.tempIndex = arrayList;
		//System.out.println(tempIndex.get(0).nameProduct);
	
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGiHngCa = new JFrame();
		frmGiHngCa.getContentPane().setBackground(new Color(255, 250, 205));
		frmGiHngCa.setTitle("Giỏ hàng của bạn");
		frmGiHngCa.setBounds(100, 100, 450, 227);
		frmGiHngCa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmGiHngCa.getContentPane().setLayout(null);
		frmGiHngCa.setVisible(true);
		
		jTable = new JTable(dtm);
		JTableHeader header = jTable.getTableHeader();
		header.setBackground(Color.red);
		header.setForeground(Color.black);
		header.setFont(new Font("Tahoma", Font.BOLD, 12));
		jTable.setBackground(Color.white);
		
	    jTable.setBorder(new LineBorder(new Color(154, 205, 50), 1, true));// border cho table xung quanh
		jTable.setAutoCreateRowSorter(true); // tự sort
		jTable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column) {
                Component c = super.getTableCellRendererComponent(table,value,isSelected,hasFocus,row,column);
                c.setForeground(Color.green);
                return c;
            }
        });
		jTable.setSelectionBackground(Color.ORANGE);// khi chọn màu nền sể đổi
	    jTable.setSelectionForeground(Color.CYAN);//  khi chọn màu text sể đổi
	 AddRow();
		scrollPane = new JScrollPane(jTable);
		scrollPane.setBackground(Color.white);
		scrollPane.setBounds(10, 11, 414, 118);
		frmGiHngCa.getContentPane().add(scrollPane);
		
		btnPayment = new JButton("PayMent");
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmInformationPayment frmInformationPayment = new FrmInformationPayment();
			}
		});
		btnPayment.setBounds(163, 154, 89, 23);
		frmGiHngCa.getContentPane().add(btnPayment);
	}

	public void AddRow() {
		if(tempIndex!=null) {
		for(int i=0; i<tempIndex.size();i++) {
			dataValue[0]=tempIndex.get(i).nameProduct;
			dataValue[1]=tempIndex.get(i).priceProduct;
			dtm.addRow(dataValue);
		}
		}
		
	}
}
