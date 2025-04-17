package ToolBar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class btnSelect extends btn_base {
    public btnSelect() {
        // 調用父類構造函數，傳入特定圖標的路徑
        super("/Resource/SelectIcon.png");


        // 設置這個按鈕特有的屬性
        this.setToolTipText("Select");

        // 添加動作監聽器
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 實現選擇工具的功能
                System.out.println("Selection 被按下");
            }
        });
    }
}