package calc;

import javax.security.auth.Subject;

public class Sum {
	public int sum (int pFirstNumber, int pSecondNumber){
		return pFirstNumber + pSecondNumber;
	}

	public static void main(String[] args) {
	
		System.out.println(new Sum().sum(2, 3));

	}

}
