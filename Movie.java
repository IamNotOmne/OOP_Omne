public class Movie implements LineInterface {
    private String name;

    public Movie(String name){
      this.name = name;
    }

    public String getName(){
      return name;
    }

    public void setName (String name){
      this.name = name;
    }
    public void line(){
      System.out.println("I'm sorry, professor. I must not tell lies");
    }
}


