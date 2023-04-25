package com_D5.Day5;

public class ComplexNumber {

	private int real,imaginary;

	public ComplexNumber() {
		real = 0;
		imaginary = 0;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}

	public int getReal() {
		return real;
	}

	public int getImaginary() {
		return imaginary;
	}

	public void display() {
		System.out.println("Complex Number: "+real+"+"+imaginary+"i");
	}
}
