using System.ComponentModel.DataAnnotations;

namespace BLL
{
    public class Employee
    {
        public Employee()
        {
        }

        public Employee(int eid, string? name, string? email, string? password, double salary)
        {
            this.eid = eid;
            this.name = name;
            this.email = email;
            this.password = password;
            this.salary = salary;
        }

        public int eid { get; set; }
        [Required]
        public string? name { get; set; }
        [Required]
        public string? email { get; set; }
        public string? password { get; set; }
        public double salary { get; set; }

    }
}