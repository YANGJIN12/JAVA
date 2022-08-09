package namoo.java;

public class VarageExample {
	
	
		public static int sum(int...arg) {
			int result = 0;
			for(int i : arg) {
				result += 1;
				
			}
			return result;
		}
		
		public static void main(String[] args) {
			sum(10);
			sum(1,2,3);
			System.out.println(sum(10,20,30));
			
		}
		
	}


