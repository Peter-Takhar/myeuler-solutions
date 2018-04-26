import java.io.PrintStream;
import java.util.ArrayList;





public class Problem24
{
  public Problem24() {}
  
  public static void main(String[] paramArrayOfString)
  {
    long l = System.nanoTime();
    
    ArrayList<Integer> localArrayList = new ArrayList<>();
    //number of digits in set
    int digits = 10;
    //position you want to find
    int position = 1000000;
    
    for (int k = 0; k < digits; k++) {
      localArrayList.add(k);
    }
    
    String str = "";
    int index = digits - 1;
    
    while (index >= 0) {
      int permutations= factorial(index--);
      int factor = position / permutations;
      if (position % permutations == 0)
        factor--;
      str = str + localArrayList.get(factor) + "";
      localArrayList.remove(localArrayList.get(factor));
      position -= factor * permutations;
    }
    
    System.out.println(str);
    System.out.println((System.nanoTime() - l) / 1.0E9D + " seconds");
  }
  
  public static int factorial(int paramInt) {
    if ((paramInt == 1) || (paramInt == 0))
      return 1;
    return paramInt * factorial(paramInt - 1);
  }
	
}
