
public class Main implements Dog, Cat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main main = new Main();
		main.crying();
		main.one();
		main.two();
		
	}

	@Override
	public void crying() {
		// TODO Auto-generated method stub
		System.out.println("¿ù! ¿ù!");
		
	}


	@Override
	public void one() {
		// TODO Auto-generated method stub
		System.out.println("One!");
		
	}

	@Override
	public void two() {
		// TODO Auto-generated method stub
		System.out.println("Two!");
		
	}

}
