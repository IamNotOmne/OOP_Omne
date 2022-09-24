

public class Movie implements Artists {
    String name;
     public void character(){
        System.out.print("Real Name: ");
        System.out.println("Daniel Radcliffe");
     }
    public void age(){
        System.out.print("Age: ");
        System.out.println("33 years old");
    }
   
  public void lines(){
    System.out.println("Famous Line: ");
    System.out.println("I solemnly swear I am up to no good. ");
  }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
