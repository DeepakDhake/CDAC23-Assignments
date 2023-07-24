using MySql.Data.MySqlClient;
using BOL;
namespace DAL
{
    public class DBManager
    {
        public static string dburl = @"server=localhost;port=3306;user=root;password=root123;database=dotnet";
        
        public static List<Product> getAllProducts() { 
            List<Product> plist = new List<Product>();
            MySqlConnection conn = new MySqlConnection(dburl);
            conn.ConnectionString = dburl;
            try
            {
                conn.Open();
                MySqlCommand cmd = new MySqlCommand();
                cmd.Connection = conn;
                string query = "Select * from product";
                cmd.CommandText = query;
                MySqlDataReader reader = cmd.ExecuteReader();
                while (reader.Read())
                {
                    int id = int.Parse(reader["Id"].ToString());
                    string name = reader["Name"].ToString();
                    int qty = int.Parse(reader["Qty"].ToString());
                    double price = double.Parse(reader["Price"].ToString());

                    Product pd = new Product
                    {
                        Id = id,
                        Name = name,
                        Qty = qty,
                        Price = price
                    };
                    plist.Add(pd);
                }
            }
            catch (Exception ex)
            {
                throw ex;
            }
            finally { conn.Close(); }
        return plist;
        }
    }
}