package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("The Desktopsize is:"+"20*40");
	}

	public static void main(String[] args) {
		Desktop desk=new Desktop();
		desk.computerModel();
		desk.desktopSize();
		

	}

}
