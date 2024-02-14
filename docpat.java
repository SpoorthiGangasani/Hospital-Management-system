package newdoctor;
import java.util.Scanner;
public class docpat
{
Scanner sc=new Scanner(System.in);
String dn,id,s,a,de;
int ag;
String p;
String gen,time;
double sa;
public void doc()
{
System.out.println("Enter name of doctor:");
dn=sc.next();
System.out.println("Enter gender:");
gen=sc.next();
System.out.println("Enter doctor id:");
id=sc.next();
System.out.println("Enter age:");
ag=sc.nextInt();
System.out.println("Enter phn no.:");
p=sc.next();
System.out.println("Enter address:");
a=sc.next();
System.out.println("Enter specilization:");
s=sc.next();
System.out.println("Enter department of doctor:");
de=sc.next();
System.out.println("Enter doctor timings:");
time=sc.next();
System.out.println("Enter salary:");
sa=sc.nextDouble();
}
public void showdoc()
{
System.out.println("Doctor name:"+dn);
System.out.println("Doctor ID:"+id);
System.out.println("Gender:"+gen);
System.out.println("Age:"+ag);
System.out.println("Phn number:"+p);
System.out.println("Address:"+a);
System.out.println("Specialization:"+s);
System.out.println("Department:"+de);
System.out.println("Timings:"+time);
System.out.println("Salary:"+sa);
}
}
