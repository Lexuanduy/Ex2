/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package24;

/**
 *
 * @author duy
 */
public class MainThread {
    public static void main(String[] args) {
        EmployeeController empctl = new EmployeeController();
        Employee emp = empctl.getEmployeeInfor();
        empctl.printEmpInformation(emp);
        
    }
}
