/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package worksheet.pkg2;
import java.util.*;


/**
 *
 * @author PAVITHRA T
 */
class student
{
    int m1;
    int m2;
    int m3;
    String name;
    String dept;
void getvalue()
{
    Scanner objt=new Scanner(System.in);
    System.out.println("enter the name,dept,m1,m2,m3");
    name=objt.next();
    dept=objt.next();
    m1=objt.nextInt();
    m2=objt.nextInt();
    m3=objt.nextInt();
    
    
}
void markcal()
{
    double s;
    s=(m1+m2+m3)/3;
    if(s>80)
        System.out.println("excellent");
    else if(s>70&&s<79)
        System.out.println("very good");
    else if(s>50&&s<69)
        System.out.println("average");
    else
        System.out.println("fail");
    
        
}
void display()
{
  System.out.println("NAME"+name);
  System.out.println("DEP"+dept);
  System.out.println("M1"+m1);
  System.out.println("M2"+m2);
  System.out.println("M3"+m3);
  
}

public class studentdetails {
}
    public static void main(String[] args){
    student obj[]=new student[10];
    int i;
    for(i=0;i<3;i++)
    {
      System.out.println("enter students detail");
      obj[i]=new student();
      obj[i].getvalue();
      obj[i].markcal();
      obj[i].display();
      
    }
}
}

    

