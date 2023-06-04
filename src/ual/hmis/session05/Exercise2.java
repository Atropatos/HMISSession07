package ual.hmis.session05;

public class Exercise2 {
	public boolean login (String username, String password) {
			if (username.isEmpty() || password.isEmpty())
				return false;
			if (username.length()>=30 || password.length()>=30)
				return false;
			
			if (!password.matches(".*[A-Z].*") || 
		            !password.matches(".*[a-z].*") || 
		            !password.matches(".*\\d.*")) {
		            return false;
		        }
			return compruebaLoginEnBD(username, password);
			
	
	}
	
	public boolean compruebaLoginEnBD(String username, String password) {
		if(username.equals("user") &&
			password.equals("Pass1"))
					return true;
		else
					return false;
		
		
		
	}
	}


