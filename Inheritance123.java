//super()

class Student
{
int rollno;
String name;

Student(int a,String b)
{
rollno=a;
name=b;
}

void display()
{
System.out.println(rollno+" "+name);
}
}


class Exam extends Student
{
int math1,math2;

Exam(int a,String b,int m1, int m2)
{

super(a,b);
math1=m1;
math2=m2;
}
void display2()
{
System.out.println(math1+" " +math2);
System.out.println(math1+math2);
}
}

class Inheritance123
{
public static void main(String args[])
{

Exam e1=new Exam(1,"bdhf",23,34);
e1.display();
e1.display2();

}
}