package labandstaff;
import java.util.Scanner;
public class labstaff
{
String sname,sgen,typeofs,sp,logins,logouts;
double ssal;
public labstaff()
{
System.out.println("------------LAB DETAILS-------------");
System.out.println("1.X-ray\n2.CT Scan\n3.OR Scan\n4.MRI Scan\n5.Ultrasonic\n6.Blood Bank");
System.out.println("----------------------------------------------");
}
public labstaff(String sname,String sgen,String sp,String typeofs,String logins,String logouts,double ssal)
{
this.sname=sname;this.sgen=sgen;this.sp=sp;this.typeofs=typeofs;this.logins=logins;this.logouts=logouts;
this.ssal=ssal;
}
public void showstaff()
{
System.out.println("Staff name:"+sname);
System.out.println("Gender:"+sgen);
System.out.println("Pho no:"+sp);
System.out.println("Type of staff:"+typeofs);
System.out.println("Login time:"+logins);
System.out.println("Logout time:"+logouts);
System.out.println("Salary:"+ssal);
System.out.println("--------------------------------------------------");
}
}
