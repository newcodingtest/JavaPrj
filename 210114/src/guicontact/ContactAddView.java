package guicontact;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ContactAddView extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JTextField text_name;
	private JTextField text_age;
	private JTextField text_number;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ContactAddView dialog = new ContactAddView();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ContactAddView() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			panel_1 = new JPanel();
			panel_1.setToolTipText("\uC5F0\uB77D\uCC98\uB4F1\uB85D");
			panel_1.setBounds(12, 5, 410, 74);
			contentPanel.add(panel_1);
			SpringLayout sl_panel_1 = new SpringLayout();
			panel_1.setLayout(sl_panel_1);
			
			JLabel lblNewLabel_3 = new JLabel("\uC5F0 \uB77D \uCC98 \uB4F1 \uB85D");
			sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 10, SpringLayout.NORTH, panel_1);
			sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_3, 99, SpringLayout.WEST, panel_1);
			sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, 64, SpringLayout.NORTH, panel_1);
			sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_3, -80, SpringLayout.EAST, panel_1);
			lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 30));
			panel_1.add(lblNewLabel_3);
		}
		{
			panel_2 = new JPanel();
			panel_2.setBounds(15, 89, 197, 128);
			contentPanel.add(panel_2);
			SpringLayout sl_panel_2 = new SpringLayout();
			panel_2.setLayout(sl_panel_2);
			{
				lblNewLabel = new JLabel("\uC774\uB984");
				sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, panel_2);
				lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
				panel_2.add(lblNewLabel);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("\uB098\uC774");
				sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 16, SpringLayout.SOUTH, lblNewLabel);
				sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, lblNewLabel_1);
				sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_1, -78, SpringLayout.EAST, panel_2);
				lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
				panel_2.add(lblNewLabel_1);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("\uBC88\uD638");
				sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel);
				sl_panel_2.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -10, SpringLayout.SOUTH, panel_2);
				lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));
				panel_2.add(lblNewLabel_2);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBounds(224, 89, 198, 128);
			contentPanel.add(panel);
			SpringLayout sl_panel = new SpringLayout();
			panel.setLayout(sl_panel);
			
			text_name = new JTextField();
			sl_panel.putConstraint(SpringLayout.NORTH, text_name, 10, SpringLayout.NORTH, panel);
			sl_panel.putConstraint(SpringLayout.EAST, text_name, -39, SpringLayout.EAST, panel);
			panel.add(text_name);
			text_name.setColumns(10);
			
			text_age = new JTextField();
			sl_panel.putConstraint(SpringLayout.NORTH, text_age, 21, SpringLayout.SOUTH, text_name);
			sl_panel.putConstraint(SpringLayout.WEST, text_age, 0, SpringLayout.WEST, text_name);
			panel.add(text_age);
			text_age.setColumns(10);
			
			text_number = new JTextField();
			sl_panel.putConstraint(SpringLayout.SOUTH, text_number, -10, SpringLayout.SOUTH, panel);
			sl_panel.putConstraint(SpringLayout.EAST, text_number, 0, SpringLayout.EAST, text_name);
			panel.add(text_number);
			text_number.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addMouseListener(new MouseAdapter() {
					
					
					public void mouseClicked(MouseEvent e) {
						//버튼 클릭시. 사용자가 입력한 정보들을  db에 저장
						String name=text_name.getText(); //
						int age=Integer.parseInt(text_age.getText());  //문자열 형태로
						String number=text_number.getText();
						
						System.out.println(name);
						
						//db에 저장하기 위한 dao객체 생성
						ContactDAO dao=new ContactDAO();
						dao.addContact(new ContactVO(name,age,number));
						
						dispose();
						
						new ContactView().main(null);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
