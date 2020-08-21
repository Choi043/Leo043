
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		newType[] animals = new newType[3];
		animals[0] = new Dog("강아지");
		animals[1] = new Cat("고양이");
		animals[2] = new Turtle("거북이");
		
		Show show = new Show();
		
		show.select();
		
		if(animals[show.returns()] instanceof Dog)
		{
			Dog temp = (Dog) animals[show.returns()];
			temp.announce();
		}
		else if(animals[show.returns()] instanceof Cat)
		{
			Cat temp = (Cat) animals[show.returns()];
			temp.announce();
		}
		else if(animals[show.returns()] instanceof Turtle)
		{
			Turtle temp = (Turtle) animals[show.returns()];
			temp.announce();
		}
		else
		{
			System.out.println("잘못 입력하셨습니다.");
		}
		show.crying();
		
		
	}

}
