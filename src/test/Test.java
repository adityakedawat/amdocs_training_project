package test;

import Drivers.UserImpl;
import Models.Users;
import interfaces.UsersDao;

public class Test {

	public static void main(String[] args) {
		Users user=new Users(107, "Aditya", "24/06/2020", "3768 Lanchester City, USA", "Hello_world", "adity@gmail.com",
				90038035032L,"2343dsfdsf");
		UsersDao userdriver= new UserImpl();
		if(userdriver.saveUser(user))
		System.out.print("User Added Succesfully");
	}

}
