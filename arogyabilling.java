package ArogyasriandBilling;
import java.util.Scanner;
public class arogyabilling
{
Scanner sc=new Scanner(System.in);
int limit,i;
  String[]  medname=new   String[10];
String patientname,patientID;
double[] cost=new double[10];
double total_cost,room_cost;
public arogyabilling()
{
System.out.println("------------AROGYASRI  SCHEME-------------");
System.out.println("1.Heart, liver, lung, kidney, pancreas-related health conditions\n2.Burns\n3.Post-burn contracture surgery\n4.Polytrauma\n5.Cancer - Radiotherapy, chemotherapy, surgery\n6.Cochlear Implant Surgery plus Auditory Verbal Therapy (Coverage up to Rs.6.5 lakh is available)");
System.out.println("-----------------------------------------------------------------------------------------------------------------");
}
public  arogyabilling(int z) //constructor overloading
{
System.out.println("Enter patient name:");
patientname=sc.next();
System.out.println("Enter patient ID:");
patientID=sc.next();
System.out.println("Enter number of medicines:");
limit=sc.nextInt();
for(i=1;i<=limit;i++)
{
System.out.println("Enter name of medicine"+i+":");
medname[i]=sc.next();
System.out.println("Enter cost of medicine"+i+":");
cost[i]=sc.nextDouble();
total_cost=total_cost+cost[i];
}
System.out.println("Enter Room cost:");
room_cost=sc.nextDouble();
if(room_cost!=0)
{
System.out.println("Total medical cost: "+(room_cost+total_cost));
System.out.println("Thank you");
}
else
{
System.out.println("Total medical cost: "+total_cost);
System.out.println("Thank you");
}
}
}
