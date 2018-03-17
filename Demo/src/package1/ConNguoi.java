package package1;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duy
 */
public class ConNguoi {
        private String ten;
        private int tuoi;
        private int gioitinh;
        private String dienthoai;
        
        //constructor default
        public ConNguoi(){}
        public ConNguoi(String ten){
        this.ten = ten;
        }
        public ConNguoi(String ten, int tuoi, int gioitinh, String dienthoai){
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
        this.dienthoai = dienthoai;
        }
        
        public void setTen(String ten)
        {
        this.ten = ten;
        }
        
        public String getTen(){
        return this.ten;
        }
        
        public void setTuoi (int t)
        {
        this.tuoi = t;
        }
        
        public int getTuoi(){
        return this.tuoi;
        }
        
        public void setGioitinh(int gt)
        {
        this.gioitinh = gt;
        }
        
        public int getGioitinh(){
        return this.gioitinh;
        }
        
        public void setDienthoai(String dt)
        {
        this.dienthoai = dt;
        }
        
        public String getDienthoai(){
        return this.dienthoai;
        }
        
        public String toString(){
        return "Toi ten la " + ten + ", " + tuoi + " tuoi, gioi tinh " + (gioitinh == 1 ? "Nam" : (gioitinh == 0 ? "Nu" : "Khac")) + ", dien thoai: " + dienthoai + ".";
        }
        
        public static void main(String[] args) {
       //  Type     bien  = ham();   
        ConNguoi connguoi = new ConNguoi("Duyle", 24, 1, "0989773866");
        //connguoi.setTen("Duy");
        //connguoi.setTuoi(24);
        //connguoi.setGioitinh(1);
        //connguoi.setDienthoai("0999888777");
            System.out.println(connguoi.toString());
            
    }
}


