using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmployeeLib
{
    public class SalesManager : Employee
    {
        public double SalesBonus { get; set; }
        public SalesManager(int empId, string name, DateOnly dob, string city, string state, double salary, Dept department, double bonus) : base(empId, name, dob, city, state, salary, department)
        {
            this.SalesBonus = bonus;
        }

        public override string ToString()
        {
            return base.ToString() + " " + this.SalesBonus;
        }

        public override double computeSalary()
        {
            return base.computeSalary() + this.SalesBonus;
        }
    }
}
