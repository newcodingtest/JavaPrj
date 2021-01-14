package musicplayer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javazoom.jl.player.MP3Player;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MusicView {

   private JFrame frame;
   private Musicplayer mp3=new Musicplayer();
   private Music music;
   //실제로 노래를 재생시켜주는 객체 생성 -->player,jar파일에서 제공해주고있음
   private MP3Player player=new MP3Player();
   private JLabel lbl_song;

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               MusicView window = new MusicView();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   
   public MusicView() {
      initialize();
   }

   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 450, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBounds(0, 10, 414, 241);
      frame.getContentPane().add(panel);
      
      JButton btn_pre = new JButton("\uC774\uC804\uACE1");
      btn_pre.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            
            music =mp3.prePlay();
            
            if(music==null) {
               //이전곡이 없다면 팝업창을 띄우기
               //(null, 띄워주고 싶은 메세지, 팝업창 제목, 아이콘--> JOptionPane필드에 있다.
               JOptionPane.showInternalMessageDialog(null, "노래가 없습니다.", "경고창", JOptionPane.ERROR_MESSAGE);
            }else{
               player.stop();
               player.play(music.getPath());
               //lbl_song--->재생되고 있는 가수,제목,시간
               //return this.singer+"/"+this.songName+"/"+this.playTime;
               lbl_song.setText(music.toString());
              
            }
         }
      });
      btn_pre.setBounds(12, 10, 97, 61);
      btn_pre.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      panel.setLayout(null);
      panel.add(btn_pre);
      
      JButton btn_play = new JButton("\uC7AC\uC0DD");
      btn_play.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
         
         music = mp3.play();
         if(player.isPlaying()) {
            //player멈추기
            //btn_play text 재생
            player.stop();
            btn_play.setText("재생");
            
         }else {
            //btn_play text 정지
            //player 재생
            //lbl_song -> text
            player.play(music.getPath());
            btn_play.setText("정지");
            lbl_song.setText(music.toString());
         }
            
         }
        
      });
      btn_play.setBounds(159, 10, 97, 61);
      panel.add(btn_play);
      
      JButton btn_next = new JButton("\uB2E4\uC74C\uACE1");
      btn_next.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            
            music = mp3.nextPlay();
            if(music == null) {
               JOptionPane.showInternalMessageDialog(null, "노래가 없습니다.", "경고창", JOptionPane.ERROR_MESSAGE);
               
            }else {
               player.stop();
               player.play(music.getPath());
               lbl_song.setText(music.toString());
            }
         }
      });
      btn_next.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      btn_next.setBounds(305, 10, 97, 61);
      panel.add(btn_next);
      
      JButton btn_off = new JButton("\uC885\uB8CC");
      btn_off.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
         }
      });
      btn_off.setBounds(44, 170, 331, 61);
      panel.add(btn_off);
      
      lbl_song = new JLabel("");
      lbl_song.setBounds(44, 81, 331, 79);
      panel.add(lbl_song);
   }

}