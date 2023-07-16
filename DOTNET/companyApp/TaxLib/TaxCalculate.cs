namespace TaxLib
{
    public class TaxCalculate
    {
        public double PayIncomeTax(double pay)
        {
            Console.WriteLine("After Calculating Income Tax");
            return pay - pay * 0.10;
        }

        public double PayServiceTax(double pay)
        {
            Console.WriteLine("After Calculating Service Tax");
            return pay - pay * 0.15;
        }
    }
}