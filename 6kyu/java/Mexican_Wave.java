public class MexicanWave {

    public static String[] wave(String str) {
        
      //usuwam spacje
        String opt=str.replaceAll("\\s+","");
        String[] anArray;
      
      //tworzem dlugos array na podstawie samych liter
        anArray = new String[opt.length()];
      
            for(int j=0, z=0; j<str.length() && z<opt.length(); j++, z++)
            {
 

              while(str.charAt(j)==' ')
              {
              j++;  
                
              }
    
              

              
              if(j<str.length())
              {
               anArray[z]=str.substring(0,j)+Character.toUpperCase(str.charAt(j))+str.substring(j+1);   
                System.out.println(j);
            System.out.println(anArray[z]);
              }
                

         


            }
    
          
        return anArray;
    }
    
}