namespace EmployeeWebApp.Models
{
    public class Employee
    {
        public int id { get; set; } = 0;
        public string firstName { get; set; } = string.Empty;
        public string lastName { get; set; } = string.Empty;
        public double salary { get; set; }
        public string city { get; set; } = string.Empty;
        public string email { get; set; } = string.Empty;
        public string password { get; set; } = string.Empty;
    }
}
