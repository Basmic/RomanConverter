
public class NumeralToRoman {

	String Romanfor(int num)
	{
		String rom = "";
		
		while(num >= 1000) {
			rom += 'M';
			num -= 1000;
		}
		while(num >= 900) {
			rom += "CM";
			num -= 900;
		}
		while(num >= 500) {
			rom += 'D';
			num -= 500;
		}
		while(num >= 400) {
			rom += "CD";
			num -= 400;
		}
		while(num >= 100) {
			rom += 'C';
			num -= 100;
		}
		while(num >= 90) {
			rom += "XC";
			num -= 90;
		}
		while(num >= 50) {
			rom += 'L';
			num -= 50;
		}
		while(num >= 40) {
			rom += "XL";
			num -= 40;
		}
		while(num >= 10) {
			rom += 'X';
			num -= 10;
		}
		while(num >= 9) {
			rom += "IX";
			num -= 9;
		}
		while(num >= 5) {
			rom += 'V';
			num -= 5;
		}
		while(num >= 4) {
			rom += "IV";
			num -= 4;
		}
		
		while(num > 0) {
		rom += 'I';
		num -= 1;
		}
		return rom;
	}
}
