using EMP;
namespace MGR
{
    public class Manager : Employee
    {
        private double perfBonus;

        // public Manager()
        // {

        // }
        public Manager(int empId, string fname, string lname, string email, double salary, DateOnly dob, double perfBonus) : base(empId, fname, lname, email, salary, dob)
        {
            this.perfBonus = perfBonus;
        }

        public double PerfBonus { get => perfBonus; set => perfBonus = value; }

        public override string ToString()
        {
            string data = string.Format(" {0}", this.perfBonus);

            return base.ToString() + data;
        }

        public override double computeSalary()
        {
            return base.computeSalary() + this.perfBonus;
        }

    }
}