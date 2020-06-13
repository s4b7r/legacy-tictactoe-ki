/**
 * 
 */
package game;

/**
 * @author ICH
 *
 */
public class Field {

	private String gameField[][]=new String[3][3];

	public Field(){
		for(int x=0;x<3;x++){
			for(int y=0;y<3;y++){
				gameField[x][y]="";
			}
		}
	}
	
	public void setField(int x, int y, String setTo){
		gameField[x][y]=setTo;
	}

	public String getField(int x, int y){
		return gameField[x][y];
	}

	public void setComplete(String setTo[][]){
		gameField=setTo;
	}

	public String[][] getComplete(){
		return gameField;
	}

	public String getWinner(){
		String winner="";
		int count=0;

		for(int i=0;i<3;i++){
			if(countInRow(i,"x")>=3 || countInLine(i,"x")>=3){
				winner="x";
			}
			if(countInRow(i,"o")>=3 || countInLine(i,"o")>=3){
				winner="o";
			}
			if(i<3){
				if(countInCros(i,"x")>=3){
					winner="x";
				}
				if(countInCros(i,"o")>=3){
					winner="o";
				}
			}
		}
		if(winner==""){
			for(int x=0;x<3;x++){
				for(int y=0;y<3;y++){
					if(gameField[x][y]!=""){
						count++;
					}
				}
			}
			if(count>=9){
				winner="u";
			}
		}
		return winner;
	}

	private int countInRow(int row, String lookFor){
		int count=0;

		for(int y=0;y<3;y++){
			if(gameField[row][y]==lookFor){
				count++;
			}
		}
		return count;
	}

	private int countInLine(int line, String lookFor){
		int count=0;

		for(int x=0;x<3;x++){
			if(gameField[x][line]==lookFor){
				count++;
			}
		}
		return count;
	}

	private int countInCros(int halfCros, String lookFor){
		int count=0;

		if(halfCros==0){
			if(gameField[0][0]==lookFor){
				count++;
			}
			if(gameField[2][2]==lookFor){
				count++;
			}
		}else if(halfCros==1){
			if(gameField[2][0]==lookFor){
				count++;
			}
			if(gameField[0][2]==lookFor){
				count++;
			}
		}
		if(gameField[1][1]==lookFor){
			count++;
		}
		return count;
	}
}
