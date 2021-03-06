package com.bridgelabz.stockmanagement.model;

/**
 * @Author : Vishal Yadav
 * @Version : 1.0
 * @Date : 2019/11/30
 */
public class Model {
	private String companyName;
	private double pricePerShares;
	private long noOfShares;
	private String symbol;

	public String getCompanyName() {
		return companyName;
	}

	public void setName(String name) {
		this.companyName = name;
	}

	public long getNoOfShares() {
		return noOfShares;
	}

	public void setNoOfShares(long noOfShares) {
		this.noOfShares = noOfShares;
	}

	@Override
	public String toString() {
		return "[companyName=" + companyName + ", pricePerShares=" + pricePerShares + ", noOfShares=" + noOfShares
				+ ", symbol=" + symbol + "]";
	}

	public double getPricePerShares() {
		return pricePerShares;
	}

	public void setPricePerShares(double pricePerShares) {
		this.pricePerShares = pricePerShares;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
}
