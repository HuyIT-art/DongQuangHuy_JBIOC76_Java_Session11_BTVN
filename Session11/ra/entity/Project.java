//package Session11.ra.entity;
//import java.time.LocalDate;
//import java.util.regex.Pattern;
//import java.util.regex.Matcher;
//import java.util.Scanner;
//public class Project {
//    private String projectId;
//    private String projectName;
//    private LocalDate startDate;
//    private LocalDate endDate;
//    public Employee[] employees;
//    public enum Status{
//        PLANNING, RUNNING, FINISHED
//    }
//    private Status status;
//
//    public Project(String projectId, String projectName, LocalDate startDate, LocalDate endDate, Employee[] employees, Status status) {
//        this.projectId = projectId;
//        this.projectName = projectName;
//        this.startDate = startDate;
//        this.endDate = endDate;
//        this.employees = employees;
//        this.status = status;
//    }
//
//    public String getProjectId() {
//        return projectId;
//    }
//
//    public String getProjectName() {
//        return projectName;
//    }
//
//    public LocalDate getStartDate() {
//        return startDate;
//    }
//
//    public LocalDate getEndDate() {
//        return endDate;
//    }
//
//    public Employee[] getEmployees() {
//        return employees;
//    }
//
//    public Status getStatus() {
//        return status;
//    }
//
//    public void setProjectId(String projectId) {
//        if(projectId.matches("^P\\d{4}$")){
//            this.projectId = projectId;
//        }else{
//            throw new IllegalArgumentException("Bắt đầu bằng P, 5 ký tự");
//        }
//    }
//
//    public void setProjectName(String projectName) {
//        this.projectName = projectName;
//    }
//
//    public void setStartDate(LocalDate startDate) {
//        this.startDate = startDate;
//    }
//
//    public void setEndDate(LocalDate endDate) {
//        if(endDate.isAfter(startDate)){
//            this.endDate = endDate;
//        }else{
//            throw new IllegalArgumentException("endDate >= startDate");
//        }
//    }
//
//    public void setEmployees(Employee[] employees) {
//        this.employees = employees;
//    }
//
//    public void setStatus(Status status) {
//        this.status = status;
//    }
//    public void inputData(Scanner sn, Project[] arrProject, int index, Employee[] arrEmp, int empIndex) {
//        System.out.println("=== Nhập danh sách nhân viên trong dự án ===");
//        int i = 0, j = 0;
//        while (j < index) {
//            System.out.println("=== Nhập thông tin dự án ===");
//            while (true) {
//                try {
//                    System.out.println("Nhập ProjectID: ");
//                    this.setProjectId(sn.nextLine());
//                    break;
//                } catch (IllegalArgumentException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//            while (true) {
//                try {
//                    System.out.println("Nhập ProjectName: ");
//                    this.setProjectName(sn.nextLine());
//                    break;
//                } catch (IllegalArgumentException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//            while (true) {
//                try {
//                    System.out.println("StartDate(yyyy-mm-dd): ");
//                    String input = sn.nextLine();
//                    LocalDate date = LocalDate.parse(input);
//                    this.setStartDate(date);
//                    break;
//                } catch (IllegalArgumentException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//            while (true) {
//                try {
//                    System.out.println("EndDate(yyyy-mm-dd): ");
//                    String s = sn.nextLine();
//                    LocalDate d = LocalDate.parse(s);
//                    this.setEndDate(d);
//                    break;
//                } catch (IllegalArgumentException e) {
//                    System.out.println(e.getMessage());
//                }
////            }
////            while (i < empIndex) {
////               arrEmp[i].inputData()
////            }
//            }
//        }
//    }
