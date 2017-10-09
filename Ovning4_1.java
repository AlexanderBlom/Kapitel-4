import javax.swing.*;
/*
Program som räknar ut kostnaden för samtal varje månad
Alexander Blom
2017/10/02
*/

public class Ovning4_1{
	public static void main(String[] args) {
		String minuter, kostnad;
		int minuter2;
		double kostnad2, pris;

		minuter = JOptionPane.showInputDialog(null, "Hur manga minuter ringer du per manad?");
		minuter2 = Integer.parseInt(minuter);

		kostnad = JOptionPane.showInputDialog(null, "Hur mycket kostar det per minut?");
		kostnad2 = Double.parseDouble(kostnad);
		if (minuter2 > 1000)
			kostnad2 = kostnad2 * 0.90;

		pris = kostnad2 * minuter2;

		JOptionPane.showMessageDialog(null, "Du betalar " + pris + " kr varje manad");

	}
}