public class Lab00
{
   public static void main(String[] args)
   {
      //Declaring and initializing some variables
      int x = 5;
      String y = "hello";
      double z = 9.8;

      //Printing the variables
      System.out.println("x: " + x + " y: " + y + " z: " + z);
      
      //A list (make an array in java)
      int[] nums = {3,6,-1,2};
      for (int val : nums) {
         System.out.println(val);
      }
   
      //Call a function
      int numFound = char_count(y, 'l');
      System.out.println("Found: " + numFound);
   
      //A counting for loop
      for (int i = 1; i < 11; i++) {
         System.out.println(i);
   }//NEED TO FIND EQUIVALENT FOR <end = ''>
      System.out.println("");
   
   }
   
   public static int char_count(String s, char c)
   {
      int count = 0;
      for (int i=0; i<s.length(); i++)
         if (s.charAt(i) == c) {
            count++; 
         }
      return count;
}
}
