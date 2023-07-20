using BLL;
using DBConnection;
using Microsoft.AspNetCore.Mvc;
namespace EmployeeWebApplication.Controllers
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
        public IActionResult AddEmployee(int eid, string name, string email, string password, double salary)
        {
            Employee emp = new Employee();
            emp.eid = eid;
            emp.name = name;
            emp.email = email;
            emp.password = password;
            emp.salary = salary;
            bool status = DBManager.AddEmployee(emp);
            if (status == true)
            {
                return RedirectToAction("List");  
            }
            else
            {
                return Json(emp);
            }
        }
        public IActionResult List()
        {
            List<Employee> employees = DBManager.GetAll();
            ViewData["emps"] = employees;
            return View();
        }

    }
}
