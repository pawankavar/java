package view;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	public MyPanel() {
		JLabel lblTitle = new JLabel("add User : ");
		JButton btnOk = new JButton("OK");
		JButton btnCancel = new JButton("Cancel");
		add(lblTitle);
		add(createFormPanel());
		add(btnOk);
		add(btnCancel);
	}

	JPanel createFormPanel() {
		JPanel p = new JPanel(new GridLayout(2, 2, 5, 5));

		JLabel lbluname = new JLabel("Username : ");
		JLabel lblPassword = new JLabel("Password : ");

		JTextField txtUname = new JTextField(15);
		JTextField txtPass = new JTextField(15);

//		p.setBackground(Color.red);

		p.add(lbluname);
		p.add(txtUname);
		p.add(lblPassword);
		p.add(txtPass);
		
		
		p.setBorder(BorderFactory.createEtchedBorder());
		return p;

	}
}
