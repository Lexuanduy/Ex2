/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package21;

import java.util.Scanner;

/**
 *
 * @author xuanhung
 */
public class MainThread {
    public static void main(String[] args) {                        
        EmployeeController empController = new EmployeeController();
        Employee emp =  empController.getEmployeeInfor();
        empController.printEmpInformation(emp);
    }
    
}
