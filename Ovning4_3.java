import javax.swing.*;
/*
Program som räknar ut vilket betyg du fick
Alexander Blom
2017/10/16
*/

public class Ovning4_3{
	public static void main(String[] args) {
		String poangS = JOptionPane.showInputDialog(null,"Hur manga poang fick du?");
			int poang = Integer.parseInt(poangS);

			if (poang >= 45){
				JOptionPane.showMessageDialog(null,"Du fick betyget A.");
			}
			else if (poang >= 40){
				JOptionPane.showMessageDialog(null,"Du fick betyget B.");
			}
			else if (poang >= 35){
				JOptionPane.showMessageDialog(null,"Du fick betyget C.");
			}
			else if (poang >= 30){
				JOptionPane.showMessageDialog(null,"Du fick betyget D.");
			}			
			else if (poang >= 25){
				JOptionPane.showMessageDialog(null,"Du fick betyget E.");
			}
	}
}