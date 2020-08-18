
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Archer archer1 = new Archer("±Ã¼ö", "»ó");
		Archer archer2 = new Archer("±Ã¼ö2", "Áß");
		Archer archer3 = new Archer("±Ã¼ö", "»ó");
		System.out.println(archer1 == archer2);
		System.out.println(archer1 == archer3);
		System.out.println(archer1.equals(archer3));
		
		
	}

}
