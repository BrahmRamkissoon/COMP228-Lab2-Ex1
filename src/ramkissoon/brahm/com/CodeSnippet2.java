package ramkissoon.brahm.com;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class CodeSnippet2 {
	public static void main(String[] args) 
    {
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(new JRadioButton("option1"));
		group1.add(new JRadioButton("option2"));
		group1.add(new JRadioButton("option3"));
		group1.add(new JRadioButton("option4"));

		JPanel panel = new JPanel();
		panel.add(new JRadioButton("radio"));
		panel.add(new JRadioButton("radio2"));
		panel.add(new JRadioButton("radio3"));
		panel.add(new JRadioButton("radio4"));
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		JOptionPane.showOptionDialog(null, panel,
		    "Radio Test", JOptionPane.OK_OPTION,
		    JOptionPane.QUESTION_MESSAGE, null, null, panel);


    }


}
