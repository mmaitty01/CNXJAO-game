package CNX; //ประกาศชื่อ package

public class Userclass { //ประกาศ Userclass ในเป็น public
	
  public static String sUsername; //ประกาศ String sUsername ในเป็น public แล้วก็เป็น static เพื่อจำตัวแปรที่ประกาศไว้ตลอดการทำงาน
  
  // ประกาศเป็น public void  จะได้นำไปใช้ในคลาสอื่นได้ แล้วทำการ setUsername กำหนดเป็น string ตามที่เราประกาศไว้ด้วย
  public void setUsername(String username){ 
  	sUsername = username;//กำหนดให้ sUsername = username
  	
  	}
  	//ประกาศเป็น public static จะได้นำไปใช้ในคลาสอื่นได้ แล้วทำการ getUsername กำหนดเป็น string ตามที่เราประกาศไว้ด้วย
  public static String getUsername(){
  	return sUsername;  //returnค่าที่ getUsername

  }  
}
