package Models;

public class SudokuModel {
	MyGame population;
	public SudokuModel() {
		population = new MyGame();
	}
	public void makeNewGame() {
		population.makeNewGame();
	}
	public Genome getGenome() {
		return population.getGenome();
	}
	public boolean isSuccess() {
		return population.isMakeNewGameSuccess();
	}
	public static void main(String[] args) {
		SudokuModel s = new SudokuModel();
		s.makeNewGame();
		


	}
}

