import java.io.*;
import java.util.*;

public class GradeManager {

	private List<Student> students=new ArrayList<>();
	private final String fileName="student.txt";
	
	
	public void addStudent(Scanner sc) {
		System.out.println("Enter ID: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Java Marks: ");
		int java=sc.nextInt();
		System.out.println("Enter python marks: ");
		int python=sc.nextInt();
		System.out.println("Enter DBMS marks: ");
		int dbms=sc.nextInt();
		
		
		Student s=new Student(id, name,java,python,dbms);
		students.add(s);
		saveFile(s);
		System.out.println("Student Added!\n");
	
	}
	
	
	public void showAllStudents() {
		System.out.println("\nID\tName\tJava\tPython\tDBMS\t%\tGrade");
		for(Student s:students) {
			System.out.println(s);
			
		}
		
	}
	
	
	public void loadFromFile() {
		try(BufferedReader br= new BufferedReader(new FileReader(fileName)))
		{
			String line;
			while((line=br.readLine()) !=null) {
				String[] parts = line.split(",");
				Student s=new Student(
					Integer.parseInt(parts[0]),
					parts[1],
					Integer.parseInt(parts[2]),
					Integer.parseInt(parts[3]),
					Integer.parseInt(parts[4])
			);
				
				
	students.add(s);
			}
			
		}	catch(IOException e) {
			System.out.println("No previous data found");
		}
		}
	public void saveFile(Student s) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write(s.id + "," + s.name + "," + s.javaMarks + "," + s.pythonMarks + "," + s.dbmsMarks);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
	}
	
}
	
	

