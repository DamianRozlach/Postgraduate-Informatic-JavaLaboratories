package pl.edu.agh.asd2.array;

public class Exercise07Array2D {
    
	public static final String X = "X";
	public static final String O = "O";
	public static final String EMPTY = "_";
	
	public static final boolean checkTicTacToeBoard(String[][] board) {
        // TODO: implement
		
		if(board ==null) return false;
		else if(board.length != 3) {
			throw new IllegalArgumentException();
		}
		else {
			boolean winn = false;
			int sumO = 0;
			int sumX = 0;
			for(int j = 0;j < 3;j++) {
				sumO=0;
				sumX=0;
				for(int i =0;i<3;i++) {
					if(board[j][i]=="X")sumX += 1;
					if(board[j][i]=="O")sumO += 1;
				}
				if(sumX == 3||sumO ==3) winn=true;
			}
			for(int j = 0;j < 3;j++) {
				sumO=0;
				sumX=0;
				for(int i =0;i<3;i++) {
					if(board[i][j]=="X")sumX += 1;
					if(board[i][j]=="O")sumO += 1;
				}
				if(sumX == 3||sumO ==3) winn=true;
			}
			sumO=0;
			sumX=0;
			for(int p =0;p<3;p++) {
				if(board[p][2-p]=="X")sumX += 1;
				if(board[p][2-p]=="O")sumO += 1;
			}
			if(sumX == 3||sumO ==3) winn=true;
			sumO=0;
			sumX=0;
			for(int p =0;p<3;p++) {
				if(board[p][p]=="X")sumX += 1;
				if(board[p][p]=="O")sumO += 1;
			}
			if(sumX == 3||sumO ==3) winn=true;
			return winn;
		}
    }

}