class UsingArraysAnswers2
{
public static void main (String[] args)
{
int[] sample = new int[10];

for(int i = 0; i<sample.length; i++)
{
  sample[i] = 1;
  swap(sample, 0,9);
   System.out.println(sample[i]);
  // swap(sample, 0,9);
}  
}
    
  }
