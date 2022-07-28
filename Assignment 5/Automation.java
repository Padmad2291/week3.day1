package week3.day2;

public class Automation extends MultipleLanguage implements Language,TestTool{

	public static void main(String[] args) {
		Automation obj=new Automation();
		obj.java();
		obj.selenium();
		obj.ruby();
		obj.python();

	}

	public void selenium() {
		System.out.println("This method is for Selenium");
		
	}

	public void java() {
		System.out.println("This method is for Java");
		
	}

	@Override
	public void ruby() {
		System.out.println("This method is for Ruby");
		
	}

}
