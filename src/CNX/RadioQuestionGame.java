package CNX;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.FlowLayout;

public class RadioQuestionGame extends JPanel implements ActionListener{

	/**
	 * Create the panel.
	 */

	int correctAns; //ประกาศให้ตัวแปร correctAns เป็น integer
	Quiz quiz; //เรียกตัวแปร quiz จากclass Quiz
	int selected; //ประกาศให้ตัวแปร selected เป็น integer
	boolean used; //ประกาศให้ตัวแปร used เป็น boolean
	

	//ส่วนของ questions
	JPanel qPanel = new JPanel(); //สร้าง Object ของ class JPanel ชื่อ qPanel
	
	//ส่วนของ answers
	JPanel aPanel = new JPanel(); //สร้าง Object ของ class aPanel ชื่อ aPanel
	JRadioButton[] responses; //ให้responses คือ JRadioButton[]
	ButtonGroup group = new ButtonGroup(); //สร้าง Object ของ class ButtonGroup ชื่อ group
	
	
	//ส่วนของ bottom
	JPanel botPanel = new JPanel(); //สร้าง Object ของ class JPanel ชื่อ botPanel
	JButton next = new JButton(""); //สร้าง Object ของ class JButton ชื่อ next
	JButton finish = new JButton(""); //สร้าง Object ของ class JButton ชื่อ finish
	private final JLabel lblNewLabel_1 = new JLabel(); //สร้าง Object ของ class JLabel ชื่อ lblNewLabel_1 เป็นชนิดprivate และไม่สามารถเปลี่ยนแปลงค่าของตัวแปรได้โดยใส่final
	private final JLabel lblNewLabel = new JLabel();  //สร้าง Object ของ class JLabel ชื่อ lblNewLabel มีค่าเป็น New label เป็นชนิดprivate และไม่สามารถเปลี่ยนแปลงค่าของตัวแปรได้โดยใส่final
	private final JLabel label_1 = new JLabel(); //สร้าง Object ของ class JLabel ชื่อ Label_1 มีค่าเป็น New label เป็นชนิดprivate และไม่สามารถเปลี่ยนแปลงค่าของตัวแปรได้โดยใส่final
	private final JLabel label_1_1 = new JLabel();
	public RadioQuestionGame(String q, String[] options, int ans, Quiz quiz ){
		//add
		this.quiz = quiz; //เรียกmethod quiz ให้มีค่าเท่ากับ quiz
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS)); //ตั้งรับค่าLayout
		correctAns = ans; //ให้correctAns มีค่าเท่ากับ ans
		qPanel.setBackground(new Color(239, 74, 66)); //ตั้งรับค่าพื้นหลังของ qPanel เป็นสี Button.background
		//qPanel.set
		qPanel.setLayout(null); //qPanelเรียกใช้method setLayout ให้ไม่มีค่า
		//question
		JLabel label = new JLabel(q); //สร้าง Object ของ class JLabel ชื่อlabel
		label.setBackground(Color.WHITE);
		label.setForeground(Color.BLACK); //ตั้งรับค่าสีForegroundของ label 
		label.setFont(new Font("Angsana New", Font.BOLD, 46)); //ตั้งรับค่าFont ของ label และขนาดของตัวอักษร
		label.setBounds(276, 27, 693, 105); //ตั้งรับค่าBoundsของ label 
		label.setHorizontalAlignment( SwingConstants.CENTER ); //ตั้งรับค่าให้ตัวอักษรอยู่ตรงกลางของ label 
		qPanel.add(label); //รับค่าจากlabelใส่ใน qPanel
		add(qPanel);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 10)); //ตั้งรับค่าFont ของ label และขนาดของตัวอักษร
		label_1.setIcon(new ImageIcon("img\\logo.png")); //รับค่ารูปใส่ในlabel_1
		label_1.setBounds(24, 0, 182, 180); //รับค่าBoundsใส่ในlabel_1
		qPanel.add(label_1); //รับค่าจากlabelใส่ใน label_1
		lblNewLabel_1.setBounds(0, 0, 1000, 181);
		qPanel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("img\\view.png"));
		
		//answer
		responses = new JRadioButton[options.length]; //สร้างarray responseเท่ากับ จำนวน index ของคำตอบ ใส่ใน JRadioButton
		for(int i=0;i<options.length;i++){ //ใช้loop for สำหรับเงื่อนไข int i=0;i<options.length;i++(i=index)
			responses[i]=new JRadioButton(options[i]); //สร้างarray responseเท่ากับ index ของคำตอบ ใส่ใน JRadioButton
			responses[i].addActionListener(this); //รับค่าจากActionListenerใส่ใน responses[i]
			responses[i].setFont(new Font("AngsanaUPC", Font.BOLD, 35));  //ตั้งรับค่าFont ของ responses[i] และขนาดของตัวอักษร
			responses[i].setForeground(Color.yellow);
			responses[i].setBackground(new Color(239, 74, 66));
			group.add(responses[i]);  //รับค่าจาก responses[i]ใส่ใน group
			aPanel.add(responses[i]); //รับค่าจาก responses[i]ใส่ใน aPanel
			
		}
		
		aPanel.setForeground(new Color(239, 74, 66));
		aPanel.setBackground(new Color(239, 74, 66)); //ตั้งรับค่าสีพื้นหลังของ aPanel
		//aPanel.setBounds(100, 100, 900, 300);
		
		add(aPanel);
		aPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		next.setIcon(new ImageIcon("img\\next.png")); //รับค่ารูปใส่ใน next
		next.setBackground(new Color(239, 74, 66)); //ตั้งรับค่าสีBackgroundของnext
		next.setBounds(128, 7, 310, 85); //ตั้งรับค่าBoundsของ next
		
		//bottom
		next.addActionListener(this); //รับค่าจากActionListenerใส่ใน next
		finish.setIcon(new ImageIcon("img\\finish.png")); //รับค่ารูปใส่ใน finish
		finish.setBackground(new Color(239, 74, 66));  //ตั้งรับค่าสีBackgroundของ finish
		finish.setFont(new Font("Ekkamai New", Font.BOLD, 20)); //ตั้งรับค่าFont ของ finish และขนาดของตัวอักษร
		finish.setBounds(542, 7, 314, 85); //ตั้งรับค่าBoundsของ finish 
		finish.addActionListener(this); //รับค่าจากActionListenerใส่ใน finish
		botPanel.setBackground(new Color(239, 74, 66)); //ตั้งรับค่าสีBackgroundของbotPanel
		botPanel.setLayout(null); //ตั้งรับค่าLayoutของ botPanel ให้ไม่มีค่า
		botPanel.add(next); //รับค่าจาก next ใส่ใน BotPanel
		botPanel.add(finish); //รับค่าจาก finish ใส่ใน BotPanel
		add(botPanel); //รับค่าใส่ใน botPanel
		label_1_1.setIcon(new ImageIcon("img\\view-2.png"));
		label_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_1_1.setBounds(0, 112, 1000, 118);
		
		botPanel.add(label_1_1);
	}
		public void actionPerformed(ActionEvent e){ //ให้method actionPerformed ให้ค่า e เป็นชนิด ActionEvent และเป็น Public ที่ไม่ต้องการreturnค่ากลับมา
		Object src=e.getSource(); //ให้srcมีค่าเท่ากับ e ใน method Source เรียกว่าจากคลาส Object
		if(src.equals(next)){ //กำหนดเงื่อนไขถ้ากดที่ next
			showResult(); //เรียก method showResult
			if(selected==correctAns){ //กำหนดเงื่อนไขถ้าเลือกเท่ากับคำตอบ
				used=true; //used(ตัวที่เลือก) มีค่าเท่ากับ true
				quiz.next(); //เปลี่ยนคำถาม
			}else { //ถ้าไม่ตรงตามเงื่อนไขข้างบน
				used=false; //used(ตัวที่เลือก) มีค่าเท่ากับ false
				quiz.next(); //เปลี่ยนคำถาม
			}
		}
		
		//finish button
		if(src.equals(finish)){ //กำหนดเงื่อนไขถ้ากดที่ finish
			quiz.showSummary(); //เรียกmethod showResultใน quiz
		}
		
		//radio buttons
		for(int i=0;i<responses.length;i++){ //กำหนดเงื่อนไขถ้า int i=0;i<responses.length;i++
			if(src==responses[i]){ //กำหนดเงื่อนไขถ้าsrc มีเท่ากับ responses[i]
				selected=i; //ให้selected=i
			}
		}
	}
	
	public void showResult(){ //ให้method showResult เป็น Public ที่ไม่ต้องการ return ค่ากลับมา
		quiz.total++; //เพิ่มค่าในtotal ที่อยู่ในmethod quiz
		if(selected==correctAns){ //กำหนดเงื่อนไขถ้าเลือกเท่ากับคำตอบ
			JOptionPane.showMessageDialog(null,"correct! ✔"+"\nYour Score +10"+"\nGood Job!"); //แสดงข้อความcorrectในMessageDialog 
		}else{ //ถ้าไม่ตรงตามเงื่อนไขข้างบน
			JOptionPane.showMessageDialog(null,"worng! ✖"); //แสดงข้อความworngในMessageDialog 
			quiz.wrongs++; //เพิ่มค่าในwrong ที่อยู่ในmethod quiz
		}
		
	}

}
