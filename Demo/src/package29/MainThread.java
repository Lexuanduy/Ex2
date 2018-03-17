/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package29;

/**
 *
 * @author duy
 */
public class MainThread {
    public static void main(String[] args) {
        EmployController empctl = new EmployController();
        Employee emp = empctl.getEmployInfo();
        empctl.printEmployInformation(emp);
    }
}
