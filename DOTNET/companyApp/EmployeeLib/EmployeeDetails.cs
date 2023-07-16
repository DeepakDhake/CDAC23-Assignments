using TaxLib;
using static TaxLib.Delegatee;

namespace EmployeeLib
{
    public partial class Employee
    {
        public int empId { get; set; }
        public string name { get; set; }
        public DateOnly dob { get; set; }
        public double salary { get; set; }
        public Dept department { get; set; }
        
        public event TaxManager manageTax; 
        public Employee(int empId,string name, DateOnly dob, string city, string state, double salary, Dept department) 
        {
            this.empId = empId;
            this.name = name;
            this.dob = dob;
            this.city = city;
            this.state = state;
            this.salary = salary;
            this.department = department;
        }

        public override string ToString()
        {
            return ($"{this.empId}:{this.name}:{this.dob}:{this.city}:{this.state}:{this.salary}:{this.department}:");
        }

        public virtual double computeSalary()
        {
            return this.salary;
        }

        public void IncSal(double sal)
        {
            this.salary += sal;
            if (this.salary > 50000)
            {
                this.salary = manageTax(this.salary);
            }
        }

    }
}
