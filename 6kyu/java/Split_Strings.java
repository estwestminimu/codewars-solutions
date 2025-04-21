public class StringSplit {
    public static String[] solution(String s) {

      int length = s.length();
      String[] arr;
        arr = new String[length%2==0?length/2:(length/2)+1];

        int k=0;
        for(int i=0; i<s.length(); i+=2, k++)
        {
          
            arr[k]=Character.toString(s.charAt(i));
          if(i+1>=s.length())
          {
            arr[k]+='_';

          }
          else
          {
            arr[k]+=Character.toString(s.charAt(i+1));
          }
            

        }

      return arr;
   }
}