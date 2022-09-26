public class Main {
    public static void main(String[] args) {
      Movie names = new Movie("\"Harry Potter\"");
      Artists info = new Artists("Daniel Radcliffe", 32);

      System.out.println("The movie " + names.getName());
      System.out.println("The main character's name is " + info.getName() + " and his age is " + info.getAge() + ".");
   
      
      
      
    }

}     