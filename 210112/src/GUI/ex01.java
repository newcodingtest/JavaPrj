package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ex01 {

   private JFrame frame;
   private JLabel lbl_name;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               ex01 window = new ex01();
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
   public ex01() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.getContentPane().setBackground(Color.CYAN);
      frame.getContentPane().setForeground(Color.WHITE);
      frame.getContentPane().setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBounds(0, 0, 371, 326);
      frame.getContentPane().add(panel);
      panel.setLayout(null);
      
      lbl_name = new JLabel("");
      lbl_name.setFont(new Font("HY궁서B", Font.PLAIN, 30));
      lbl_name.setHorizontalAlignment(SwingConstants.CENTER);
      lbl_name.setBounds(0, 0, 371, 224);
      panel.add(lbl_name);
      
      JButton btn_me = new JButton("\uB0B4\uC774\uB984");
      //클릭했을때 이벤트를 처리하겠다
      btn_me.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
        	 //처리해야하는 코드는 안쪽 중괄호에 작성할 것
        	 lbl_name.setText("윤주영");
        	 
         }
      });
      btn_me.setBackground(Color.MAGENTA);
      btn_me.setBounds(10, 234, 176, 82);
      panel.add(btn_me);
      
      JButton btn_you = new JButton("\uC9DD\uAFCD\uC774\uB984");
      btn_you.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
        	 lbl_name.setText("외계인");
         }
      });
      
      
      
      btn_you.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      btn_you.setBackground(Color.CYAN);
      btn_you.setBounds(188, 234, 171, 82);
      panel.add(btn_you);
      btn_me.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      frame.setBounds(100, 100, 378, 359);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}