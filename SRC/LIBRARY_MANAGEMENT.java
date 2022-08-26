/**Write a program to do Library Management System.*/

import java.util.*;
import java.io.*;
import java.text.*;
public class LIBRARY_MANAGEMENT
{
public static String address1,name1;
public static String books[]={" Tinkle Digest"," Wings Of Fire"," Secret Seven"," Famous Five"," Harry Potter"," Together With-Mathematics"," Together With-Physics"," Together With-Biology"," Together With-Chemistry"," Together With-Computer"," Tell Me Why?"," Amar Chithra Katha"," Gaptopaedia : G.K."," Wisdom"," My Family and Other Animals"," Matilda"};
public static String author[]={" Tinkle publisher"," A.P.J Abdul Kalam"," Enid Blyton"," Enid Blyton"," J.K.Rowling"," Rachna Sagar"," Rachna Sagar"," Rachna Sagar"," Rachna Sagar"," Rachna Sagar"," Tell Me Why Publisher"," Amar Publishers"," Greycaps"," Wisdom Publishing centre"," Gerald Durrell"," Roald Dahl"};
public static int price[]={350,250,150,200,400,200,200,200,200,200,750,100,500,700,900,400};
public static int bid[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
public static String avail[]={"Yes","Yes","Yes","Yes","Yes","Yes","Yes","Yes","Yes","Yes","Yes","Yes","Yes","Yes","Yes","Yes"};
public static int regid[]={100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115};
public static String name[]={"S.M.Sutharsan Raj","Sai Dharshan","Abdur Raaziq","Kiran.D","Junaid","Himanshu.J","Rakesh.T","Shamanthak","Rohith.J","Ganesh","Shreyas","Gokul","Chandresh","Ashwin K","Vignesh Sheshadari",name1};
public static String address[]={" Bannerghatta"," Gottigere"," Bilekahalli"," JP Nagar"," Jayanagar"," MG Road"," Basavanagudi"," BTM Layout"," Nelamangala"," Kormangala"," Malleshwaram"," KR Market"," Rajajinagar"," Shivajinagar"," Shantinagar",address1};
public static int no[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
public static String nam;
public static String addr;
public static int ch;
public static int i;
public static int rd;
public static int flag,flag1;
public static int Id;
public static int index;
public static int index1;
public static long nob[]=new long[16];
public static Date isdate[]=new Date[16];
public static Date retdate[]=new Date[16];
public static Date dt1;
public static Date dt2;
public static int rid;
public static void dat1()throws Exception
{
BufferedReader br = null;
br = new BufferedReader(new InputStreamReader(System.in));
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
System.out.println("Enter the date in (dd/mm/yyyy) format: ");
dt1 = sdf.parse(br.readLine().trim());
System.out.println("Enter the date when the book has to be returned :- ");
dt2 = sdf.parse(br.readLine().trim());
if(br != null)
{
br.close();
}
}
public static void dat()throws Exception
{
BufferedReader br = null;
br = new BufferedReader(new InputStreamReader(System.in));
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
System.out.println("Enter the date in (dd/mm/yyyy) format: ");
dt1 = sdf.parse(br.readLine().trim());
System.out.println("Enter the date when the book has to be returned :- ");
dt2 = sdf.parse(br.readLine().trim());
if(br != null)
{
br.close();
}
}
public static void issue()throws Exception
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your register ID:-");
while(!sc.hasNextInt())
{
sc.next();
System.out.println("Please enter an integer:- ");
}
rd=sc.nextInt();
flag=0;
for(int i=0;i<regid.length;i++)
{
if(rd==regid[i])
{
flag=1;
index=i;
break;
}
}
if(flag==1)
{
if(no[index]==0)
{
System.out.println("---------------------------------------------------------------------");
System.out.println("REGISTRATION ID : "+regid[index]);
System.out.println("NAME : "+name[index]);
System.out.println("ADDRESS: "+address[index]);
System.out.println("---------------------------------------------------------------------");
System.out.println("                  ");
view();
System.out.println("Enter the book ID:-");
rid=sc.nextInt();
if(rid<=16)
{
for(i=0;i<bid.length;i++)
{
if(rid==bid[i])
{
if(avail[i].compareTo("Yes")==0)
{
avail[i]="No";
System.out.println("Book issued:-");
System.out.println("---------------------------------------------------------------------");
System.out.println("BOOK ID       NAME                AUTHOR                 PRICE");
System.out.println(bid[i]+"       "+books[i]+"        "+author[i]+"         "+price[i]);
System.out.println("---------------------------------------------------------------------");
no[index]=rid;
dat1();
isdate[index]=dt1;
retdate[index]=dt2;
long diff=((dt2.getTime()-dt1.getTime())/ 1000L / 60L / 60L / 24L);
nob[index]=diff;
break;
}
else
{
System.out.println("Sorry book is not available. ");
}
}
}
}
else
{
System.out.println("Enter valid book ID....");
rid=sc.nextInt();
if(rid<=16)
{
for(i=0;i<bid.length;i++)
{
if(rid==bid[i])
{
if(avail[i].compareTo("Yes")==0)
{
avail[i]="No";
System.out.println("Book issued:-");
System.out.println("---------------------------------------------------------------------");
System.out.println("BOOK ID       NAME                AUTHOR                 PRICE");
System.out.println(bid[i]+"       "+books[i]+"        "+author[i]+"         "+price[i]);
System.out.println("---------------------------------------------------------------------");
no[index]=rid;
dat1();
isdate[index]=dt1;
retdate[index]=dt2;
long diff=((dt2.getTime()-dt1.getTime())/ 1000L / 60L / 60L / 24L);
nob[index]=diff;
break;
}
else
{
System.out.println("Sorry book is not available. ");
}
}
}
}
}
}
else
{
System.out.println("You already have a book issued in your name and second book can't be issued until you return the first book....");
}
}
else
{
System.out.println("Sorry. You are not registered.");
System.out.println("Either register by entering 5.");
System.out.println("     OR");
System.out.println("You can register on www.SMSbooks.com");
flag=0;
}
}
public static void Return()throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
Scanner sc=new Scanner(System.in);
System.out.println("Enter your register ID:-");
while(!sc.hasNextInt())
{
sc.next();
System.out.println("Please enter an integer:- ");
}
rd=sc.nextInt();
flag=0;
for(int i=0;i<regid.length;i++)
{
if(rd==regid[i])
{
flag=1;
index=i;
break;
}
}
if(flag==1)
{
if( no[index]==0)
{
System.out.println("You have not taken any book.");
}
else
{
for(int j=0;j<bid.length;j++)
{
if(no[index]==bid[j])
{
System.out.println("---------------------------------------------------------------------");
System.out.println("REGISTRATION ID : "+regid[index]);
System.out.println("NAME : "+name[index]);
System.out.println("ADDRESS: "+address[index]);
System.out.println("---------------------------------------------------------------------");
System.out.println();
avail[j]="Yes";
System.out.println("Book returned:-");
no[index]=0;
break;
}
}
System.out.println("Enter the date when the book has to be returned :- ");
dt1 = sdf.parse(br.readLine().trim());
long diff = ((dt1.getTime() - isdate[index].getTime())/ 1000L / 60L / 60L / 24L);
System.out.println("Number of Days You Have taken the book : " + diff+" days." );
long diff1 = ((dt1.getTime() - retdate[index].getTime())/ 1000L / 60L / 60L / 24L);
System.out.println("Number of days late is "+diff1+" days.");
long fine;
if(diff>nob[index])
{
if(diff-nob[index]>0 && diff-nob[index]<=3)
{
fine=(diff-nob[index])*3;
}
else if(diff-nob[index]>3 && diff-nob[index]<=5)
{
fine=(diff-nob[index])*5;
}
else
{
fine=(diff-nob[index])*10;
}                 
System.out.println("The fine to be payed is Rs. "+fine);
flag=0;
}
}
}
else
{
System.out.println("You are not registered.");
}
}
public static void view()
{
System.out.printf("%-10s%-30s%-30s%-14s%-20s\n","BOOK ID"," BOOK NAME"," AUTHOR"," PRICE"," AVAILABILITY");
System.out.println("-------------------------------------------------------------------------------------------------");
for(int i=0;i<books.length;i++)
{
System.out.printf("%-10d%-30s%-33s%-18d%-20s\n",bid[i],books[i],author[i],price[i],avail[i]);
System.out.println("-------------------------------------------------------------------------------------------------");
}
}
public static void todo()throws Exception
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 to take the book.");
System.out.println("Enter 2 to return the book.");
System.out.println("Enter 3 to view the Booklist.");
System.out.println("Enter 4 to include new person that is new registration:-");
System.out.println("Enter 5 to exit.");
while(!sc.hasNextInt())
{
sc.next();
System.out.println("Please enter an integer:- ");
}
ch=sc.nextInt();
switch(ch)
{
case 1:
issue();
break;
case 2:
Return();
break;
case 3:
view();
break;
case 4 :
System.out.println("Enter the name:-");
while(sc.hasNextInt())
{
sc.next();
System.out.println("Please enter a valid proper name:- ");
}
name[15]=sc.next();
System.out.println("Enter the address:-");
address[15]=sc.next();
System.out.println("Your new ID is 115.");
System.out.println("Enter 1 to take the book.");
System.out.println("Enter 2 to return the book.");
System.out.println("Enter 3 to view the Booklist.");
System.out.println("Enter 4 to exit.");
int choice=sc.nextInt();
switch(choice)
{
case 1:
issue();
break;
case 2:
Return();
break;
case 3:
view();
break;
case 4:
System.out.println("Thanks!!! Visit again!!!!");
System.out.println("________________________________________________________________________________________");
System.exit(0);
default:
System.out.println("Wrong Choice.");
break;
}
break;
case 5:
System.out.println("Thanks!!! Visit again!!!!");
System.out.println("________________________________________________________________________________________");
System.exit(0);
default:
System.out.println("Wrong Choice.");
break;
}
}
public static void main(String args[])throws Exception
{
System.out.println("________________________________________________________________________________________");
System.out.println("                     S.M.S GROUP OF LIBRARIES.");
System.out.println("                     Spread the spirit of knowledge....."+"\n");
Scanner sc=new Scanner(System.in);
String ans;
do
{
todo();
System.out.println("Do you want to continue. Enter yes to continue and no to exit.");
ans=sc.next();
}
while(ans.equalsIgnoreCase("Yes"));
System.out.println("----------------------------------------------------------------------------------------");
System.out.println("Thanks!!! Visit again!!!!");
System.out.println("________________________________________________________________________________________");
}
}