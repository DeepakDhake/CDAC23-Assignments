using BOL;
using DAL;
namespace BLL
{
    public class ProductApi
    {
        public List<Product> getAllProduct()
        { 
            List<Product> products = new List<Product>();
            products = DBManager.getAllProducts(); 
            return products;
        }
        public bool AddProduct(Product newProduct)
        {
            DBManager.AddProduct(newProduct);  
            return true;
        }
    }
}