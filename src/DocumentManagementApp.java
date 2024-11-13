import javax.swing.*;
import java.awt.*;

public class DocumentManagementApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ứng Dụng Quản Lý Tài Liệu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        
        // Tạo màu sắc và font chữ
        Color mainColor = new Color(60, 179, 113); // Xanh lá nhẹ
        Color buttonColor = new Color(34, 139, 34); // Xanh đậm
        Font buttonFont = new Font("Sans-Serif", Font.BOLD, 16);

        // Tạo panel trái chứa các nút
        JPanel sidePanel = new JPanel();
        sidePanel.setBackground(new Color(230, 230, 250)); // Màu nền sáng
        sidePanel.setLayout(new GridLayout(6, 1, 10, 10));
        
        // Tạo nút và thiết lập phong cách cho từng nút
        JButton btnHome = new JButton("TRANG CHỦ");
        JButton btnUsers = new JButton("NGƯỜI DÙNG");
        JButton btnDocuments = new JButton("TÀI LIỆU");
        JButton btnPermissions = new JButton("QUYỀN TRUY CẬP");
        JButton btnFolder = new JButton("THƯ MỤC");
        JButton btnTrash = new JButton("THÙNG RÁC");

        // Đặt màu và font chữ cho nút
        for (JButton button : new JButton[]{btnHome, btnUsers, btnDocuments, btnPermissions, btnFolder, btnTrash}) {
            button.setBackground(mainColor);
            button.setForeground(Color.WHITE);
            button.setFont(buttonFont);
            button.setFocusPainted(false);
            button.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            sidePanel.add(button);
        }
        
        // Tạo panel chính chứa phần nội dung
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);

        // Thêm các thành phần vào JFrame
        frame.setLayout(new BorderLayout());
        frame.add(sidePanel, BorderLayout.WEST);
        frame.add(mainPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
