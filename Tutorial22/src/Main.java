
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Archer archer1 = new Archer("�ü�", "��");
		Archer archer2 = new Archer("�ü�2", "��");
		Archer archer3 = new Archer("�ü�", "��");
		System.out.println(archer1 == archer2);
		System.out.println(archer1 == archer3);
		System.out.println(archer1.equals(archer3));
		
		
	}

}
