public class BitCounting {

	public static int countBits(int n){
		String out = Integer.toBinaryString(n);
    int sum=0;
    for(int i=0; i<out.length(); i++)
    {

        sum+=out.charAt(i)=='1'?1:0;
    }
    return sum;
	}
	
}