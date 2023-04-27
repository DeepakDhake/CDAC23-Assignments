package com.app.org;

public class worker extends Emp {
    private double hoursWorked;
    private double hourlyRate;
    
    public worker(String firstName, String lastName, int deptId, double basic, double hoursWorked, double hourlyRate) {
        super(firstName, lastName, deptId, basic);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    
    public String toString() {
        return "Worker [id=" + getId() + ", firstName=" + getFirstName() + ", lastName=" + getLastName() + ", deptId=" + getDeptId() + "]";
    }
    
    public double computeNetSalary() {
        return getBasic() + (hoursWorked * hourlyRate);
    }
    
    public double getHourlyRate() {
        return hourlyRate;
    }
}
