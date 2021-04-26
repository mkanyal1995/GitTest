public class Circle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
<<<<<<< HEAD
      System.out.println("Inside Circle::draw() method. for merging conflicts changing in original workspace");
=======
      System.out.println("Inside Circle::draw() method. for merging conflicts changing in cloned workspace");
>>>>>>> 00371315d905be8eea41d4c7ea23580699e306fc
   }
}