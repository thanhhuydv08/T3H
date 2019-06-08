package swing_Object_BT5_3;
// update github
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrDisplayContentFilm {

	private JFrame frmDanhSchPhim;
	private JButton lbBack;
	private JButton lbNext;
	private JTextField txtName;
	private JTextField txtType;
	private JTextField txtDate;
	private JTextField txtCinema;
	JLabel pnImage;
	Film film4, film1, film2, film3;
	static int count = 1;

	/**
	 * Laun
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrDisplayContentFilm window = new FrDisplayContentFilm();
					window.frmDanhSchPhim.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrDisplayContentFilm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		InsertFilm();
		frmDanhSchPhim = new JFrame();
		frmDanhSchPhim.getContentPane().setBackground(new Color(255, 250, 205));
		frmDanhSchPhim.setTitle("Danh S\u00E1ch Phim Chi\u1EBFu R\u1EA1p");
		frmDanhSchPhim.setBounds(100, 100, 579, 375);
		frmDanhSchPhim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDanhSchPhim.getContentPane().setLayout(null);

		pnImage = new JLabel();
		pnImage.setIcon(new ImageIcon(film1.getfImage()));
		pnImage.setBackground(Color.WHITE);
		pnImage.setBounds(10, 11, 256, 256);
		frmDanhSchPhim.getContentPane().add(pnImage);

		lbBack = new JButton("");
		lbBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count > 1) {// ko cho trừ =0,-1,-2,-3
					count--;
					SwitchFilm(count);
				} else {
					JOptionPane.showMessageDialog(frmDanhSchPhim,
							"Trang film đầu tiên, vui lòng nhấn next bên dưới để xem film kế tiếp !", " Thông Báo",
							JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});
		lbBack.setBackground(Color.WHITE);
		lbBack.setIcon(new ImageIcon("E:\\ICON\\iconWeb\\back.png"));
		lbBack.setBounds(79, 272, 64, 64);
		frmDanhSchPhim.getContentPane().add(lbBack);

		lbNext = new JButton("");
		lbNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count < 4) {// vì toi chi tao 4 doi tuong thoi tới index 3 là vào ++ thi lên 4 g�?i hàm
					count++;
					SwitchFilm(count);
				} else {
					JOptionPane.showMessageDialog(frmDanhSchPhim,
							"Trang film cuối cùng, vui lòng nhấn back bên dưới để xem lại !", " Thông Báo",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		lbNext.setBackground(Color.WHITE);
		lbNext.setIcon(new ImageIcon("E:\\ICON\\iconWeb\\next.png"));
		lbNext.setBounds(153, 272, 64, 64);
		frmDanhSchPhim.getContentPane().add(lbNext);

		txtName = new JTextField();
		txtName.setBackground(new Color(250, 235, 215));
		txtName.setText(film1.getfName());
		txtName.setBounds(291, 58, 231, 20);
		frmDanhSchPhim.getContentPane().add(txtName);
		txtName.setColumns(10);

		txtType = new JTextField();
		txtType.setColumns(10);
		txtType.setText(film1.getfType());
		txtType.setBackground(new Color(255, 228, 225));
		txtType.setBounds(291, 104, 231, 20);
		frmDanhSchPhim.getContentPane().add(txtType);

		txtDate = new JTextField();
		txtDate.setColumns(10);
		txtDate.setText(film1.getfDate());
		txtDate.setBackground(new Color(176, 224, 230));
		txtDate.setBounds(291, 150, 231, 20);
		frmDanhSchPhim.getContentPane().add(txtDate);

		txtCinema = new JTextField();
		txtCinema.setColumns(10);
		txtCinema.setText(film1.getfCinema());
		txtCinema.setBackground(new Color(224, 255, 255));
		txtCinema.setBounds(291, 199, 231, 20);
		frmDanhSchPhim.getContentPane().add(txtCinema);

		System.out.println(film1.getfName());
	}

	/**
	 * truyen tham so cho doi tuong film
	 */
	public void InsertFilm() {
		film1 = new Film("Avatar", "Hành Động", "06/06/2019", "Galaxy PN", "E:\\ICON\\iconWeb\\avatar.png");
		film2 = new Film("Tần thờii minh Nguyệt", "Hoạt hình 3D", "06/12/2019", "Galaxy PVT",
				"E:\\ICON\\iconWeb\\ttmn.png");
		film3 = new Film("Thiên Hành Cửu Ca", "Hoạt hình 3D", "06/09/2019", "HBO CGV", "E:\\ICON\\iconWeb\\thcc.png");
		film4 = new Film("Đấu La đại Lục", "Hoạt hình 3D", "06/07/2019", "CGV Hùng Vương",
				"E:\\ICON\\iconWeb\\dldl.png");
	}

	/**
	 * hien thi cac tham so da truyen vao len swing GUI
	 */
	public void DisplayFilm(Film film) {
		txtName.setText(film.getfName());
		txtType.setText(film.getfType());
		txtDate.setText(film.getfDate());
		txtCinema.setText(film.getfCinema());
		pnImage.setIcon(new ImageIcon(film.getfImage()));
	}

	/**
	 * 
	 * xu ly code cho tung gia tri theo tung doi tuong khi next or back
	 */
	public void SwitchFilm(int count) {

		switch (count) {
		case 1:
			DisplayFilm(film1);
			break;
		case 2:
			DisplayFilm(film2);
			break;
		case 3:
			DisplayFilm(film3);
			break;
		case 4:
			DisplayFilm(film4);
			break;

		}
	}

}
