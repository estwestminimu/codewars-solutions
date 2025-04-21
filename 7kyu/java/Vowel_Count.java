public class Vowels {

  public static int getCount(String str) {
    
    int sum=0;
    char arr[]={'a','e', 'i', 'o', 'u'};
    
    for(int i=0; i<str.length(); i++)
    {
     
      for(int j=0; j<5; j++)
        { 
      
            if(str.charAt(i)==arr[j])
            {
              sum++;
              break;
            }

      
          }
    

  }
    return sum;
}
  }