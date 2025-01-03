class MatricesDibujo {
    public static void main(String[] args) {
        int[][] x = {
            {8, 6, 5, 9, 0, 2, 6, 2, 8, 4, 5, 9, 9, 7, 2, 6, 7, 6, 4, 0},
            {7, 1, 6, 2, 5, 4, 5, 6, 7, 2, 8, 0, 4, 8, 4, 9, 2, 7, 1, 2},
            {3, 6, 4, 9, 7, 6, 6, 8, 5, 7, 2, 0, 3, 9, 2, 9, 9, 1, 3, 1},
            {9, 9, 7, 6, 2, 0, 8, 8, 6, 6, 0, 3, 6, 6, 3, 8, 4, 7, 3, 9},
            {9, 4, 8, 0, 4, 4, 3, 4, 6, 0, 6, 8, 1, 5, 6, 8, 8, 9, 2, 9},
            {6, 4, 3, 5, 9, 0, 4, 8, 1, 2, 0, 6, 0, 2, 1, 1, 2, 7, 0, 6},
            {6, 3, 3, 0, 0, 8, 9, 5, 2, 2, 0, 9, 2, 0, 0, 0, 1, 6, 3, 3},
            {6, 0, 6, 9, 5, 7, 4, 0, 7, 3, 1, 1, 6, 2, 4, 3, 2, 8, 8, 8},
            {4, 9, 1, 2, 3, 6, 7, 4, 4, 5, 0, 7, 4, 5, 6, 9, 1, 6, 2, 8},
            {3, 2, 7, 1, 0, 7, 1, 4, 4, 8, 7, 6, 6, 0, 3, 0, 3, 1, 3, 1},
            {1, 2, 2, 3, 5, 2, 2, 8, 1, 2, 5, 0, 7, 3, 6, 9, 5, 9, 5, 3},
            {9, 6, 7, 4, 6, 8, 7, 2, 1, 3, 8, 2, 6, 3, 2, 7, 7, 3, 1, 0},
            {7, 0, 4, 6, 3, 2, 4, 5, 2, 8, 2, 2, 2, 0, 5, 5, 9, 4, 2, 2},
            {0, 0, 1, 1, 1, 1, 8, 1, 1, 1, 1, 5, 9, 0, 4, 7, 1, 8, 9, 5},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 9, 3, 9, 9, 6, 4, 6, 0, 8},
            {4, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 5, 7, 2, 0, 7, 8, 8, 7, 3},
            {0, 5, 1, 0, 0, 0, 0, 0, 0, 0, 1, 3, 9, 4, 8, 0, 7, 0, 0, 2},
            {2, 6, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 3, 1, 8, 8, 3, 5, 8},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 5, 6, 1, 5, 5, 4, 7, 0},
            {5, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 2, 6, 9, 2, 4, 9, 9, 0}
        };
        imprimir(x);
    }
    
    static void imprimir(int[][] x){
        System.out.println("===".repeat(x[0].length));
        for(int fila=0; fila<x.length; fila++){
            for(int columna=0; columna<x[fila].length; columna++){
                System.out.print(parse(x[fila][columna]));
            }
            System.out.println();
        }   
        System.out.println("===".repeat(x[0].length));
    }
    
    static String parse(int valor){
        final String[] TILES = {
            "   ",
            "[#]",
            " ' ",
            "<->",
            "'''",
            ", '",
            "/^\\",
            "^|^",
            ":|:",
            "-_-"
        };
        return TILES[valor];
    }
    
}

