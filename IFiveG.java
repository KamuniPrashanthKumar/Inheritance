package inheritance;

public class IFiveG implements IThreeG{

	@Override
	public void add() {
		System.out.println("hello");
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		IFiveG s=new IFiveG();
		s.add();
	}

}
