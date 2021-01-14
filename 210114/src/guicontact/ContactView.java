package guicontact;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class ContactView {

	private JFrame frame;
	private JLabel lbl_name, lbl_age, lbl_phone;
	private JButton addBtn, deleteBtn,selectAllBtn;
	private JList contact_list;
	private DefaultListModel model;
	private int pos;
	private String selectName;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactView window = new ContactView();
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
	public ContactView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 450);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//현재창 다시 마지막에 열린 창만 닫힘
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		
		JPanel panel_btn = new JPanel();
		springLayout.putConstraint(SpringLayout.EAST, panel, 0, SpringLayout.EAST, panel_btn);
		springLayout.putConstraint(SpringLayout.NORTH, panel_btn, -109, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_btn, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_btn, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_btn, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_btn);
		
		JPanel panel_scroll = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_scroll, 65, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_scroll, -6, SpringLayout.NORTH, panel_btn);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -6, SpringLayout.NORTH, panel_scroll);
		springLayout.putConstraint(SpringLayout.WEST, panel_scroll, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_scroll, -290, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_scroll);
		
		JPanel panel_info = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_info, 6, SpringLayout.SOUTH, panel);
		
		JLabel lblNewLabel_3 = new JLabel("\uC804\uD654\uBC88\uD638\uBD80");
		lblNewLabel_3.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 36));
		panel.add(lblNewLabel_3);
		springLayout.putConstraint(SpringLayout.WEST, panel_info, 6, SpringLayout.EAST, panel_scroll);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_info, -6, SpringLayout.NORTH, panel_btn);
		SpringLayout sl_panel_scroll = new SpringLayout();
		panel_scroll.setLayout(sl_panel_scroll);
		
		JScrollPane scrollPane = new JScrollPane();
		sl_panel_scroll.putConstraint(SpringLayout.NORTH, scrollPane, 10, SpringLayout.NORTH, panel_scroll);
		sl_panel_scroll.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, panel_scroll);
		sl_panel_scroll.putConstraint(SpringLayout.SOUTH, scrollPane, 221, SpringLayout.NORTH, panel_scroll);
		sl_panel_scroll.putConstraint(SpringLayout.EAST, scrollPane, 274, SpringLayout.WEST, panel_scroll);
		panel_scroll.add(scrollPane);
		
		//DB에서  연락처 목록 가져오기
		ContactDAO dao = new ContactDAO();
		ArrayList<ContactVO> contacts = dao.selectContactAll();

		
		//연락처 목록 출력
		model = new DefaultListModel();
		contact_list = new JList(model);
		model = (DefaultListModel)contact_list.getModel();
		
		//DB에서 연락처의 이름만 가져오기
		for(int i=0; i<contacts.size(); i++) { // contact어레이 리스트에 select문 결과를 다 담고, 어레이리스트 길이만큼 반복
			String name = contacts.get(i).getName(); // i번째 인덱스에서 Name만 추출
			model.addElement(name); // 추출한 이름을 name이라는문자열 변수에 저장후 이를 추가
		}
		
		contact_list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//선택한 항목의 위치, 이름을 변수에 저장
				pos = contact_list.getSelectedIndex();
				selectName = contact_list.getSelectedValue().toString();
				//선택한 항목의 이름 나이 번호를 가져오기 위해서
				ContactVO contact = contacts.get(pos);
				//JLabel에 이름 나이 번호 출력
				lbl_name.setText(contact.getName());
				lbl_age.setText(contact.getAge()+"");
				lbl_phone.setText(contact.getPhone());
			}
		});



//		model.addElement("홍길동");
		
		scrollPane.setViewportView(contact_list);
		springLayout.putConstraint(SpringLayout.EAST, panel_info, -10, SpringLayout.EAST, frame.getContentPane());
		panel_btn.setLayout(new GridLayout(1, 0, 0, 0));
		
		addBtn = new JButton("\uC5F0\uB77D\uCC98 \uCD94\uAC00");
		addBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			frame.dispose();
			 new ContactAddView().main(null);
			}
		});
		addBtn.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_btn.add(addBtn);
		
		selectAllBtn = new JButton("\uC5F0\uB77D\uCC98 select");
		selectAllBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//연락처 전체정보를 보여주는 ContactAllView창 띄우기
				new ContactAllView().main(null);
				
			}
		});
		selectAllBtn.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		panel_btn.add(selectAllBtn);
		
		deleteBtn = new JButton("\uC5F0\uB77D\uCC98 \uC0AD\uC81C");
		deleteBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//선택한 항목의 연락처를 삭제
				model.remove(pos);
				//DB에 있는 연락처 삭제
				dao.deleteContact(selectName);
				
			}
		});
		deleteBtn.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		panel_btn.add(deleteBtn);
		frame.getContentPane().add(panel_info);
		panel_info.setLayout(new GridLayout(3, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("\uC774  \uB984");
		lblNewLabel.setFont(new Font("HY견고딕", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_info.add(lblNewLabel);
		
		lbl_name = new JLabel("-");
		lbl_name.setHorizontalAlignment(SwingConstants.CENTER);
		panel_info.add(lbl_name);
		
		JLabel lblNewLabel_4 = new JLabel("\uB098  \uC774");
		lblNewLabel_4.setFont(new Font("HY견고딕", Font.PLAIN, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_info.add(lblNewLabel_4);
		
		lbl_age = new JLabel("-");
		lbl_age.setHorizontalAlignment(SwingConstants.CENTER);
		panel_info.add(lbl_age);
		
		JLabel lblNewLabel_2_1 = new JLabel("\uC9C1  \uC5C5");
		lblNewLabel_2_1.setFont(new Font("HY견고딕", Font.PLAIN, 15));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_info.add(lblNewLabel_2_1);
		
		lbl_phone = new JLabel("-");
		lbl_phone.setHorizontalAlignment(SwingConstants.CENTER);
		panel_info.add(lbl_phone);
	}
}
