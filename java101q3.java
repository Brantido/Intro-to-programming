public class java101q3 {
    public static double sumGrid(double[][] grid) {
        double arrSum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) { 
                arrSum += grid[i][j];
            }
        }
        return arrSum;
    }

    public static void main(String[] arg){
        double[][] grid ={
            {1.1, 2.2, 3.3},
            {4.4, 5.5, 6.6},
            {7.7, 8.8, 9.9}
        };
        System.out.print("The sum of the grid is: " + sumGrid(grid));
    }
}
