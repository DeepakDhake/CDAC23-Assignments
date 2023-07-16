using EmployeeLib;
using static TaxLib.Delegatee;
using TaxLib;

Console.WriteLine("*****Welcome To Company*****");
int choice;
List<Employee> empList = new List<Employee>();
TaxCalculate taxCalculate = new TaxCalculate();
TaxManager opr1 = new TaxManager(taxCalculate.PayIncomeTax);
TaxManager opr2 = new TaxManager(taxCalculate.PayServiceTax);
do
{
    Console.WriteLine("Select option 1.Add Employee 2.Display All Employee 3.Total Expenditure to Company 4.Calculate Salary 5.Increase Salary 0.To Exit");
    choice = Convert.ToInt32(Console.ReadLine());
    switch (choice)
    {
        case 0:
            Console.WriteLine("*****Thank You*****");
            break;
        case 1:
            Console.WriteLine("Select 1.To add HR Employee 2.To add to add SalesManager 3.Calculate Salary 0.To Exit");
            int choice2 = Convert.ToInt32(Console.ReadLine());
            if (choice2 == 1)
            {
                Console.WriteLine("EmpId, Name, City, State, Salary, Bonus");
                HR h1 = new(Convert.ToInt32(Console.ReadLine()),
                               Console.ReadLine(),
                               new DateOnly(2023, 10, 30),
                               Console.ReadLine(),
                               Console.ReadLine(),
                               Convert.ToDouble(Console.ReadLine()),
                               Dept.RND,
                               Convert.ToDouble(Console.ReadLine()));
                empList.Add(h1);
                Console.WriteLine("HR Added Successfully");
                break;
            }
            else if (choice2 == 2)
            {
                Console.WriteLine("EmpId, Name, City, State, Salary, Bonus");
                SalesManager s1 = new(
                    Convert.ToInt32(Console.ReadLine()),
                    Console.ReadLine(),
                    new DateOnly(2023, 10, 30),
                    Console.ReadLine(),
                    Console.ReadLine(),
                    Convert.ToDouble(Console.ReadLine()),
                    Dept.ACCOUNT,
                    Convert.ToDouble(Console.ReadLine()));
                empList.Add(s1);
                Console.WriteLine("SalesManager Added Successfully");
                break;
            }
            else
            {
                Console.WriteLine("Enter Valid Input");
                break;
            }
        case 2:
            foreach (Employee e in empList)
            {
                Console.WriteLine(e + "\n");
            }
            break;
        case 3:
            double cost = 0;
            foreach (Employee e in empList)
            {
                cost += e.computeSalary();
            }
            Console.WriteLine("Total Expenditure of Company Rs." + cost);
            break;
        case 4:
            Console.WriteLine("Enter your Id to calculate salary: ");
            int eid = Convert.ToInt32(Console.ReadLine());
            foreach (Employee emp in empList)
            {
                if (eid == emp.empId)
                {
                    if (emp.GetType() == typeof(HR))
                    {
                        Console.WriteLine(opr1(emp.computeSalary()));
                        break;
                    }
                    else if (emp.GetType() == typeof(SalesManager))
                    {
                        Console.WriteLine(opr2(emp.computeSalary()));
                        break;
                    }
                    else
                    {
                        Console.WriteLine(opr1(emp.computeSalary()));
                        break;
                    }
                }
            }
            break;
        case 5:
            Console.WriteLine("Enter the Id to Increment salary: ");
            int eId = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter the amount by which you want to increase salary ");
            double amount = Convert.ToDouble(Console.ReadLine());
            foreach (Employee emp in empList)
            {
                if (eId == emp.empId)
                {
                    emp.manageTax += taxCalculate.PayIncomeTax;
                    emp.IncSal(amount);
                    break;
                }
            }
            break;
        default:
            Console.WriteLine("Invalid Input");
            break;
    }
} while (choice != 0);