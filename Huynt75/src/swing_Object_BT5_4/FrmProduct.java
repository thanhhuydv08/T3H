package swing_Object_BT5_4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmProduct {
   final String  IP6 ="Iphone 6 256G New ";
   final String  IPX ="Iphone X 256G New ";
   final String  SSA8 ="Samsung Galaxy A8 ";
   final String  VERTU90 ="Vertu 90 bold jwery USA ";
   final String  BB ="BlackBery Q200 icon USA new ";
   final String  VERTU1200 ="Vertu 1200 bold Full New ";
   final String  priceIP6 ="15";
   final String  priceIPX ="23";
   final String  priceSSA8 ="9";
   final String priceVERTU90 ="100";
   final String  priceBB ="32";
   final String  priceVERTU1200 ="125";
   final String  iIP6 ="E:\\APLICATION_WORKING\\JAVACORE & SQL SERVER\\KHTN\\shareGit\\Huynt75\\images\\ip6_258_15tr.png";
   final String  iIPX ="E:\\\\APLICATION_WORKING\\\\JAVACORE & SQL SERVER\\\\KHTN\\\\shareGit\\\\Huynt75\\\\images\\\\ipx_256_23tr.png";
   final String  iSSA8 ="E:\\\\APLICATION_WORKING\\\\JAVACORE & SQL SERVER\\\\KHTN\\\\shareGit\\\\Huynt75\\\\images\\\\ss_a8_9tr.png";
   final String  iVERTU90 ="E:\\\\APLICATION_WORKING\\\\JAVACORE & SQL SERVER\\\\KHTN\\\\shareGit\\\\Huynt75\\\\images\\\\vertu90_100tr.png";
   final String  iBB ="E:\\\\APLICATION_WORKING\\\\JAVACORE & SQL SERVER\\\\KHTN\\\\shareGit\\\\Huynt75\\\\images\\\\blackberry_icon_32tr.png";
   final String  iVERTU1200 ="E:\\\\APLICATION_WORKING\\\\JAVACORE & SQL SERVER\\\\KHTN\\\\shareGit\\\\Huynt75\\\\images\\\\vertu1200_125tr.png";
	private JFrame frmSnPhm;
	JButton btn1,btn2,btn3,btn4,btn5,btn6;
	Product product1,product2,product3,product4,product5,product6;
	JLabel lblNewLabel,lblCard;
	JPanel panel;
	ArrayList arrayList = new ArrayList();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmProduct window = new FrmProduct();
					window.frmSnPhm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmProduct() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmSnPhm = new JFrame();
		frmSnPhm.setTitle("Sản Phẩm");
		frmSnPhm.getContentPane().setBackground(new Color(224, 255, 255));
		frmSnPhm.getContentPane().setForeground(new Color(105, 105, 105));
		frmSnPhm.getContentPane().setLayout(null);
		/*
		 *  gọi method hien thị ảnh lên app
		 */
		
		
		btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(frmSnPhm, "Bạn có chắc chắn thêm sản phẩm "+product1.getNameProduct()+" vào giỏ hàng hay không?", "Thông Bóa", JOptionPane.INFORMATION_MESSAGE);
				if(result==0) {
				     arrayList.add(product1);
				     System.out.println(product1.nameProduct);
				}
					
				
			}
		});
		btn1.setBackground(new Color(255, 255, 255));
		btn1.setBounds(10, 11, 160, 160);
		frmSnPhm.getContentPane().add(btn1);
		
		btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(frmSnPhm, "Bạn có chắc chắn thêm sản phẩm "+product1.getNameProduct()+" vào giỏ hàng hay không?", "Thông Bóa", JOptionPane.INFORMATION_MESSAGE);
				if(result==0) {
					arrayList.add(product2);
				}
			}
		});
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(192, 11, 160, 160);
		frmSnPhm.getContentPane().add(btn2);
		
		btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(frmSnPhm, "Bạn có chắc chắn thêm sản phẩm "+product1.getNameProduct()+" vào giỏ hàng hay không?", "Thông Bóa", JOptionPane.INFORMATION_MESSAGE);
				if(result==0) {
					arrayList.add(product3);
				}
			}
		});
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(371, 11, 160, 160);
		frmSnPhm.getContentPane().add(btn3);
		
		btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(frmSnPhm, "Bạn có chắc chắn thêm sản phẩm "+product1.getNameProduct()+" vào giỏ hàng hay không?", "Thông Bóa", JOptionPane.INFORMATION_MESSAGE);
				if(result==0) {
					arrayList.add(product4);
				}
			}
		});
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(10, 182, 160, 160);
		frmSnPhm.getContentPane().add(btn4);
		
		btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(frmSnPhm, "Bạn có chắc chắn thêm sản phẩm "+product1.getNameProduct()+" vào giỏ hàng hay không?", "Thông Bóa", JOptionPane.INFORMATION_MESSAGE);
				if(result==0) {
					arrayList.add(product5);
				}
			}
		});
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(192, 182, 160, 160);
		frmSnPhm.getContentPane().add(btn5);
		
		btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(frmSnPhm, "Bạn có chắc chắn thêm sản phẩm "+product1.getNameProduct()+" vào giỏ hàng hay không?", "Thông Bóa", JOptionPane.INFORMATION_MESSAGE);
				if(result==0) {
					arrayList.add(product6);
				}
			}
		});
		btn6.setBackground(Color.WHITE);
		btn6.setBounds(371, 182, 160, 160);
		frmSnPhm.getContentPane().add(btn6);
		
		panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ProcessPanelCart();
			}
		});

		panel.setBackground(new Color(255, 235, 205));
		panel.setBounds(10, 353, 521, 43);
		frmSnPhm.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\APLICATION_WORKING\\JAVACORE & SQL SERVER\\KHTN\\shareGit\\Huynt75\\images\\shopping_cart.png"));
		lblNewLabel.setBounds(210, 1, 40, 40);
		panel.add(lblNewLabel);
		
		lblCard = new JLabel("Cart");
		lblCard.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCard.setBounds(260, 0, 36, 43);
		panel.add(lblCard);
		frmSnPhm.setBounds(100, 100, 557, 446);
		frmSnPhm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		InsertProduct();
		System.out.println(product1.getImageView());
		DisplayToApp(btn1, product1);
		DisplayToApp(btn2, product2);
		DisplayToApp(btn3, product3);
		DisplayToApp(btn4, product4);
		DisplayToApp(btn5, product5);
		DisplayToApp(btn6, product6);
		//btn1.setIcon(new ImageIcon(product1.getImageView()));
		
		
	}
	
	public void InsertProduct() {
		product1 = new Product(IP6, priceIP6, iIP6);
		product2 = new Product(IPX, priceIPX, iIPX);
		product3 = new Product(VERTU90, priceVERTU90, iVERTU90);
		product4 = new Product(VERTU1200, priceVERTU1200, iVERTU1200);
		product5 = new Product(SSA8, priceSSA8, iSSA8);
		product6 = new Product(BB, priceBB, iBB);	
			
		}
	public void DisplayToApp(JButton button, Product product) {
		button.setIcon(new ImageIcon(product.getImageView()));
	}
	public void ProcessPanelCart() {
		FrmCart cart = new FrmCart(arrayList);
		
	}
	
	
}
