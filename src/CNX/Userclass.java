package CNX; //��С�Ȫ��� package

public class Userclass { //��С�� Userclass ��� public
	
  public static String sUsername; //��С�� String sUsername ��� public ���ǡ��� static ���ͨӵ���÷���С������ʹ��÷ӧҹ
  
  // ��С���� public void  ��������㹤�������� ���Ƿӡ�� setUsername ��˹��� string ��������һ�С��������
  public void setUsername(String username){ 
  	sUsername = username;//��˹���� sUsername = username
  	
  	}
  	//��С���� public static ��������㹤�������� ���Ƿӡ�� getUsername ��˹��� string ��������һ�С��������
  public static String getUsername(){
  	return sUsername;  //return��ҷ�� getUsername

  }  
}