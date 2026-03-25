import javax.swing.*;

public class 숫자야구게임 extends JFrame{
	JTextArea ta = new JTextArea();
	tf
	start
	end
	
	public 숫자야구게임() {
		JScrollPane js = new JScrollPane();
		JPanel p = new JPanel();
		p.add(tf); p.add(start); p.add(end);
		ta.setEditable(false);
		tf.setEnable(false);
		add("Center",js);
		add("South",p);
		setSize(350,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		숫자야구게임 a = new 숫자야구게임();
	}
}
