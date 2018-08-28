package rationalNumberHomework;

public class RationalNumber {
	private int numerator;
	private int denominator;
	
	public RationalNumber() {
		this.numerator = 0;
		this.denominator = 1;
	}
	
	public RationalNumber(int numerator, int denominator) {
		this.numerator = numerator;
		if(denominator != 0)
			this.denominator = denominator;
		else
			this.denominator = 1;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		if(denominator != 0)
			this.denominator = denominator;
		else
			System.out.println("The denominator can't be 0");
	}
	
	public RationalNumber add(RationalNumber number) {
		int n = (this.numerator * number.getDenominator()) + (number.getNumerator()* this.denominator);
		int d = this.denominator * number.getDenominator();
		 RationalNumber numberAdding = new RationalNumber(n, d);
		 numberAdding.simplify();
		 return numberAdding;
	}
	
	public RationalNumber substract(RationalNumber number) {
		 int n = (this.numerator * number.getDenominator()) - (number.getNumerator() * this.denominator);
		 int d = this.denominator * number.getDenominator();
		 RationalNumber numberAdding = new RationalNumber(n, d);
		 numberAdding.simplify();
		 return numberAdding;
	}
	
	public RationalNumber multiply(RationalNumber number) {
		int n = this.numerator * number.getNumerator();
		int d = this.denominator * number.getDenominator();
		 RationalNumber numberAdding = new RationalNumber(n, d);
		 numberAdding.simplify();
		 return numberAdding;
	}
	
	public RationalNumber divide(RationalNumber number) {
		int n = this.numerator * number.getDenominator();
		int d = this.denominator * number.getNumerator();
		 RationalNumber numberAdding = new RationalNumber(n, d);
		 numberAdding.simplify();
		 return numberAdding;
	}
	
	public RationalNumber inverse() {
		return new RationalNumber(this.denominator, this.numerator);
	}
	
	public double getNumber() {
		double rationalNumber = this.numerator / this.denominator;
		return rationalNumber;
	}
	
	public int mcd() {
		if(this.numerator != 0) {
			int a = this.numerator > 0 ? this.numerator: this.numerator * -1;
			int b = this.denominator > 0 ? this.denominator: this.denominator * -1;
			while(b>0) {
				if(a>b)
					a = a - b;
				else
					b = b - a;
			}
			return a;
		}
		return 0;
	}
	
	public void simplify() {
		int multiple = mcd();
		if(multiple != 0) {
			setNumerator(this.numerator/multiple);
			setDenominator(this.denominator/multiple);
		}		
	}
	
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}
	
	public static void main(String[] args) {
		RationalNumber number = new RationalNumber(0, 18);
		System.out.println(number.mcd() + "");
		number.simplify();
		System.out.println(number.toString());
		System.out.println(number.getNumber() + "");
		System.out.println(number.add(new RationalNumber(2, 18)).toString());
	}
	
}
