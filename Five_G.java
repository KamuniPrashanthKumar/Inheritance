package inheritance;

public class Five_G extends Four_G {
	public void fiveG() {
		System.out.println("we can get fast 5G internet connection");
	}
	public static void main(String[] args) {
		Five_G fg= new Five_G();
		fg.call();
		fg.msg();
		
		
	}
	
	
}
