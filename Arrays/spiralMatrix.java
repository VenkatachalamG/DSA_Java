package Arrays;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        enum Direction {
            RIGHT, LEFT, UP, DOWN;
        }
        List<Integer> ans = new ArrayList<>();
        if (matrix.length == 0){
            System.out.println(ans);;
        }
        int x = 0, y = 0, rows = matrix.length, cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];
        Direction direction = Direction.RIGHT;
        int total = rows * cols;

        while (ans.size() < total){
            ans.add(matrix[x][y]);
            visited[x][y] = true;
            switch(direction) {
                case RIGHT:
                    if (y + 1 < cols && !visited[x][y + 1]) {
                        y++;
                    } else {
                        direction = Direction.DOWN;
                        x++;
                    }
                    break;

                case DOWN:
                    if (x + 1 < rows && !visited[x + 1][y]) {
                        x++;
                    } else {
                        direction = Direction.LEFT;
                        y--;
                    }
                    break;

                case LEFT:
                    if (y - 1 >= 0 && !visited[x][y - 1]) {
                        y--;
                    } else {
                        direction = Direction.UP;
                        x--;
                    }
                    break;

                case UP:
                    if (x - 1 >= 0 && !visited[x - 1][y]) {
                        x--;
                    } else {
                        direction = Direction.RIGHT;
                        y++;
                    }
                    break;
            }
        }
        System.out.println(ans);
    }
}
