package ToolBar;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class btn_base extends JButton {
    public btn_base(String actionImagePath) {
        try {
            // 嘗試載入圖標
            URL imageURL = getClass().getResource(actionImagePath);
            if (imageURL != null) {
                ImageIcon icon = new ImageIcon(imageURL);
                this.setIcon(icon);
                System.out.println("成功載入圖標: " + actionImagePath);
            } else {
                System.out.println("無法找到圖標: " + actionImagePath);
            }
        } catch (Exception e) {
            System.out.println("載入圖標時出錯: " + e.getMessage());
        }

        // 設置按鈕屬性
        this.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.setPreferredSize(new Dimension(50, 50)); // 設定按鈕大小
        this.setFocusPainted(false);
        this.setBorderPainted(true);
    }

    // 如果子類沒有提供圖標，可以提供一個無參構造函數
    public btn_base() {
        // 設置共用屬性
        this.setFocusPainted(false);
        this.setBorderPainted(true);
    }
}