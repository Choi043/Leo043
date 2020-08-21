import java.util.Scanner;

public class Show implements PetInter{

	String type;
	String name;
	int input;
		
	Scanner scan = new Scanner(System.in);

	
	
	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("숫자를 입력하세요.");
		System.out.println("1번 강아지, 2번 고양이, 3번 거북이");
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
		System.out.println("멍! 멍!");
		}
		else if(input == 2)
		{
			System.out.println("야옹~");
		}
		else if(input == 3)
		{
			System.out.println("뿌억 뿌억");
		}
		else
		{
			System.out.println("잘못 선택하셨습니다.");
		}
		
	}

}

