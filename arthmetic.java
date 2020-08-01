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
class arithmetic
{
    int a;
    int b;
    void add(int a,int b)
    {
        System.out.println("add"+(a+b));
    }
    void sub(int a,int b)
    {
        System.out.println("sub"+(a-b));
    }
    void mul(int a,int b)
    {
        System.out.println("mul"+(a*b));
    }
    void div(int a,int b)
    {
        System.out.println("div"+(a/b));
    }
    
}
public class arthmetic {

    public static void main(String[] args){
        Scanner objt=new Scanner(System.in);
        arithmetic obj=new arithmetic();
        System.out.println("enter the two no");
        obj.a=objt.nextInt();
        obj.b=objt.nextInt();
        obj.add(obj.a,obj.b);
        obj.sub(obj.a,obj.b);
        obj.mul(obj.a,obj.b);
        obj.div(obj.a,obj.b);
        
        
        
                
                
        
        
    }
}

