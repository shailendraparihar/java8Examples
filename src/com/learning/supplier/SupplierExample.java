package com.learning.supplier;

import java.util.Calendar;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// Supplier has only get Method
		Supplier<Calendar> calendarSupplier = new Supplier<Calendar>() {

			@Override
			public Calendar get() {
				return Calendar.getInstance();
			}
		};
		Calendar c = calendarSupplier.get();
	}
}
