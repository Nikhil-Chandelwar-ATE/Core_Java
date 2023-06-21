package decisionMakingStatement;

interface I1
{
	default void m1()
	{
		System.out.println("hi");
	}
	}
interface I2
{
	default void m2()
	{
		System.out.println("hello");
	}
	}
class C implements I1, I2
{
	@Override
	public void m1()
	{
		I1.super.m1();
		System.out.println("overriden");
	}
}
class Switch_Even_Odd
{
	public static void main(String[] args) {
	C c = new C();
	c.m1();
	}
}
