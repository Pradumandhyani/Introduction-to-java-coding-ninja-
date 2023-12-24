public class nQueens {
    public static void nQueen(char boards[][],int row){
        if(row==boards.length){
            printBoards(boards);
            return;
        }
       
        for (int i=0;i<boards.length;i++){
            if(isSafe(boards, row, i)){
            boards[row][i]='Q';
            nQueen(boards, row+1);
            boards[row][i]='x';}
        }
    }
    public static void printBoards(char boards[][]){
        System.out.println("........chess......");
        for(int i=0;i<boards.length;i++){
            for(int j=0;j<boards.length;j++){
                System.out.print(boards[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char boards[][],int row,int col){
        //vertical up 
        for(int i=row-1;i>=0;i--){
            if(boards[i][col]=='Q'){
                return false;
            }
        }
        // left up 
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(boards[i][j]=='Q'){
                return false;
            }
        }
        // right up 
        for(int i=row-1,j=col+1;i>=0 && j<boards.length;i--,j++){
            if(boards[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=4;
        char[][] boards=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                boards[i][j]='x';
            }
        }
        nQueen(boards,0);
    }
}
