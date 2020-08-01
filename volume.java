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
class box
{
    double height;
    double width;
    double depth;

void getvalue()
{
Scanner objt=new Scanner(System.in);
System.out.println("enter the height,depth,width");
height=objt.nextDouble();
width=objt.nextDouble();
depth=objt.nextDouble();
}
void vol()
{
    double vol=depth*width*height;
    System.out.println("volume"+vol);
    
}
public class volume {
}
    public static void main(String[] args){
    box obj=new box();
    obj.getvalue();
    obj.vol();
}
}

