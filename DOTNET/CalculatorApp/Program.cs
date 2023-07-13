// See https://aka.ms/new-console-template for more information
using MathsEngine;
Console.WriteLine("Hello, World!");

float num1 = 7.232F;
float num2 = 5.432F;

double area=0;
double circumference=0;

MathsLib expression = new MathsLib();
expression.Num1 = num1;
expression.Num2 = num2;
Console.WriteLine("Addition of " + expression.Num1 + " + " + expression.Num2 + " = " + expression.Addition(num1,num2));

Console.WriteLine("Substraction of " + expression.Num1 + " - " + expression.Num2 + " = " + expression.Subtraction(num1,num2));


Console.WriteLine("Multiplication of " + expression.Num1 + " * " + expression.Num2 + " = " + expression.Multiplication(num1,num2));

Console.WriteLine("Division of " + expression.Num1 + " / " + expression.Num2 + " = " + expression.Division(num1,num2));

expression.Swap(num1,num2);

expression.AreaofCircle(25,out area,out circumference);







