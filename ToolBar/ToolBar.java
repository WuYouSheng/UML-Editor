package ToolBar;

import javax.swing.*;
import java.awt.*;
import ToolBar.util.UIUtility;

public class ToolBar extends JToolBar {
    public ToolBar(){
        // 使用 BoxLayout 進行垂直排列
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // 依序新增button
        this.add(new btnSelect());
        this.add(new btnAssociationLine());
        this.add(new btnGenerationLine());
        this.add(new btnCompositionLine());
        this.add(new btnClass());
        this.add(new btnUseCase());

        // 使用工具類設置按鈕間距和邊距
        UIUtility.setToolBarButtonSpacing(this, 5);//Button 之間的距離
        UIUtility.setToolBarMargin(this, 10, 10, 10, 10);//每一個按鈕的四邊大小

    }
}