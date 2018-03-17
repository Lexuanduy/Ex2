/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package25;

import java.util.Scanner;

/**
 *
 * @author duy
 */
public class EmployeeController {
    public void printEmpInformation(Employee emp)
    {
        if(emp.getStatus() == 0)
        {
            System.out.println("Nhân viên đã nghỉ hoặc không tồn tại.");
        }
        System.out.println("Nhân viên: " + emp.getName());
        System.out.println("Mức lương: " + emp.getSalaryPerHour()*emp.getWorkingHours());
    }
    
    public Employee getEmployeeInfor()
    {
       Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập tên nhân viên: ");
        String name = sc.nextLine();
        System.out.println("Vui lòng nhập email: ");
        String email = sc.nextLine();
        System.out.println("Vui lòng nhập số điện thoại: ");
        String phone = sc.nextLine();
        System.out.println("Vui lòng nhập số giờ đã làm: ");
        int workingHours = Integer.parseInt(sc.nextLine());
        System.out.println("Vui lòng nhập số tiền làm được trong 1h:  ");
        int salaryPerHour = Integer.parseInt(sc.nextLine());
        
        Employee emp = new Employee(name, email, workingHours, salaryPerHour);
        emp.setStatus(1);
        return emp;
    }
}
