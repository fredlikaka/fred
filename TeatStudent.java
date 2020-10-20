import java.util.Scanner;
	public class TestStudent{
	public static void main(String [] args){
// creating a scanner name
	 Scanner input= new Scanner(System.in);

//This is an object from a student class
         Student fred=new Student();

//prompting user to enter name
	   System.out.println("Enter your name");
	   String name=input.nextLine();
	   fred.setName(name);         //setName method called from the object

// prompting user to enter grades
	   System.out.println("Enter the grades");
	   double [] grades=new double[3];
	   double totalSum= 0;
            
	   for(int i =0; i<grades.length;i++){
	        grades[i]=input.nextDouble();
		totalSum=totalSum+grades[i];
       
	   }
	fred.setAverage(totalSum);   //setAverage method called from the object

// prompting user to enter total number of student
	System.out.println("Enter total number of students");
	int numberOfStudent=input.nextInt();
	fred.setNumberOfStudent(numberOfStudent);      //setNumberOfStudent method called from the object


//printing out the name, average grade and the current number of students
	System.out.println("Student name is " +fred.getName()+ " and average grade is " +fred.getAverage() + " and the current number of students is "+fred.getNumberOfStudent());
	
	
	}
	
	
	
	
	}