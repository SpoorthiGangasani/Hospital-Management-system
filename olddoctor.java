package olddoc;
public class olddoctor
{
int ageo;
String phno;
String  dno,ido,so,ao,deo;
String tym,gender;
double salo;
public olddoctor(String dno,String ido,int ageo,String gender,String phno,String ao,String so,String deo,String tym,double salo)
{
this.dno=dno;
this.ido=ido;
this.ageo=ageo;
this.gender=gender;
this.phno=phno;
this.ao=ao;
this.so=so;
this.deo=deo;
this.tym=tym;
this.salo=salo;
}
public void displayolddoctordetails()
{
System.out.println("Doctor name:"+dno);
System.out.println("Doctor ID:"+ido);
System.out.println("Age:"+ageo);
System.out.println("Gender:"+gender);
System.out.println("Land line number:"+phno);
System.out.println("Address:"+ao);
System.out.println("Specialization:"+so);
System.out.println("Department:"+deo);
System.out.println("Timings:"+tym);
System.out.println("Salary:"+salo);
System.out.println("-----------------------------------------------------------");
}
}
