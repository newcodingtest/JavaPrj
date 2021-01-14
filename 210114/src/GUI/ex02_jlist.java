package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class ex02_jlist {

	private JFrame frame;
	private JTextField txt_msg;
	private JList list;
	private JLabel lbl_text;
//	==========================================
	
	
	private DefaultListModel model; //
	private int row;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex02_jlist window = new ex02_jlist();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ex02_jlist() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.menu);
		frame.setBounds(100, 100, 650, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 265, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 306, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.control);
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 17, SpringLayout.SOUTH, scrollPane);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 86, SpringLayout.SOUTH, scrollPane);
		
		//===============================
		//JList를 제어하기 위하 model객체 생성
		model =new DefaultListModel();
		 list = new JList(model);
		list.addMouseListener(new MouseAdapter() {	
			@Override
			public void mouseClicked(MouseEvent e) {
			String item=list.getSelectedValue().toString(); //list를 클릭했을 때 데이터 가져오기
			
			//Jlabel에 출력
			lbl_text.setText(item);
			
		}
	});
		list.setBackground(SystemColor.activeCaption);
		list.setForeground(Color.WHITE);
		model=(DefaultListModel) list.getModel();
		//===============================
		
		scrollPane.setViewportView(list);
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 624, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		txt_msg = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, txt_msg, 17, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, txt_msg, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, txt_msg, -10, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, txt_msg, 362, SpringLayout.WEST, panel_1);
		panel_1.add(txt_msg);
		txt_msg.setColumns(10);
		//===========================================================
		JButton addBtn = new JButton("\uD56D\uBAA9\uCD94\uAC00");
		addBtn.setForeground(SystemColor.textHighlightText);
		addBtn.setBackground(SystemColor.controlText);
		addBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//사용자가 입력한 데이터를 콘솔창에 출력하시오.
				
			String data=txt_msg.getText();
			
			System.out.println(data);
			
			//클릭시, list에 데이터 추가하기
			model.addElement(data);
			}
		});
		
		//===========================================================
		addBtn.setFont(new Font("바탕체", Font.BOLD, 15));
		sl_panel_1.putConstraint(SpringLayout.NORTH, addBtn, 0, SpringLayout.NORTH, txt_msg);
		sl_panel_1.putConstraint(SpringLayout.WEST, addBtn, 23, SpringLayout.EAST, txt_msg);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, addBtn, 0, SpringLayout.SOUTH, txt_msg);
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		panel_1.add(addBtn);
		
		JButton removeBtn = new JButton("\uD56D\uBAA9\uC0AD\uC81C");
		removeBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//list를 클릭했을 때 데이터 가져오기
				row=list.getSelectedIndex();
				model.remove(row);
				
			}
		});
		removeBtn.setForeground(SystemColor.textHighlightText);
		removeBtn.setBackground(SystemColor.controlText);
		removeBtn.setFont(new Font("바탕체", Font.BOLD, 15));
		sl_panel_1.putConstraint(SpringLayout.EAST, addBtn, -6, SpringLayout.WEST, removeBtn);
		sl_panel_1.putConstraint(SpringLayout.EAST, removeBtn, -23, SpringLayout.EAST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, removeBtn, 491, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.NORTH, removeBtn, 0, SpringLayout.NORTH, txt_msg);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, removeBtn, 0, SpringLayout.SOUTH, txt_msg);
		panel_1.add(removeBtn);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 6, SpringLayout.EAST, scrollPane);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -17, SpringLayout.NORTH, panel_1);
		springLayout.putConstraint(SpringLayout.EAST, panel, 318, SpringLayout.EAST, scrollPane);
		frame.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		 lbl_text = new JLabel("\uD56D\uBAA9\uC774 \uCD9C\uB825\uB429\uB2C8\uB2E4");
		 lbl_text.setFont(new Font("굴림", Font.BOLD, 25));
		sl_panel.putConstraint(SpringLayout.NORTH, lbl_text, 79, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lbl_text, 23, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lbl_text, 171, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lbl_text, -58, SpringLayout.EAST, panel);
		panel.add(lbl_text);
	}
}
