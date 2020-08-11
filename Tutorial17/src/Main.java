import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan = new Scanner(System.in);
		System.out.print("총 몇명의 학생이 있습니까?");
		int number = scan.nextInt();
		Student[] students = new Student[number];
		
		for(int i=0; i < number; i++)
		{
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gPA;
			System.out.print("학생의 이름을 입력하세요 : ");
			name = scan.next();
			System.out.print("학생의 나이를 입력하세요 : ");
			age = scan.nextInt();
			System.out.print("학생의 키를 입력하세요 : ");
			height = scan.nextInt();
			System.out.print("학생의 몸무게를 입력하세요 : ");
			weight = scan.nextInt();
			System.out.print("학생의 학번을 입력하세요 : ");
			studentID = scan.next();
			System.out.print("학생의 학년을 입력하세요 : ");
			grade = scan.nextInt();
			System.out.print("학생의 학점을 입력하세요 : ");
			gPA = scan.nextDouble();
			System.out.println();
		
			
			students[i] = new Student(name, age, height, weight, studentID, grade, gPA);
		}
		
		for(int i=0; i < number; i++)
		{
			students[i].show();
		}


	}

}
