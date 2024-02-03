package test;

import org.junit.Test;

import varseven_calc.Setka;

import static org.junit.Assert.*;

public class SetkaTest {
    
    @Test
    public void testGeneration() {
        Setka setka = new Setka();
        setka.setMetr(5.0);
        setka.generation();
        double expectedCost = 200.0; // 5.0 * 40
        assertEquals(expectedCost, setka.getCost(), 0.01);
    }
    
    @Test
    public void testDefaultValues() {
        Setka setka = new Setka();
        assertEquals(0.0, setka.getCost(), 0.01); 
        assertEquals(0.0, setka.getMetr(), 0.01); 
    }
    
    @Test
    public void testSetMetr() {
        Setka setka = new Setka();
        double meter = 10.0;
        setka.setMetr(meter);
        assertEquals(meter, setka.getMetr(), 0.01); // Проверяем, что установленное значение метра совпадает с полученным значением
    }
    
}
