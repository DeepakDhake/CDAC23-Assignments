namespace MathsEngine
{
    public class MathsLib
    {
        public float num1;
        public float num2;
        const double PI = 3.14;

        public float Num1 { get; set; }
        public float Num2 { get; set; }

        public float Addition(float num1, float num2)
        {
            return num1 + num2;
        }

        public float Subtraction(float num1, float num2)
        {
            return num1 - num2;
        }

        public float Multiplication(float num1, float num2)
        {
            return num1 * num2;
        }

        public float Division(float num1, float num2)
        {
            return num1 / num2;
        }

        public void Swap(float num1, float num2)
        {
            float temp;
            Console.WriteLine("Number 1 = " + num1 + " Number 2 = " + num2);
            temp = num1;
            num1 = num2;
            num2 = temp;
            Console.WriteLine("Number 1 = " + num1 + " Number 2 = " + num2);
        }

        public void AreaofCircle(float radius, out double area, out double circumference)
        {
            area = Convert.ToDouble(PI * radius * radius);
            circumference = Convert.ToDouble(2 * PI * radius);
            Console.WriteLine("Area = " + area);
            Console.WriteLine("Circumference = " + circumference);
        }

    }
}
