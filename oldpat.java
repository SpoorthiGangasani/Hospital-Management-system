package oldpatient;
import java.util.Scanner;
public class oldpat
{
String opn,opid,oas,odis,opa,opdo,orn;
int opag;
String opphno;
String opgen;
public oldpat(String opn,String opid,String opgen,int opag,String opphno,String opa,String odis,String opdo,String orn,String oas)
{
this.opn=opn;
this.opid=opid;
this.opgen=opgen;
this.opag=opag;
this.opphno=opphno;
this.opa=opa;
this.odis=odis;
this.opdo=opdo;
this.orn=orn;
this.oas=oas;
}
public void showoldpat()
{
System.out.println("Patient name:"+opn);
System.out.println("Patient ID:"+opid);
System.out.println("Gender:"+opgen);
System.out.println("Age:"+opag);
System.out.println("Phone number:"+opphno);
System.out.println("Address:"+opa);
System.out.println("Disease:"+odis);
System.out.println("Doctor name:"+opdo);
System.out.println("Patient Room NO:"+orn);
System.out.println("Admit Status:"+oas);
System.out.println("------------------------------------------------------------");
}
}
