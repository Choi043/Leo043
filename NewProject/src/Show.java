import java.util.Scanner;

public class Show implements PetInter{

	String type;
	String name;
	int input;
		
	Scanner scan = new Scanner(System.in);

	
	
	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("���ڸ� �Է��ϼ���.");
		System.out.println("1�� ������, 2�� �����, 3�� �ź���");
		input = scan.nextInt();
		
	}

	public int returns()
	{		
		return input -1;
	}
	
	@Override
	public void crying() {
		// TODO Auto-generated method stub

		if(input == 1) {
		System.out.println("��! ��!");
		}
		else if(input == 2)
		{
			System.out.println("�߿�~");
		}
		else if(input == 3)
		{
			System.out.println("�Ѿ� �Ѿ�");
		}
		else
		{
			System.out.println("�߸� �����ϼ̽��ϴ�.");
		}
		
	}

}

