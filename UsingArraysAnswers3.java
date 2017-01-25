class UsingArraysAnswers3
{
  public static void main (String[] args)
  {
    double value1 =join();
    System.out.println(value1);
    
    
  }
public static double[] join (double[] a, double[] b)
{
double[] result = new double [a.length + b.length];
int i, j;
for (i = 0; i < a.length; i++)
{
result[i] = a[i];
}
for (j = 0; j < b.length; i++, j++)
{
result[i] = b[j];
}
return result;
}
}