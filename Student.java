
public class Student {
	int id;
	String name;
	int javaMarks, pythonMarks, dbmsMarks;
	public Student() {
		super();
	}
	public Student(int id, String name, int javaMarks, int pythonMarks, int dbmsMarks) {
		super();
		this.id = id;
		this.name = name;
		this.javaMarks = javaMarks;
		this.pythonMarks = pythonMarks;
		this.dbmsMarks = dbmsMarks;
	}
	
	public double getPercentage() {
		return(javaMarks+pythonMarks+dbmsMarks)/3.0;
	}
	
	public String getGrade() {
		double perc=getPercentage();
		if(perc>=85) return "A";
		else if(perc>=70) return "B";
		else if(perc>=50) return "C";
		else return "F";
	}
	
	public String toString() {
		return id+"\t"+name+"\t"+javaMarks+"\t"+pythonMarks+"\t"+dbmsMarks+"\t"+String.format("%.2f", getPercentage())+"\t"+getGrade();
		
	}

}
