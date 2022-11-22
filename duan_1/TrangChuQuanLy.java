package duan_1;

import java.awt.CardLayout;
import java.awt.Color;

public class TrangChuQuanLy extends javax.swing.JFrame {
    public TrangChuQuanLy() {
        initComponents();
        CardLayout layout = (CardLayout) GiaoDienQuanLy.getLayout();
        layout.show(GiaoDienQuanLy, "card_TrangChinh");
        TrangChinh.setBackground(Color.gray);
        DiemDanh.setBackground(Color.orange);
        NhanVien.setBackground(Color.orange);
        TaiKhoan.setBackground(Color.orange);
        Luong.setBackground(Color.orange);
        SanPham.setBackground(Color.orange);
        GoiMon.setBackground(Color.orange);
        HoaDon.setBackground(Color.orange);
        KhuyenMai.setBackground(Color.orange);
        ThongKe.setBackground(Color.orange);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QuanLyQuanSinhTo = new javax.swing.JPanel();
        Menu_QuanLy = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ThongKe = new javax.swing.JLabel();
        KhuyenMai = new javax.swing.JLabel();
        HoaDon = new javax.swing.JLabel();
        GoiMon = new javax.swing.JLabel();
        SanPham = new javax.swing.JLabel();
        Luong = new javax.swing.JLabel();
        TaiKhoan = new javax.swing.JLabel();
        NhanVien = new javax.swing.JLabel();
        DiemDanh = new javax.swing.JLabel();
        TrangChinh = new javax.swing.JLabel();
        lblBG_MenuQuanLy = new javax.swing.JLabel();
        GiaoDienQuanLy = new javax.swing.JPanel();
        PN_TrangChinh = new javax.swing.JPanel();
        BG_GiaoDienQuanLy = new javax.swing.JLabel();
        BG_Nen = new javax.swing.JLabel();
        PN_DangNhap = new javax.swing.JPanel();
        BG_GiaoDienQuanLy1 = new javax.swing.JLabel();
        PN_DiemDanh = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        BG_GiaoDienQuanLy2 = new javax.swing.JLabel();
        PN_NhanVien = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        BG_GiaoDienQuanLy3 = new javax.swing.JLabel();
        PN_TaiKhoan = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        BG_GiaoDienQuanLy4 = new javax.swing.JLabel();
        PN_Luong = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        BG_GiaoDienQuanLy5 = new javax.swing.JLabel();
        PN_SanPham = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        BG_GiaoDienQuanLy6 = new javax.swing.JLabel();
        PN_GoiMon = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        BG_GiaoDienQuanLy7 = new javax.swing.JLabel();
        PN_HoaDon = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        BG_GiaoDienQuanLy8 = new javax.swing.JLabel();
        PN_KhuyenMai = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        BG_GiaoDienQuanLy9 = new javax.swing.JLabel();
        PN_ThongKe = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        BG_GiaoDienQuanLy10 = new javax.swing.JLabel();
        PN_DoiMatKhau = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        BG_GiaoDienQuanLy11 = new javax.swing.JLabel();
        PN_QuenMatKhau = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        BG_GiaoDienQuanLy12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MenuTren = new javax.swing.JMenuBar();
        Menu_CaiDat = new javax.swing.JMenu();
        DoiMatKhau = new javax.swing.JMenuItem();
        DangXuat = new javax.swing.JMenuItem();
        Thoat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý quán sinh tố");
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        QuanLyQuanSinhTo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu_QuanLy.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setOpaque(true);
        Menu_QuanLy.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 10, 90));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setOpaque(true);
        Menu_QuanLy.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 10, 90));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setOpaque(true);
        Menu_QuanLy.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 10, 90));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setOpaque(true);
        Menu_QuanLy.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 10, 90));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setOpaque(true);
        Menu_QuanLy.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 10, 90));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setOpaque(true);
        Menu_QuanLy.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 10, 90));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setOpaque(true);
        Menu_QuanLy.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 10, 90));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        Menu_QuanLy.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 10, 90));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setOpaque(true);
        Menu_QuanLy.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 10, 90));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Mã Nhân Viên:");
        Menu_QuanLy.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 30, -1, -1));

        ThongKe.setBackground(new java.awt.Color(102, 102, 102));
        ThongKe.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ThongKe.setForeground(new java.awt.Color(255, 255, 255));
        ThongKe.setText("  Thống Kê");
        ThongKe.setOpaque(true);
        ThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThongKeMouseClicked(evt);
            }
        });
        Menu_QuanLy.add(ThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 0, 150, 90));

        KhuyenMai.setBackground(new java.awt.Color(102, 102, 102));
        KhuyenMai.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        KhuyenMai.setForeground(new java.awt.Color(255, 255, 255));
        KhuyenMai.setText(" Khuyến Mãi");
        KhuyenMai.setOpaque(true);
        KhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KhuyenMaiMouseClicked(evt);
            }
        });
        Menu_QuanLy.add(KhuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 140, 90));

        HoaDon.setBackground(new java.awt.Color(102, 102, 102));
        HoaDon.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        HoaDon.setForeground(new java.awt.Color(255, 255, 255));
        HoaDon.setText("   Hóa Đơn");
        HoaDon.setOpaque(true);
        HoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HoaDonMouseClicked(evt);
            }
        });
        Menu_QuanLy.add(HoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 140, 90));

        GoiMon.setBackground(new java.awt.Color(102, 102, 102));
        GoiMon.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        GoiMon.setForeground(new java.awt.Color(255, 255, 255));
        GoiMon.setText("   Gọi Món");
        GoiMon.setOpaque(true);
        GoiMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoiMonMouseClicked(evt);
            }
        });
        Menu_QuanLy.add(GoiMon, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 140, 90));

        SanPham.setBackground(new java.awt.Color(102, 102, 102));
        SanPham.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SanPham.setForeground(new java.awt.Color(255, 255, 255));
        SanPham.setText("  Sản Phẩm");
        SanPham.setOpaque(true);
        SanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SanPhamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SanPhamMouseEntered(evt);
            }
        });
        Menu_QuanLy.add(SanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 140, 90));

        Luong.setBackground(new java.awt.Color(102, 102, 102));
        Luong.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Luong.setForeground(new java.awt.Color(255, 255, 255));
        Luong.setText("    Lương");
        Luong.setOpaque(true);
        Luong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LuongMouseClicked(evt);
            }
        });
        Menu_QuanLy.add(Luong, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 140, 90));

        TaiKhoan.setBackground(new java.awt.Color(102, 102, 102));
        TaiKhoan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        TaiKhoan.setText("  Tài Khoản");
        TaiKhoan.setOpaque(true);
        TaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TaiKhoanMouseClicked(evt);
            }
        });
        Menu_QuanLy.add(TaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 140, 90));

        NhanVien.setBackground(new java.awt.Color(102, 102, 102));
        NhanVien.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NhanVien.setForeground(new java.awt.Color(255, 255, 255));
        NhanVien.setText("  Nhân Viên");
        NhanVien.setOpaque(true);
        NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhanVienMouseClicked(evt);
            }
        });
        Menu_QuanLy.add(NhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 140, 90));

        DiemDanh.setBackground(new java.awt.Color(102, 102, 102));
        DiemDanh.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DiemDanh.setForeground(new java.awt.Color(255, 255, 255));
        DiemDanh.setText("  Điểm Danh");
        DiemDanh.setOpaque(true);
        DiemDanh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DiemDanhMouseClicked(evt);
            }
        });
        Menu_QuanLy.add(DiemDanh, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 140, 90));

        TrangChinh.setBackground(new java.awt.Color(102, 102, 102));
        TrangChinh.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TrangChinh.setForeground(new java.awt.Color(255, 255, 255));
        TrangChinh.setText("Trang Chính");
        TrangChinh.setOpaque(true);
        TrangChinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TrangChinhMouseClicked(evt);
            }
        });
        Menu_QuanLy.add(TrangChinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 90));

        lblBG_MenuQuanLy.setBackground(new java.awt.Color(255, 255, 255));
        lblBG_MenuQuanLy.setOpaque(true);
        Menu_QuanLy.add(lblBG_MenuQuanLy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 100));

        QuanLyQuanSinhTo.add(Menu_QuanLy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1900, 90));

        GiaoDienQuanLy.setLayout(new java.awt.CardLayout());

        PN_TrangChinh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BG_GiaoDienQuanLy.setBackground(new java.awt.Color(255, 153, 51));
        BG_GiaoDienQuanLy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bộ_Icon/TrangChinh.gif"))); // NOI18N
        BG_GiaoDienQuanLy.setOpaque(true);
        PN_TrangChinh.add(BG_GiaoDienQuanLy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1880, 910));

        BG_Nen.setBackground(new java.awt.Color(255, 255, 255));
        BG_Nen.setOpaque(true);
        PN_TrangChinh.add(BG_Nen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 930));

        GiaoDienQuanLy.add(PN_TrangChinh, "card_TrangChinh");

        PN_DangNhap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BG_GiaoDienQuanLy1.setBackground(new java.awt.Color(255, 255, 255));
        BG_GiaoDienQuanLy1.setOpaque(true);
        PN_DangNhap.add(BG_GiaoDienQuanLy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 930));

        GiaoDienQuanLy.add(PN_DangNhap, "card_DangNhap");

        PN_DiemDanh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("jButton2");
        PN_DiemDanh.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 700, -1, 30));

        BG_GiaoDienQuanLy2.setBackground(new java.awt.Color(255, 255, 255));
        BG_GiaoDienQuanLy2.setOpaque(true);
        PN_DiemDanh.add(BG_GiaoDienQuanLy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 930));

        GiaoDienQuanLy.add(PN_DiemDanh, "card_DiemDanh");

        PN_NhanVien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("jButton2");
        PN_NhanVien.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 700, -1, 30));

        BG_GiaoDienQuanLy3.setBackground(new java.awt.Color(255, 255, 255));
        BG_GiaoDienQuanLy3.setOpaque(true);
        PN_NhanVien.add(BG_GiaoDienQuanLy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 930));

        GiaoDienQuanLy.add(PN_NhanVien, "card_NhanVien");

        PN_TaiKhoan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setText("jButton2");
        PN_TaiKhoan.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 700, -1, 30));

        BG_GiaoDienQuanLy4.setBackground(new java.awt.Color(255, 255, 255));
        BG_GiaoDienQuanLy4.setOpaque(true);
        PN_TaiKhoan.add(BG_GiaoDienQuanLy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 930));

        GiaoDienQuanLy.add(PN_TaiKhoan, "card_TaiKhoan");

        PN_Luong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setText("jButton2");
        PN_Luong.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 700, -1, 30));

        BG_GiaoDienQuanLy5.setBackground(new java.awt.Color(255, 255, 255));
        BG_GiaoDienQuanLy5.setOpaque(true);
        PN_Luong.add(BG_GiaoDienQuanLy5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 930));

        GiaoDienQuanLy.add(PN_Luong, "card_Luong");

        PN_SanPham.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setText("jButton2");
        PN_SanPham.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 700, -1, 30));

        BG_GiaoDienQuanLy6.setBackground(new java.awt.Color(255, 255, 255));
        BG_GiaoDienQuanLy6.setOpaque(true);
        PN_SanPham.add(BG_GiaoDienQuanLy6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 930));

        GiaoDienQuanLy.add(PN_SanPham, "card_SanPham");

        PN_GoiMon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setText("jButton2");
        PN_GoiMon.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 700, -1, 30));

        BG_GiaoDienQuanLy7.setBackground(new java.awt.Color(255, 255, 255));
        BG_GiaoDienQuanLy7.setOpaque(true);
        PN_GoiMon.add(BG_GiaoDienQuanLy7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 930));

        GiaoDienQuanLy.add(PN_GoiMon, "card_GoiMon");

        PN_HoaDon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setText("jButton2");
        PN_HoaDon.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 700, -1, 30));

        BG_GiaoDienQuanLy8.setBackground(new java.awt.Color(255, 255, 255));
        BG_GiaoDienQuanLy8.setOpaque(true);
        PN_HoaDon.add(BG_GiaoDienQuanLy8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 930));

        GiaoDienQuanLy.add(PN_HoaDon, "card_HoaDon");

        PN_KhuyenMai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setText("jButton2");
        PN_KhuyenMai.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 700, -1, 30));

        BG_GiaoDienQuanLy9.setBackground(new java.awt.Color(255, 255, 255));
        BG_GiaoDienQuanLy9.setOpaque(true);
        PN_KhuyenMai.add(BG_GiaoDienQuanLy9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 930));

        GiaoDienQuanLy.add(PN_KhuyenMai, "card_KhuyenMai");

        PN_ThongKe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton11.setText("jButton2");
        PN_ThongKe.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 700, -1, 30));

        BG_GiaoDienQuanLy10.setBackground(new java.awt.Color(255, 255, 255));
        BG_GiaoDienQuanLy10.setOpaque(true);
        PN_ThongKe.add(BG_GiaoDienQuanLy10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 930));

        GiaoDienQuanLy.add(PN_ThongKe, "card_ThongKe");

        PN_DoiMatKhau.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton12.setText("jButton2");
        PN_DoiMatKhau.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 700, -1, 30));

        BG_GiaoDienQuanLy11.setBackground(new java.awt.Color(255, 255, 255));
        BG_GiaoDienQuanLy11.setOpaque(true);
        PN_DoiMatKhau.add(BG_GiaoDienQuanLy11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 930));

        GiaoDienQuanLy.add(PN_DoiMatKhau, "card_DoiMatKhau");

        PN_QuenMatKhau.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton13.setText("jButton2");
        PN_QuenMatKhau.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1770, 700, -1, 30));

        BG_GiaoDienQuanLy12.setBackground(new java.awt.Color(255, 255, 255));
        BG_GiaoDienQuanLy12.setOpaque(true);
        PN_QuenMatKhau.add(BG_GiaoDienQuanLy12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 930));

        GiaoDienQuanLy.add(PN_QuenMatKhau, "card_QuenMatKhau");

        QuanLyQuanSinhTo.add(GiaoDienQuanLy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1900, 930));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setOpaque(true);
        QuanLyQuanSinhTo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1940, 1060));

        getContentPane().add(QuanLyQuanSinhTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2220, 1082));

        Menu_CaiDat.setText("Cài đặt");

        DoiMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        DoiMatKhau.setText("Đổi mật khẩu");
        DoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoiMatKhauActionPerformed(evt);
            }
        });
        Menu_CaiDat.add(DoiMatKhau);

        DangXuat.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        DangXuat.setText("Đăng Xuất");
        DangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangXuatActionPerformed(evt);
            }
        });
        Menu_CaiDat.add(DangXuat);

        Thoat.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Thoat.setText("Thoát");
        Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoatActionPerformed(evt);
            }
        });
        Menu_CaiDat.add(Thoat);

        MenuTren.add(Menu_CaiDat);

        setJMenuBar(MenuTren);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoiMatKhauActionPerformed
    }//GEN-LAST:event_DoiMatKhauActionPerformed

    private void DangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangXuatActionPerformed
    }//GEN-LAST:event_DangXuatActionPerformed

    private void ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ThoatActionPerformed

    private void TrangChinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrangChinhMouseClicked
        CardLayout layout = (CardLayout) GiaoDienQuanLy.getLayout();
        layout.show(GiaoDienQuanLy, "card_TrangChinh");
        TrangChinh.setBackground(Color.gray);
        DiemDanh.setBackground(Color.orange);
        NhanVien.setBackground(Color.orange);
        TaiKhoan.setBackground(Color.orange);
        Luong.setBackground(Color.orange);
        SanPham.setBackground(Color.orange);
        GoiMon.setBackground(Color.orange);
        HoaDon.setBackground(Color.orange);
        KhuyenMai.setBackground(Color.orange);
        ThongKe.setBackground(Color.orange);
    }//GEN-LAST:event_TrangChinhMouseClicked

    private void DiemDanhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiemDanhMouseClicked
        CardLayout layout = (CardLayout) GiaoDienQuanLy.getLayout();
        layout.show(GiaoDienQuanLy, "card_DiemDanh");
        TrangChinh.setBackground(Color.orange);
        DiemDanh.setBackground(Color.gray);
        NhanVien.setBackground(Color.orange);
        TaiKhoan.setBackground(Color.orange);
        Luong.setBackground(Color.orange);
        SanPham.setBackground(Color.orange);
        GoiMon.setBackground(Color.orange);
        HoaDon.setBackground(Color.orange);
        KhuyenMai.setBackground(Color.orange);
        ThongKe.setBackground(Color.orange);
    }//GEN-LAST:event_DiemDanhMouseClicked

    private void NhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhanVienMouseClicked
        CardLayout layout = (CardLayout) GiaoDienQuanLy.getLayout();
        layout.show(GiaoDienQuanLy, "card_NhanVien");
        TrangChinh.setBackground(Color.orange);
        DiemDanh.setBackground(Color.orange);
        NhanVien.setBackground(Color.gray);
        TaiKhoan.setBackground(Color.orange);
        Luong.setBackground(Color.orange);
        SanPham.setBackground(Color.orange);
        GoiMon.setBackground(Color.orange);
        HoaDon.setBackground(Color.orange);
        KhuyenMai.setBackground(Color.orange);
        ThongKe.setBackground(Color.orange);
    }//GEN-LAST:event_NhanVienMouseClicked

    private void TaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TaiKhoanMouseClicked
        CardLayout layout = (CardLayout) GiaoDienQuanLy.getLayout();
        layout.show(GiaoDienQuanLy, "card_TaiKhoan");
        TrangChinh.setBackground(Color.orange);
        DiemDanh.setBackground(Color.orange);
        NhanVien.setBackground(Color.orange);
        TaiKhoan.setBackground(Color.gray);
        Luong.setBackground(Color.orange);
        SanPham.setBackground(Color.orange);
        GoiMon.setBackground(Color.orange);
        HoaDon.setBackground(Color.orange);
        KhuyenMai.setBackground(Color.orange);
        ThongKe.setBackground(Color.orange);
    }//GEN-LAST:event_TaiKhoanMouseClicked

    private void LuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LuongMouseClicked
        CardLayout layout = (CardLayout) GiaoDienQuanLy.getLayout();
        layout.show(GiaoDienQuanLy, "card_Luong");
        TrangChinh.setBackground(Color.orange);
        DiemDanh.setBackground(Color.orange);
        NhanVien.setBackground(Color.orange);
        TaiKhoan.setBackground(Color.orange);
        Luong.setBackground(Color.gray);
        SanPham.setBackground(Color.orange);
        GoiMon.setBackground(Color.orange);
        HoaDon.setBackground(Color.orange);
        KhuyenMai.setBackground(Color.orange);
        ThongKe.setBackground(Color.orange);
    }//GEN-LAST:event_LuongMouseClicked

    private void SanPhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SanPhamMouseEntered
       
    }//GEN-LAST:event_SanPhamMouseEntered

    private void SanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SanPhamMouseClicked
        CardLayout layout = (CardLayout) GiaoDienQuanLy.getLayout();
        layout.show(GiaoDienQuanLy, "card_SanPham");
        TrangChinh.setBackground(Color.orange);
        DiemDanh.setBackground(Color.orange);
        NhanVien.setBackground(Color.orange);
        TaiKhoan.setBackground(Color.orange);
        Luong.setBackground(Color.orange);
        SanPham.setBackground(Color.gray);
        GoiMon.setBackground(Color.orange);
        HoaDon.setBackground(Color.orange);
        KhuyenMai.setBackground(Color.orange);
        ThongKe.setBackground(Color.orange);
    }//GEN-LAST:event_SanPhamMouseClicked

    private void GoiMonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoiMonMouseClicked
        CardLayout layout = (CardLayout) GiaoDienQuanLy.getLayout();
        layout.show(GiaoDienQuanLy, "card_GoiMon");
        TrangChinh.setBackground(Color.orange);
        DiemDanh.setBackground(Color.orange);
        NhanVien.setBackground(Color.orange);
        TaiKhoan.setBackground(Color.orange);
        Luong.setBackground(Color.orange);
        SanPham.setBackground(Color.orange);
        GoiMon.setBackground(Color.gray);
        HoaDon.setBackground(Color.orange);
        KhuyenMai.setBackground(Color.orange);
        ThongKe.setBackground(Color.orange);
    }//GEN-LAST:event_GoiMonMouseClicked

    private void HoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoaDonMouseClicked
        CardLayout layout = (CardLayout) GiaoDienQuanLy.getLayout();
        layout.show(GiaoDienQuanLy, "card_HoaDon");
        TrangChinh.setBackground(Color.orange);
        DiemDanh.setBackground(Color.orange);
        NhanVien.setBackground(Color.orange);
        TaiKhoan.setBackground(Color.orange);
        Luong.setBackground(Color.orange);
        SanPham.setBackground(Color.orange);
        GoiMon.setBackground(Color.orange);
        HoaDon.setBackground(Color.gray);
        KhuyenMai.setBackground(Color.orange);
        ThongKe.setBackground(Color.orange);
    }//GEN-LAST:event_HoaDonMouseClicked

    private void KhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KhuyenMaiMouseClicked
        CardLayout layout = (CardLayout) GiaoDienQuanLy.getLayout();
        layout.show(GiaoDienQuanLy, "card_KhuyenMai");
        TrangChinh.setBackground(Color.orange);
        DiemDanh.setBackground(Color.orange);
        NhanVien.setBackground(Color.orange);
        TaiKhoan.setBackground(Color.orange);
        Luong.setBackground(Color.orange);
        SanPham.setBackground(Color.orange);
        GoiMon.setBackground(Color.orange);
        HoaDon.setBackground(Color.orange);
        KhuyenMai.setBackground(Color.gray);
        ThongKe.setBackground(Color.orange);
    }//GEN-LAST:event_KhuyenMaiMouseClicked

    private void ThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThongKeMouseClicked
        CardLayout layout = (CardLayout) GiaoDienQuanLy.getLayout();
        layout.show(GiaoDienQuanLy, "card_ThongKe");
        TrangChinh.setBackground(Color.orange);
        DiemDanh.setBackground(Color.orange);
        NhanVien.setBackground(Color.orange);
        TaiKhoan.setBackground(Color.orange);
        Luong.setBackground(Color.orange);
        SanPham.setBackground(Color.orange);
        GoiMon.setBackground(Color.orange);
        HoaDon.setBackground(Color.orange);
        KhuyenMai.setBackground(Color.orange);
        ThongKe.setBackground(Color.gray);
    }//GEN-LAST:event_ThongKeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangChuQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuQuanLy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG_GiaoDienQuanLy;
    private javax.swing.JLabel BG_GiaoDienQuanLy1;
    private javax.swing.JLabel BG_GiaoDienQuanLy10;
    private javax.swing.JLabel BG_GiaoDienQuanLy11;
    private javax.swing.JLabel BG_GiaoDienQuanLy12;
    private javax.swing.JLabel BG_GiaoDienQuanLy2;
    private javax.swing.JLabel BG_GiaoDienQuanLy3;
    private javax.swing.JLabel BG_GiaoDienQuanLy4;
    private javax.swing.JLabel BG_GiaoDienQuanLy5;
    private javax.swing.JLabel BG_GiaoDienQuanLy6;
    private javax.swing.JLabel BG_GiaoDienQuanLy7;
    private javax.swing.JLabel BG_GiaoDienQuanLy8;
    private javax.swing.JLabel BG_GiaoDienQuanLy9;
    private javax.swing.JLabel BG_Nen;
    private javax.swing.JMenuItem DangXuat;
    private javax.swing.JLabel DiemDanh;
    private javax.swing.JMenuItem DoiMatKhau;
    private javax.swing.JPanel GiaoDienQuanLy;
    private javax.swing.JLabel GoiMon;
    private javax.swing.JLabel HoaDon;
    private javax.swing.JLabel KhuyenMai;
    private javax.swing.JLabel Luong;
    private javax.swing.JMenuBar MenuTren;
    private javax.swing.JMenu Menu_CaiDat;
    private javax.swing.JPanel Menu_QuanLy;
    private javax.swing.JLabel NhanVien;
    private javax.swing.JPanel PN_DangNhap;
    private javax.swing.JPanel PN_DiemDanh;
    private javax.swing.JPanel PN_DoiMatKhau;
    private javax.swing.JPanel PN_GoiMon;
    private javax.swing.JPanel PN_HoaDon;
    private javax.swing.JPanel PN_KhuyenMai;
    private javax.swing.JPanel PN_Luong;
    private javax.swing.JPanel PN_NhanVien;
    private javax.swing.JPanel PN_QuenMatKhau;
    private javax.swing.JPanel PN_SanPham;
    private javax.swing.JPanel PN_TaiKhoan;
    private javax.swing.JPanel PN_ThongKe;
    private javax.swing.JPanel PN_TrangChinh;
    private javax.swing.JPanel QuanLyQuanSinhTo;
    private javax.swing.JLabel SanPham;
    private javax.swing.JLabel TaiKhoan;
    private javax.swing.JMenuItem Thoat;
    private javax.swing.JLabel ThongKe;
    private javax.swing.JLabel TrangChinh;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblBG_MenuQuanLy;
    // End of variables declaration//GEN-END:variables
}
