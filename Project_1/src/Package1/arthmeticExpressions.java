package Package1;

public class arthmeticExpressions 
{
public int sum(int a, int b)
{
	int c;
	c=a+b;
	return c;
}
public int sub(int l, int m)
{
	int n;
	n=l-m;
	return n;
}
public int mul(int o, int p)
{
	int q;
	q=o*p;
	return q;
}
public void div(int r, int s)
{
	int t;
	t=r/s;
	System.out.println("Arthmetic Expression <(((((10+2)+2)-2)*2)/2)> value = " +t);
}
public static void main(String args[])
{
	arthmeticExpressions AE = new arthmeticExpressions ();
	int Summation=AE.sum(10,2);
	System.out.println("summation value = " +Summation);
	int SumOfSums=AE.sum(Summation,2);
	System.out.println("Sum of sums value = " +SumOfSums);
	int Substraction=AE.sub(SumOfSums, 2);
	System.out.println("After Substitution value = " +Substraction);
	int Multiplication=AE.mul(Substraction, 2);
	System.out.println("After Multiplication value = " +Multiplication);
	AE.div(Multiplication, 2);
}		
}

