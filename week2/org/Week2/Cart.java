package org.Week2;

import java.util.*;

public class Cart {


	public Cart() {
	
		for(int i = 0; i < 100; i++)
		{
			CartItem c = new CartItem(i,i+10.2,i+2);
			cartItems.add(c);
System.out.println("added CartItem");	
		}

	}

	protected ArrayList<CartItem> cartItems = new ArrayList<CartItem>();

}
