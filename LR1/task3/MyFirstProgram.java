class MyFirstClass {
	public static void main(String[] args) {
		MySecondClass o = new MySecondClass(30, 40);
		System.out.println(o.formula1());
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				o.setA(i);
				o.setB(j);
				System.out.print(o.formula1());
				System.out.print(" ");
			}
		System.out.println();
		}
	}
}

class MySecondClass{
	private int a;
	private int b;

	MySecondClass()
	{
	a = 0; b = 0;
	}

	MySecondClass(int A, int B)
	{
	a = A; b = B;
	}

	public int getA()
	{
		return a;
	}

	public int getB()
	{
		return b;
	}

	public void setA(int A)
	{
		a = A;
	}

	public void setB(int B)
	{
		b = B;
	}

	public int formula1()
	{
		return a + b;
	}

	public int formula2()
	{
		return a - b;
	}

	public int formula3()
	{
		return a * b;
	}

	public int formula4()
	{
		return a / b;
	}

	public int formula5()
	{
		return a % b;
	}

	public int formula6()
	{
		return a < b ? a:b;
	}

	public int formula7()
	{
		return a > b ? a:b;
	}

	public int formula8()
	{
		return a & b;
	}

	public int formula9()
	{
		return a | b;
	}

	public int formula10()
	{
		return a ^ b;
	}

	public int formula11()
	{
		return a << b;
	}
}
