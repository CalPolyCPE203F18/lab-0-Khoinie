public class Lab00
{
   public static void main(String[] args)
   {
	//Declaring and initializing some variables
	int x = 5;
	String y = "hello";
	double z = 9.8;

	//Printing the variables; check later!!
	System.out.println("x:" + x + "y:" + y + "z:" + z);
      
   //A list (make an array in java)
   int[] nums = [3,6,-1,2];
   for (int val : nums)
      System.out.println(val);
   
   System.out.println("");
   
   }
   
   public static char_count(String s, char c)
   {
      int count = 0;
      for (char ch: s)
         if c == s[count] {
            count++; 
         }
      return count;
}
