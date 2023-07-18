using EmployeeWebApp.Models;
using Microsoft.AspNetCore.Mvc;
using System.IO;
using System.Diagnostics;
using Newtonsoft.Json;

namespace EmployeeWebApp.Controllers
{
    public class HomeController : Controller
    {
        private readonly ILogger<HomeController> _logger;

        public HomeController(ILogger<HomeController> logger)
        {
            _logger = logger;
        }

        public IActionResult Index()
        {
            return View();
        }

        public IActionResult Privacy()
        {
            return View();
        }

        public IActionResult Login()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Login(string email, string password)
        {
            if (email == "Deep@gmail.com" && password == "12345")
            {
                return RedirectToAction("Welcome");
            }
            return RedirectToAction("Login"); 
        }

        public IActionResult Welcome()
        {
            return View();
        }

        public IActionResult Register()
        {
            return View();
        }

        private static List<Employee> employees = new List<Employee>();
        
        [HttpPost]
        public IActionResult Register(int id, string firstName, string lastName, double salary, string city, string email, string password)
        {
            Employee emp = new Employee();
            emp.id = id;
            emp.firstName = firstName;
            emp.lastName = lastName;
            emp.salary = salary;
            emp.city = city;
            emp.email = email;
            emp.password = password;
            employees.Add(emp);
            var fileName = "EmployeeList.json";
            //var filePath = Path.Combine(Environment.CurrentDirectory, fileName);
            var filePath = "D:\\Git\\CDAC23-Assignments\\DOTNET\\EmployeeWebApp\\EmployeeList.json";
            var json = JsonConvert.SerializeObject(employees);
            System.IO.File.WriteAllText(filePath, json);
            return RedirectToAction("List");
        }
            public IActionResult List()
        {
            var filePath = "D:\\Git\\CDAC23-Assignments\\DOTNET\\EmployeeWebApp\\EmployeeList.json";
            //var fileName = "EmployeeList.json";
            //var filePath = Path.Combine(Environment.CurrentDirectory, fileName);
            if (System.IO.File.Exists(filePath))
            {
                var json = System.IO.File.ReadAllText(filePath);
                var empol = JsonConvert.DeserializeObject<List<Employee>>(json);
                return View(empol);
            }
            return View(new List<Employee>());
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}