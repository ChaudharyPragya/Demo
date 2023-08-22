package com.primitive.datatypes;

import java.math.BigDecimal;

public class InterestCalculation {
	BigDecimal principal, rateOfInterest;

	public InterestCalculation(String principal, String rateOfInterest) {
		this.principal = (new BigDecimal(principal));
		this.rateOfInterest = (new BigDecimal(rateOfInterest)).divide(new BigDecimal(100));// as rate of interest is
																							// always divide by 100 in
																							// simpleInterest formula
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		// totalValue =principal+principal*rateOfInterest*noOfYears
		BigDecimal noOfYearBigDecimal = new BigDecimal(noOfYears);
		BigDecimal totalVaule = principal.add((principal.multiply(rateOfInterest)).multiply(noOfYearBigDecimal));
		return totalVaule;
	}

}
