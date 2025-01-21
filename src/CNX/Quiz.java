package CNX;//ประกาศชื่อpackage

import javax.swing.JFrame; //นำเข้าตัว class ของJFrame
import javax.swing.JPanel; //นำเข้าตัว class ของ JPanel
import java.awt.CardLayout; //นำเข้าตัว class ของ CardLayout
import java.util.Random; //นำเข้าตัว class ของ Random
import javax.swing.JOptionPane; //นำเข้าตัว class ของ JOptionPane
import java.awt.Toolkit; //นำเข้าตัว class ของ Toolkit
import java.io.BufferedWriter; //นำเข้าตัว class ของ BufferedWriter
import java.io.File; //นำเข้าตัว class ของ File
import java.io.FileWriter; //นำเข้าตัว class ของ FileWriter
import java.io.IOException; //นำเข้าตัว class ของ IOException

public class Quiz extends JFrame{ //ประกาศ class Quiz เป็น public ไปทำงานที่๋JFrame
	JPanel qu = new JPanel(); //สร้างObject ของ class JPanel ชื่อ qu
	CardLayout cards = new CardLayout(); //สร้างObject ของ class CardLayout ชื่อ cards
	int numQs; //ประกาศตัวแปร numQ เป็น integer
	int wrongs=0; //ประกาศตัวแปร wrongs เป็น integer
	int total=0 ; //ประกาศตัวแปร total เป็น integer
	
	 String[][] answers={ //เก็บข้อมูลของ answer เป็น String และเก็บแบบ array
					  {"2","3","5","1"}, //ตัวเลือกคำตอบ
					  {"นพบุรีล้านนาเชียงใหม่","นพบุรีศรีพระนครพิงค์เชียงใหม่","นพระบุรีศรีนครพิงค์เชียงใหม่ ","นพบุรีศรีนครพิงค์เชียงใหม่"}, //ตัวเลือกคำตอบ
					  {"ศรีตรัง","ทองกวาว","นนทรีย์","กระดังงา"}, //ตัวเลือกคำตอบ
					  {"วัดพระธาตุดอยสุเทพราชวรวิหาร","อุทยานหลวงราชพฤกษ์","น้ำตกห้วยแก้ว","เชียงใหม่ไนท์ซาฟารี"}, //ตัวเลือกคำตอบ
					  {"น้ำพริกหนุ่ม","กล้วยตาก","ตำเมี่ยงนาคู","ข้าวจี่"}, //ตัวเลือกคำตอบ
					  {"แมวน้ำ","ปลาสร้อย","ปลากา","แพนด้า"}, //ตัวเลือกคำตอบ
					  {"ถ้ำเชียงดาว","ถ้ำเมืองออน","ถ้ำแกลบ","ถ้ำบริจินดา"}, //ตัวเลือกคำตอบ
					  {"ดอยสุเทพเป็นศรี ประเพณีเป็นสง่า บุปผชาติล้วนามตา นามล้ำค่านครพิงค์","ดอยสุเทพเป็นศรี ประเพณีเป็นสง่า บุปผาชาติล้วนงามตา นามล้ำค่านครพิงค์","ดอยสุเทพเป็นศรี ประเพณีเป็นสง่า บุปผะชาติล้วนงามตา นามล้ำค่านครพิงค์","ดอยสุเทพเป็นศรี ประเพณีเป็นสง่า บุปผชาติล้วนงามตา นามล้ำค่านครพิงค์"}, //ตัวเลือกคำตอบ
					  {"ดอยอินทนนท์","ดอยสุเทพ","ดอยอ่างขาง","ดอยม่อนจอง"}, //ตัวเลือกคำตอบ
					  {"ตำนานเมื่อก่อนมีดอกบัวมากที่สุดในจังหวัดเชียงใหม่","ตำนานสาวเอื้องเหนือกระโดดน้ำเพื่อบูชารักแท้","ตำนานสาวเหนือบูชาดอกบัวในคืนวันพระ","ตำนานสาวเอื้องเหนือกระโดดหน้าผาบูชารักแท้"}, //ตัวเลือกคำตอบ
					  {"ดินแดนมีนานับล้าน","ดินแดนที่เป็นอู่ข้าวอู่น้ำ","ดินแดนที่อุมสมบูรณ์กับการเกษตร","เป็นดินแดนที่ชื่อว่า “นาทอง”"}, //ตัวเลือกคำตอบ
					  
					 };
	RadioQuestionGame questions[]={ //สร้าง Object ของ class RadioQuestionGame ชื่อ questions และเก็ข้อมูลแบบ array
		
		new RadioQuestionGame( //สร้าง Object ของ class RadioQuestionGame
			"จังหวัดเชียงใหม่มีขนาดใหญ่เป็นอันดับที่เท่าไหร่ ?", //ชื่อคำถามที่เก็บไว้ใน questions แบบ array
			answers[0], //เรียกคำตอบใน answers ที่ array ที่ 0
			0,this //ให้เลือกในindexที่0ตัวที่0นarray
		),
		new RadioQuestionGame( //สร้าง Object ของ class RadioQuestionGame
			"ข้อใดเป็นชื่อเดิมของจังหวัดเชียงใหม่  ?", //ชื่อคำถามที่เก็บไว้ใน questions แบบ array
			answers[1], //เรียกคำตอบใน answers ที่ arrayที่ 1
			3,this //ให้เลือกในindexที่1ตัวที่2ในarray
		),
		new RadioQuestionGame( //สร้าง Object ของ class RadioQuestionGame
			"ดอกไม้ประจำจังหวัดเชียงใหม่ คือดอกไม้อะไร  ?", //ชื่อคำถามที่เก็บไว้ใน questions แบบ array
			answers[2], //เรียกคำตอบใน answers ที่ array ที่ 2
			1,this //ให้เลือกในindexที่2ตัวที่1ในarray
		),
		new RadioQuestionGame( //สร้าง Object ของ class RadioQuestionGame
			"สถานที่ท่องเที่ยวใดไม่ได้อยู่ในอำเภอเมืองเชียงใหม่ ?", //ชื่อคำถามที่เก็บไว้ใน questions แบบ array
			answers[3], //เรียกคำตอบใน answers ที่ array ที่ 3
			3,this //ให้เลือกในindexที่3ตัวที่3ในarray
		),
		new RadioQuestionGame( //สร้าง Object ของ class RadioQuestionGame
			"อาหารพื้นเมืองของจังหวัดเชียงใหม่คือ ?", //ชื่อคำถามที่เก็บไว้ใน questions แบบ array
			answers[4], //เรียกคำตอบใน answers ที่ array ที่ 4
			0,this //ให้เลือกในindexที่4ตัวที่0ในarray
		),
		new RadioQuestionGame( //สร้าง Object ของ class RadioQuestionGame
			"สัตว์น้ำประจำจังหวัดเชียงใหม่คือ ?", //ชื่อคำถามที่เก็บไว้ใน questions แบบ array
			answers[5], //เรียกคำตอบใน answers ที่ array ที่ 5
			2,this //ให้เลือกในindexที่5ตัวที่2ในarray
		),
		new RadioQuestionGame( //สร้าง Object ของ class RadioQuestionGame
			"พระธาตุนมผาอยู่ที่ถ้ำใดในจังหวัดเชียงใหม่ ? ", //ชื่อคำถามที่เก็บไว้ใน questions แบบ array
			answers[6], //เรียกคำตอบใน answers ที่ array ที่ 6
			1,this //ให้เลือกในindexที่6ตัวที่1ในarray
		),
		new RadioQuestionGame( //สร้าง Object ของ class RadioQuestionGame
			"ข้อใดคือคำขวัญจังหวัดเชียงใหม่ ?", //ชื่อคำถามที่เก็บไว้ใน questions แบบ array
			answers[7], //เรียกคำตอบใน answers ที่ array ที่ 7
			3,this //ให้เลือกในindexที่7ตัวที่3ในarray
		),
		new RadioQuestionGame( //สร้าง Object ของ class RadioQuestionGame
			"ดอยที่สูงที่สุดในจังหวัดเชียงใหม่คือ ?", //ชื่อคำถามที่เก็บไว้ใน questions แบบ array
			answers[8], //เรียกคำตอบใน answers ที่ array ที่ 8
			0,this //ให้เลือกในindexที่8ตัวที่0ในarray
		),
		new RadioQuestionGame( //สร้าง Object ของ class RadioQuestionGame
			"ข้อใดถูกต้องเกียวกับ “วังบัวบาน” ?", //ชื่อคำถามที่เก็บไว้ใน questions แบบ array
			answers[9], //เรียกคำตอบใน answers ที่ array ที่ 9
			3,this //ให้เลือกในindexที่9ตัวที่3ในarray
		),
		new RadioQuestionGame( //สร้าง Object ของ class RadioQuestionGame
			"คำว่าล้านนาหมายถึงอะไร ?", //ชื่อคำถามที่เก็บไว้ใน questions แบบ array
			answers[10], //เรียกคำตอบใน answers ที่ array ที่ 10
			0,this //ให้เลือกในindexที่10ตัวที่0ในarray
		)
	};

	public static void main(String args[]){ //สร้าง method main
		new Quiz(); //สร้าง methodชื่อ Quiz
	}

	
	public Quiz(){ //ให้method Quiz เป็น Public
		super("CNX-JAO"); //ใส่titleของเกมส์
		setIconImage(Toolkit.getDefaultToolkit().getImage("img\\icon-game.png")); //setรูปไอคอน(logo)ของเกมส์
		setResizable(false); //กำหนอให้ผู้ใช้ปรับปรับขนาดหน้าเกมส์ได้
		setSize(1000,700); //setหน้าต่างเกมส์ให้มีขนาด 1000*700
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); //setให้สามารถปิดเกมส์ได้ใน tag title
		
		qu.setLayout(cards); //ตั้งค่าObject qu ให้set Layoutคือcards
		numQs = questions.length; //ให้ numQ เท่ากับคำถามใน array ของ questions
		for(int i=0;i<numQs;i++){ //ใช้ loop forใส่เงื่อนไข int i=0;i<numQs;i++
			qu.add(questions[i],"q"+i); //qu เพิ่มคำถามจากindexที่ i และให้ q+i 
		}
		Random r = new Random(); //สร้างobjectของclass Random ชื่อ r
		int i=r.nextInt(numQs); //ให้ i = r เป็น integer เรียกใช้คำถามใน numQ
		cards.show(qu,"q"+i); //ให้แสดง คำถามโดยเปลี่ยนคำถามไปเรื่อยๆ แสดงใน cards ของ qu
		getContentPane().add(qu); //รับค่า qu ใส่ใน ContentPane
		setVisible(true); //ให้แสดงผลบนหน้าจอ โดย setVisible เป็น boolean 
		
	
	}
	
	public void next(){ //ให้method next เป็น Public ที่ไม่คือค่า
		if((total-wrongs)==numQs){ //ถ้าคำตอบที่เลือกทั้งหมดลบกับคำตอบที่ตอบผิดเท่ากับnumQ
			showSummary(); //ให้showSummary
		}else{ //ถ้าไม่ตรงตามเงื่อนไขให้โปรแกรมมาทำงานต่อในนี้
			Random r=new Random(); //สร้างobjectของclass Random ชื่อ r
			boolean found=false; //ให้foundคือ false เป็นตัวแปรชนิด boolean
			int i=0; //ประกาศตัวแปร i เป็น integer มีค่าเป็น 0
			while(!found){ //ใช้ while บอกว่าในขณะที่ foundไม่เท่ากับflase(foundเป็นจริง)
				i=r.nextInt(numQs); //ให้ i = r เรียก numQถัดไป
				if(!questions[i].used){ //ถ้าquestionsในindexที่iไม่ถูกเรียก(ใช้) used
					found=true; //ให้foundคือ false
			}
			cards.show(qu,"q"+i); //แสดงคำถามถัดไปใน cards
			}
		}
	}
	
	

	public void showSummary(){ //ให้method showSummary เป็น Public ที่ไม่คืนค่า
		
		try{ //สร้างtry-catch ดักจับข้อผิดพลาด
            String data = " 𝐆𝐚𝐦𝐞 𝐎𝐯𝐞𝐫 " //แสดงข้อความใน data มีชนิดเป็นString
            		+"\n"+ (total-wrongs) + " right  ✔" //แสดงข้อความและจำนวนคำตอบที่คำตอบถูก
            		+"\n"+ wrongs + " questions wrong  ✖" + //แสดงข้อความและจำนวนคำตอบที่คำตอบผิด
        			"\n𝐘𝐨𝐮𝐫  𝐒𝐜𝐨𝐫𝐞 : \t\t"+(int)((float)(total-wrongs)*10)+ "\t\t "+"\n" //แสดงข้อความและคำแนน
        		;
           
            File file =new File("score.txt"); //สร้าง Object ของ class File ชื่อ file มีscore.txt เก็บไว้
            if(!file.exists()){ //กำหนดเงื่อนไขถ้าfileไม่ถูกปิดหรือออก
                file.createNewFile(); //ให้method createNewFileรับค่าและนำค่าใส่ใน file
            }
  
            //true = append file
            FileWriter fileWritter = new FileWriter(file,true); //สร้าง Object ของ class  FileWriter ชื่อfileWritter มีค่าfile และใช้trueเพื่อ เก็บเนื้อหาเก่าที่มีอยู่แล้วเพิ่มเนื้อหาใหม่ลงในไฟล์
                BufferedWriter bufferWritter = new BufferedWriter(fileWritter);//สร้าง Object ของ class BufferedWriter ชื่อ bufferedWriter มีค่าfileWritter
                bufferWritter.write(data); //เขียนข้อมูล(data)ลงใน  bufferWritter
                bufferWritter.newLine(); //ขึ้นบรรทัดใหม่ในbufferWritter
                bufferWritter.close(); //ปิดการทำงานของbufferWritter
  
            
  
        }catch(IOException e){ //สร้างtry-catch ดักจับข้อผิดพลาด
            e.printStackTrace(); //สร้างtry-catch ดักจับข้อผิดพลาด
        }
		
		JOptionPane.showMessageDialog(null,"𝐆𝐚𝐦𝐞 𝐎𝐯𝐞𝐫" //แสดงข้อความในMessageDialog
				+"\n"+ (total-wrongs) + " right  ✔"  //แสดงข้อความและจำนวนคำตอบที่คำตอบถูกในMessageDialog 
				+"\n"+ wrongs + " questions wrong  ✖" + //แสดงข้อความและจำนวนคำตอบที่คำตอบผิดในMessageDialog
			"\n𝐘𝐨𝐮𝐫  𝐒𝐜𝐨𝐫𝐞 : \t\t"+(int)((float)(total-wrongs)*10) + "\t\t "+"\n"  //แสดงข้อความและคำแนนในMessageDialog
		);
		System.exit(0); //ออกจากเกมส์
	}
}