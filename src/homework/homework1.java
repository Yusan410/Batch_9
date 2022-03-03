package homework;



public class homework1 {

    public static void main(String[] args) {

    	 String str = "ABCD";
         String output = "";
         
         for (int i = str.length()-1; i >=0; i--) {
             output = output + str.charAt(i);
         }
             System.out.println(output);
	}

}