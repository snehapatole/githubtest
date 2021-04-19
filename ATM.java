import java.util.Scanner;
class verify
{
	void pin()
	{
		Scanner sc=new Scanner(System.in);
		int pin;
		long blnc=15000,wd,dp;
		int ch;
		System.out.println("Enter pin: ");
		pin=sc.nextInt();
		if (pin ==1234)
		{
		
			System.out.println("Welcome to ATM transactions");
			System.out.println("1. Check banalnce");
			System.out.println("2. Withdraw cash");
			System.out.println("3. Deposite cash");
			System.out.println("4. Exit");
			
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Your account balance is: "+blnc);
				break;
			case 2:
				System.out.println("Enter amount to withdraw:");
				wd=sc.nextLong();
				if(wd%10!=0)
				{
					System.out.println("Enter the amount in multiples of 100");
				}
				else if(wd>(blnc-500))
				{
					System.out.println("Insuficient balance");
				}
				else
				{
					blnc=blnc-wd;
					System.out.println("Your balance is: "+blnc);
				}
				break;
			case 3:
				System.out.println("Enter amount to deposite:");
				dp=sc.nextLong();
				blnc=blnc+dp;
				System.out.println("Your balance is: "+blnc);
				break;
			case 4:
				System.out.println("Thank You");
				break;
				
			default:
				System.out.println("Invalid choice");
				break;
			}
			
		}
		
		
			
			
	else
	{
		System.out.println("Enter correct pin");
	}
		
}
	
}


public class ATM {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
			Scanner cha=new Scanner(System.in);
			verify v=new verify();
			v.pin();
			
			
		
			
			System.out.println("Do you want another tranaction ?(y/n) ");
			char c=cha.next().charAt(0);
			if(c=='y')
			{
				v.pin();
			}
			else if(c=='n')
			{
				System.out.println("Thank you..");
			}
			else
			{
				System.out.println("Invalid input");
			}
			
	}

}
