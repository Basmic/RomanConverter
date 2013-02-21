
public class RomanComputer {
	
	String compute(String str)
	{
		int temp = 0;
		NumeralToRoman convertNtoR = new NumeralToRoman();
		RomanToNumeral convertRtoN= new RomanToNumeral();
		String[] tabstr = str.split("\\s+");
		for(int i =0; i < tabstr.length; i+=2)
			temp += convertRtoN.Numeralfor(tabstr[i]);
		
		return convertNtoR.Romanfor(temp);
	}

}
