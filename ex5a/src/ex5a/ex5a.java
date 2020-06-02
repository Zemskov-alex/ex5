package ex5a;

public class ex5a {


	public static void main (String[] args){
		
		double price = 700;
		double res;
		if (price < 500){
			res = price*0.99;
		}


		else if (price < 1000){
			res = price*0.98;
		}
		else if (price < 2000){
			res = price*0.97;
		}
		else {
			res = price*0.96;
		}
	System.out.println (res + "руб.");

}
}
