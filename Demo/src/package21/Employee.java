/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package21;

/**
 *
 * @author xuanhung
 */
public class Employee {
    
    private long id;
    private String name;
    private String email;
    private String phone;
    private long birthday;
    private long joinedDate;
    private String address;
    private int workingHours;
    private int salaryPerHour;    
    private int status; // 0. Đã nghỉ | 1. Đang làm việc

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public long getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(long joinedDate) {
        this.joinedDate = joinedDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Employee() {
    }

    public Employee(String name, String email) {
        this.id = System.currentTimeMillis();
        this.name = name;
        this.email = email;
    }

    public Employee(String name, String email, int workingHours, int salaryPerHour) {
        this.name = name;
        this.email = email;
        this.workingHours = workingHours;
        this.salaryPerHour = salaryPerHour;
    }

    
    
    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", birthday=" + birthday + ", joinedDate=" + joinedDate + ", address=" + address + ", workingHours=" + workingHours + ", salaryPerHour=" + salaryPerHour + ", status=" + status + '}';
    }
    
    
       
}
