public class DataFrame {
    private String[][] data;
    private String[] columns;
    private int[] shape;
    
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
    }
    
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
    public String head(int rows) {
      return "";
    }
    
    public boolean equals(DataFrame df){
        return false;
    }
    
    public boolean equals(Object o){
        return equals((DataFrame)o);
    }
}
