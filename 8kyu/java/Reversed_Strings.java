public class Kata {

  public static String solution(String str) {
    
    char[] temp = str.toCharArray();
    String output="";
    
    for(int i=str.length()-1; i>=0; i--)
    {
      output+=temp[i];

      
      
    }
    
    return output;
  }

}