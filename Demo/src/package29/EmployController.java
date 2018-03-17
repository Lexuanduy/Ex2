/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package29;

import java.util.Scanner;

/**
 *
 * @author duy
 */
public class EmployController {
    public void printEmployInformation(Employee emp)
    {
       if(emp.getStatus() == 0)
       {
           System.out.println("Nhân viên đã nghỉ hoặc không làm việc: ");
       }
        System.out.println("Nhân viên: " + emp.getName());
        System.out.println("Mức lương: " + emp.getSalaryPerHour()*emp.getWorkingHours());
    }
    
    public Employee getEmployInfo()
    {
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Vui lòng nhập tên nhân viên: ");
        String name = sc.nextLine();
        System.out.println("Vui lòng nhập email: ");
        String email = sc.nextLine();
        System.out.println("Vui lòng nhập số điện thoại: ");
        String phone = sc.nextLine();
        System.out.println("Vui lòng nhập số giờ làm việc: ");
        int workingHours = Integer.parseInt(sc.nextLine());
        
        Employee emp = new Employee(name, email, workingHours, workingHours);
        emp.setStatus(1);
        return emp;
    }
}
