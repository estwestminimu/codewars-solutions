 public class Sum
  {
     public int GetSum(int a, int b)
     {
      int sum=0;
       if(a<b)
       {
         for(;a<b;a++)
         {
           sum+=a;
         }
         sum+=b;
       }
       else
      {
          for(;b<a;b++)
         {
           sum+=b;
         } 
         sum+=a;
       }
       
      return sum;
     }
  }
