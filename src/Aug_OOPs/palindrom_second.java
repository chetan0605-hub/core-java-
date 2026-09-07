package Aug_OOPs;

public class palindrom_second {

	boolean palindrom(int a) {

		int a1=0;

		int temp = a1;
		int rev = 0;

		while (a1 > 0) {

			int num = a1 % 10;

			rev = rev * 10 + num;

			a1 = a1 / 10;

		}
		if(temp==rev)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}