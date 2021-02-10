public class Program1 
{
   public static void main(String[] args) 
   {
    String a = "Peter";
    int vowels = 0;
    
    for (int i = 0; i < a.length(); ++i) {
      char ch = a.charAt(i);
          
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
    	++vowels;
    }
    System.out.println("Vowels: " + vowels);
    }
   }
}