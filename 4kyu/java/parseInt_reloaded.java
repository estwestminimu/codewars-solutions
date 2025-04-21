public class Parser {
    
    public static int parseInt(String numStr) {
      
      if(numStr=="one million")
      {
        return 1000000;
      }
      
      int sum=0,out=0;
      
        numStr=numStr.replaceAll("-", " ");
        numStr=numStr.replaceAll(" and ", " ");

            String[] words = numStr.split(" ");
      

      
          for(int i=0; i<words.length; i++)
          {
            switch(words[i])
            {
                case "one": 
                  sum+=1;
                break;
                
                case "two":
                  sum+=2;
                break;
                
                case "three":
                  sum+=3;
                break;

                case "four":
                  sum+=4;
                break;

                case "five":
                  sum+=5;
                break;

                case "six":
                  sum+=6;
                break;

                case "seven":
                  sum+=7;
                break;

                case "eight":
                  sum+=8;
                break;

                case "nine":
                  sum+=9;
                break;

                case "ten":
                  sum+=10;
                break;

                case "eleven":
                  sum+=11;
                break;

                case "twelve":
                  sum+=12;
                break;

                case "thirteen":
                  sum+=13;
                break;

                case "fourteen":
                  sum+=14;
                break;

                case "fifteen":
                  sum+=15;
                break;

                case "sixteen":
                  sum+=16;
                break;

                case "seventeen":
                  sum+=17;
                break;

                case "eighteen":
                  sum+=18;
                break;

                case "nineteen":
                  sum+=19;
                break;

                case "twenty":
                  sum+=20;
                break;
 
                case "thirty":
                  sum+=30;
                break;

                case "forty":
                  sum+=40;
                break;

                case "fifty":
                sum+=50;
                break;

                case "sixty":
                  sum+=60;
                break;

                case "seventy":
                  sum+=70;
                break;

                case "eighty":
                  sum+=80;
                break;

                case "ninety":
                  sum+=90;
                break;

                case "thousand":
                sum*=1000;
                out+=sum;
                sum=0;
                break;
                
                case "hundred":
                sum*=100;
 
                break;
              
            }
            System.out.println("Suma"+sum);
             System.out.println(words[i]);
            System.out.println("wynik"+out);
            System.out.println();
          }
          out+=sum;
      
        
 
        return out;
    }
}