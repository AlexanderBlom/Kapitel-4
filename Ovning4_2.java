import javax.swing.*;
/*
Program som bestämmer om årskort eller biljett är billigare.
Alexander Blom
2017/10/09
*/
public class Ovning4_2{
	public static void main(String[] args) {
		String arsKortS = JOptionPane.showInputDialog(null, "Vad kostar ett arskort?");
		int arsKort = Integer.parseInt(arsKortS);

		String biljettS = JOptionPane.showInputDialog(null, "Vad kostar en biljett?");
		int biljett = Integer.parseInt(biljettS);

		String besokS = JOptionPane.showInputDialog(null, "Hur manga ganger ska du ga till gymmet?");
		int besok = Integer.parseInt(besokS);

		int biljettArsKostnad = biljett * besok;

		if (arsKort < biljettArsKostnad)
			JOptionPane.showMessageDialog(null, "Ett arskort blir billigare.");
		else
			JOptionPane.showMessageDialog(null, "Att kopa biljetter blir billigare.");

	}
}