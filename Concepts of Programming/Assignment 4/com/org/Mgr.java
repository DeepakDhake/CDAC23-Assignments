package com.app.org;

public class Mgr extends Emp {
    private double perfBonus;
    
    public Mgr(String firstName, String lastName, int deptId, double basic, double perfBonus) {
        super(firstName, lastName, deptId, basic);
        this.perfBonus = perfBonus;
    }
    
    public String toString() {
        return "Mgr [id=" + getId() + ", firstName=" + getFirstName() + ", lastName=" + getLastName() + ", deptId=" + getDeptId() + "]";
    }
    
    public double computeNetSalary() {
        return getBasic() + perfBonus;
    }
    
    public double getPerfBonus() {
        return perfBonus;
    }
}
