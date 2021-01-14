package GUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ex01_jtable {

   private JFrame frame;
   private JTable table;
   private JTextField txt_name;
   private JTextField txt_java;
   private JTextField txt_iot;
   private JTextField txt_web;
   private JButton addBtn;
   private JButton removeBtn;
   private DefaultTableModel model; //JTable의 데이터를 추가하거나 삭제할 때
   private int row; //선택한 행의 위치

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               ex01_jtable window = new ex01_jtable();
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
   public ex01_jtable() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setTitle("JTable 예제");
      frame.setBounds(100, 100, 650, 400); // (x축, y축, width, height)
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      SpringLayout springLayout = new SpringLayout();
      frame.getContentPane().setLayout(springLayout);
      
      JPanel panel = new JPanel();
      springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.SOUTH, panel, 289, SpringLayout.NORTH, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.EAST, panel, 624, SpringLayout.WEST, frame.getContentPane());
      frame.getContentPane().add(panel);
      
      JPanel panel_1 = new JPanel();
      springLayout.putConstraint(SpringLayout.NORTH, panel_1, 6, SpringLayout.SOUTH, panel);
      springLayout.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, frame.getContentPane());
      springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 62, SpringLayout.SOUTH, panel);
      SpringLayout sl_panel = new SpringLayout();
      panel.setLayout(sl_panel);
      
      JScrollPane scrollPane = new JScrollPane();
      sl_panel.putConstraint(SpringLayout.NORTH, scrollPane, 10, SpringLayout.NORTH, panel);
      sl_panel.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, panel);
      sl_panel.putConstraint(SpringLayout.SOUTH, scrollPane, 269, SpringLayout.NORTH, panel);
      sl_panel.putConstraint(SpringLayout.EAST, scrollPane, 604, SpringLayout.WEST, panel);
      panel.add(scrollPane);
      
      //JTable 데이터 초기화
      //컬럼명 1차원 배열, 행 데이터는 2차원 배열
      String[] colNames = {"이름","Java", "IOT", "Web"};
      String[][] rowDatas = {
            {"김경태","80","80","70"},
            {"김운비","70","60","70"},
            {"임명진","90","50","60"}
      };
      
      
      //model객체를 통해서 데이터 추가/수정/삭제 등이 가능
      model = new DefaultTableModel(rowDatas, colNames);
      
            table = new JTable(model);
            
            //model객체를 통해서 변경작업을 하려면 현재 JTable의 정보를 초기화해줘야 한다.
             model = (DefaultTableModel) table.getModel();
            
             table.addMouseListener(new MouseAdapter() {
               @Override
               public void mouseClicked(MouseEvent arg0) {
                  //마우스로 테이블을 클릭했을 때 실행할 로직을 작성
               row = table.getSelectedRow();
               int col = table.getSelectedColumn();
               String data = table.getValueAt(row, col).toString();
               
               
               System.out.println("선택한 항목의 위치>> " +row+ "," + col);
               System.out.println("선택한 항목>> "+data);
               }
            });
   
      
      scrollPane.setViewportView(table);
      springLayout.putConstraint(SpringLayout.EAST, panel_1, 624, SpringLayout.WEST, frame.getContentPane());
      frame.getContentPane().add(panel_1);
      panel_1.setLayout(new GridLayout(1, 6, 0, 0));
      
      txt_name = new JTextField();
      panel_1.add(txt_name);
      txt_name.setColumns(10);
      
      txt_java = new JTextField();
      panel_1.add(txt_java);
      txt_java.setColumns(10);
      
      txt_iot = new JTextField();
      panel_1.add(txt_iot);
      txt_iot.setColumns(10);
      
      txt_web = new JTextField();
      panel_1.add(txt_web);
      txt_web.setColumns(10);
      
      addBtn = new JButton("\uCD94\uAC00");
      addBtn.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            //추가버튼 클릭 시, JTable에 행 데이터 추가
            //-> 먼저 사용자가 입력한 4개의 정보를 가져오기
            String name = txt_name.getText();
            String java = txt_java.getText();
            String iot = txt_iot.getText();
            String web = txt_web.getText();
            
            System.out.println(name + "/" + java +"/" + iot+"/" + web);
            
            String[] rowData = {name, java, iot, web};
            model.addRow(rowData);
            
         }
      });
      panel_1.add(addBtn);
      
      
      removeBtn = new JButton("\uC0AD\uC81C");
      removeBtn.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		model.removeRow(row);
      		System.out.println("선택한 해잉 삭제되었습니다.");
      		
      	}
      });
      panel_1.add(removeBtn);
   }
}