/**
 * 
 */
package game;

import javax.swing.JFrame;

/**
 * @author 
 *
 */
public class Main {

	/**
	 * @param args
	 */

	private static GUI instanz=null;

	public static GUI getInstanz(){
		if(instanz==null){
			instanz=new GUI();
		}
		return instanz;
	}


	public static void main(String[] args) {
		getInstanz().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getInstanz().setVisible(true);
	}

}
