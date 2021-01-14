package Images;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ex_cardlayout {

	private JFrame frame;
	private CardLayout cardLayout;
	private JPanel first_panel, second_panel,third_panel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex_cardlayout window = new Ex_cardlayout();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ex_cardlayout() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		//ī�巹�̾ƿ� ��ü����
		cardLayout=new CardLayout();
		
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 73, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 424, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		
		JPanel parent = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, parent, 5, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, parent, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, parent, 178, SpringLayout.SOUTH, panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//ù���� �г� ���
				//show(�гε��� �����ϴ� �θ��г�, ����� �г��̸�);
				cardLayout.show(parent, "first");
			}
		});
		panel.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cardLayout.show(parent,"second");
				//�ι��� �г� ���
			}
		});
		panel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// ����° �ҷ� ���
				cardLayout.show(parent,"third");
			}
		});
		panel.add(btn3);
		springLayout.putConstraint(SpringLayout.EAST, parent, 424, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(parent);
		parent.setLayout(cardLayout);
		
		first_panel = new JPanel();
		parent.add(first_panel, "first");
		
		JLabel lblNewLabel = new JLabel("1\uBC88\uD654\uBA74");
		first_panel.add(lblNewLabel);
		
		second_panel = new JPanel();
		parent.add(second_panel, "second");
		
		JLabel lblNewLabel_1 = new JLabel("2\uBC88\uD654\uBA74");
		second_panel.add(lblNewLabel_1);
		
		third_panel = new JPanel();
		parent.add(third_panel, "third");
		
		JLabel lblNewLabel_2 = new JLabel("3\uBC88\uD654\uBA74");
		third_panel.add(lblNewLabel_2);
	}
}