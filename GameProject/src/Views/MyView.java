package Views;

import java.awt.*;
import java.util.Iterator;
import java.util.Random;
import java.util.Timer;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.PanelUI;
import javax.swing.plaf.basic.BasicDirectoryModel;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.text.AttributeSet.FontAttribute;

import Canvas.BoardGraphics;

import javax.swing.border.Border;

import Controller.Controller;
import Models.SudokuModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyView extends JFrame implements ActionListener {
	JTextField[][] board = new JTextField[9][9];
	int[][] state = new int[9][9];
	int[][] stateSolve = new int[9][9];
	int numberCellIllegal = 0;
	JButton jbNew, jbSolved, jbCheck, jbReset,jbPlayAgain,jbStop;
	JLabel lbMessage;
	JLabel lbMessage2;
	JComboBox<String> comboBox;
	Controller controller;
	SudokuModel model;
	Random random = new Random();
	boolean reset = true;
	Font font = new Font("Arial", Font.BOLD, 16);
	ColorUIResource colorMain = new ColorUIResource(0, 128, 255);
	Color colorButton = new Color(0, 128, 255);
	Color colorOpacity = new Color(93, 174, 255);
	ColorUIResource colorCell = new ColorUIResource(178, 231, 250);
	ColorUIResource colorText = new ColorUIResource(255, 51, 51);
	Color colorSolved = new Color(255, 221, 221);
	private int remainingTime;
	private GameTimer gameTimer;
	private int clickCount = 0; // Số lần sử dụng tính năng "Gợi ý"
	
	public MyView(Controller controller, SudokuModel model) {
		this.controller = controller;
		this.model = model;
		init();
		//

	}

	public MyView() {

	}

	public void init() {
		setTitle("Sudoku Game");
		setSize(700, 500);
		createView();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	

	public void createView() {
		JPanel container = new JPanel();
		add(container);
		container.setLayout(new BorderLayout());
		JLayeredPane boardPanel = new BoardGraphics(new GridLayout(9, 9, 2, 2));
		

//		boardPanel.setBackground(Color.white);
		JPanel controlPanel = new JPanel(new BorderLayout());
		controlPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		controlPanel.setBackground(Color.white);
		boardPanel.setBorder(new LineBorder(colorMain, 5));
		container.add(boardPanel, BorderLayout.CENTER);
		container.add(controlPanel, BorderLayout.EAST);

		//
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {

				board[i][j] = new JTextField();
				board[i][j].addActionListener(this);
				board[i][j].setHorizontalAlignment(JTextField.CENTER);
				
				board[i][j].setBorder(new LineBorder(colorMain, 1));
				board[i][j].setFont(new Font("Arial", Font.BOLD, 25));
				board[i][j].setForeground(colorText);

				boardPanel.add(board[i][j]);

			}
		}
		//

		comboBox = new JComboBox<String>(new String[] { "Dễ", "Trung Bình", "Khó" });
		comboBox.setPreferredSize(new DimensionUIResource(110, 20));
		comboBox.setBackground(colorMain);
		comboBox.setForeground(Color.white);
		comboBox.setOpaque(true);

		JLabel label = new JLabel("Độ khó: ");
		JPanel headerPanel = new JPanel();
		headerPanel.add(label);
		headerPanel.add(comboBox);
		headerPanel.setBackground(Color.white);
		headerPanel.setBorder(new LineBorder(colorMain, 2));

		jbNew = new JButton("Trò chơi mới");
		jbNew.addActionListener(this);
		setUI(jbNew);
		setHover(jbNew);

		jbSolved = new JButton("Giải");
		setUI(jbSolved);
		setHover(jbSolved);
		jbSolved.addActionListener(this);
		jbPlayAgain = new JButton("Chơi lại");
		setUI(jbPlayAgain);
		setHover(jbPlayAgain);
		jbPlayAgain.addActionListener(this);

		jbCheck = new JButton("Kiểm tra");
		setUI(jbCheck);
		setHover(jbCheck);
		jbCheck.addActionListener(this);
		JPanel panelBt = new JPanel();
		panelBt.setPreferredSize(new DimensionUIResource(200, 220));
//		BoxLayout boxLayout = new BoxLayout(panelBt, BoxLayout.Y_AXIS);
		panelBt.setLayout(new GridLayout(6, 1, 5, 5));
		panelBt.add(headerPanel);
		JButton jbStop = new JButton("Dừng");
		setUI(jbStop);
		setHover(jbStop);
		
			jbStop.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					// TODO Auto-generated method stub
					clickCount++;
			        if (clickCount % 2 == 1) {
			            // dừng thời gian khi nhấn nút lẻ
			            gameTimer.stop();
			            jbStop.setText("Tiếp tục");
			        } else {
			            // tiếp tục chạy thời gian khi nhấn nút chẵn
			            gameTimer.start();
			            jbStop.setText("Dừng");
			        }
				}
			});

		panelBt.add(jbNew);
		panelBt.add(jbSolved);
		panelBt.add(jbCheck);
		panelBt.add(jbPlayAgain);
		panelBt.add(jbStop);
		lbMessage = new JLabel("        Hãy tạo trò chơi mới       ");
		lbMessage2 = new JLabel("");
		JButton lbTitle = new JButton("Sudoku Game");
		lbTitle.setBackground(Color.white);
		lbTitle.setBorder(null);
		lbTitle.setEnabled(true);
		lbTitle.setFont(new Font("Arial", Font.BOLD, 25));
		lbTitle.setForeground(colorMain);
		lbMessage.setFont(new Font("Arial", Font.BOLD, 15));
		lbMessage.setBackground(Color.white);
		lbMessage.setBorder(null);
		lbMessage.setEnabled(true);
		lbMessage2.setFont(new Font("Arial", Font.BOLD, 15));
		lbMessage2.setBackground(Color.white);
		lbMessage2.setBorder(null);
		lbMessage2.setEnabled(true);
		JPanel panelInfo = new JPanel();
		panelInfo.add(lbTitle);
		panelInfo.add(lbMessage);
		panelInfo.add(lbMessage2);
		panelInfo.setBorder(new LineBorder(colorMain,2));
		panelInfo.setLayout(new GridLayout(8, 1, 10, 10));
		

		panelInfo.setBackground(Color.white);
		
		
		controlPanel.add(panelInfo,BorderLayout.CENTER);
		controlPanel.add(panelBt,BorderLayout.NORTH);
//		jbStop.setPreferredSize(new Dimension(200, 40));

//		JPanel panelStop = new JPanel();
//		panelStop.add(jbStop);
//		panelStop.setBackground(Color.white);

//		controlPanel.add(panelStop, BorderLayout.SOUTH);

	}

	public void setUI(JComponent component) {
		component.setBackground(colorButton);
		component.setForeground(Color.white);
		component.setFont(font);
		component.setCursor(new Cursor(Cursor.HAND_CURSOR));
		component.setBorder(null);

	}

	public void setHover(JComponent component) {
		component.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				component.setBackground(colorOpacity);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				component.setBackground(colorButton);
			}
		});
	}

	public void level() {
		int level = 2;
		switch (comboBox.getSelectedIndex()) {
		case 0:
			level = 2;
			 remainingTime = 300; // 5 minutes
			break;
		case 1:
			level = 4;
			 remainingTime = 600; // 5 minutes
			break;
		case 2:
			level = 8;
			remainingTime = 900; // 5 minutes
//			lbMessage2.setText("Time remaining: 15:00");
			break;

		default:
			break;
		}
		  if (gameTimer != null) {
		        gameTimer.stop();
		        gameTimer.setRemainingTime(remainingTime);
		    } else {
		        gameTimer = new GameTimer(1000, null, lbMessage2, remainingTime); // Giảm delay xuống còn 1000
//		        gameTimer.addActionListener(gameTimer);
		    }

		    gameTimer.start();
		    lbMessage2.setText(String.format("Time remaining: %02d:%02d", remainingTime / 60, remainingTime % 60));
		

		for (int l = 0; l < level; l++) {
			for (int k = 0; k < 9; k++) {
				int i = 1 + random.nextInt(8);
				state[k][i] = 0;
			}
			for (int k = 0; k < 9; k++) {
				int i = 1 + random.nextInt(8);
				state[i][k] = 0;
			}
		}

	}
	

	public void checkWin() {
	    boolean win = true;
	    int elapsedSeconds = 0; // khởi tạo biến lưu thời gian chơi
	    for (int i = 0; i < 9; i++) {
	        for (int j = 0; j < 9; j++) {
	            if (board[i][j].isEditable()) {
	                String inputUser = board[i][j].getText();
	                if (!inputUser.equals(String.valueOf(stateSolve[i][j]))) {
	                    win = false;
	                    numberCellIllegal++;
	                    board[i][j].setBackground(Color.red);
	                    board[i][j].setForeground(Color.yellow);
	                } else {
	                    board[i][j].setBackground(Color.white);
	                    board[i][j].setForeground(Color.black);
	                }
	            }
	        }
	    }
	    if (win) {
	        JOptionPane.showMessageDialog(this, "Chúc mừng bạn đã giải thành công");
	        lbMessage.setText("Winner !!!\n Tạo trò chơi mới");
	    } else {
	        int score = 81 - numberCellIllegal;
	        lbMessage.setText(score + "/81đ");
	        lbMessage.setHorizontalAlignment(SwingConstants.CENTER);
	        gameTimer.stop();
	        lbMessage2.setText("Time remaining: 00:00");
	        elapsedSeconds = remainingTime - gameTimer.getRemainingTime(); // tính thời gian chơi
	        lbMessage2.setText(String.format("Thời gian chơi: %02d:%02d", elapsedSeconds / 60, elapsedSeconds % 60)); // in thời gian chơi vào JLabel
	        lbMessage2.setHorizontalAlignment(SwingConstants.CENTER);
	    }
	    numberCellIllegal = 0;
	}
	public void display2(int board[][]) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(" " + board[i][j]);
			}

			System.out.println();
		}

		System.out.println();
	}

	public void resetBoard() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				board[i][j].setText("");
				state[i][j] = 0;
				board[i][j].setBackground(Color.white);
				board[i][j].setEditable(true);
				board[i][j].setForeground(colorText);
			}
		}
	}

	public boolean isNumeric(String strNum) {
		try {
			int d = Integer.parseInt(strNum);
			if (!(d > 0 && d <= 9)) {
				return false;
			}
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public void handleExceptionInput() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				int i1 = i;
				int i2 = j;
				board[i][j].getDocument().addDocumentListener(new DocumentListener() {
					@Override
					public void removeUpdate(DocumentEvent e) {
						board[i1][i2].setBackground(Color.white);
						board[i1][i2].setForeground(Color.red);

					}

					@Override
					public void insertUpdate(DocumentEvent e) {
						board[i1][i2].setBackground(Color.white);
						board[i1][i2].setForeground(Color.red);

					}

					@Override
					public void changedUpdate(DocumentEvent e) {
						board[i1][i2].setBackground(Color.white);
						board[i1][i2].setForeground(Color.red);
					}
				});
			}
		}
	}

	public boolean isEmtry() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (!(state[i][j] == 0)) {
					return false;
				}

			}
		}
		return true;
	}

	public void showBoard() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (state[i][j] != 0) {
					board[i][j].setText(String.valueOf(state[i][j]));
//					
					board[i][j].setEditable(false);
					board[i][j].setBackground(colorCell);
					board[i][j].setForeground(Color.black);
				}

			}
		}
	}

	public int[][] copyState(int[][] state) {
		int[][] result = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				result[i][j] = state[i][j];
			}
		}
		return result;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbNew) {
			resetBoard();
			controller.makeNewGame();
			state = copyState(model.getGenome().getState());
			stateSolve = copyState(model.getGenome().getState());
			level();
			showBoard();
			display2(state);
			if(model.isSuccess()) {
				lbMessage.setText("   Tạo trò chơi thành công   " );
				lbMessage2.setHorizontalAlignment(SwingConstants.CENTER);

			
				
			}else {
				lbMessage.setText("   Tạo trò chơi thất bại   ");
				lbMessage2.setHorizontalAlignment(SwingConstants.CENTER);
			}
			
			System.out.println("xong");
		}
		if (e.getSource() == jbSolved) {
			if (!isEmtry()) {
				for (int i = 0; i < 9; i++) {
					for (int j = 0; j < 9; j++) {

						if (board[i][j].isEditable()) {
							board[i][j].setText(String.valueOf(stateSolve[i][j]));
							board[i][j].setBackground(Color.white);
							board[i][j].setForeground(Color.black);
							
						}
					}
				}
			} else {
				JOptionPane.showMessageDialog(this, "Bạn phải tạo trò chơi mới");

			}
		}
		boolean isTimerRunning = true;
		long startTime = 0;
		 if (e.getSource() == jbPlayAgain) {
			 lbMessage.setText("");
			 if (!isEmtry()) {
					for (int i = 0; i < 9; i++) {
						for (int j = 0; j < 9; j++) {

							if (board[i][j].isEditable()) {
								level();
								
								board[i][j].setText("");
								board[i][j].setBackground(Color.white);
								board[i][j].setForeground(Color.red);
							}
						}
					}
			 }
		 }
		

		if (e.getSource() == jbCheck) {
			checkWin();
			handleExceptionInput();
			System.out.println("hello");
		}
//	
//		  if (e.getSource() == jbStop) {
//			  int clickCount = 0;
//			clickCount ++;
//		        if (clickCount % 2 == 1) {
//		            // xử lý sự kiện khi nhấn nút số lẻ
//		        	gameTimer.stop();
//		        	System.out.println("lẻ");
//		        } else {
//		            // xử lý sự kiện khi nhấn nút số chẵn
//		        	gameTimer.start();
//		        	System.out.println("");
//		        }
//		        }
		    }
	}

	


