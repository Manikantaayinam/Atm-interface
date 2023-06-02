import java.util.*;
class Atm{
   static Scanner sc= new Scanner(System.in);
    private String userId="Mani";
    private int pin=1234;
  void  check(String userId,int pin)
   {
        if((userId.equals(this.userId))&&(this.pin==pin))
         {
            sucess();
         }
         else
         {
             System.out.println("please Enter valid Details");
              System.out.println("Enter userid");
             String  userId1=sc.next();
               System.out.println("Enter pin");
                int  pin1=sc.nextInt();
             check(userId1,pin1);
         }

       
   }
   static void sucess()
   {
         int bankBalance=100;
         LinkedHashMap<Integer,String> a2=new LinkedHashMap<Integer,String>();
         int i=1;
       while(true)
       {
         System.out.println("press 1 for Transaction history");
           System.out.println("please 2 for withdraw");
             System.out.println("press 3 for deposit");
               System.out.println("press 4 for transfer");
                 System.out.println("press 5 for Quit");
                 int n=sc.nextInt();
                 
                 
                 if(n==1)
                 {
                   for(Map.Entry<Integer,String>m:a2.entrySet()){  
                    System.out.println(m.getKey()+" "+m.getValue());  
                     }  
                     
                 }

                 if(n==2)
                 {
                      System.out.println("ENTER AMOUNT TO withdraw");
                       int withdraw=sc.nextInt();
                       if(withdraw>bankBalance)
                       {
                          String k="Transaction Failed";
                         a2.put(i,k);
                         i++;
                         
                           System.out.println("INSUFFICIENT FUNDS");
                       }
                       else{
                       bankBalance=bankBalance-withdraw;
                       System.out.println("PLEASE TAKE YOUR MONEY");
                         String p="Amount withdrawn:"+withdraw;
                         a2.put(i,p);
                         i++;
                       System.out.println("Available Balance"+bankBalance);
                       }
                 }
                 if(n==3)
                 {
                    System.out.println("ENTER AMOUNT TO DEPOSIT");
                    int deposit=sc.nextInt();
                    bankBalance=bankBalance+deposit;
                    System.out.println(deposit+"RS SUCESSFULLY DEPOSITED");
                     String l="Amount diposited:"+deposit;
                         a2.put(i,l);
                         i++;
                     System.out.println("Available balance:"+bankBalance);
                    
                 }
                   if(n==4)
                 {
                     System.out.println("ENTER AMOUNT TO TRANSFER");
                      int Transfer=sc.nextInt();
                      if(Transfer>bankBalance)
                       {
                         String m="Transaction Failed";
                         a2.put(i,m);
                         i++;
                           System.out.println("INSUFFICIENT FUNDS");
                       }
                       else{
                       bankBalance=bankBalance-Transfer;
                       System.out.println(Transfer+"RS TRANSFERED SUCESSFULLY");
                        String o="Amount Transfer:"+Transfer;
                         a2.put(i,o);
                         i++;
                       
                       System.out.println("Remaining balance:"+bankBalance);
                       }              
                }
                 if(n==5)
                 {
                     System.out.println("Thank you and visit again");
                     break;
                 }
                 System.out.println();
       }
       
   }
   public static void main(String args[])
   {
       Atm a1= new Atm();
      
       System.out.println("Enter userid");
       String userId1=sc.next();
       System.out.println("Enter pin");
        int pin1=sc.nextInt();
        
        a1.check(userId1,pin1);
        
   
   }
   

  


}
