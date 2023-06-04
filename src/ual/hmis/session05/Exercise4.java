package ual.hmis.session05;

public class Exercise4 {

	public String maskedPassword(String password)
	{
		int number = password.length();
		
		if(number<5)
			return "password too short";
		else if (number>=5 && number <=8)
			return "********";
		else if(number>=12 && number<=40)
			return "************";
		else
			return "password too long";
		
		
	}
}
