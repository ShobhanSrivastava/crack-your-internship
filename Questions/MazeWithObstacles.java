import java.util.ArrayList;

public class MazeWithObstacles {
    public static void main(String[] args) {
        Boolean[][] maze = {{true, true, false}, {true, true, true}, {true, true, true}, };
        System.out.println(paths(maze, "", 0, 0));
    }

    static ArrayList<String> paths(Boolean[][] maze, String path, int r, int c){
        if(r == 2 && c == 2){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r<2 && maze[r+1][c] != false){
            list.addAll(paths(maze, path+'D', r+1, c));
        }

        if(c<2 && maze[r][c+1] != false){
            list.addAll(paths(maze, path+'R', r, c+1));
        }

        return list;
    }
}
