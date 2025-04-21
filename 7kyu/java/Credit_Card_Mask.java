public class Maskify {
    public static String maskify(String str) {
      
      if(str.length()<=4)
      {
        return str;
      
      }
      else
      {
        String change="";
        int i=0;
        while(i<str.length()-4)
        {
          change+="#";
          i++;
        }
        
      return change+str.substring(str.length()-4);
      }

      

      //  throw new UnsupportedOperationException("Unimplemented");
    }
}