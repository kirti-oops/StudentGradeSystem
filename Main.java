import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		GradeManager gm= new GradeManager();
		gm.loadFromFile();
		
		int choice;
		do {
			System.out.println("\n====Student Grade Management System");
			System.out.println("1. Add student");
			System.out.println("2. Show all students");
			System.out.println("3. Exit");
			System.out.println("Enter your Choice: ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1: 
				gm.addStudent(sc);
				break;
			case 2:
				gm.showAllStudents();
				break;
			case 3:
				System.out.println("Existing....Bye!");
				break;
			default:
				System.out.println("Invalid choice!");
			
			
	
				
			}
		} while(choice !=3);
		

	}

}
