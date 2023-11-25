package Package1;

public class Student //ClassName >>> Student
{
int rollNo;
int age;
public void display1()
{
	System.out.println("Welcome to all of you");
}
public void display2()
{
	System.out.println("Automation is very easy");
}
public static void main(String[] args) 
{
Student refrncV=new Student();
refrncV.display1();
refrncV.display2();
refrncV.rollNo=786;
refrncV.age=44;
System.out.println("Student RollNo: " +refrncV.rollNo);

System.out.println("Student Age: " +refrncV.age);
}
}
