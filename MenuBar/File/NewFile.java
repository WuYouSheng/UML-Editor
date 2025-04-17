package MenuBar.File;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewFile extends JMenuItem{
    // 建構子
    public NewFile(JFrame frame) {
        super("New File"); // 設定 JMenuItem 標題
        //System.out.println("New File");

        // 加入事件監聽
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "New File Clicked");
            }
        });
    }
}
