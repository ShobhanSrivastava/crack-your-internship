import java.util.ArrayList;

public class PossiblePaths2DArray {
    public static void main(String[] args) {
        // possiblePathsPrint("", 3, 3);
        System.out.println(possiblePathsDiagonalReturn("", 3, 3));
    }

    static void possiblePathsPrint(String path, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(path);
            return;
        }

        if(c>1){
            possiblePathsPrint(path+'R', r, c-1);
        }

        if(r>1){
            possiblePathsPrint(path+'D', r-1, c);
        }
    }

    static ArrayList<String> possiblePathsReturn(String path, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }

        ArrayList<String> right = new ArrayList<>();
        ArrayList<String> down = new ArrayList<>();

        if(c>1){
            right.addAll(possiblePathsReturn(path+'R', r, c-1));
        }

        if(r>1){
            down.addAll(possiblePathsReturn(path+'D', r-1, c));
        }

        right.addAll(down);
        return right;
    }

    static ArrayList<String> possiblePathsDiagonalReturn(String path, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(c>1){
            list.addAll(possiblePathsDiagonalReturn(path+'R', r, c-1));
        }

        if(r>1 && c>1){
            list.addAll(possiblePathsDiagonalReturn(path+"Di", r-1, c-1));
        }

        if(r>1){
            list.addAll(possiblePathsDiagonalReturn(path+'D', r-1, c));
        }
        return list;
    }
}
