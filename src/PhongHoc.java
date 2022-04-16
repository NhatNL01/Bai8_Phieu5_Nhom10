
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ACER
 */
public abstract class PhongHoc {

    protected String maPhong;
    protected String dayNha;
    protected float dienTich;
    protected int soBongDen;

    public PhongHoc(String maPhong, String dayNha, float dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    public PhongHoc() {

    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getDayNha() {
        return dayNha;
    }

    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    public void setSoBongDen(int soBongDen) {
        this.soBongDen = soBongDen;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma phong: ");
        maPhong = sc.nextLine();
        System.out.print("nhap day nha: ");
        dayNha = sc.nextLine();
        System.out.print("nhap dien tich: ");
        dienTich = sc.nextFloat();
        System.out.print("nhap so bong den: ");
        soBongDen = sc.nextInt();
    }
    public void Xuat(){
        System.out.printf("%15s %15s %15.2f %15d", maPhong, dayNha, dienTich, soBongDen);
    }
    public static void inTieuDe(){
        System.out.printf("%15s %15s %15s %15s", "Ma Phong", "Day Nha", "Dien Tich", "So Bong Den");
    }
    
    
    public boolean xetDatChuan(){
        return dienTich/soBongDen >= 10;
    }
}
