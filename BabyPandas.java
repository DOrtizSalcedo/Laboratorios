import java.util.HashMap;

/** 
 * Mini aplicación que simula la biblioteca Pandas de Python.
 * @autor: Juan Pablo Cuervo Contreras, David Felipe Ortiz Salcedo
 * @version: 20/02/2026
 */
    
public class BabyPandas{
    private HashMap<String,DataFrame> variables;
    
    /**
     * Constructor para la mini biblioteca.
     */
    public BabyPandas(){
        variables = new HashMap<>();
    } // Cierre del constructor.

    //Define a new variable
    /**
     * Método que da el nombre a una variable.
     * @param name El parámetro name es el nombre que se le dé a la estructura de datos.
     */
    public void define(String name){
        variables.put(name, null);
    } // Cierre del método.
     
    //Assign a DataFrame to an existing variable
    //a := DataFrame
    /**
     * Método que asigna datos a la estructura de datos.
     * @param a El parámetro a es el nombre de la variable.
     * @param data El parámetro data es la información que tiene en las filas.
     * @param columns El parámetro columns es la información que tiene en las filas.
     */
    public void assign(String a, String[][] data, String[] columns){
        DataFrame dataFrame = new DataFrame(data, columns);
        variables.put(a, dataFrame);
    } // Cierre del método.
    
    //Return DataFrame's shape
    /**
     * Método que obtiene el tamaño de la estructura de datos con ayuda del método shape de la clase DataFrame.
     * @param a El parámetro a ayuda a verificar el tamaño de la tabla.
     */
    public int[] shape(String a){
        return variables.get(a).shape();
    }
    
    
    //Assigns the value of a unary operation to a variable
    // a = b op parameters
    //The operator characters are: 'r' select rows, 'c' select columns, '?' select condition
    //The parameters for 'r' are [index1, index2, ...]
    //The parameters for 'c' are [column1, column2, ...]
    //The parameters for '?' are [valueColumn1, valueColumn2, ...]

    public void assignUnary(String a, String b, char op, String [] parameters){
    }
      
    
    //Assigns the value of a binary operation to a variable
    // a = b op c
    //The operator characters are:  'r' concate by rows, 'c' concate by columns
    public void assignBinary(String a, String b, char op, String c){
    }
  
    
    //Return some rows of the DataFrame
    public String head(String variable, int rows){
        return variables.get(variable).head(rows);
    }
    
    
    //If the last operation was successfully completed
    public boolean ok(){
        return false;
    }
}
    



