
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
public class PhongHocLyThuyet extends PhongHoc {

    private boolean mayChieu;

    public boolean isMayChieu() {
        return mayChieu;
    }

    public void setMayChieu(boolean mayChieu) {
        this.mayChieu = mayChieu;
    }

    public PhongHocLyThuyet() {
    }
    
    
    @Override
     public void Nhap() {
        Scanner sc = new Scanner(System.in);
        
        super.Nhap();
        System.out.print("nhap co may chieu khong? ");
        mayChieu = sc.nextBoolean();
        
    }
     
    @Override
    public boolean xetDatChuan(){
        return super.xetDatChuan() && isMayChieu();
    } 
    
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.printf("%15s %15s %n",xetDatChuan(), mayChieu);
    }
    public static void inTieuDe(){
        PhongHoc.inTieuDe();
        System.out.printf("%15s %15s %n","Dat chuan","Co may chieu" );
    }
}
