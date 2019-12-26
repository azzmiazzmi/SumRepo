package calc;

import javax.security.auth.Subject;

public class Sum {
	public int sum (int pFirstNumber, int pSecondNumber){
		return pFirstNumber + pSecondNumber;
	}

	public int sub (int pFirstNumber, int pSecondNumber){
		int result=0;
		result= pFirstNumber - pSecondNumber;
		return result;
	}

	
	public static void main(String[] args) {
	
		System.out.println(new Sum().sum(2, 3));
		System.out.println(new Sum().sum(5, 1));
	}

}
