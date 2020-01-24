package com.book.ref;

import java.util.HashMap;
import java.util.Map;

public class Price {

	private Map<String, Double> rates;
	private Double value;

	public Price(Double value) {
		this.value = value;
		rates = new HashMap<>();
		rates.put("USD", 1d);
		rates.put("GBP", 0.6);
		rates.put("EUR", 0.8);
	}

	public Double convert(String toCurrency) {

		if ("USD".equals(toCurrency)) {
			return value;
		} else {
			return value * rates.get(toCurrency) * rates.get("USD");
		}
	}

	@Override
	public String toString() {
		return this.value.toString();
	}

	public Map<String, Double> getRates() {
		return Map.copyOf(rates);
	}

}
