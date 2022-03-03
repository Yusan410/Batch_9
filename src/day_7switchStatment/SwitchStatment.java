package day_7switchStatment;

public class SwitchStatment {

	public static void main(String[] args) {
		
		char grade ='F';
		
		switch(grade)
		{
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		System.out.println("pass");
		
		break;
		case 'W' :
		System.out.println("Withdraw");
		
		
		   break;
		case'I':
		System.out.println("Incomplete");
		break;
		
		default:
		System.out.println("fail");
		
		
		}		
		
			
		
		
		
		
		
	}

}
