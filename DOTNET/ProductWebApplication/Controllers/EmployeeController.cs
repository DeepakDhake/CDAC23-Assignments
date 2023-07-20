using Emp;
using Microsoft.AspNetCore.Mvc;
namespace ProductWebApplication.Controllers
{
    public class EmployeeController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }

        public IActionResult AddEmployee()
        {
            return View();
        }

        [HttpPost]
        public IActionResult AddEmployee(int id, string name, string email, string password, double salary)
        {
            Employee emp = new Employee();
            emp.eid = id;
            emp.name = name;
            emp.email = email;
            emp.password = password;
            emp.salary = salary;
            return RedirectToAction("List");  
        }

    }
}
