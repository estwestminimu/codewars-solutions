public class Solution {

    public static String camelCase(String str) {
     System.out.println(str); 
      if(str=="")
      {
        return str;
      }
      str.replaceAll("[\\t\\n\\r]+"," ");
      
      String zw = str.trim().replaceAll(" +", " ");
      str = zw;      
      if(str.charAt(0)==' ')
      {
         String be = str.substring(1);
          str=be;
      }
      
System.out.println(str);
      int length = str.length();
      
        for(int i=0; i<length-1; i++)
        {
          
          if(str.charAt(i)==' ' && str.charAt(i+1)!=' ' )
          {
      
            
            String newName = str.substring(0,i)+Character.toUpperCase(str.charAt(i+1))+str.substring(i+2);
            str=newName;
            length-=1;
          }
        }

      String s1 = str.substring(0, 1).toUpperCase();
       String newName = s1+str.substring(1);
        str=newName;
      str.replace(".", "");
      
    return str;
    }

}