package unit11;

public class StudentTester {
	  public static void main(String[] args) {
	  	Student stu = new Student("Billy Bob","5 - 90 85 95.5 77.5 88");
			System.out.println(stu);
			System.out.println("sum = " + stu.getSum());
			System.out.println("average = " + stu.getAverage());
			System.out.println("average after dropping low grade = " + stu.getAverageMinusLow());
			System.out.println("low grade = " + stu.getLowGrade());
			System.out.println("high grade = " + stu.getHighGrade());
	  	
	  }
	}