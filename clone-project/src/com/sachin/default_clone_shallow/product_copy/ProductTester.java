package com.sachin.product_copy;

import com.sachin.product_copy.base.Product;
import com.sachin.product_copy.constant.ProductType;

public class ProductTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product pro = new Product();
		pro.productId = 88;
		pro.name = "Wheat Flour";
		pro.price = 180;
		pro.type = ProductType.GROCERY;

		pro.displayInfo();
		System.out.println("-----------");
		try {
			Product pro1 = (Product) pro.clone();
			System.out.println(pro1.productId);
			System.out.println(pro1.name);
			System.out.println(pro1.price);
			System.out.println(pro1.type);
		} catch (CloneNotSupportedException e) {
			e.getStackTrace();

		}

	}

}
