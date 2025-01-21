package CNX;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;

public class LoginGame extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField username;
	public String sUsername; //ให้ sUsername เป็นString เป็น public 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			LoginGame dialog = new LoginGame();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	


	/**
	 * Create the dialog.
	 */
	public LoginGame() {
		setResizable(false); //กำหนดให้ผู้ใช้ปรับปรับขนาดหน้าเกมส์ไม่ได้
		setTitle("Login CNX-JAO"); //ตั้งรับค่าTitleมีค่าเป็น  Login CNX-JAO
		setLocationRelativeTo(null); //ตั้งรับค่าLocationRelativeTo ให้ค่าเท่ากับnull
		setBounds(100, 100, 1000, 700);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(102, 204, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnLogin = new JButton("");
			btnLogin.setBackground(new Color(102, 204, 255));
			btnLogin.setIcon(new ImageIcon("img\\start-1.png"));
			btnLogin.addActionListener(new ActionListener() {  //รับค่าจากActionListenerใส่ใน btnLogin
				public void actionPerformed(ActionEvent e) { //ให้method actionPerformed ให้ค่า e เป็นชนิด ActionEvent และเป็น Public ที่ไม่ต้องการreturnค่ากลับมา
			
					Quiz quiz = new Quiz(); //สร้าง Object ของ class Quiz ชื่อ quiz
					quiz.setVisible(true); //รับค่าจาก method Visibleใส่ใน quiz
				
					dispose(); //สิ้นสุดการทำงาน
				}
			});
			btnLogin.setBounds(172, 519, 269, 115);
			contentPanel.add(btnLogin);
		}
		{
			JButton btnCancel = new JButton("");
			btnCancel.setBackground(new Color(102, 204, 255));
			btnCancel.setIcon(new ImageIcon("img\\exit-1.png"));
			btnCancel.addActionListener(new ActionListener() { //รับค่าจากActionListenerใส่ใน  btnCancel 
				public void actionPerformed(ActionEvent e) { //ให้method actionPerformed ให้ค่า e เป็นชนิด ActionEvent และเป็น Public ที่ไม่ต้องการreturnค่ากลับมา
					sUsername = ""; //ให้ตัวsUsernameรับค่า
					System.exit(0); //ออกจากการทำงาน
						}
					});
			btnCancel.setBounds(536, 519, 269, 115);
			contentPanel.add(btnCancel);
		}
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("img\\chiangmai-logo-1.png"));
		lblLogo.setBounds(211, 25, 564, 297);
		contentPanel.add(lblLogo);
		{
			JLabel lblLoginGame = new JLabel("LOGIN GAME");
			lblLoginGame.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 48));
			lblLoginGame.setBounds(299, 332, 376, 74);
			contentPanel.add(lblLoginGame);
		}
		
		username = new JTextField();
		username.setHorizontalAlignment(SwingConstants.CENTER);
		username.setForeground(Color.GREEN);
		username.setFont(new Font("Tahoma", Font.PLAIN, 30));
		username.setBackground(Color.BLACK);
		username.setBounds(407, 431, 368, 55);
		contentPanel.add(username);
		username.setColumns(10);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setVerticalAlignment(SwingConstants.BOTTOM);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblUsername.setBounds(211, 440, 200, 38);
		contentPanel.add(lblUsername);
		
		JLabel lblIconGame = new JLabel("");
		lblIconGame.setIcon(new ImageIcon("img\\ico-gamepad-1.png"));
		lblIconGame.setBounds(25, 231, 215, 211);
		contentPanel.add(lblIconGame);
		
		JLabel lblIconGame1 = new JLabel("");
		lblIconGame1.setIcon(new ImageIcon("img\\jao.gif"));
		lblIconGame1.setBounds(748, 217, 200, 200);
		contentPanel.add(lblIconGame1);
	}
}
