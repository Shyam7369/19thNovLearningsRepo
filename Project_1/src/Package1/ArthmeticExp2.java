package Package1;

public class ArthmeticExp2
{
public int multi(int a, int b)
{
	int c;
	c=a*b;
	return c;
}
public int substract(int l, int m)
{
	int n;
	n=l-m;
	return n;
}
public int sum(int o, int p)
{
	int q;
	q=o+p;
	return q;
}
public void divison(int u, int v)
{
	int w;
	w=u/v;
	System.out.println("Arthmetic Expression <(((((10*2)-2)+2)-2)/2)> value = " +w);
}
public static void main(String args[])
{
	ArthmeticExp2 AX2 = new ArthmeticExp2();
	int Multivalue=AX2.multi(10,2);
	System.out.println("Multiplication value = " +Multivalue);
	int Subsvalue1=AX2.substract(Multivalue,2);
	System.out.println("Substraction sub value = "+Subsvalue1);
	int Sumsvalue=AX2.sum(Subsvalue1, 2);
	System.out.println("Summation value = " +Sumsvalue);
	int subsvalue2=AX2.substract(Sumsvalue, 2);
	System.out.println("Substraction value = " +subsvalue2);
	AX2.divison(subsvalue2, 2);
}
}