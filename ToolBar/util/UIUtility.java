package ToolBar.util;
import javax.swing.*;
import java.awt.*;

/**
 * UI 工具類，提供各種 UI 相關的通用方法
 */
public class UIUtility {

    /**
     * 設置工具欄按鈕之間的間距
     *
     * @param toolbar 需要設置間距的工具欄
     * @param spacing 按鈕之間的垂直間距（像素）
     */
    public static void setToolBarButtonSpacing(JToolBar toolbar, int spacing) {
        // 確保工具欄使用 BoxLayout 進行垂直排列
        if (!(toolbar.getLayout() instanceof BoxLayout)) {
            toolbar.setLayout(new BoxLayout(toolbar, BoxLayout.Y_AXIS));
        }

        // 移除所有組件
        Component[] components = toolbar.getComponents();
        toolbar.removeAll();

        // 重新添加組件，並在按鈕之間添加間距
        for (int i = 0; i < components.length; i++) {
            toolbar.add(components[i]);

            // 在每個按鈕後面添加間距（最後一個按鈕後不添加）
            if (i < components.length - 1) {
                toolbar.add(Box.createRigidArea(new Dimension(0, spacing)));
            }
        }

        // 重新驗證並重繪工具欄
        toolbar.revalidate();
        toolbar.repaint();
    }

    /**
     * 設置工具欄的邊距
     *
     * @param toolbar 需要設置邊距的工具欄
     * @param top 頂部邊距（像素）
     * @param left 左側邊距（像素）
     * @param bottom 底部邊距（像素）
     * @param right 右側邊距（像素）
     */
    public static void setToolBarMargin(JToolBar toolbar, int top, int left, int bottom, int right) {
        toolbar.setBorder(BorderFactory.createEmptyBorder(top, left, bottom, right));
    }

    /**
     * 為工具欄添加分隔線
     *
     * @param toolbar 需要添加分隔線的工具欄
     * @param height 分隔線高度（像素）
     */
    public static void addToolBarSeparator(JToolBar toolbar, int height) {
        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setMaximumSize(new Dimension(Integer.MAX_VALUE, height));
        toolbar.add(separator);
    }

    /**
     * 設置工具欄按鈕的統一尺寸
     *
     * @param toolbar 工具欄
     * @param width 按鈕寬度
     * @param height 按鈕高度
     */
    public static void setToolBarButtonSize(JToolBar toolbar, int width, int height) {
        Dimension buttonSize = new Dimension(width, height);

        for (Component comp : toolbar.getComponents()) {
            if (comp instanceof AbstractButton) {
                comp.setMinimumSize(buttonSize);
                comp.setPreferredSize(buttonSize);
                comp.setMaximumSize(buttonSize);
            }
        }
    }
}