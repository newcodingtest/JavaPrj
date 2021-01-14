package Images;

import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class exframeBackground {

    private JFrame frame;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    exframeBackground window = new exframeBackground();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public exframeBackground() {
        initialize();
    }


    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //프레임창 배경이미지 적용

        ImageIcon bg = new ImageIcon("images/label.jpg");

        JPanel background = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                g.drawImage(bg.getImage(), 0, 0, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        frame.setContentPane(background);
    }

}