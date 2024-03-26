class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int topRow = 0;
        int bottomRow = matrix.length - 1;
        int leftCol = 0;
        int rightCol = matrix[0].length - 1;

        while(topRow <= bottomRow && leftCol <= rightCol){
            for(int i = leftCol; i <= rightCol; i++){
                ans.add(matrix[topRow][i]);
            }
            topRow++;

            for(int i = topRow; i <= bottomRow;i++){
                ans.add(matrix[i][rightCol]);
            }
            rightCol--;

            if(topRow <= bottomRow){
                for(int i = rightCol; i >=leftCol ;i--){
                    ans.add(matrix[bottomRow][i]);
                }
                bottomRow--;
            }

            if(leftCol <= rightCol){
                for(int i = bottomRow; i>=topRow; i--){
                    ans.add(matrix[i][leftCol]);
                }
                leftCol++;
            }
        }
        return ans;
    }
}