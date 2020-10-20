class Student{
	private String name;
	private double grades;
	private static int numberOfStudent;
	double totalSum;

    //creating a constructor with no parameters
	Student(){
	}

   //set and get methods
	public void setName(String name){
	this.name=name;
	}

	public String getName(){
	return name;
	
	}
	
		public void setGrade(double grades){
		this.grades=grades;
	}
	
		public double getGrade(){
		return grades;
	}
		public void setAverage(double totalSum){
			this.totalSum=totalSum;
                     
		}
		public double getAverage(){
                      double average=totalSum/3;
			return average;
		}
		public void setNumberOfStudent(int numberOfStudent){
		this.numberOfStudent=numberOfStudent;
	}  
		public int getNumberOfStudent(){
	             return numberOfStudent;
	}











}