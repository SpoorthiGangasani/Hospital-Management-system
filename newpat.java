package newpatient;
import java.util.Scanner;
public class newpat
{
Scanner sc=new Scanner(System.in);
String pn,pid,as,dis,pa,pdo,rn;
int pag;
String pphno;
String pgen;

public void pat()
{
System.out.println("Enter name of patient:");
pn=sc.next();
System.out.println("Enter patient id:");
pid=sc.next();
System.out.println("Enter gender:");
pgen=sc.next();
System.out.println("Enter age:");
pag=sc.nextInt();
System.out.println("Enter phn no.:");
pphno=sc.next();
System.out.println("Enter address:");
pa=sc.next();
System.out.println("Enter disease:");
dis=sc.next();
System.out.println("Enter doctor name who is treating the patient:");
pdo=sc.next();
System.out.println("Enter Patient Room NO:");
rn=sc.next();
System.out.println("Enter admit_status:");
as=sc.next();
}
public void showpat()
{
System.out.println("Patient name:"+pn);
System.out.println("Patient ID:"+pid);
System.out.println("Gender:"+pgen);
System.out.println("Age:"+pag);
System.out.println("Phone number:"+pphno);
System.out.println("Address:"+pa);
System.out.println("Disease:"+dis);
System.out.println("Doctor name:"+pdo);
System.out.println("Patient Room NO:"+rn);
System.out.println("Admit Status:"+as);
}
}
