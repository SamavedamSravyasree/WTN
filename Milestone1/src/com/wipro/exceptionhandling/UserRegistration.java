package com.wipro.exceptionhandling;


class InvalidCountryException extends Exception 
{ 
	public InvalidCountryException()

	{System.out.println("User outside India , cannot be registered");
    return;
}
}

class S
{
	public void NotIndia(String s) throws InvalidCountryException
	{
		if(!s.equals("India"))
		{
			throw new InvalidCountryException();
		}
	}
}
public class UserRegistration 
{
	String name;
	static String country;
	public void registerUser(String name, String country)
	{
		this.name=name;
		UserRegistration.country=country;
	}
	public static void main(String[] args) {
		UserRegistration u=new UserRegistration();
		u.registerUser(args[0], args[1]);;
		S a=new S();
		try {
			country=args[1];
			a.NotIndia(country);
			
		}
		catch(Exception e){
			return;
		}
		System.out.println("User Registration done successfully");
		
	}
	
}