public class Artists extends Movie {
    private int age;
   
    
    public  Artists (String name, int age){
        super(name);
        this.age = age;
    }
   
    public Integer getAge(){
        return age;
      }
  
      public void setAge (int age){
        this.age = age;
      }
}

