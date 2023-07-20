using MySql.Data.MySqlClient;
using BLL;
using System.Data;

namespace DBConnection
{
    public class DBManager
    {
        public static string conString = @"server=localhost;port=3306;user=root; password=root123;database=dotnet";

        public static List<Employee> GetAll()
        {
            List<Employee> list = new List<Employee>();
            MySqlConnection conn = new MySqlConnection();
            conn.ConnectionString = conString;
            string query = "select * from emp";
            try
            {
                MySqlCommand command = new MySqlCommand();
                command.Connection = conn;
                conn.Open();
                command.CommandText = query;
                MySqlDataReader reader = command.ExecuteReader();
                while (reader.Read())
                {
                    int eid = int.Parse(reader["eid"].ToString());
                    string name = reader["name"].ToString();
                    string email = reader["email"].ToString();
                    string password = reader["password"].ToString();
                    double salary = double.Parse(reader["salary"].ToString());
                    Employee emp = new Employee(eid, name, email, password, salary);
                    list.Add(emp);
                }
            }
            catch (Exception e)
            {
                throw e;

            }
            finally
            {
                conn.Close();
            }
            return list;
        }
        public static bool AddEmployee(Employee emp)
        {
            bool status = false;
            string query = "Insert into emp (eid,name,email,password,salary) Values( '" + emp.eid + "','"
            + emp.name + "','" + emp.email + "','" + emp.password + "','" + emp.salary + "')";
            MySqlConnection conn = new MySqlConnection();
            conn.ConnectionString = conString;
            try
            {
                conn.Open();
                MySqlCommand command = new MySqlCommand(query, conn);
                command.ExecuteNonQuery();  //DML
                status = true;
            }
            catch (Exception ex)
            {
                throw ex;
            }
            finally
            {
                conn.Close();
            }
            return status;
        }
    }
}