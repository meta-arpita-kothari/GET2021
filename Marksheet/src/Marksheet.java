import java.util.*;

public class Marksheet {
	private ArrayList<Float> grades = new ArrayList<Float>();  // list of grades
	Integer numOfStudents;    // total number of students
	Integer i;
	Scanner input = new Scanner(System.in);
	
	/*
	 * To take the input of total number of students
	 */
	private void setNumberOfStudents(){
		System.out.println("Enter number of students:");
		int n = input.nextInt();
		if(n == 0){
			System.out.println("Marksheet cannot be created for zero student.");
			System.out.println("Do you want to try again?(y/n)");
			Character ch = input.next().charAt(0); 
			if(ch=='Y' || ch=='y'){
				setNumberOfStudents();
			}
			else{
				System.out.println("Okay, bye!");
				System.exit(1);
			}
			
		}
		numOfStudents = n;
	}
	/*
	 * To take the input grades of the students
	 */
	private void setGrades(){
		float temp = 0;
		for(i=1; i <= numOfStudents ;i++){
			System.out.println("Enter grade for student "+i+": ");
			temp = input.nextFloat();
			if(temp < 0 || temp > 100){
				System.out.println("Invalid input. Try to input again!!");
				System.out.println("Enter grade for student "+i+": ");
				temp = input.nextFloat();
			}
			grades.add(temp);
		}
	}

	/*
	 * Return average of all grades.
	 * @return avg - average calculated 
	 * 			     return type is float 
	 */
	private float averageGrade(){
		Float total = 0f;
		Float avg = 0f;
		for(Float g : grades){
			total+=g;
		}
		avg = total/numOfStudents;
		return avg;
	}
	
	/*
	 * Return maximum of all grades.
	 * @return  - maximum value of grade 
	 * 			     return type is float 
	 */
	private float maximumGrade(){
		return Collections.max(grades);
	}
	
	/*
	 * Return minimum of all grades.
	 * @return  - minimum value of grade 
	 * 			     return type is float 
	 */
	private float minimumGrade(){
		return Collections.min(grades);
	}
	
	/*
	 * Return percentage of students passed. (Assume grade >= 40 as Pass) 
	 * @return  - percentage of students passed
	 * 			     return type is float 
	 */
	private float percentagePassed(){
		Integer studentPassed =0;
		Float percentage;
		for(Float g : grades){
			if(g >= 40f){
				studentPassed+=1;
			}
		}
		
		percentage = studentPassed / (float)numOfStudents;
		percentage*=100f;
		return percentage;
	}
	
	/*
	 * display grades
	 */
	private void displayGrades(){
		
		System.out.println("Grades :"+grades);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Marksheet m = new Marksheet();
		m.setNumberOfStudents();
		m.setGrades();
		
		boolean flag = true;
		
		while(flag){
			System.out.println("\n\nMENU : \n"
					+ "1. Average of all grades. \n"
					+ "2. Maximum of all grades. \n"
					+ "3. Minimum of all grades. \n"
					+ "4. Percentage of students passed. \n"
					+ "5. Display grades\n"
					+ "0. Exit \n");
			System.out.println("Enter your choice: ");
			int choice = input.nextInt();
			switch(choice){
			case 0 : flag = false;
					 System.out.println("Okay, bye!");
			 		 System.exit(1);
			case 1 : System.out.println("\nAverage of all grades: "
			 		 		+String.format("%.2f", m.averageGrade()));
					 break;
					
			case 2 : System.out.println("\nMaximum of all grades: "
							+String.format("%.2f", m.maximumGrade()));
			 		 break;
			 
			case 3 : System.out.println("\nMinimum of all grades: "
							+String.format("%.2f", m.minimumGrade()));
			 		 break;
			 
			case 4 : System.out.println("\nPercentage of students passed: "
							+String.format("%.2f", m.percentagePassed())+"%");
			 		break;		
			 
			case 5 : m.displayGrades();
					 break;
			
			default: System.out.println("Wrong choice! Try again.");
							 
			}
		}
	

		input.close();
	}

}
