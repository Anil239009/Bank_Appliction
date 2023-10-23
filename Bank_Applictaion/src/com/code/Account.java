package com.code;

public class Account {
	private int accid;
	private String name;
	private double balance;
	private Locker lobj;
	private static int accCount;
	
	static {
		accCount=100;
	}
	public Account(String name,double bal) {
	
		this.name=name;
		this.balance=bal;
		accCount++;
		this.accid=accCount;
	}
	
	public int getAccid() {
		return accid;
	}
	public void AssignLocker( int duration) {
		lobj=new Locker(duration);
		System.out.println("Locker Assign successfully..!");
	}
	public void Changeduration(int duration) {
		lobj.duration=duration;
	}
	public int getLockerId()
	{
		return lobj.lockerid;
	}

	public String toString() { 
		if(lobj!=null) {
			return "Bank  Details  are Accid :"+accid+"  Name :"+name+"  Balance :"+balance+ lobj;
		}
		else {
			return"Bank  Details are  Accid :"+accid+"  Name :"+name+"  Balance :"+balance+"  you can apply for locker";
		}
	}
	private static class Locker{
		private int lockerid;
		private int duration;
		private double charges;
		private static int countid;
		
		static {
			countid=1000;
		}
		
		public Locker(int duration) {
			countid++;
			this.lockerid=countid;
			this.duration=duration;
			this.charges=400;
		}
		
		public int getLockerid() {
			return lockerid;
		}
		public String toString() {
			return "\nLocker details are Lockerid :"+lockerid+"  Duration :"+duration+"  Charges :"+(charges*duration);
		}
	}
	public double withdraw(double amount) {
		balance=(balance-amount);
		return balance;
	}
	public void diposite (double amount) {
		balance=balance+amount;
	}

}
