
import java.util.Scanner;


public class PhongThiNghiem  extends PhongHoc{
    
    private String chuyenNganh;
    private float sucChua;
    private boolean bonRua;

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public float getSucChua() {
        return sucChua;
    }

    public void setSucChua(float sucChua) {
        this.sucChua = sucChua;
    }

    public boolean isBonRua() {
        return bonRua;
    }

    public void setBonRua(boolean bonRua) {
        this.bonRua = bonRua;
    }

    public PhongThiNghiem() {
    }
    
    

    public PhongThiNghiem(String chuyenNganh, float sucChua, boolean bonRua) {
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.bonRua = bonRua;
    }
    
    @Override
     public void Nhap() {
        Scanner sc = new Scanner(System.in);
        
        super.Nhap();
        
        System.out.print("nhap chuyen nganh:");
        chuyenNganh = sc.nextLine();
        System.out.print("nhap suc chua:");
        sucChua = sc.nextFloat();
        System.out.print("nhap co bon rua khong?(true/false)");
        bonRua = sc.nextBoolean();
    }
     
    @Override
    public boolean xetDatChuan(){
        return super.xetDatChuan() && isBonRua();
    } 
    
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.printf("%15s %15s %15s %15s %n",chuyenNganh,sucChua,xetDatChuan(), isBonRua());
    }
    public static void inTieuDe(){
        PhongHoc.inTieuDe();
        System.out.printf("%15s %15s %15s %15s %n","Chuyen nganh","Suc chua","Dat chuan", "Bon chua");
    }
    
}
