/*
 * Author Rick saha
 * */

class Bank{
	
	int acno;
	String name;
	float balance,totalbalance;
	
	Bank(int acno,String name,float balance){
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}
	
	void Deposite(int dpamount) {
		System.out.println(dpamount+" deposited");
		balance=balance+dpamount;
		
	}
	void Withdrwal(int wpamount) {
		System.out.println(wpamount+" withdrawn");
		balance=balance-wpamount;
	}
	void printdetails() {
		System.out.println(acno+" "+name+" "+balance+" ");
	}
	void PrintBalance() {
		System.out.println("Balance is: "+balance);
	}
}



public class Account {

	public static void main(String[] args) {
		Bank boiAc = new Bank(832345,"Rick saha",1000);
		boiAc.printdetails();
		boiAc.PrintBalance();
		boiAc.Deposite(40000);
		boiAc.PrintBalance();
		boiAc.Withdrwal(15000);
		boiAc.PrintBalance();
		boiAc.Withdrwal(26000);
		boiAc.PrintBalance();
		boiAc.Deposite(57000);
		boiAc.PrintBalance();
		boiAc.Deposite(50000);
		boiAc.PrintBalance();
		boiAc.Withdrwal(7000);
		boiAc.PrintBalance();
	}

}
