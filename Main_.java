

class Operation{
	
	private int a;
	private int b ;
	String s ;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public void getResult(double x ,double y) {
		
	}
}

class Add extends Operation{

	public void getResult(double x ,double y) {
		System.out.println(x+"+"+y+"结果是"+(x+y)) ;
	}
}

class Minus extends Operation{
		
	public	void getResult(double x, double y) {
		System.out.println(x+"-"+y+"结果是"+(x-y)) ;
	}
}

class Cheng extends Operation{

	public void getResult(double x, double y) {
		System.out.println(x+"+"+y+"结果是"+x*y) ;
	}	
}

class Chu extends Operation{
	
	public void  getResult(double x,double y) {
		if(y==0) {
			try {
				throw new Exception();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("x/y结果是"+x*1.0/y) ;
	}
}

class Factory{
	
	public static void process(Operation op ,String s) {
	
		Operation oper = null;
		switch(s) {
			case "*":
				oper = new Cheng();
				oper.getResult(op.getB(), op.getA());
				break ;
			case "+":
				oper = new Add();
				oper.getResult(op.getB(), op.getA());
				break ;
			case "-":
				oper = new Minus();
				oper.getResult(op.getB(), op.getA());
				break ;
			case "/":
				oper = new Chu();
				oper.getResult(op.getB(), op.getA());
				break ;
			default:
				System.out.println("No Such Program!");
				break ;
		}
	}
}

public class Main_ {
	
	public static void main(String[]args) {
		Operation op = new Operation();
		op.setA(2);
		op.setB(5);
		Factory.process(op, "*");
	}
}
