package Session11.ra.entity;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
    private String employeeId;
    private String employeeName;
    private Role role;
    public enum Role {
        DEV, TESTER, PM, BA
    }
    private double salary;

    public Employee() {

    }

    public Employee(String id, String name, Role role, double salary) {
        this.employeeId = id;
        this.employeeName = name;
        this.role = role;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        if (employeeId != null && employeeId.matches("^E\\d{4}$")) {
            this.employeeId = employeeId;
        } else {
            throw new IllegalArgumentException("ID phải dạng E0001");
        }
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        if (employeeName != null && employeeName.matches("^.{6,30}$")) {
            this.employeeName = employeeName;
        } else {
            throw new IllegalArgumentException("Tên phải 6-30 kí tự");
        }
    }

    public double getSalary() {
        return salary;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Lương > 0");
        }
    }

    public void inputData(Scanner sn, Employee[] arrEmp, int index) {
        System.out.println("===== NHẬP THÔNG TIN NHÂN VIÊN ======");
        int i = 0;
        while(i<index) {
            while (true) {
                try {
                    System.out.println("ID: ");
                    this.setEmployeeId(sn.nextLine());

                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            while (true) {
                try {
                    System.out.println("Name: ");
                    this.setEmployeeName(sn.nextLine());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            while(true) {
                try {
                    System.out.println("Role (DEV / TESTER / PM / BA ");
                    String r = sn.nextLine().toUpperCase();
                    this.setRole(Role.valueOf(r));
                    break;
                }catch(Exception e){
                    System.out.println("Role không hợp lệ!");
                }
            }
            while (true) {
                try {
                    System.out.println("Salary > 0: ");
                    this.setSalary(sn.nextDouble());
                    sn.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.println("Lương không hợp lệ!");
                }
            }
            arrEmp[i] = this;
            i++;
        }
    }
    public void displayData(){
        System.out.println("ID: "+this.getEmployeeId()+
                " | NAME: "+this.getEmployeeName()+
                " | ROLE: "+this.getRole()+
                " | SALARY: "+this.getSalary());


    }
}














