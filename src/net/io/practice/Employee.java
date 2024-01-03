package net.io.practice;

public class Employee {
    private int empID;
    private String empName;
    private String empDept;

    public Employee(int empID, String empName, String empDept, int empSal) {
        this.empID = empID;
        this.empName = empName;
        this.empDept = empDept;
        this.empSal = empSal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", empDept='" + empDept + '\'' +
                ", empSal=" + empSal +
                '}';
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public int getEmpSal() {
        return empSal;
    }

    public void setEmpSal(int empSal) {
        this.empSal = empSal;
    }

    private int empSal;
}
