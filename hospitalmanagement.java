import olddoc.olddoctor;
import newdoctor.docpat;
import oldpatient.oldpat;
import newpatient.newpat;
import labandstaff.labstaff;
import ArogyasriandBilling.arogyabilling;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Myframe extends JFrame implements ActionListener
{
JLabel  l1,l2,l3,l4,l5;
JTextField t1,t2;
JRadioButton male,female;
JComboBox day,mon,yr;
JTextArea ta;
JCheckBox term;
JButton sub;
JLabel msg;
JTextArea screen;
Myframe()
{
setTitle("PATIENT FORM");
setSize(700,500);
setLocationRelativeTo(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
Container c=getContentPane();
c.setLayout(null);
l1=new JLabel("Name");
l1.setBounds(20,50,100,20);
c.add(l1);
t1=new JTextField();
t1.setBounds(130,50,100,20);
c.add(t1);

l2=new JLabel("Mobile");
l2.setBounds(20,100,100,20);
c.add(l2);
t2=new JTextField();
t2.setBounds(130,100,100,20);
c.add(t2);

l3=new JLabel("Gender");
l3.setBounds(20,150,100,20);
c.add(l3);
male=new JRadioButton("Male");
female=new JRadioButton("Female");
male.setBounds(130,150,80,20);
female.setBounds(220,150,80,20);

c.add(male);
c.add(female);
ButtonGroup bg=new ButtonGroup();
bg.add(male);
bg.add(female);

l4=new JLabel("DOB");
l4.setBounds(20,200,100,20);
c.add(l4);

String[] days={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
String[] months={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
String[] year={"2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007"};
day=new JComboBox(days);
mon=new JComboBox(months);
yr=new JComboBox(year);
day.setBounds(130,200,50,20);
mon.setBounds(190,200,50,20);
yr.setBounds(250,200,60,20);
c.add(day);
c.add(mon);
c.add(yr);
l5=new JLabel("Address");
l5.setBounds(20,250,100,20);
c.add(l5);

ta=new JTextArea();
ta.setBounds(130,240,200,50);
c.add(ta);

term=new JCheckBox("Accept terms and conditions");
term.setBounds(50,300,250,20);
c.add(term);
sub=new JButton("Submit");
sub.setBounds(150,350,80,20);
c.add(sub);
sub.addActionListener(this);

screen=new JTextArea();
screen.setBounds(350,50,300,300);
c.add(screen);
msg=new JLabel();
msg.setBounds(20,400,250,20);
c.add(msg);
c.setBackground(Color.PINK);
setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(term.isSelected())
{
msg.setText("Registration Success");
String name=t1.getText();
String mobile=t2.getText(); 
String GENDER="None";
if(female.isSelected())
     {
         GENDER="Female";
      }
else if(male.isSelected())
     {
   GENDER="Male";
     }
String dob=day.getSelectedItem()+"-"+mon.getSelectedItem()+"-"+yr.getSelectedItem();
String add=ta.getText();
screen.setText("Name: "+name+"\n"+"Mobile: "+mobile+"\n"+"Gender: "+GENDER+"\n"+"Date of Birth:  "+dob+"\n"+"Address: "+add);

}
else
{
msg.setText("Please accept terms and conditions.");
screen.setText(" ");
}
}
}                    //end of swings
class PasswordException extends Exception   //userdefined exception
{
  PasswordException (String s)
{
super(s);
}
}
class hospital
{
static   //Static block
{
System.out.println("------------------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\t|| GLOBAL HEALTH CARE HOSPITALS ||");
}
void message()
{
System.out.println("\t\t\t\tWe care for you most. ");
}
}
class hospital2 extends hospital   //inheritance
{
void message()   //overriding
{
super.message();  //super at method level
System.out.println("\t\t\t\tSubedari,Hanamakonda,Warangal,Telangana,506001 ");
System.out.println("------------------------------------------------------------------------------------------------------");
}
}
class hospitalmanagement
{
public static void main(String args[]) throws PasswordException 
{
hospital2 H2=new hospital2();
H2.message();
Scanner sc=new Scanner(System.in);
String password="sru";
String str,username;
System.out.println("\t************LOGIN***********");
System.out.println("Enter username:");
username=sc.next();
System.out.println("Enter your password:");
str=sc.next();
if(str.equals(password))    //string classes
{
while(true)
{
System.out.println("MAIN MENU");
System.out.println("1.Old doctor details");
System.out.println("2.Entering new doctor details");
System.out.println("3.Enter for patient form.");
System.out.println("4.Patient details");
System.out.println("5.New patient details");
System.out.println("6.Lab details");
System.out.println("7.Staff details");
System.out.println("8.Arogyasri details");
System.out.println("9.Billing");
System.out.println("10.Exit");
System.out.println("-----------------------------------------------------");
System.out.println("Enter your choice:");
int c=sc.nextInt();
if(c==10)
{
System.out.println("THANK YOU");
break;
}
switch(c)
{
case 1:
System.out.println("\t\t\t\t---------*********OLD DOCTORS DETAILS*********---------");
 olddoctor o1=new olddoctor("DR.chander","A21",43,"Male","9600250432","Hanamkonda","General","OP","10am-2:30pm",140000);
o1.displayolddoctordetails();
olddoctor o2=new olddoctor("DR.spoorthi","A22",36,"Female","7688345210","Hanamkonda","ENT","OP","10am-2:30pm",95000);
o2.displayolddoctordetails();
olddoctor o3=new olddoctor("DR.Rama","A23",51,"Female","8096543800","Hyderabad","Gynaecologist","OP&Surgen","11am-3pm",240000);
o3.displayolddoctordetails();
olddoctor o4=new olddoctor("DR.Vijay","A24",62,"Male","9866200901","Warangal","Orthopedic","OP&Surgen","11am-2:30pm",295000);
o4.displayolddoctordetails();
olddoctor o5=new olddoctor("DR.Shiva","A25",48,"Male","9234260345","Hyderabad","Dermatologist","OP","11am-2:30pm",180000);
o5.displayolddoctordetails();
olddoctor o6=new olddoctor("DR.Mamatha","A26",38,"Female","9542564310","Hyderabad","Cardiologist","OP&Surgen","11am-1:30pm",240000);
o6.displayolddoctordetails();
break;
case 2:
System.out.println("\t\t\t\t\t**********NEW DOCTORS DATA********** ");
int i,n;
docpat D=new docpat();
System.out.println("Hello..how many new doctors details you need to enter:");
n=sc.nextInt();
for (i = 1; i <= n; i++)
{
          System.out.println(" Enter doctor "+i+"details") ;
        D.doc();
System.out.println("++++++++DOCTOR "+i+" DETAILS++++++++++");
        D.showdoc();
}
break;
case 3:
new Myframe();
    break;
case 4:
System.out.println("\t\t\t\t---------*********OLD PATIENT DETAILS*********---------");
 oldpat p1=new oldpat("Alluri.karthik","p10","Male",25,"9876321007","Warangal","Dengue","DR.chander","204","yes");
p1.showoldpat();
oldpat p2=new oldpat("Dhonthi.sumaja","p210","Female",35,"9000586652","Hanamkonda","Tonsillitis","DR.spoorthi","not_Admited","No");
p2.showoldpat();
oldpat p3=new oldpat("Vemula.Ashok","p13","Male",47,"7784300651","Ragunathpalley","Fever","DR.chander","not_Admited","No");
p3.showoldpat();
oldpat p4=new oldpat("Kundhur.Srilatha","p205","Female",68,"9755331090","Hanamkonda","BoneFracture","DR.Vijay","OrthoICU","yes");
p4.showoldpat();
oldpat p5=new oldpat("Chinthala.vijay","p263","Male",45,"9553754805","Warangal","HeartStroke","DR.Mamatha","cardioICU","yes");
p5.showoldpat();
oldpat p6=new oldpat("Gayam.Tara","p264","Female",75,"8008957208","Narsampet","SkinRash(Fungal-Infection)","DR.Ramesh","not_Admited","No");
p6.showoldpat();
break;
case 5:
System.out.println("\t-----------*****NEW PATIENTS DATA*****-------------");
int j,x;
newpat p=new newpat();
System.out.println("Hello..how many new patients details you need to enter:");
x=sc.nextInt();
for (j = 1; j<= x; j++)
{
   
          System.out.println(" Enter Patient "+j+" details") ;
        p.pat();
     System.out.println("++++++++++++PATIENT "+j+" DETAILS++++++++++++++");
        p.showpat();
}
break;
case 6:
new labstaff();
break;
case 7:
System.out.println("\t\t\t\t---------*********STAFF DETAILS*********---------");
labstaff s1=new labstaff("Allam.pooja","Female","9854217650","Managing Director","9am","6pm",80000);
s1.showstaff();
labstaff s2=new labstaff("Dharapu.Sreeja","Female","9700882211","Nurse","9am","6pm",25000);
s2.showstaff();
labstaff s3=new labstaff("Gangasani.Satya","Male","7855761290","Hospital_Pharmacy","9:30am","10pm",20000);
s3.showstaff();
labstaff s4=new labstaff("Angirekula.Sudeer","Male","8003461195","Radiologist","9am","7:30pm",15000);
s4.showstaff();
labstaff s5=new labstaff("Akula.Dheeraj","Male","9876231100","Ambulance_Driver","9am","8:30pm",10000);
s5.showstaff();
labstaff s6=new labstaff("Aaluri.Deepika","Female","8900563211","Receptionist","9am","7:30pm",20000);
s6.showstaff();
break;
case 8:
new arogyabilling();
break;
case 9:
System.out.println("+++++++++++BILLING DETAILS++++++++++++");
new arogyabilling(20);
break;
}
}
}
else
{
throw new PasswordException("Incorrect Password,Check it again");
}
}
}
