// See https://aka.ms/new-console-template for more information
using EMP;
using MGR;
Console.WriteLine("Hello, World!");
Employee e1 = new Employee(1, "Virat", "Kholi", "vk@gmail.com", 50000, new DateOnly(1999, 07, 06));
Console.WriteLine(e1);
Console.WriteLine("Net Salary of " + e1.fname + " is " + e1.computeSalary());
Manager m1 = new Manager(10, "Alex", "Mercer", "ak@gmail.com", 50000, new DateOnly(1999, 05, 12), 50000);
Console.WriteLine(m1);
Console.WriteLine("Net Salary of " + m1.fname /*Getter*/ + " is " + m1.computeSalary());

m1.fname = "MAX"; //Setter
Console.WriteLine("Net Salary of " + m1.fname + " is " + m1.computeSalary());

