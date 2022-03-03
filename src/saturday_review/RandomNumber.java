package saturday_review;

public class RandomNumber {
public static void main(String[] args) {

	
	
	RandomNumber ran = new RandomNumber();
	
	System.out.println(ran.randomInt(98,780));
	
	String result = ran.reverstring("yusan")+("samira");
	

	System.out.println(result);
}
public int  randomInt(int a , int b ) {
	
  return a +b;
	
	
	
	
	
	
}

public String  reverstring(String str) {
	

	StringBuilder sb = new StringBuilder();
          sb.append(str);
          
          return sb.reverse().toString();

	
	
	
	
}










}
