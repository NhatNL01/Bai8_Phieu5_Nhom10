
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class demo {

    static ArrayList<PhongHoc> dsPhong = new ArrayList<PhongHoc>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println();
            System.out.println("------------Quản Lý Phòng Học--------------");
            System.out.println("1. Thêm Phòng Học                          ");//x
            System.out.println("2. Tìm kiếm phong học                      ");
            System.out.println("3. In danh sách phòng học                  ");//x
            System.out.println("4. In ra DS phòng học đạt chuẩn            ");
            System.out.println("5. Sắp xếp tăng dần theo cột dãy nhà       ");//x
            System.out.println("6. Sắp xếp giảm dần theo cột diện tích     ");//x
            System.out.println("7. Sắp xếp tăng dần theo cột bóng đèn      ");//x
            System.out.println("8. Cập nhật số lượng máy tính              ");
            System.out.println("9. Xóa phòng học                           ");
            System.out.println("10. In ra tổng số phòng học                ");
            System.out.println("11. In ra các phòng có 60 máy              ");
            System.out.println("12. Kết thúc chương trình                  ");
            System.out.println("Mời bạn nhập lựa chọn: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    ThemPhong();
                    break;
                case 2:
                    TimKiemTheoMa();
                    break;
                case 3:
                    InDsPhong();
                    break;
                case 4:
                    InDsPhongDatChuan();
                    break;
                case 5:
                    SapXepTangTheoDayNha();
                    break;
                case 6:
                    SapXepGiamTheoDienTich();
                    break;
                case 7:
                    SapXepTangTheoBongDen();
                    break;
                case 8:
                    CapNhatSLMayTinhTheoMa();
                    break;
                case 9:
                    XoaPhongHoc();
                    break;
                case 10:
                    InTongSoPhong();
                    break;
                case 11:
                    InCacPhongCo60May();
                    break;
                case 12:
                    return;
                default:
                    System.out.println("Không hợp lệ");
                    break;
            }

        } while (chon != 11);
    }

    private static void ThemPhong() {
        Scanner sc = new Scanner(System.in);
        int chon;
        int i = 0, j;

        System.out.println(
                "Nhập: 1- Phòng lý thuyết; 2- Phòng máy tính; 3.Phòng thí nghiệm");
        chon = sc.nextInt();
        PhongHoc phong;
        if (chon == 1) {
            phong = new PhongHocLyThuyet();
        } else if (chon == 2) {
            phong = new PhongMayTinh();
        } else {
            phong = new PhongThiNghiem();
        }
        phong.Nhap();
        for (j = 0; j < i; j++) {
            if (phong.getMaPhong().equalsIgnoreCase(dsPhong.get(j).getMaPhong())) {
                System.out.println("Hàng đã tồn tại");
                break;
            }
        }

        dsPhong.add(phong);

    }

    private static void TimKiemTheoMa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void InDsPhong() {
        System.out.println("Danh sach phong hoc ly thuyet:");
        PhongHocLyThuyet.inTieuDe();
        for (PhongHoc item : dsPhong) {
            if (item instanceof PhongHocLyThuyet) {
                item.Xuat();
            }
        }
        System.out.println("Danh sach phong may tinh:");
        PhongMayTinh.inTieuDe();
        for (PhongHoc item : dsPhong) {
            if (item instanceof PhongMayTinh) {
                item.Xuat();
            }
        }
        System.out.println("Danh sach phong thi nghiem:");
        PhongThiNghiem.inTieuDe();
        for (PhongHoc item : dsPhong) {
            if (item instanceof PhongThiNghiem) {
                item.Xuat();
            }
        }

    }

    private static void InDsPhongDatChuan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void SapXepTangTheoDayNha() {
        Comparator<PhongHoc> c1 = new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc t1, PhongHoc t2) {
                return t1.getDayNha().compareTo(t2.getDayNha());
            }
        };

        dsPhong.sort(c1);
    }

    private static void SapXepGiamTheoDienTich() {
        Comparator<PhongHoc> c1 = new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc t1, PhongHoc t2) {
                return (int) (t2.getDienTich() - t1.getDienTich());
            }
        };

        dsPhong.sort(c1);
    }

    private static void SapXepTangTheoBongDen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void CapNhatSLMayTinhTheoMa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void XoaPhongHoc() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void InTongSoPhong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void InCacPhongCo60May() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
