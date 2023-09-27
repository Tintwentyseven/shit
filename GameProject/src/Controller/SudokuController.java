package Controller;


import Models.SudokuModel;
import Views.MyView;

public class SudokuController implements Controller {
	SudokuModel model;
	MyView view;
	public SudokuController (SudokuModel model) {
		this.model = model;
		view = new MyView(this, model);
	}
	@Override
	public void makeNewGame() {
		model.makeNewGame();
	}


	
} 
