using EmployeeWebApp.Models;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

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
            if (email == "aa@gmail.com" && password == "12345")
            {
            return RedirectToAction("Welcome");
            }
            return View(); 
        }

        public IActionResult Welcome()
        {
            return View();
        }

        public IActionResult Register()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Register(int id, string firstName, string lastName, double salary, string city, string email, string password)
        {
            return RedirectToAction("Welcome");
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}