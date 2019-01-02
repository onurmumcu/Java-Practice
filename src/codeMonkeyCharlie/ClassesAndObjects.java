package codeMonkeyCharlie;

import javax.swing.JLabel;

public class ClassesAndObjects {
	public static void main(String[] args) {

		JLabel label = new JLabel();
		
		
		Person melis =new Person("melis");
		Person onur = new Person("onur");
		
		
		onur.merhabadedi(melis);
		melis.merhabadedi(onur);
	}
}
