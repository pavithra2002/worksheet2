/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package worksheet.pkg2;

/**
 *
 * @author PAVITHRA T
 */


class custo
{
    int id;
    String name;
    int discount;
    custo(int i,String n,int d)
    {
        id=i;
        name=n;
        discount=d;
    }
    int getid()
    {
        return id;
    }
    String getname()
    {
        return name;
    }
    int getdiscount()
    {
        return discount;
    }
    int setdiscount(int d1)
    {
        return discount=d1;
    }
    public String toString()
    {
       return("name:"+name+"\nid:"+id+"\ndiscount:"+discount); 
    }
    
    

}
public class customer {


public static void main(String[] args){   
custo c1=new custo(100,"aaa",10);
System.out.println(c1.getid());
System.out.println(c1.getname());
System.out.println(c1.getdiscount());
System.out.println(c1.setdiscount(15));
System.out.println(c1.getdiscount());
System.out.println(c1);
}  
}
    
    

}


