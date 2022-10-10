/*Aim: Use the Account class created in Programming Exercise 1 to simulate an ATM 
machine. 
 Create 10 accounts in an array with id 0, 1, . . . , 9, and an initial balance of 
$100. 
 The system prompts the user to enter an id. If the id is entered incorrectly, ask 
the user to enter a correct id. 
 Once an id is accepted, the main menu is displayed.
 You can enter choice 1 for viewing the current balance, 2 for withdrawing 
money, 3 for depositing money, and 4 for exiting the main menu. 
 Once the system starts, it will stop by entering number 99.*/

 import java.util.Scanner;
 import java.util.ArrayList;
 import java.util.Iterator;
 
 public class New
 {
     public static void main(String[] args) 
     {  
         ArrayList<AC> l = new ArrayList<>();
         for(int i=0;i<10;i++)
         {
             l.add(new  AC(AC.ID));
             //always add objects this way ...we can't add them as creating fisrt then add using for
             // loop it will add the objects to list but we wont be able to get them back from list it 
             //will throw an error of Nullpointer
             AC.ID++;
         }
         int n;
         final boolean i=true;
         Scanner sc = new Scanner(System.in);
         //creating an infinite loop for continuously taking input.
         while(i)
         {
             
            
             
             System.out.println("Enter your ID in Digits:-");
             n = sc.nextInt();
             if(n>(AC.ID-1) || n==0)
             {
                 System.out.println("Incorrect ID please Try again...");
                 continue;
             }
             else
             {
                 AC b = l.get(--n);
 
                 System.out.println("Press 1 for Balance Inquiry \n Press 2 to Withdraw Money \n Press 3 to Deposit money \n Press 99 to Exit \n Enter Your Choice :-");
                 int choice = sc.nextInt();
                 switch(choice)
                 {
                     case 1:
                     b.balanceInquiry();
                     break;
 
                     case 2:
                     System.out.println("Enter the amount you want to Withdraw:-");
                     double money = sc.nextDouble();
                     b.withdrawMoney(money);
                     break;
 
                     case 3:
                     b.deposit();
                     break;
 
                     case 99:
                     System.exit(0);
 
                     default:
                     System.out.println("Invalid Input..!! \n Try again...");
                 }
             }
         }
         
     }
 }
 