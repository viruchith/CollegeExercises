class Solution {
    public void setRowZeroes(int[][] matrix,Integer[] rows){
        for(int row : rows){
            for(int col = 0 ; col<matrix[row].length ; col++){
                matrix[row][col] = 0;
            }
        }
    }
    
    public void setColumnZeroes(int[][] matrix, Set<Integer> rows, Integer[] columns){
        for(int i = 0 ; i< matrix.length ; i++){
            if(rows.contains(i)){
                continue;
            }
            for(int column : columns){
                matrix[i][column] = 0;
            }
        }
    }
    
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>() ,columns = new HashSet<>();
        
        for(int i = 0 ; i<matrix.length ; i++ ){
            
            if(rows.contains(i)){
                continue;
            }
            
            for(int j = 0; j<matrix[i].length ; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        
        setRowZeroes(matrix,rows.toArray(new Integer[rows.size()]));
        setColumnZeroes(matrix,rows,columns.toArray(new Integer[columns.size()]));
        
        
    }
}
