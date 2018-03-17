package package1;

    

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author duyle
 */
public class Calculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Nhập 2 số từ bàn phím
        System.out.println("Nhập 2 số a và b ");
        System.out.println("Nhập vào số a: ");
        float a = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        float b = scanner.nextInt();
        
        //Tính tổng
        float tong = a + b;
        System.out.println("Tổng 2 số a và b là :" + tong);
        
        //Tính hiệu
        float hieu = a - b;
        System.out.println("Hiệu 2 số a và b là :" + hieu);
        
        //Tính tích
        float tich = a * b;
        System.out.println("Tích 2 số a và b là :" + tich);
        
        //Tính thương
        if(b != 0){
            float thuong = a/b;
            System.out.println("Thương 2 số a và b là :" + thuong);
        }
        else{
            System.out.println("Không có số nào chia hết cho 0. Vui lòng nhập lại số b");
        }
    }
}
