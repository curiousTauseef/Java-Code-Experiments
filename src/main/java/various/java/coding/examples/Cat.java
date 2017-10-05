package various.java.coding.examples;
public class Cat 
{
	
   private final String breed;
   private final String name;
   private final int age;
   private final double weight;
   private final String furColour;
   private final boolean isFemale;
   private final boolean isMale;
   private final boolean isDeclawed;
   private final boolean isSpayed;
   private final boolean isNeutered;
   private final boolean isStray;
   private final boolean isMicrochipped;
   
   private Cat(
	  final String newBreed,
	  final String newName,
	  final int newAge,
	  final double newWeight,
	  final String newFurColour,
	  final boolean newIsFemale,
	  final boolean newIsMale,
	  final boolean newIsDeclawed,
	  final boolean newIsSpayed,
	  final boolean newIsNeutered,
	  final boolean newIsStray,
	  final boolean newIsMicrochipped)
   {
	  this.breed = newBreed;
      this.name = newName;
      this.age = newAge;
      this.weight = newWeight;
      this.furColour = newFurColour;
      this.isFemale = newIsFemale;
      this.isMale = newIsMale;
      this.isDeclawed = newIsDeclawed;
      this.isSpayed = newIsSpayed;
      this.isNeutered = newIsNeutered;
      this.isStray = newIsStray;
      this.isMicrochipped = newIsMicrochipped;
   }
	   
   public static class CatBuilder
   {
      private String nestedBreed;
      private String nestedName;
      private int nestedAge;
      private double nestedWeight;
      private String nestedFurColour;
      private boolean nestedIsFemale;
      private boolean nestedIsMale;
      private boolean nestedIsDeclawed;
      private boolean nestedIsSpayed;
      private boolean nestedIsNeutered;
      private boolean nestedIsStray;
      private boolean nestedIsMicrochipped;

      public CatBuilder(
         final String newName,
         final String newBreed,
         final int newAge) 
      {
         this.nestedName = newName;
         this.nestedBreed = newBreed;
         this.nestedAge = newAge;
      }
      
      public CatBuilder withBreed(String newBreed)
      {
         this.nestedBreed = newBreed;
         return this;
      }

      public CatBuilder withName(String newName)
      {
         this.nestedName = newName;
         return this;
      }
      
      public CatBuilder withAge(int newAge)
      {
         this.nestedAge = newAge;
         return this;
      }
      
      public CatBuilder withWeight(double newWeight)
      {
         this.nestedWeight = newWeight;
         return this;
      }
      
      public CatBuilder withFurColour(String newFurColour)
      {
         this.nestedFurColour = newFurColour;
         return this;
      }
      
      public CatBuilder isFemale(boolean newIsFemale)
      {
         this.nestedIsFemale = newIsFemale;
         return this;
      }
      
      public CatBuilder isMale(boolean newIsMale)
      {
         this.nestedIsMale = newIsMale;
         return this;
      }
      
      public CatBuilder isDeclawed(boolean newIsDeclawed)
      {
         this.nestedIsDeclawed = newIsDeclawed;
         return this;
      }
      
      public CatBuilder isSpayed(boolean newIsSpayed)
      {
         this.nestedIsSpayed = newIsSpayed;
         return this;
      }
      
      public CatBuilder isNeutered(boolean newIsNeutered)
      {
         this.nestedIsNeutered = newIsNeutered;
         return this;
      }
      
      public CatBuilder isStray(boolean newIsStray)
      {
         this.nestedIsStray = newIsStray;
         return this;
      }
      
      public CatBuilder isMicrochipped(boolean newIsMicrochipped)
      {
         this.nestedIsMicrochipped = newIsMicrochipped;
         return this;
      }    
      
      public Cat createCat() 
      {
    	  return new Cat(
			  nestedName, nestedBreed, nestedAge, nestedWeight, nestedFurColour, 
			  nestedIsFemale, nestedIsMale, nestedIsDeclawed, nestedIsSpayed, 
			  nestedIsNeutered, nestedIsStray, nestedIsMicrochipped);
      }
   }
}
