package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		Department obj = new Department(1, "Books");
		Seller seller = new Seller(1, "Rafael", "rafael@gmail.com", new Date(), 4500.00, obj);
		System.out.println(obj);
		
		System.out.println(seller);
		
		

	}	

}
