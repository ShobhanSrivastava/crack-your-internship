import java.util.ArrayList;

public class MazeRoutes {
    public static void main(String[] args) {
        Boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true},
        };
        mazeRoutes(maze, 0, 0, "");
    }

    static ArrayList<String> mazeRoutesPrint(Boolean[][] maze, int r, int c, String path){
        if(r == 2 && c == 2){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }

        maze[r][c] = false;
        ArrayList<String> list = new ArrayList<>();

        if(c < maze[0].length-1){
            list.addAll(mazeRoutesPrint(maze, r, c+1, path+'R'));
        }

        if(r < maze.length-1){
            list.addAll(mazeRoutesPrint(maze, r+1, c, path+'D'));
        }

        if(c > 0){
            list.addAll(mazeRoutesPrint(maze, r, c-1, path+'L'));
        }

        if(r > 0){
            list.addAll(mazeRoutesPrint(maze, r-1, c, path+'U'));
        }

        maze[r][c] = true;

        return list;
    }

    static void mazeRoutes(Boolean[][] maze, int r, int c, String path){
        if(r == 2 && c == 2){
            System.out.println(path);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;

        if(c < maze[0].length-1){
            mazeRoutes(maze, r, c+1, path+'R');
        }

        if(r < maze.length-1){
            mazeRoutes(maze, r+1, c, path+'D');
        }

        if(c > 0){
            mazeRoutes(maze, r, c-1, path+'L');
        }

        if(r > 0){
            mazeRoutes(maze, r-1, c, path+'U');
        }

        maze[r][c] = true;
    }
}
