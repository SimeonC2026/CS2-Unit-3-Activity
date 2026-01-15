public class Main {

   public static void main(String []args) {
      // CREATE 2 Pet objects with different initial values
      // TEST all Pet methods (getters, toString, setters)
      Pet puppy = new Pet("dog", "Sophie", 5);
      puppy.setName("Sophie");
      puppy.setFillLevel(10);
      System.out.println(puppy);

   }
}
