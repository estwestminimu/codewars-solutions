public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    // Do something
    
    int minutes=(int)Math.floor(seconds/60);
    seconds=seconds-minutes*60;
    int hours=(int)Math.floor(minutes/60);
    minutes=minutes-hours*60;

      String se=seconds<10?"0"+String.valueOf(seconds):String.valueOf(seconds);   
      String mi=minutes<10?"0"+String.valueOf(minutes):String.valueOf(minutes);
      String ho=hours<10?"0"+String.valueOf(hours):String.valueOf(hours);

    
    String out=ho+":"+mi+":"+se;
    
    return out;
  }
}