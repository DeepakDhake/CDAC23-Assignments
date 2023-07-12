namespace EMP
{
    public class Employee
    {
        private int empId;
        // private string fname;
        private string lname;
        private string email;
        private double salary;
        private DateOnly dob;

        public Employee(int empId, string fname, string lname, string email, double salary, DateOnly dob)
        {
            this.empId = empId;
            this.fname = fname;
            this.lname = lname;
            this.email = email;
            this.salary = salary;
            this.dob = dob;
        }

        public int EmpId
        {
            get { return this.empId; }
            set { this.empId = value; }
        }

        // public string Fname
        // {
        //     get { return this.fname; }
        //     set { this.fname = value; }
        // }

        public string fname { get; set; }
        public string Lname
        {
            get { return this.lname; }
            set { this.lname = value; }
        }
        public string Email
        {
            get { return this.email; }
            set { this.email = value; }
        }
        public double Salary
        {
            get { return this.salary; }
            set { this.salary = value; }
        }

        public DateOnly Dob
        {
            get { return this.dob; }
            set { this.dob = value; }
        }

        public override string ToString()
        {
            string data = string.Format("{0} {1} {2} {3} {4} {5}", this.empId, this.fname, this.lname, this.email, this.salary, this.dob);
            return data;
        }

        public virtual double computeSalary()
        {
            return this.salary;
        }

    }
}
