import java.util.*;
class Project_Banking
{
	public static Scanner Sc;
	public static void main(String args[])
	{
		Sc = new Scanner(System.in);
		String name[] = new String[10];
		name[0]="Paul Shinji";
		name[1]="Andrew Hayden";
		name[2]="Gary Oak";
		name[3]="Ash Ketchem";
		name[4]="Drayden Ryvre";
		name[5]="Sreelekha Manunuru";
		String pw[]=new String[10];
		pw[0]="torterra";
		pw[1]="roselia";
		pw[2]="umbreon";
		pw[3]="pikachu";
		pw[4]="vampire";
		pw[5]="alien";
		int acc_num[]= new int[10];
		acc_num[0]=1;
		acc_num[1]=2;
		acc_num[2]=3;
		acc_num[3]=4;
		acc_num[4]=5;
		acc_num[5]=6;
	    int ob[]=new int[10];
	    ob[0]=100000;
	    ob[1]=59000;
	    ob[2]=99000;
	    ob[3]=77000;
	    ob[4]=100000;
	    ob[5]=77777;
		int bal[]=new int[10];
	    bal[0]=10000;
	    bal[1]=5900;
	    bal[2]=9900;
	    bal[3]=7700;
	    bal[4]=10000;
	    bal[5]=7777;
		int dp[]=new int[10];
	    dp[0]=1000;
	    dp[1]=5900;
	    dp[2]=9900;
	    dp[3]=7700;
	    dp[4]=1000;
	    dp[5]=7777;
		int wd[]=new int[10];
		dp[0]=1000;
	    dp[1]=2000;
	    dp[2]=3000;
	    dp[3]=4000;
	    dp[4]=5000;
	    dp[5]=7000;
		System.out.println("Welcome to Lunar Bank");
		System.out.println("1. Creating Account \n"+"2. Withdrawal \n"+"3. Deposit \n"
				+"4. Checking Account \n"+"5. Checking Master Account \n"+"6. Exit");
		int ch;
		do
		{
			System.out.println("Enter your choice");
			ch= Sc.nextInt();
			switch(ch)
	    	{
			case 1:
			{
				System.out.println("Creating Account");
				System.out.println("Enter First Name ");
			    String fname = Sc.next();
			    System.out.println("Enter your Last Name ");
			    String lname = Sc.next();
			    name[6] = fname + " " + lname;
				System.out.println("Enter your account number");
				acc_num[6] = Sc.nextInt();
				System.out.println("Enter your password");
				pw[6] = Sc.next();
				System.out.println("Enter your opening balance");
				ob[6] = Sc.nextInt();
				System.out.println("Name : "+ name[6] +"\n"+"Account Number : "+ acc_num[6] +
				"\n"+"Password : "+ pw[6] +"\n"+"Opening Balance : Rs."+ ob[6]);
				System.out.println("ACCOUNT CREATION SUCCESSFUL");
				break;
			}
			case 2 :
			{
				System.out.println("Withdrawal");
				System.out.println("Enter your account number");
				int A = Sc.nextInt();
				System.out.println("Enter your password");
				String P = Sc.next();
				int i = 0;
				for(;i<10;i++)
				{
					if((A==acc_num[i])&&(P.equals(pw[i])))
					{
						System.out.println("Enter the withdrawal amount");
						wd[6] = Sc.nextInt();
						bal[i] = ob[i] - wd[6];
						System.out.println("Amount withdrawn : Rs."+wd[6]);
						System.out.println("Balance after withdrawal : Rs."+bal[i]);
						ob[i] = bal[i];
						wd[i] = wd[6];
						break;
					}
				}
				if(i==10)
					System.out.println("Either your account number or password is wrong.\nPlease try again.");
				break;
			}
			case 3 :
			{
				System.out.println("Deposit");
				System.out.println("Enter your account number");
				int A1 = Sc.nextInt();
				System.out.println("Enter your password");
				String P1 = Sc.next();
				int i = 0;
				for(;i<10;i++)
				{
					if((A1==acc_num[i])&&(P1.equals(pw[i])))
					{
						System.out.println("Enter the deposit amount");
						dp[6] = Sc.nextInt();
						bal[i] = ob[i] + dp[6];
						System.out.println("Amount withdrawn : Rs."+dp[6]);
						System.out.println("Balance after deposition : Rs."+bal[i]);
						ob[i] = bal[i];
						wd[i] = wd[6];
						break;
					}
				}
				if(i==10)
					System.out.println("Either your account number or password is wrong.\nPlease try again.");
				break;
			}
			case 4 :
			{
				System.out.println("Checking Account");
				System.out.println("Enter your account number");
				int A = Sc.nextInt();
				System.out.println("Enter your password");
				String P = Sc.next();	
				int i = 0;
				for(;i<10;i++)
				{
					if((A==acc_num[i])&&(P.equals(pw[i])))
					{
						System.out.println("Your name is : "+name[i]);
						System.out.println("Your account number is : "+ acc_num[i]);
						System.out.println("Your password is : "+pw[i]);
						System.out.println("Last deposited on 7/8/2018 Rs."+dp[i]);
						System.out.println("Last withdrew on 15/8/2018 Rs."+wd[i]);
						System.out.println("Current Balance : Rs."+ bal[i]);
						break;
					}
				}
				if(i==10)
					System.out.println("Either your account number or password is wrong.\nPlease try again.");
				break;
			}
			case 5:
			{
				System.out.println("Checking Master Account");
				System.out.println("Acc\tName\t\t\tDate\t\tCurrent Balance\tPassword");
				System.out.println("1\tPaul Shinji\t\t7/8/2015\tRs.1,00,000\ttortera");
				System.out.println("2\tAndrew Hayden\t\t15/10/2017\tRs.59,000\trosalia");
				System.out.println("3\tGary Oak\t\t7/7/2017\tRs.99,000\tumbreon");
				System.out.println("4\tAsh Ketchem\t\t25/12/2016\tRs.77,000\tpikachu");
				System.out.println("5\tDrayden Ryvre\t\t17/7/2017\tRs.1,00,000\tvampire");
				System.out.println("6\tSreelekha\t\t7/8/2018\tRs.77,777\talien");
				if(ob[6]!=0)
					System.out.println(acc_num[6]+"\t"+name[6]+"\t24/7/2015\tRs."+ob[6]+"\t"+pw[6]);
				break;
			}
			case 6:
			{
				System.out.println("Thank You for Your Visit to Lunar Bank");
				break;
			}
			default:
			{
				System.out.println("Sorry,the option you've chosen is not available.\n"+"Please choose one of the following options: ");
			}
		    }
			if(ch==6)
				break;
			else
			{
				System.out.println("Welcome to Lunar Bank");
				System.out.println("1. Creating Account \n"+"2. Withdrawal \n"+"3. Deposit \n"
				+"4. Checking Account \n"+"5. Checking Master Account \n"+"6. Exit");
			}
		}while((ch<=6)||(ch>6));
	}
}

