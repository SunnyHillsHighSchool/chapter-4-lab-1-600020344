//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
 public static int countEvenDigits(int num)
 {
   if (num>0)
   {
     int digit = num%10;
     num/=10;
     if (digit%2==0)
     {
       return 1+countEvenDigits(num);
     }
     return 0+countEvenDigits(num);
   }
   return 0;
 }
}
