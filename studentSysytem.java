package studentsystem;
import java.util.Scanner;


public class studentSysytem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(int s =1; s<= 10; s++) {
			System.out.println("----Student" + s +"----");
		
			//1. Read Name
			System.out.println("Enter Name: ");
			String name =scanner.nextLine();

			
			// 2.Read course
			System.out.println("Enter Course: ");
			String course = scanner.nextLine();
			while(!
					course.equalsIgnoreCase("BBC")){
		
				System.out.println("That is not the required course.");
				System.out.println("Enter your course again: ");
				course = scanner.nextLine();
			}
			
			
			
			
			
			// 3. Read marks
			int marks;
			do {
			System.out.println("Enter Marks: ");
			 marks =scanner.nextInt();
			if (marks<=0) {
				System.out.println("Please enter a number greater than 0");
			}
			
			}while
				(marks<=0);
			int Marks=70;
			String results =marks>=80? "Pass":"Failed";
			String mark = scanner.nextLine();
			System.out.println(results);
				
					
			

		}

	}

 }