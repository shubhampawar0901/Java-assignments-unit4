package com.q2;

public class HistoryStudent extends Student {
	int historyMarks;
	int civicsMarks;
	
	public HistoryStudent(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
		this.name = name;
		this.address= address;
	}

	@Override
	double getPercentage() {
		// TODO Auto-generated method stub
		double x = (double)(historyMarks+civicsMarks)/2;

		return x;
	}

}
