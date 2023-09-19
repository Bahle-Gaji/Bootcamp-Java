package com.bahlegaji01.chapter11.Exercise1;

// import statements here:
import java.time.*;
import java.time.format.DateTimeFormatter;

public class ShoppingCart {
	public static void main(String[] args) {
		// Declare a LocalDateTime object, orderDate
		LocalDateTime orderDate;


		// Initialize the orderDate to the current date and time. Print it.
		orderDate = LocalDateTime.now();
		System.out.println(orderDate);


		// Format orderDate using ISO_LOCAL_DATE; Print it.
		orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(orderDate);

	}
}