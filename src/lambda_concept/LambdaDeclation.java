package lambda_concept;

public class LambdaDeclation {
	
	public static void main(String[] args) {
		
		WebPage w1 = new WebPage() {
			
			@Override
			public void header(String value) {
				System.out.println("hello " + value);
			}
		};
		
		w1.header("world");
		w1.header("city");
		
		//OR => The above anonymous inner type is equivalent to below lambda expression
		WebPage w2 = (value) -> {
			System.out.println(value.toUpperCase());
		};
		
		//OR => a single line
		w2 = (value) -> System.out.println(value.toUpperCase());
		
		w2.header("world");
		w2.header("city");
	}

}
