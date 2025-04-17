package ToolBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Designed By WYSH
 */
public class btnCompositionLine extends btn_base{
    public btnCompositionLine(){
        // 調用父類構造函數，傳入特定圖標的路徑
        super("/Resource/CompositionLineIcon.png");


        // 設置這個按鈕特有的屬性
        this.setToolTipText("CompositionLine");

        // 添加動作監聽器
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 實現選擇工具的功能
                System.out.println("Composition Line Tool 被按下");
            }
        });
    }
}
