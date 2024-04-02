class MaxOnes {


        public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 1}
        }; 
        
        int rowIndex = find(matrix);
        
        if (rowIndex != -1) {
            System.out.println("Row with the maximum number of 1's: " + rowIndex);
        } else {
            System.out.println("No row with 1's found.");
        }
    }


    
    public static int find(int[][] matrix) {
        int maxOnesCount = 0;
        int maxOnesRowIndex = -1;
        
        for (int i = 0; i < matrix.length; i++) {
            int onesCount = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    onesCount++;
                }
            }
            if (onesCount > maxOnesCount) {
                maxOnesCount = onesCount;
                maxOnesRowIndex = i;
            }
        }
        
        return maxOnesRowIndex;
    }
    
    
}
