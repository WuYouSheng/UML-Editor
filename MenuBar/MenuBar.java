package MenuBar;

import MenuBar.Edit.Edit;
import MenuBar.File.File;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar extends JMenuBar {
    //Constructor
    public MenuBar(JFrame frame) {
        this.add(new File(frame)); //新增File Item
        this.add(new Edit(frame)); //新增Edit Item
    }
}