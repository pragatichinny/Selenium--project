package day4_assignment;

	class Bank {
	    public double getInterestRate() {
	        return 0.0; // default rate
	    }
	}
	class SBI extends Bank {
	    @Override
	    public double getInterestRate() {
	        return 6.7;
	    }
	}
	class ICICI extends Bank {
	    @Override
	    public double getInterestRate() {
	        return 7.0;
	    }
	}
	class HDFC extends Bank {
	    @Override
	    public double getInterestRate() {
	        return 7.5;
	    }
	}
	public class BankDemo {
	    public static void main(String[] args) {
	        Bank sbi = new SBI();
	        Bank icici = new ICICI();
	        Bank hdfc = new HDFC();

	        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
	        System.out.println("ICICI Interest Rate: " + icici.getInterestRate() + "%");
	        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
	    }
	}
