import javax.swing.*;
import java.awt.*;
import MenuBar.MenuBar;
import ToolBar.ToolBar;

public class UMLEditor {
    private JPanel UMLEditor;

    // Constructor
    public UMLEditor() {
        UMLEditor = new JPanel(new BorderLayout());

        //設定ToolBar
        ToolBar toolbar = new ToolBar();
        UMLEditor.add(toolbar, BorderLayout.WEST);
    }

    public JPanel getPanel() {
        return UMLEditor;
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("UML Editor");

        // 設定 MenuBar
        frame.setJMenuBar(new MenuBar(frame));


        // 建立 UMLEditor 並取得 JPanel
        UMLEditor editor = new UMLEditor();
        frame.setContentPane(editor.getPanel());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}