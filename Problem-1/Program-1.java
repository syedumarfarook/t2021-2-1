public class Program1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in );
		double a=20.5, b=5.5;
		System.out.println("Enter the operation to be performed");
		String operation = sc.next( );
		switch(operation)
		{
			case "Addition": System.out.println("The sum of two numbers a and b is "+(a+b));
			break;
			case "Substraction": System.out.println("The substraction of two numbers a and b is "+(a-b));
			break;
			case "Multiplication": System.out.println("The Multiplication of two numbers a and b is "+(a*b));
			break;
			case "Division": System.out.println("The Division of two numbers a and b is "+(a/b));
			break;
			default : System.out.println("Invalid operation ");
			break;
		}
	}
}
