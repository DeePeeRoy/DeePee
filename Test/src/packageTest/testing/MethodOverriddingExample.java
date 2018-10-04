package packageTest.testing;

class MethodOverridding{
	int sampleMethod() {
		return 0;
	}
}
	
	class testing1 extends MethodOverridding{
		int sampleMethod(){
			return 1;
		}
	}
	
	class testing2 extends MethodOverridding{
		int sampleMethod() {
			return 2;
		}
	}
	
	class testing3 extends MethodOverridding{
		int sampleMethod() {
			return 4;
		}
	}
	
	public class MethodOverriddingExample{
		
		public static void main(String args[]){
			testing1 t1 = new testing1();
			System.out.println("Testing 1 :: "+t1);
			System.out.println("Testing 1 :: "+t1.sampleMethod());
			testing2 t2 = new testing2();
			System.out.println("Testing 2 :: "+t2);
			System.out.println("Testing 2 :: "+t2.sampleMethod());
			testing3 t3 = new testing3();
			System.out.println("Testing 3 :: "+t3);
			System.out.println("Testing 3 :: "+t3.sampleMethod());
		}
	}