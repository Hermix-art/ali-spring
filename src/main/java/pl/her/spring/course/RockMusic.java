package pl.her.spring.course;

public class RockMusic implements Music {

  @Override
  public String getSong() {
    return "Wind cries Mary";
  }

  public void doMyInit(){
    System.out.println("Initializing RockMusic method");
  }
  public void doMyDestroy(){
    System.out.println("Seek and Destroy meethod");
  }
}
