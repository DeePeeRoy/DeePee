package packageTest.testing;

class TestException extends Exception{
	public TestException(String s) {
		super(s);
	}
}

public class CustomException{
	void check (int weight) throws TestException{
		if(weight<100);
		throw new TestException("Customized Exception Thrownssss");
	}

public static void main(String[] args) {
	CustomException cusExc = new CustomException();
	try {
		cusExc.check(120);
	}catch(TestException ex) {
		ex.printStackTrace();
		System.out.println("Thrown Exception ::  "+ex);
	}
}
}