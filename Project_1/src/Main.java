
public class Main{
			
	Main(int value01)
	{
		System.out.println("매개변수가 하나인 생성자" + value01);
	}	
	
	Main(int value01, int value02)
	{
		System.out.println("매개변수가 두개인 생성자" +(value01 + value02));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main obj1 = new Main(10);
		Main obj2 = new Main(10, 20);
		
	}

}
