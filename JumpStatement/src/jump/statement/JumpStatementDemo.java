package jump.statement;

public class JumpStatementDemo {

	public static void main(String[] args) {
		System.out.println("==========Continue");
		for(int i = 0; i < 5; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println("Counter: " +i);
		}
		System.out.println("==========Break");
		for(int i = 0; i < 5; i++) {
			if(i == 3) {
				break;
			}
			System.out.println("Counter: " +i);
		}
		System.out.println("==========Break Nasted Loop");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 3) {
					break;
				}
				System.out.print(j + " ");
			}
			System.out.println("Counter: "+i);
		}
	}

}
