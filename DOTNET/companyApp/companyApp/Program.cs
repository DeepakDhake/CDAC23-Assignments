using EmployeeLib;
Console.WriteLine("*****Welcome To*****");
int choice;
List<Employee> empList = new List<Employee>();
do{
Console.WriteLine("Select option 1.Add Employee 2.Display All Employee 3.Total Expenditure to Company 4.Calculate Salary 5.Increase Salary");
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
                Console.WriteLine("EmpId, Name, City, State, Salary, Department, Bonus");
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
                Console.WriteLine("EmpId, Name, City, State, Salary, Department, Bonus");
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
            Console.WriteLine("Total Expenditure of Company");
            double cost = 0;
            foreach (Employee e in empList)
            {
                cost += e.computeSalary();
            }
            break;
        case 4:
            break;
        case 5:
            break;
        case 6:

            break;
        case 7:
            break;
        case 8:
            break;
        default:
            Console.WriteLine("Invalid Input");
            break;
    }
}while(choice != 0);