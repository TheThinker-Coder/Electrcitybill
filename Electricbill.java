import java.util.Scanner;
class Electricbill
{
      String name,city;
      int cons,meternu;
      long mobilenu;
      double units,totalamt = 0,totalcharge;
       double tax = 250;
       double pmfund = 250;
       double maintance  = 200;
       double extracharge = 50;
       Scanner sc = new Scanner(System.in);

       ///// Function Start///////

        public void Input()
        {
        System.out.println("Enter Consumer number = ");
         cons = sc.nextInt();
        System.out.println("Enter Meter number = ");
        meternu = sc.nextInt();
       System.out.println("Enter name = ");
        name = sc.next().toString();
        System.out.println("Enter city = ");
       city = sc.next().toString(); 
      System.out.println("Enter mobile number= ");
       mobilenu = sc.nextLong(); 
      System.out.println("Enter units consume = ");
      units = sc.nextInt();       
      }
        public  void calculation()
        {
               if (units>1 && units<50)
               {
                     totalamt  = (1.50 * units)+tax+pmfund+maintance+extracharge;
               }
               else if (units>51 &&units<100)
               {
                    totalamt  = (3.00 * units)+tax+pmfund+maintance+extracharge;
               }
                else if (units>101 &&units<200)
               {
                   totalamt  = (4.00 * units)+tax+pmfund+maintance+extracharge;
               }
                else if (units>200 &&units<300)
               {
                   totalamt  = (5.00 * units)+tax+pmfund+maintance+extracharge;
               }
                else if (units>300)
                {
                    totalamt  = (5.00 * units)+tax+pmfund+maintance+extracharge;
               }
                
              // System.out.println("totalcharge is = "+totalcharge);
                if(totalamt>500)
                {
                   totalcharge  = totalamt + 500;
                }else
                {
                    totalcharge  = totalamt + 0;
                }
        }
          
              public void Dispaly()
               {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Electricity Department Nagpur");
                System.out.println("For Compalint and query call us on 1800-200-400");
                System.out.println("Vist us on Nmceb.com");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("consmer number = "+ cons);
                System.out.println("Meter number = "+ meternu);
                System.out.println("Name = "+ name);
                System.out.println("City = "+ city);
                System.out.println("Units used = "+ units);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Per units chagre = ");
                System.out.println("1 to 50 = 1.50");
                System.out.println("51 to 100 = 2.00");
                System.out.println("100 to 200 = 4.00");
                System.out.println("200 to 300= 5.00");
                System.out.println("Taxes And maintence are include in the bill as per Govt Act 6001 And 6500 ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Total_Bill = "+ totalcharge);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(""); 
                }
                                 public static void main(String[] args) 
                                 {
                                 Electricbill eb = new Electricbill();
                                 eb.Input();
                                 eb.calculation();
                                 eb.Dispaly();
                                  }
}