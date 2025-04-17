package MenuBar.Edit;

import MenuBar.File.Exit;
import MenuBar.File.NewFile;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Edit extends JMenu {
    public Edit(JFrame frame){
        super("Edit");
        // 加入各個Menu物件
        this.add(new Rename(frame)); // 加入 Rename 物件
        this.add(new Group(frame)); // 加入 Group 物件
        this.add(new Ungroup(frame)); // 加入 ungroup 物件
        this.add(new Delete(frame)); // 加入Delete 物件
    }
}
