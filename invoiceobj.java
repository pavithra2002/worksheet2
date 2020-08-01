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
class invoice
{
  int id;;
  custo o;
  double amount;
  invoice(int i,custo o1,double a)
  {
      id=i;
      o=o1;
      amount=a;
  }
  int getid()
  {
      return id;
  }
  custo getcusto()
  {
      return o;
  }
  void setcusto(custo o2)
  {
      o=o2;
  }
  double getamount()
  {
      return amount;
  }
  void setamount(double a)
  {
      amount a;
  }
  String getcustoname()
  {
      return o.name;
  }
  double getamounafterdiscount()
  {
      return amount-(amount*o.discount)/100;
  }
  
      
    
}
public class invoiceobj {
public static void main(String[] args){  
    invoice in=new invoice(1000,o1,2000);
    System.out.println(in.getid());
    System.out.println(in.getcusto());
    customer c2=new cuto(1001,"bbb",155);
    in.setcusto(o2);
    System.out.println(in.getamount());
    in.setamount(2500);
    System.out.println(in.getcustoname());
    System.out.println(in.getamountafterdiscount());
    
}
}
    
}
