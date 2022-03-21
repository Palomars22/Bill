package entities;


public class Bill {

	private char gender;
	private int beer, softdrink, barbecue;

	public Bill() {
	}

	public Bill(char gender, int beer, int softdrink, int barbecue ) {
		this.gender = gender;
		this.beer = beer;
		this.softdrink = softdrink;
		this.barbecue = barbecue;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getBeer() {
		return beer;
	}

	public void setBeer(int beer) {
		this.beer = beer;
	}

	public int getSoftdrink() {
		return softdrink;
	}

	public void setSoftdrink(int softdrink) {
		this.softdrink = softdrink;
	}

	public int getBarbecue() {
		return barbecue;
	}

	public void setBarbecue(int barbecue) {
		this.barbecue = barbecue;
	}

	public double couver(int beer, int softDrink, int barbecue) {
		double count = (beer * 5) + (softDrink * 3) + (7 * barbecue);

		return count;

	}

	public double feeding(int beer, int softDrink, int barbecue) {
		double couver = couver(beer, softDrink, barbecue);
		double tax = 0;
		if (couver < 30) {
			tax = 4;
			couver = couver + tax;
		} else if (couver > 30) {
			tax = 0;
		}
		return tax;

	}

	public double ticket(char gender) {
		double tick = 0;
		if (gender == 'M') {
			tick = 10;
		} else if (gender == 'F') {

			tick = 8;
		}

		return tick;
	}

	public double total(int beer, int softDrink, int barbecue, char gender, double Couver) {
		double totaldrink = feeding(beer, softDrink, barbecue) + ticket(gender) + couver(beer, softDrink, barbecue);

		return totaldrink;

	}
}
