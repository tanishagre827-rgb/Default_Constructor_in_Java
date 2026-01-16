class emp
{
String name;
int age;
int salary;
emp()
{
name="Tanish Agre";
age=17;
salary=900000;
}
void display()
{
System.out.println("Employee Name is:"+name);
System.out.println("Employee Age is:"+age);
System.out.println("Employee Salary is:"+salary);
}
public static void main(String args[])
{
emp e1=new emp();
e1.display();
}
}