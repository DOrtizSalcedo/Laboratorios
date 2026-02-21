/**
 * Estructura de datos que contiene datos heterogéneos.
 * @autor: Juan Pablo Cuervo Contreras, David Felipe Ortiz Salcedo
 * @version: 20/02/2026
 */


public class DataFrame {
    private String[][] data;
    private String[] columns;
    private int[] shape;
    
    // Invariante
    // data.length == columns.length
    // shape[0] >= 0
    // shape[1] > 0
    
    /**
     * Constructor para la estructura de datos.
     * @param data Son las filas que contienen información.
     * @param columns Son las columnas que contienen información.
     */
    public DataFrame(String [][] data, String [] columns){
        int helper = 0;
        for(String[] fila : data) {
            if(fila.length == columns.length) {
                helper++;
        }
    }
        this.data = new String[helper][columns.length];
        int secondHelper = 0;
        for(int i = 0; i < data.length; i++) {
            if(data[i].length == columns.length) {
                this.data[secondHelper] = data[i];
                secondHelper++;
            }
        }
        this.shape = new int[]{helper, columns.length};
    } // Cierre del constructor.
    
    /**
     * 
     */
    public DataFrame loc(int [] rows, String columns){
        return null;
    }    
    
    public DataFrame select(String [] values){
        return null;
    }      


    public DataFrame concat(DataFrame [] dfs, byte axis){
        return null;
    }

    public int [] shape(){
        return shape;
    }    
    
   
    // The columns are aligned, separated by three spaces, and include the index.
    //     Nombre   Edad    Profesion
    // 0    Lucía     28    Ingeniero
    // 1   Carlos     35     Profesor
    // 2      Ana     42       Doctor
    // 3    Jorge     30   Arquitecto
    // 4    Elena     25    Diseñador
    /**
     * Método que retorna las primeras filas de una tabla.
     * @param rows El parámetro rows indica las filas de la tabla.
     */
    public String head(int rows) {
        for(int i = 0; i < rows; i++) {
            if(rows >= 2) {
                return this.columns;
                System.out.println(this.dayta);
            } else {
                System.out.println("Cantidad inválida de filas");
            }
        }
    } // Cierre del constructor.
    
    public boolean equals(DataFrame df){
        return false;
    }
    
    public boolean equals(Object o){
        return equals((DataFrame)o);
    }
}
