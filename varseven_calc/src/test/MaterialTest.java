package test;
import org.junit.Test;
import static org.junit.Assert.*;
import varseven_calc.Material;

public class MaterialTest {
<<<<<<< HEAD
	class ConcreteMaterial extends Material {
	    @Override
	    public void generation() {
	        setCost(100.0);
	    }
	}
	 @Test
	    public void testGeneration() {
	        Material material = new ConcreteMaterial();
	        material.generation();
	        double cost = material.getCost();
	        assertEquals(100.0, cost, 0.01);
	    }

	    @Test
	    public void testGetCost() {
	        Material material = new ConcreteMaterial();
	        material.setCost(150.0);
	        double cost = material.getCost();
	        assertEquals(150.0, cost, 0.01);
	    }
}
=======
  class ConcreteMaterial extends Material {
      @Override
      public void generation() {
          setCost(100.0);
      }
  }
   @Test
      public void testGeneration() {
          Material material = new ConcreteMaterial();
          material.generation();
          double cost = material.getCost();
          assertEquals(100.0, cost, 0.01);
      }

      @Test
      public void testGetCost() {
          Material material = new ConcreteMaterial();
          material.setCost(150.0);
          double cost = material.getCost();
          assertEquals(150.0, cost, 0.01);
      }
}
>>>>>>> 99ad449ed4177c6000b46fb0fcdd23c8a91ab08e
