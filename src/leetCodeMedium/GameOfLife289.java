package leetCodeMedium;

public class GameOfLife289 {

	public static void main(String[] args) {
		int[][] grid = { { 0, 1, 0 }, { 0, 0, 1 }, { 1, 1, 1 }, { 0, 0, 0 } };
		gameOfLife(grid);

	}

	public static void gameOfLife(int[][] board) {
		final int[][] DIRECTIONS = { { -1, 0 }, // Up
				{ 1, 0 }, // Down
				{ 0, -1 }, // Left
				{ 0, 1 }, // Right
				{ -1, -1 }, // Up-Left
				{ -1, 1 }, // Up-Right
				{ 1, -1 }, // Down-Left
				{ 1, 1 } // Down-Right
		};
		int[][] grid = new int[board.length][board[0].length];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				// System.out.println(board[i][j]);
				int count = 0;
				for (int[] direction : DIRECTIONS) {
					int newRow = i + direction[0];
					int newCol = j + direction[1];

					// Check if new position is within grid bounds
					if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[i].length
							&& board[newRow][newCol] == 1) {
						// System.out.println("Value at (" + newRow + ", " + newCol + "): " +
						// board[newRow][newCol]);
						count++;
					}
				}
				if (board[i][j] == 0 && count == 3) {
					grid[i][j] = 1;
				}
				if (board[i][j] == 1) {
					if (count < 2)
						grid[i][j] = 0;
					if (count == 2 || count == 3)
						grid[i][j] = 1;
					if (count > 3)
						grid[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				// System.out.print(cell + " ");
				board[i][j] = grid[i][j];
			}
			// System.out.println();
		}
	}

}
