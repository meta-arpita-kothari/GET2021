import java.util.Scanner;


public class Area {
	static final double pi = 3.14;
	
	/*
	 * @constructor - default
	 */
	public Area(){
		
	}
	/*
	 * To calculate area of triangle
	 * Get width and height of triangle as parameters
	 * @param width - double value
	 * @param height - double value
	 * @return area - double value 
	 */
	double areaOfTriangle(double width , double height){
		double area;
		area = width * height;
		area = area/2d;
		return area;
	}
	
	/* 
	 * To calculate area of rectangle
	 * Get width and height of rectangle as parameters
	 * @param width - double value
	 * @param height - double value
	 * @return area - double value 
	 */
	double areaOfRectangle(double width , double height){
		double area;
		area = width * height;
		return area;
	}
	
	
	/* 
	 * To calculate area of square
	 * Get width of square as parameter
	 * @param width - double value
	 * @return area - double value 
	 */
	double areaOfSquare(double width ){
		double area;
		area = width * width;
		return area;
	}
	
	
	/* 
	 * To calculate area of circle
	 * Get radius of circle as parameter
	 * @param radius - double value
	 * @return area - double value 
	 */
	double areaOfCircle(double radius ){
		double area;
		area = pi * radius * radius ;
		return area;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double width , height, radius;
		Area a = new Area();
		
		boolean flag = true;
		
		while(flag){
			System.out.println("\n\nMENU : \n"
					+ "1. Area of triangle. \n"
					+ "2. Area of rectangle. \n"
					+ "3. Area of square. \n"
					+ "4. Area of circle. \n"
					+ "0. Exit \n");
			System.out.println("Enter your choice: ");
			int choice = input.nextInt();
			switch(choice){
			case 0 : flag = false;
					 System.out.println("Okay, bye!");
			 		 System.exit(1);
			case 1 : System.out.println("Enter width and height of triangle: ");
					 width = input.nextDouble();
					 height = input.nextDouble();
					 System.out.println("\nArea of triangle: "
			 		 		+String.format("%.2f", a.areaOfTriangle(width,height))+" units");
					 break;
					
			case 2 : System.out.println("Enter width and height of rectangle: ");
					 width = input.nextDouble();
					 height = input.nextDouble();
					 System.out.println("\nArea of rectangle: "
			 		 		+String.format("%.2f", a.areaOfRectangle(width,height))+" units");
					 break;
			 
			case 3 : System.out.println("Enter width of square: ");
					 width = input.nextDouble();
					 System.out.println("\nArea of square: "
			 		 		+String.format("%.2f", a.areaOfSquare(width))+" units");
					 break;
			 
			case 4 : System.out.println("Enter width of circle: ");
					 radius = input.nextDouble();
					 System.out.println("\nArea of circle: "
			 		 		+String.format("%.2f", a.areaOfCircle(radius))+" units");
					 break;		
			 			
			default: System.out.println("Wrong choice! Try again.");
							 
			}
		}
	

		input.close();
	}
}
