package Views;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class GameTimer extends Timer implements ActionListener {
    private JLabel timeLabel;
    private int remainingTime;
    private MyView game;

    public GameTimer(int delay, ActionListener listener, JLabel lbMessage2, int remainingTime) {
        super(delay, listener);
        this.timeLabel = lbMessage2;
        this.remainingTime = remainingTime;
        addActionListener(this);
    }
    public int getRemainingTime() {
        return remainingTime;
    }

   

    public void setRemainingTime(int remainingTime) {
        this.remainingTime = remainingTime;
    }

    public void actionPerformed(ActionEvent evt) {
        remainingTime--;
        int minutes = remainingTime / 60;
        int seconds = remainingTime % 60;
        timeLabel.setText(String.format("Time remaining: %02d:%02d", minutes, seconds));
//        if (remainingTime == 5) { // Khi đếm ngược tới 30 giây cuối cùng
//            timeLabel.setForeground(Color.RED); // Thay đổi màu sắc của chữ thành màu đỏ
//        }
        if (remainingTime == 0) {
            stop();
            JOptionPane.showMessageDialog(null, "Hết giờ ! Bạn đã thua");
        
            if (game != null) {
                game.checkWin();
            }
            timeLabel.setForeground(Color.BLACK); // Thay đổi màu sắc của chữ thành màu đen khi đếm ngược kết thúc
        }
//        setDelay(1000); // Giảm delay xuống còn 1000
    }
}