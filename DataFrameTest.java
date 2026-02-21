import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Permite realizar casos para comprobar que el código funciona.
 * @autor: Juan Pablo Cuervo Contreras, David Felipe Ortiz Salcedo
 * @version: 21/02/2026
 */

public class DataFrameTest{
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp(){
        
    }
    
    /**
     * Verifica que 
     */
    @Test
    public void shouldCreateSmallestDataFrame(){
        String [] columns = {"Nombre", "Edad", "Profesión"};
        String [][] data={};
        int [] shape={0,3};
        DataFrame df=new DataFrame(data,columns);
        assertArrayEquals(shape, df.shape());     
    }
   
    @Test
    public void shouldCreateOtherDataFrame(){
        String [] columns = {"Nombre", "Edad", "Profesión"};
        String [][] data = {{"Carlos", "35", "Profesor"}, 
        {"Ana", "42", "Doctor"}, 
        {"Jorge", "30", "Arquitecto"},
        {"Elena", "25", "Diseñador"}};
        int [] shape={4,3};
        DataFrame df=new DataFrame(data,columns);
        assertArrayEquals(shape, df.shape());   
    }    
    
    @Test
    public void shouldNotCreateBadDataFrame(){
        String [] columns = {"Nombre", "Edad", "Profesión"};
        String [][] data = {{"Carlos", "35"}, 
        {"Ana", "42", "Doctor"}, 
        {"30", "Arquitecto"},
        {"Elena", "25", "Diseñador"}};
        int [] shape={2,3};
        DataFrame df=new DataFrame(data,columns);
        assertArrayEquals(shape, df.shape());   
    }      
    
    @Test
    public void shouldPass() {
        assertEquals(15, 10 + 5);
    }
    
    @Test
    public void shouldFail() {
        assertEquals(4, 10 / 2);
    }
    
    @Test
    public void shouldErr() {
        int suma =  5 + 3;
        try {
          boolean operacionAFallar = suma > 9;
          fail("8 no es mayor a 9.");
        } catch(Exception e) {
            boolean operacionIgual = suma == 8;
            System.out.println("¡Exacto!");
        }
    }
    
    @Test
    (expected = IllegalArgumentException.class)
    public void shouldHaveAName() {
        BabyPandas baby = new BabyPandas();
        baby.define("");
    }
    
    @Test
    (expected = IllegalArgumentException.class)
    public void shouldNotNameNull() {
        BabyPandas baby = new BabyPandas();
        baby.define(null);
    }
    
    @Test
    (expected = NullPointerException.class)
    public void shouldNotAssignNull() {
        BabyPandas baby = new BabyPandas();
        baby.assign(null, null, null);
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
