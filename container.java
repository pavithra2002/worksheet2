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
class volume
{
    double length;
    double breadth;
    double width;
}

public class container {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        volume objt=new volume();
        System.out.println("enter the length,breadth,width");
        objt.length=obj.nextInt();
        objt.breadth=obj.nextInt();
        objt.width=obj.nextInt();
        System.out.println("volume"+(objt.length*objt.width*objt.breadth));
        
        
        
    }
}
