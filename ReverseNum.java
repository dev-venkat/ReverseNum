
import java.util.*;

class ReverseNum{

public static void main(String[] args)
{
	System.out.println("Enter any integer: ");
	
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt();
	int result=0;
	
	while(num!=0)
	{
		result=(num%10)+(result*10);
		num=num/10;
	}
	
	System.out.println("result :"+result);
	
}

}