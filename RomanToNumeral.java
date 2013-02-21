
public class RomanToNumeral {
	
	int Numeralforc(char c)
	{
		switch(c) {
		
		case 'I':
			return 1;

		
		case 'V':
			return 5;

			
		case 'X':
			return 10;

			
		case 'L':
			return 50;

			
		case 'C':
			return 100;
			
		case 'D':
			return 500;

			
		case 'M':
			return 1000;

		default:
			return 0;
		}
		
	}
	
	int Numeralfor(String str )
	{
		int temp = 0;
		int j = 0;
		for (int i = 0; i < str.length() -1; ++i)
		{	
			if ((j = Numeralforc(str.charAt(i))) == 0)
				return 0;
			
			if ((Numeralforc(str.charAt(i+1)) > j)){
				if(str.charAt(i) == 'V' || str.charAt(i) == 'L' ||str.charAt(i) == 'D' || (Numeralforc(str.charAt(i+1)) > j*10))
					return 0;
				temp -= j;
			}
			else temp += j;
		}
		temp += Numeralforc(str.charAt(str.length() - 1));
		return temp;
	}

}
