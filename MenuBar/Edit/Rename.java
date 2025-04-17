package MenuBar.Edit;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Designed By WYSH
 */
public class Rename extends JMenuItem {
    public Rename(JFrame frame){
        super("Rename"); // 設定 JMenuItem 標題

        // 加入事件監聽
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Rename");
            }
        });
    }
}
