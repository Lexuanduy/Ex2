/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package25;

/**
 *
 * @author duy
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

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public void setJoinedDate(long joinedDate) {
        this.joinedDate = joinedDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public long getBirthday() {
        return birthday;
    }

    public long getJoinedDate() {
        return joinedDate;
    }

    public String getAddress() {
        return address;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public int getStatus() {
        return status;
    }

    public Employee() {
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
