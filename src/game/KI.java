/**
 * 
 */
package game;

/**
 * @author ICH
 *
 */
public class KI {
	private Field kiField=new Field();
	private String myString="";
	private String oponentString="";

	public KI(String kiString, String oponentString){
		myString=kiString;
		this.oponentString=oponentString;
	}

	public int[] play(Field tttField){
		kiField.setComplete(tttField.getComplete());
		return findBest();
	}

	private int[] findBest(){
		int bewertung[][]=new int[3][3];
		int auswahl[]=new int[2];
		int auswahlBewertung=-1;

		auswahl[0]=0;
		auswahl[1]=0;
		for(int x=0;x<3;x++){
			for(int y=0;y<3;y++){
				bewertung[x][y]=9999;
			}
		}
		for(int x=0;x<3;x++){
			for(int y=0;y<3;y++){
				if(kiField.getField(x, y)==""){
					kiField.setField(x,y,myString);
					bewertung[x][y]=findBestB(false);
					kiField.setField(x, y, "");
				}
			}
		}
		for(int x=0;x<3;x++){
			for(int y=0;y<3;y++){
				if(bewertung[x][y]!=9999){
					if(bewertung[x][y]>auswahlBewertung){
						auswahl[0]=x;
						auswahl[1]=y;
						auswahlBewertung=bewertung[x][y];
					}
				}
			}
		}
		return auswahl;
	}

	private int findBestB(boolean searchMax){
		String aktWinner="";
		int bewertung[][]=new int[3][3];
		int auswahlBewertung;

		if(searchMax){
			auswahlBewertung=-1;
		} else {
			auswahlBewertung=1;
		}
		aktWinner=kiField.getWinner();
		if(aktWinner==oponentString){
			auswahlBewertung=-100;
		} else if(aktWinner==myString){
			auswahlBewertung=100;
		} else if(aktWinner=="u"){
			auswahlBewertung=0;
		}
		if(aktWinner==""){
			for(int x=0;x<3;x++){
				for(int y=0;y<3;y++){
					bewertung[x][y]=9999;
				}
			}
			for(int x=0;x<3;x++){
				for(int y=0;y<3;y++){
					if(kiField.getField(x, y)==""){
						if(searchMax){
							kiField.setField(x,y,myString);	
						} else {
							kiField.setField(x,y,oponentString);
						}
						bewertung[x][y]=findBestB(searchMax^true);
						kiField.setField(x, y, "");
					}
				}
			}
			for(int x=0;x<3;x++){
				for(int y=0;y<3;y++){
					if(bewertung[x][y]!=9999){
						if(searchMax){
							if(bewertung[x][y]>auswahlBewertung){
								auswahlBewertung=bewertung[x][y];
							}	
						} else {
							if(bewertung[x][y]<auswahlBewertung){
								auswahlBewertung=bewertung[x][y];
							}
						}
					}
				}
			}
		}
		return auswahlBewertung;
	}
}
