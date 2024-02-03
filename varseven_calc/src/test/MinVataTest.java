package test;
import varseven_calc.MinVata;
import org.junit.Assert;
import org.junit.Test;


public class MinVataTest {

    @Test
    public void testGetMetr() {
        MinVata minVata = new MinVata();
        minVata.setMetr(5.0);
        double expectedMetr = 5.0;
        double actualMetr = minVata.getMetr();
        Assert.assertEquals(expectedMetr, actualMetr, 0.001);
    }

    @Test
    public void testSetMetr() {
        MinVata minVata = new MinVata();
        minVata.setMetr(7.5);
        double expectedMetr = 7.5;
        double actualMetr = minVata.getMetr();
        Assert.assertEquals(expectedMetr, actualMetr, 0.001);
    }

    @Test
    public void testGeneration() {
        MinVata minVata = new MinVata();
        minVata.setMetr(10.0);
        minVata.generation();
        double expectedCost = 2000.0;
        double actualCost = minVata.getCost();
        Assert.assertEquals(expectedCost, actualCost, 0.001);
    }

}