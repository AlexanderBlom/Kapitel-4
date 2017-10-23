import javax.swing.*;
import java.text.*;
/*
Program som bestämmer vilken alfabetisk ordning namnen är i.
Alexander Blom
2017/10/16
*/
public class Ovning4_7{
	public static void main(String[] args) {
		
		Collator c = Collator.getInstance();
		c.setStrength(Collator.PRIMARY);

		String namn1 = JOptionPane.showInputDialog(null, "Vad ar ditt namn?");
		String namn2 = JOptionPane.showInputDialog(null, "Vad ar ditt namn?");

		if (c.compare(namn1, namn2) < 0)
			JOptionPane.showMessageDialog(null, namn1 + "\n" + namn2);
		
		else if (c.compare(namn1, namn2) > 0)
			JOptionPane.showMessageDialog(null, namn2 + "\n" + namn1);
	}
}