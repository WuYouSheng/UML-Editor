package Canvas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 畫布基礎類，可以在上面顯示固定的圖示
 */
public class CanvasBase extends JPanel {

    // 存儲畫布上的所有圖示
    private List<Icon> icons = new ArrayList<>();
    public CanvasBase() {
        // 設置畫布屬性
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.GRAY));
        setLayout(null); // 使用絕對定位佈局
    }

    /**
     * 添加圖示到畫布上的指定位置
     *
     * @param icon 要添加的圖示
     * @param x 圖示的 x 座標
     * @param y 圖示的 y 座標
     * @return 添加的圖示對象
     */
    public Icon addIcon(ImageIcon imageIcon, int x, int y) {
        Icon icon = new Icon(imageIcon, x, y);
        icons.add(icon);
        repaint(); // 重繪畫布以顯示新添加的圖示
        return icon;
    }

    /**
     * 從畫布上移除指定的圖示
     *
     * @param icon 要移除的圖示
     */
    public void removeIcon(Icon icon) {
        icons.remove(icon);
        repaint(); // 重繪畫布以反映變化
    }

    /**
     * 清除畫布上的所有圖示
     */
    public void clearAllIcons() {
        icons.clear();
        repaint(); // 重繪畫布
    }

    /**
     * 獲取畫布上的所有圖示
     *
     * @return 圖示列表
     */
    public List<Icon> getIcons() {
        return new ArrayList<>(icons); // 返回副本以保護內部狀態
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // 設置抗鋸齒
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // 繪製所有圖示
        for (Icon icon : icons) {
            icon.draw(g2d);
        }
    }

    /**
     * 圖示類，表示畫布上的一個圖示對象
     */
    public class Icon {
        private ImageIcon imageIcon;
        private int x;
        private int y;

        /**
         * 構造函數
         *
         * @param imageIcon 圖示的圖像
         * @param x 圖示的 x 座標
         * @param y 圖示的 y 座標
         */
        public Icon(ImageIcon imageIcon, int x, int y) {
            this.imageIcon = imageIcon;
            this.x = x;
            this.y = y;
        }

        /**
         * 繪製圖示
         *
         * @param g2d 圖形上下文
         */
        public void draw(Graphics2D g2d) {
            imageIcon.paintIcon(CanvasBase.this, g2d, x, y);
        }

        /**
         * 設置圖示的位置
         *
         * @param x 新的 x 座標
         * @param y 新的 y 座標
         */
        public void setPosition(int x, int y) {
            this.x = x;
            this.y = y;
            repaint(); // 重繪畫布以反映位置變化
        }

        /**
         * 獲取圖示的 x 座標
         *
         * @return x 座標
         */
        public int getX() {
            return x;
        }

        /**
         * 獲取圖示的 y 座標
         *
         * @return y 座標
         */
        public int getY() {
            return y;
        }

        /**
         * 獲取圖示的寬度
         *
         * @return 圖示寬度
         */
        public int getWidth() {
            return imageIcon.getIconWidth();
        }

        /**
         * 獲取圖示的高度
         *
         * @return 圖示高度
         */
        public int getHeight() {
            return imageIcon.getIconHeight();
        }

        /**
         * 判斷指定點是否在圖示內部
         *
         * @param px 點的 x 座標
         * @param py 點的 y 座標
         * @return 如果點在圖示內部則返回 true，否則返回 false
         */
        public boolean contains(int px, int py) {
            return px >= x && px <= x + getWidth() &&
                    py >= y && py <= y + getHeight();
        }
    }
}