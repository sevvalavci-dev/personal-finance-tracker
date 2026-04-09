
import java.util.Scanner;
public class personalFinanceTracker {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
    
    double rent,groceries,electricityBill,naturalGas,transportation,
            entertainment ,salary ,investment;
    rent=0;
    groceries=0;
    electricityBill=0;
    naturalGas=0;
    transportation=0;
    entertainment =0;
    salary =0;
    investment=0;
        
    double tincome,texpense;
    tincome=0;
    texpense=0;
    
    String sMonth;
    String end_Date="";
    String start_Date="";    
    String period="one month";
    String username="User1" ;
    boolean isRunning=true;    
        
   //menü
   while(isRunning){
       
       System.out.println("\n--------PersonalFinanceTracker----------");
       System.out.println("Hi,"+ username);
       System.out.println("1)Change username.");
       System.out.println("2)Set the financial tracking period.");
       System.out.println("3)Add the income and expense transactions.");
       System.out.println("4)View the financial summary.");
       System.out.println("5)Exit.");
       System.out.println("Please select your option [1-5]:     ");
       
        int option=input.nextInt();
        input.nextLine();
       
     if(option == 1){
         System.out.println("Enter your new user name:       ");
         username=input.nextLine();
       
        }
     else if(option==2){
         System.out.println("\n------Periods--------");
         System.out.println("1.one week");
         System.out.println("2.one month(4 weeks)");
         System.out.println("3.one season(3 months)");
         System.out.println("Choose your period(1-3)");
         
         int choice=input.nextInt();
         period=input.nextLine();// period u string olarak yukarıda tanıma!!!
         
            
        //choice ları sırasıyla ne seçerse ne olur
         if(choice==1)
            period="one week";
         else if(choice==2)
             period="one month";
         else if(choice==3)
             period="one season";
         else{
             System.out.println("Invalid choice.");
             continue;// yanlış choice tan dolayı menüye geri döner.
            }
                 
         //Kullanıcıdan tarihleri iste ve yukarıda string olarak tanımla!!!!
         System.out.println("Enter your start date(dd/mm/yyyy):    ");
          start_Date=input.nextLine();
         System.out.println("Enter your end date(dd/mm/yyyy):      ");
          end_Date =input.nextLine();  
          
          }
     else if(option==3){
               System.out.println("Do not forget to choose your period and "
                       + "enter your date!"
                       + "(It is in the second option)");
              //İlk altı ay 75000 son 6 ay 77500TL Önce ayı belirlememiz gerek!!
               System.out.println("-------Income---------");
               System.out.println("Note:the first six month is 75000TL "
                       + "and the last six month is 77500TL.");
               System.out.println("1.Enter your salary amount:        ");
               System.out.println(start_Date);
               salary=input.nextDouble();
               
               
               //dd/mm/yyyy kısmının mm kısmını almak için substring i kullandım
                 sMonth= start_Date.substring(3,5);
               
               //ve bunlar string olduğu için denk oldukları 
               //ayları or kullanarak yazdım
               if(sMonth.equals("01")||sMonth.equals("02")||
                  sMonth.equals("03")||sMonth.equals("04")||
                  sMonth.equals("04")||sMonth.equals("06")){
                   
                   while(salary!= 75000){
                       
                       System.out.println("The salary of the first six"
                               + " month is 75000TL!");
                       salary=input.nextDouble();
                   }      
               }
               else if(sMonth.equals("07")||sMonth.equals("08")||
                  sMonth.equals("09")||sMonth.equals("10")||
                  sMonth.equals("11")||sMonth.equals("12")){
                   
                    while(salary!=77500){
                       
                       System.out.println("The salary of the last six "
                               + "month is 77500TL");
                       salary=input.nextDouble();
                   }
               }
               
               
               //Kullanıcıdan 100 ile 8000 arasında random sayı kabul edilebilir
               //onun haricinde error ver!!
               System.out.println("Note: amount is between 100-8000TL.");
               System.out.println("2.Enter your investment amount:    ");
               investment=input.nextDouble();
               
            while(investment<100||investment>8000){
                   
               System.out.println("Error!.Please enter amount between 100-8000");
                investment=input.nextDouble();
             }
                   
              
               // salary ve investment bilgilrini tincome a ekle!!
              tincome=salary+investment;
               
              
           
               System.out.println("--------Expense---------");
               // rent bir hafta 0, bir ay 40000,bir sezon 40000*3
               System.out.println("Note:You can directly enter "
                       + "default amount 40000TL for a month  and "
                       + "the system will adjust it according to "
                       + "the period you choose.");
               System.out.println("1.Enter your rent amount:             ");
                 rent=input.nextDouble();
               
              
               if(period.equals("one week")){
                   rent=0;
                   System.out.println("The rent amount is not considered "
                           + "in the balance.So rent is 0TL.");
               }
               else if(period.equals("one month")){
                   rent=40000;
                   System.out.println(rent);
                   
               }
               else if (period.equals("one season")){
                   rent=40000*3;
                   System.out.println(rent);
               }
               
               //grocery bir  ay 10000,diğerleri de ayına ve haftasına göre 
               System.out.println("Note:You can directly enter "
                       + "the default amount 10000TL for a month and "
                       + "the system will adjust it according to"
                       + " the period you choose.");
               System.out.println("2.Enter your groceries amount:           ");
               groceries=input.nextDouble();
               
               if(period=="one week"){
                   groceries=10000/4;
                   System.out.println(groceries);
                   
               }
                   
               
               else if(period=="one month"){
                   groceries=10000;
                   System.out.println(groceries);
               }
               else if(period=="one season"){
                   groceries=10000*3;
                   System.out.println(groceries);
               }
               
               
               
               //bir ay 1000
               System.out.println("Note:You can directly enter "
                       + "the default amount 1000TL for a month and "
                       + "the system will adjust it according to"
                       + " the period you choose.");
               System.out.println("3.Enter your electricity bill amount:    ");
               electricityBill=input.nextDouble();
               
               if(period=="one week"){
                   electricityBill=1000/4;
                   System.out.println(electricityBill);
               }
               else if (period=="one month"){
                   electricityBill=1000;
                   System.out.println(electricityBill);
               }
               else if(period=="one season"){
                   electricityBill=1000*3;
                   System.out.println(electricityBill);
               }
               
               
               
               //yaz aylarında 1000 diğer mevsimlerde 3000
               System.out.println("Note:1000TL for the summer months and "
                       + "3000TL for the other seasons.");
               System.out.println("4.Enter your natural gas amount:         ");
               naturalGas=input.nextDouble();
               
               if(sMonth.equals("06")||sMonth.equals("07")||sMonth.equals("08")){
                   naturalGas=1000;
                   System.out.println(naturalGas);
               }
               else if(sMonth.equals("01")||sMonth.equals("02")||sMonth.equals("03")||
                       sMonth.equals("04")||sMonth.equals("05")||sMonth.equals("09")||
                       sMonth.equals("10")||sMonth.equals("11")||sMonth.equals("12")){
                   
                   naturalGas=3000;
                    System.out.println(naturalGas);
               }
               
               
               
               //varsayılan ayda 5000TL
              System.out.println("Note:You can directly enter "
                       + "the default amount 5000TL for a month and "
                       + "the system will adjust it according to"
                       + " the period you choose.");
               System.out.println("5.Enter your transportation amount:      ");
               transportation=input.nextDouble();
               
               
               if(period=="one week"){
                   transportation=5000/4;
                   System.out.println(transportation);
               }
               else if(period=="one month"){
                   transportation=5000;
                   System.out.println(transportation);
               }
               else if(period=="one season"){
                   transportation=5000*3;
                   System.out.println(transportation);
               }
               
               
               
               
               //9000TL ye kadar giriş yapabilir
               
               System.out.println("You can enter multiple expenses until 9000TL.");
               
               boolean enteringUntil=true;
               String answer="  ";
               //while döngüsüne sokmamız gerek
               
               while(enteringUntil){
              
                   
                System.out.println("6.Enter your entertainment amount:       ");
                   double entry=input.nextDouble();
                   input.nextLine();
                   
                   
               
                   if(entertainment+ entry>9000){
                           
                           System.out.println("error");
                           break;
                   }
                   
                   entertainment+=entry;
                   System.out.println(entertainment);
                   
                   System.out.println("Do you want to continue? y/n :  ");
                   answer=input.nextLine();
                   
                   if(answer.equals("n")){
                       break;
                               
                   }
               
               
               }
              
               texpense=rent+groceries+electricityBill+naturalGas+transportation
                       +entertainment;
               
              
               
             }
     
     
     else if(option==4){
        
        
        
        System.out.println("-----------The Financial Summary----------");
        System.out.println(start_Date);
        System.out.println(end_Date);
        
        System.out.println("The total income: "+tincome);
        System.out.println("The total expense: "+texpense);
        
       
        //max epense bulunacak
        
        double max=rent;
        String category="";
        
        if(groceries>max){
            max=groceries;
            category="groceries";
        }
        if(electricityBill>max){
            max=electricityBill;
            category="electricity bill";
        }
        if(naturalGas>max){
            max=naturalGas;
            category="natural gas";
        }
        if(transportation>max){
            max=transportation;
            category="transportation";
        }
        if(entertainment>max){
            max=entertainment;
            category="entertainment";
            
        }
        
        
       System.out.println("The most frequent spending category is " + category);
        
        
        
        }
               
    else if(option==5){
         
         System.out.println("Exiting the program...");
         
         System.exit(0);
         
         
         
        }          
               
       
               
         
     }  
   
       
    }  
       
       
   }
     
    
    

