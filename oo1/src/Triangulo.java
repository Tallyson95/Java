public class Triangulo
{
    public int a;
    public int b;
    public int c;

    public double calcArea(int a, int b, int c)
    {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p-b) * (p - c));
    }
}
