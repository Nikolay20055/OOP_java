package myfirstpackage;
public class MySecondClass{
	private int a;
	private int b;
	public MySecondClass(){
	a = 0; b = 0;
	}
	public MySecondClass(int A, int B){
	a = A; b = B;
	}
	public int getA(){
		return a;
	}
	public int getB(){
		return b;
	}
	public void setA(int A){
		a = A;
	}
	public void setB(int B){
		b = B;
	}
	public int formula1(){ return a+b;}
	public int formula2(){ return a-b;}
	public int formula3(){ return a*b;}
	public int formula4(){ return a/b;}
	public int formula5(){ return a%b;}
	public int formula6(){ return a < b ? a:b;}
	public int formula7(){ return a > b ? a:b;}
	public int formula8(){ return a&b;}
	public int formula9(){ return a|b;}
	public int formula10(){ return a^b;}
	public int formula11(){ return a<<b;}
}
