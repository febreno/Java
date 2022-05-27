package exercicio2;

public class Lampada {
	boolean lampada;
	
	public void turnOn() {
		lampada = true;
		System.out.println("Voc� ligou a l�mpada");
	}
	
	public void turnOff() {
		lampada = false;
		System.out.println("Voc� desligou a l�mpada");
	}
	
	public boolean state() {
		System.out.println("A l�mpada est�: " + lampada);
		return lampada;
	}
	
	public static void main(String[] args) {
		Lampada lampada1 = new Lampada();
		
		lampada1.turnOn();
		lampada1.turnOff();
		lampada1.state();
	}
}