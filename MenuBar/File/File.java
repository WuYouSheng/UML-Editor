package MenuBar.File;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class File extends JMenu {
    public File(JFrame frame){
        super("File");
        // 加入各個Menu物件
        this.add(new NewFile(frame)); // 加入 NewFile 物件
        this.add(new Exit(frame));// 加入Exit 物件
    }
}
