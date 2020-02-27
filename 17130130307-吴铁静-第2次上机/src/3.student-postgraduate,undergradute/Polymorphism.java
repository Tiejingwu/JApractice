package firstshangji;
abstract class Students{
	final static int CourseNo =5;
	String name;
	String type;
	int[] courses;
	String courseGrade;
public Students(String name) {
	                 this.name=name;
	                 courses=new int[CourseNo];
	                 courseGrade=""; //³õÊ¼»¯Îª¿Õ´®
                             }
public abstract void calculateGrade();
public String getName() { return name;}
public String getType() {return type;}
public String getCourseGrade() {return courseGrade;}
public int getCourseScore(int courseNumber)
     { return courses[courseNumber];}
public void setName(String name) {this.name=name;}
public void setType(String type) {this.type=type;}
public void setCourseScore(int courseNumber,int courseScore)
{courses[courseNumber]=courseScore;}
}

class Undergraduate extends Students{
	public Undergraduate(String name) {
		super(name);
		type="Undergraduate";
	}
	public void calculateGrade() {
		int total=0;
		double average=0;
		for(int i=0;i<CourseNo;i++) {
			total=total+courses[i];
		};
		average=total/CourseNo;
		if(average>=80&&average<100) courseGrade="Excellent";
		else if(average>=70&&average<80) courseGrade="Good"; 
		else if(average>=60&&average<70) courseGrade="Pass";
		else courseGrade="Not Pass";}
}

class Postgraduate extends Students{
	public Postgraduate(String name) {
		super(name);
		type="Postgraduate";
	}
	public void calculateGrade() {
		int total=0;
		double average=0;
		for(int i=0;i<CourseNo;i++) {
			total=total+courses[i];
		};
		average=total/CourseNo;
		if(average>=90&&average<100) courseGrade="Excellent";
		else if(average>=75&&average<80) courseGrade="Good"; 
		else if(average>=65&&average<75) courseGrade="Pass";
		else courseGrade="Not Pass";}
}

public class Polymorphism{
	public static void main(String[] args) {
		Students[] students = new Students[4];
		students[0]=new Undergraduate("Nancy");
		students[1]=new Undergraduate("Jack");
		students[2]=new Postgraduate("Rose");
		students[3]=new Postgraduate("Charlotte");
		for(int i=0;i<4;i++) {
			students[i].setCourseScore(0, 92);
			students[i].setCourseScore(1, 80);
			students[i].setCourseScore(2, 75);
			students[i].setCourseScore(3, 70);
			students[i].setCourseScore(4, 88);
		}
		for(int i=0;i<4;i++) {
			students[i].calculateGrade();
		}
		for(int i=0;i<4;i++)
			{System.out.println(students[i].getName()+"  "+
					students[i].getType()+"  "+
					students[i].getCourseGrade());}
			}
}







