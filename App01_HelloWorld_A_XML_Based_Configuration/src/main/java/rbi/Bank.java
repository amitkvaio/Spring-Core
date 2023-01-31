package rbi;

public class Bank {
	public static void main(String[] args) {
		RBI hdfc = new HDFC();
		hdfc.rbiRules();
		
		RBI sbi = new SBI();
		sbi.rbiRules();
		
		RBI pnb = new PNB();
		pnb.rbiRules();
		
		/*
		if in future new bank has came like PNB bank
		then we need to change again to the child class name in the code, like this
		RBI pnb = new PNB();
		pnb.rbiRules();
		
		So we have to do our configuration in the source code. 
			So how to make it configurable? We don’t want to touch the source code of this. 
			The source code should be constant. 
			And how can we make it? Here Spring IoC comes into the picture
		*/
		System.out.println("Main end");
	}
}
