import java.util.Random;

public class Password {
   public String password= ""; 
   public String company; 

   public String CreatePassword(){
       java.util.Random rand = new Random();
       Association association = new Association();
       for(int i=0; i < 16; i++){
           password += association.association_array[rand.nextInt(75)];
       }
       return password;
   }
   public static void main(String args[]){
    Password pass = new Password();
    String password = pass.CreatePassword();
    System.out.println(password);
   }
}