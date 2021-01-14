package guicontact;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ContactAllView {

	private JFrame frame;
	private JTable contact__table;
	
	private DefaultTableModel model;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactAllView window = new ContactAllView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ContactAllView() {
		initialize();
	}

	private void initialize() { 
		ContactDAO dao=new ContactDAO();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 251, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 424, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(scrollPane);
		
		ArrayList<ContactVO>contacts=dao.selectContactAll();
		String[] columnName={"name","age","phone"};
		String[][]rowDatas=new String[contacts.size()][columnName.length];
		
		
		for (int row = 0;row<rowDatas.length; row++) {
			for (int col = 0; col < rowDatas[row].length; col++) {
				if(col==0) {// 0번째 열 이름 저장
					rowDatas[row][col]=contacts.get(row).getName();
				}else if(col==1) {//1번째 열 이름 저장
					rowDatas[row][col]=contacts.get(row).getAge()+"";
				}else {//2번째 열 이름 저장
					rowDatas[row][col]=contacts.get(row).getPhone();
				}
					
				}
				
			}
			
		
		model=new DefaultTableModel(rowDatas,columnName);
		contact__table = new JTable(model);
		scrollPane.setViewportView(contact__table);
	}
}
