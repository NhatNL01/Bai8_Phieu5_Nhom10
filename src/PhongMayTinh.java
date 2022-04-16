
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
public class PhongMayTinh extends PhongHoc{
    private int soMay;

    public PhongMayTinh() {
    }

    public int getSoMay() {
        return soMay;
    }

    public void setSoMay(int soMay) {
        this.soMay = soMay;
    }
    
    @Override
     public void Nhap() {
        Scanner sc = new Scanner(System.in);
        
        super.Nhap();
        System.out.print("nhap so may:");
        soMay = sc.nextInt();
        
    }
     
    @Override
    public boolean xetDatChuan(){
        return super.xetDatChuan() && dienTich/soMay>=1.5;
    } 
    
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.printf("%15s %15s %n",xetDatChuan(), soMay);
    }
    public static void inTieuDe(){
        PhongHoc.inTieuDe();
        System.out.printf("%15s %n","Dat chuan","Co may chieu" );
    }
}
