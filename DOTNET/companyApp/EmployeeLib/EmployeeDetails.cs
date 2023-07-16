namespace EmployeeLib
{
    public partial class Employee
    {
        public int empId { get; set; }
        public string name { get; set; }
        public DateOnly dob { get; set; }
        public double salary { get; set; }
        public Dept department { get; set; }

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

    }
}
