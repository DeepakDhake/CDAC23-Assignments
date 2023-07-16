using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmployeeLib
{
    public class HR : Employee
    {
        public double perfBonus { get; set; }
        public HR(int empId, string name, DateOnly dob, string city, string state, double salary, Dept department, double bonus) : base(empId, name, dob, city, state, salary, department)
        {
            this.perfBonus = bonus;
        }

        public override string ToString()
        {
            return base.ToString() + " " + this.perfBonus;
        }

        public override double computeSalary()
        {
            return base.computeSalary() + this.perfBonus;
        }

    }
}
