package com.learning.consumer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.function.Consumer;

/**
 * A consumer consumes an input and does not return Anything
 *
 */
public class ConsumerExample {

	public static void main(String[] args) {

		Consumer<Date> oneDayIncrement = new Consumer<Date>() {
			@Override
			public void accept(Date date) {
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(date);
				calendar.add(Calendar.DAY_OF_YEAR, 1);
				date = calendar.getTime();
				System.out.println("Tomorrow : " + date);
			}
		};

		Consumer<Date> dayPrinter = new Consumer<Date>() {
			@Override
			public void accept(Date date) {
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy EEEE");
				System.out.println(dateFormat.format(date));
			}
		};

		oneDayIncrement.accept(new Date());
		dayPrinter.accept(new Date());

		/*
		 * we can chain the consumers using andThen The output of the first consumer
		 * will not impact the next consumer
		 */
		oneDayIncrement.andThen(dayPrinter).accept(new Date());
	}

}
