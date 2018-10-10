package be.leerstad.calculator.business;

public abstract class Getal {
	
	private int getal;
	
	public int getGetal() {
		return getal;
	}
	public void setGetal(int getal) {
		this.getal = getal;
	}

	public Getal(int getal) {
		this.getal = getal;
	}
}
