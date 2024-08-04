package CNX; //ประกาศชื่อ package

import javax.swing.JButton; //นำเข้าตัวคลาสของ JButton
import javax.swing.JDialog; //นำเข้าตัวคลาสของ  JDialog
import java.awt.Color; //นำเข้าตัวคลาสของ Color
import java.awt.event.ActionListener; //นำเข้าตัวคลาสของ ActionListener
import java.awt.event.ActionEvent; //นำเข้าตัวคลาสของ ActionEvent
import javax.swing.ImageIcon; //นำเข้าตัวคลาสของ ImageIcon
import javax.swing.JLabel; //นำเข้าตัวคลาสของ EventQueue
import java.awt.Font; //นำเข้าตัวคลาสของ JLabel
import javax.swing.JTextField; //นำเข้าตัวคลาสของ JTextField
import javax.swing.JSeparator; //นำเข้าตัวคลาสของ JSeparator
import javax.swing.UIManager; //นำเข้าตัวคลาสของ UIManager

public class Login extends JDialog { //ให้ Login ในเป็น public ส่งค่าให้ Jdialog
	public String sUsername; //ให้ sUsername เป็นString เป็น public 
	
	public static void main(String[] args) { //ประกาศ method main
		try { //ให้try-catch ดักจับข้อผิดพลาด
			Login log = new Login(); //สร้างObject ของ class Login ชื่อ log
			log.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); //setให้สามารถปิดเกมส์ได้ใน tag title
			log.setVisible(true); //ให้แสดงผลบนหน้าจอ โดย setVisible เป็น boolean 
		} catch (Exception e) { //ให้try-catch ดักจับข้อผิดพลาด
			e.printStackTrace(); //ให้try-catch ดักจับข้อผิดพลาด
		}
	}
	
	public Login() { //ให้คลาสLoginDialog เป็น Public
		setResizable(false); //กำหนดให้ผู้ใช้ปรับปรับขนาดหน้าเกมส์ไม่ได้
		getContentPane().setBackground(new Color(240, 255, 255)); //รับค่ารูปใส่ในlblNewLabel
		setBounds(100, 100, 956, 637); //ตั้งรับค่าBounds
		setSize(1200,700); //ตั้งรับค่าขนาดจอแสดงผลเท่ากับ 1200*700
		setTitle("Login CNX-JAO"); //ตั้งรับค่าTitleมีค่าเป็น  Login CNX-JAO
		setLocationRelativeTo(null); //ตั้งรับค่าLocationRelativeTo ให้ค่าเท่ากับnull
		getContentPane().setLayout(null); //เรียกmethod Layout รับค่าLayout ที่มีค่าnull(ไม่มีค่า) ใส่ใน ContentPane
	
		// Label USERNAME
		JLabel lblUsername = new JLabel("USERNAME"); //สร้าง Object ของ JLabel ชื่อ lblUsername มีค่าUSERNAME
		lblUsername.setBackground(new Color(238, 232, 170));  //ตั้งรับค่าสีBackground ใส่ใน lblUsername
		lblUsername.setFont(new Font("ROG Fonts", Font.PLAIN, 25)); //ตั้งรับค่าFont ใส่ใน lblUsername และขนาดของตัวอักษร
		lblUsername.setBounds(482, 313, 202, 59);//ตั้งรับค่Bounds ใส่ใน lblUsername
		getContentPane().add(lblUsername); //รับค่าจากlblUsernameใส่ใน ContentPane

		// Input USERNAME
		final JTextField username = new JTextField(); //สร้าง Object ของ JTextField ชื่อ username และไม่สามารถเปลี่ยนแปลงค่าของตัวแปรได้โดยใส่final
		username.setFont(new Font("ROG Fonts", Font.PLAIN, 30));  //ตั้งรับค่าFont ใส่ใน username และขนาดของตัวอักษร
		username.setBounds(670, 317, 359, 46); //ตั้งรับค่Bounds ใส่ใน username
		getContentPane().add(username); //รับค่าจากusernameใส่ใน ContentPane
		

		// Button Start
		JButton btnLogin = new JButton(""); //สร้าง Object ของ JButton ชื่อ btnLogin ไม่รับค่า
		btnLogin.setIcon(new ImageIcon("img\\start.png")); //รับค่ารูปใส่ใน ใส่ใน btnLogin
		btnLogin.setBackground(new Color(255, 255, 255)); //ตั้งรับค่าสีBackground ใส่ใน btnLogin
		btnLogin.setFont(new Font("Segoe UI Black", Font.PLAIN, 30));  //ตั้งรับค่าFontและขนาดของตัวอักษร ใส่ใน btnLogin
		btnLogin.addActionListener(new ActionListener() {  //รับค่าจากActionListenerใส่ใน btnLogin
			public void actionPerformed(ActionEvent e) { //ให้method actionPerformed ให้ค่า e เป็นชนิด ActionEvent และเป็น Public ที่ไม่ต้องการreturnค่ากลับมา
		
				Quiz quiz = new Quiz(); //สร้าง Object ของ class Quiz ชื่อ quiz
				quiz.setVisible(true); //รับค่าจาก method Visibleใส่ใน quiz
			
				dispose(); //สิ้นสุดการทำงาน
			}
		});
		btnLogin.setBounds(558, 504, 165, 65); //ตั้งรับค่Bounds ใส่ในbtnLogin
		getContentPane().add(btnLogin); //รับค่าจากbtnLogin ใส่ใน ContentPane
		
		// Button Cancel
		JButton btnCancel = new JButton(""); //สร้าง Object ของ JButton ชื่อ btnCancel ไม่รับค่า
		btnCancel.setIcon(new ImageIcon("img\\exit.png")); //รับค่ารูปใส่ใน ใส่ใน btnCancel
		btnCancel.setBackground(UIManager.getColor("Button.disabledShadow")); //รับค่ารูปใส่ใน ใส่ใน btnCancel 
		btnCancel.setFont(new Font("Segoe UI Black", Font.PLAIN, 30)); //ตั้งรับค่าFontและขนาดของตัวอักษร ใส่ใน btnCancel btnCancel 
		btnCancel.addActionListener(new ActionListener() { //รับค่าจากActionListenerใส่ใน  btnCancel 
			public void actionPerformed(ActionEvent e) { //ให้method actionPerformed ให้ค่า e เป็นชนิด ActionEvent และเป็น Public ที่ไม่ต้องการreturnค่ากลับมา
				sUsername = ""; //ให้ตัวsUsernameรับค่า
				System.exit(0); //ออกจากการทำงาน
					}
				});
		btnCancel.setBounds(824, 498, 172, 71); //ตั้งรับค่Bounds ใส่ใน btnCancel
		getContentPane().add(btnCancel); //รับค่าจากbtnCancel ใส่ใน ContentPane
		
		//LOGIN GAME
		JLabel lblLogin = new JLabel("LOGIN GAME"); //สร้าง Object ของ JLabel ชื่อ lblLogin มีค่า LOGIN GAME
		lblLogin.setForeground(new Color(0, 0, 0)); //ตั้งรับค่าสีForeground ใส่ใน lblLogin
		lblLogin.setFont(new Font("ROG Fonts", Font.PLAIN, 50));  //ตั้งรับค่าFont ใส่ในlblLogin และขนาดของตัวอักษร
		lblLogin.setBounds(505, 145, 425, 103); //ตั้งรับค่Bounds ใส่ในlblLogin
		getContentPane().add(lblLogin); //รับค่าจากlblLogin ใส่ใน ContentPane
		
		
		JLabel lblImg = new JLabel(""); //สร้าง Object ของ JLabel ชื่อ lblImg
		lblImg.setIcon(new ImageIcon("img\\chiangmai-logo.png")); //รับค่ารูปใส่ในlblImg
		lblImg.setBounds(-206, 42, 807, 452);  //ตั้งรับค่Bounds ใส่ในlblImg
		getContentPane().add(lblImg);  //รับค่าจากlblImg ใส่ใน ContentPane
		
		JSeparator separator_1 = new JSeparator(); //สร้าง Object ของ JLabel ชื่อ separator_1
		separator_1.setBounds(511, 453, 567, 5);  //ตั้งรับค่Bounds ใส่ในseparator_1
		getContentPane().add(separator_1); //รับค่าจาก separator_1ใส่ใน ContentPane
		
		JSeparator separator_2 = new JSeparator(); //สร้าง Object ของ JLabel ชื่อ separator_2
		separator_2.setBounds(511, 244, 567, 5); //ตั้งรับค่Bounds ใส่ในseparator_2
		getContentPane().add(separator_2); //รับค่าจากseparator_2 ใส่ใน ContentPane
		
		JLabel label = new JLabel(""); //สร้าง Object ของ JLabel ชื่อ label
		label.setIcon(new ImageIcon("img\\q.gif"));//รับค่ารูปใส่ใน label
		label.setBounds(823, 0, 373, 296); //ตั้งรับค่Bounds ใส่ใน label
		getContentPane().add(label); //รับค่าจาก label ใส่ใน ContentPane
		
		JLabel label_1 = new JLabel(""); //สร้าง Object ของ JLabel ชื่อ label_1
		label_1.setIcon(new ImageIcon("img\\ico-gamepad.png"));//รับค่ารูปใส่ในlabel_1
		label_1.setBounds(131, 296, 308, 276); //ตั้งรับค่Bounds ใส่ในlabel_1
		getContentPane().add(label_1); //รับค่าจากlabel_1 ใส่ใน ContentPane
	
	}
}
		

		
		
