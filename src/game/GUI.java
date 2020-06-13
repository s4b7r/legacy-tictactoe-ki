/**
 * 
 */
package game;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Rectangle;
import javax.swing.JLabel;

/**
 * @author 
 *
 */
public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JButton jcb_X00 = null;
	private JButton jcb_X10 = null;
	private JButton jcb_X20 = null;
	private JButton jcb_X01 = null;
	private JButton jcb_X11 = null;
	private JButton jcb_X21 = null;
	private JButton jcb_X02 = null;
	private JButton jcb_X12 = null;
	private JButton jcb_X22 = null;
	private JButton jcb_StartNew = null;
	private JButton jcb_BeginPC = null;

	private String whosDran="";  //  @jve:decl-index=0:
	private Field tttField=new Field();  //  @jve:decl-index=0:
	private KI tttKI=new KI("o","x");  //  @jve:decl-index=0:
	private JLabel jlb_Output = null;
	private int cheatCount=0;
	private boolean cheat=false;
	
	/**
	 * This is the default constructor
	 */
	public GUI() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(360, 218);
		this.setResizable(false);
		this.setContentPane(getJContentPane());
		this.setTitle("TicTacToe");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jlb_Output = new JLabel();
			jlb_Output.setBounds(new Rectangle(210, 135, 121, 46));
			jlb_Output.setText("");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJcb_X00(), null);
			jContentPane.add(getJcb_X10(), null);
			jContentPane.add(getJcb_X20(), null);
			jContentPane.add(getJcb_X01(), null);
			jContentPane.add(getJcb_X11(), null);
			jContentPane.add(getJcb_X21(), null);
			jContentPane.add(getJcb_X02(), null);
			jContentPane.add(getJcb_X12(), null);
			jContentPane.add(getJcb_X22(), null);
			jContentPane.add(getJcb_StartNew(), null);
			jContentPane.add(getJcb_BeginPC(), null);
			jContentPane.add(jlb_Output, null);
			jContentPane.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					if(e.getX()>332){
						cheatCount=1;
					}
				}
				public void mousePressed(java.awt.event.MouseEvent e) {
				}
				public void mouseReleased(java.awt.event.MouseEvent e) {
				}
				public void mouseEntered(java.awt.event.MouseEvent e) {
				}
				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return jContentPane;
	}

	/**
	 * This method initializes jcb_X00	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJcb_X00() {
		if (jcb_X00 == null) {
			jcb_X00 = new JButton();
			jcb_X00.setBounds(new Rectangle(15, 15, 46, 46));
			jcb_X00.setEnabled(false);
			jcb_X00.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					clickedX(0,0);
				}
			});
			jcb_X00.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseEntered(java.awt.event.MouseEvent e) {
					if(cheatCount==3){
						cheat=true;
					}
				}
				public void mouseClicked(java.awt.event.MouseEvent e) {
				}
				public void mousePressed(java.awt.event.MouseEvent e) {
				}
				public void mouseReleased(java.awt.event.MouseEvent e) {
				}
				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return jcb_X00;
	}

	/**
	 * This method initializes jcb_X10	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJcb_X10() {
		if (jcb_X10 == null) {
			jcb_X10 = new JButton();
			jcb_X10.setBounds(new Rectangle(75, 15, 46, 46));
			jcb_X10.setEnabled(false);
			jcb_X10.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					clickedX(1,0);
				}
			});
			jcb_X10.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseEntered(java.awt.event.MouseEvent e) {
					cheatCount=0;
				}
				public void mouseClicked(java.awt.event.MouseEvent e) {
				}
				public void mousePressed(java.awt.event.MouseEvent e) {
				}
				public void mouseReleased(java.awt.event.MouseEvent e) {
				}
				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return jcb_X10;
	}

	/**
	 * This method initializes jcb_X20	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJcb_X20() {
		if (jcb_X20 == null) {
			jcb_X20 = new JButton();
			jcb_X20.setBounds(new Rectangle(135, 15, 46, 46));
			jcb_X20.setEnabled(false);
			jcb_X20.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					clickedX(2,0);
				}
			});
			jcb_X20.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseEntered(java.awt.event.MouseEvent e) {
					cheatCount=0;
				}
				public void mouseClicked(java.awt.event.MouseEvent e) {
				}
				public void mousePressed(java.awt.event.MouseEvent e) {
				}
				public void mouseReleased(java.awt.event.MouseEvent e) {
				}
				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return jcb_X20;
	}

	/**
	 * This method initializes jcb_X01	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJcb_X01() {
		if (jcb_X01 == null) {
			jcb_X01 = new JButton();
			jcb_X01.setBounds(new Rectangle(15, 75, 46, 46));
			jcb_X01.setEnabled(false);
			jcb_X01.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					clickedX(0,1);
				}
			});
			jcb_X01.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseEntered(java.awt.event.MouseEvent e) {
					cheatCount=0;
				}
				public void mouseClicked(java.awt.event.MouseEvent e) {
				}
				public void mousePressed(java.awt.event.MouseEvent e) {
				}
				public void mouseReleased(java.awt.event.MouseEvent e) {
				}
				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return jcb_X01;
	}

	/**
	 * This method initializes jcb_X11	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJcb_X11() {
		if (jcb_X11 == null) {
			jcb_X11 = new JButton();
			jcb_X11.setBounds(new Rectangle(75, 75, 46, 46));
			jcb_X11.setEnabled(false);
			jcb_X11.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					clickedX(1,1);
				}
			});
			jcb_X11.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseEntered(java.awt.event.MouseEvent e) {
					cheatCount=0;
				}
				public void mouseClicked(java.awt.event.MouseEvent e) {
				}
				public void mousePressed(java.awt.event.MouseEvent e) {
				}
				public void mouseReleased(java.awt.event.MouseEvent e) {
				}
				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return jcb_X11;
	}

	/**
	 * This method initializes jcb_X21	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJcb_X21() {
		if (jcb_X21 == null) {
			jcb_X21 = new JButton();
			jcb_X21.setBounds(new Rectangle(135, 75, 46, 46));
			jcb_X21.setEnabled(false);
			jcb_X21.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					clickedX(2,1);
				}
			});
			jcb_X21.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseEntered(java.awt.event.MouseEvent e) {
					if(cheatCount==2){
						cheatCount=3;
					}
				}
				public void mouseClicked(java.awt.event.MouseEvent e) {
				}
				public void mousePressed(java.awt.event.MouseEvent e) {
				}
				public void mouseReleased(java.awt.event.MouseEvent e) {
				}
				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return jcb_X21;
	}

	/**
	 * This method initializes jcb_X02	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJcb_X02() {
		if (jcb_X02 == null) {
			jcb_X02 = new JButton();
			jcb_X02.setBounds(new Rectangle(15, 135, 46, 46));
			jcb_X02.setEnabled(false);
			jcb_X02.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					clickedX(0,2);
				}
			});
			jcb_X02.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseEntered(java.awt.event.MouseEvent e) {
					if(cheatCount==1){
						cheatCount=2;
					}
				}
				public void mouseClicked(java.awt.event.MouseEvent e) {
				}
				public void mousePressed(java.awt.event.MouseEvent e) {
				}
				public void mouseReleased(java.awt.event.MouseEvent e) {
				}
				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return jcb_X02;
	}

	/**
	 * This method initializes jcb_X12	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJcb_X12() {
		if (jcb_X12 == null) {
			jcb_X12 = new JButton();
			jcb_X12.setBounds(new Rectangle(75, 135, 46, 46));
			jcb_X12.setEnabled(false);
			jcb_X12.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					clickedX(1,2);
				}
			});
			jcb_X12.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseEntered(java.awt.event.MouseEvent e) {
					cheatCount=0;
				}
				public void mouseClicked(java.awt.event.MouseEvent e) {
				}
				public void mousePressed(java.awt.event.MouseEvent e) {
				}
				public void mouseReleased(java.awt.event.MouseEvent e) {
				}
				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return jcb_X12;
	}

	/**
	 * This method initializes jcb_X22	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJcb_X22() {
		if (jcb_X22 == null) {
			jcb_X22 = new JButton();
			jcb_X22.setBounds(new Rectangle(135, 135, 46, 46));
			jcb_X22.setEnabled(false);
			jcb_X22.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					clickedX(2,2);
				}
			});
			jcb_X22.addMouseListener(new java.awt.event.MouseListener() {
				public void mouseEntered(java.awt.event.MouseEvent e) {
					cheatCount=0;
				}
				public void mouseClicked(java.awt.event.MouseEvent e) {
				}
				public void mousePressed(java.awt.event.MouseEvent e) {
				}
				public void mouseReleased(java.awt.event.MouseEvent e) {
				}
				public void mouseExited(java.awt.event.MouseEvent e) {
				}
			});
		}
		return jcb_X22;
	}

	/**
	 * This method initializes jcb_StartNew	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJcb_StartNew() {
		if (jcb_StartNew == null) {
			jcb_StartNew = new JButton();
			jcb_StartNew.setBounds(new Rectangle(210, 15, 121, 46));
			jcb_StartNew.setText("Neues Spiel");
			jcb_StartNew.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					jcb_X00.setText("");
					jcb_X01.setText("");
					jcb_X02.setText("");
					jcb_X10.setText("");
					jcb_X11.setText("");
					jcb_X12.setText("");
					jcb_X20.setText("");
					jcb_X21.setText("");
					jcb_X22.setText("");
					jlb_Output.setText("");
					for(int x=0;x<3;x++){
						for(int y=0;y<3;y++){
							tttField.setField(x, y, "");
						}
					}
					whosDran="x";
					jcb_BeginPC.setEnabled(true);
					jcb_X00.setEnabled(true);
					jcb_X01.setEnabled(true);
					jcb_X02.setEnabled(true);
					jcb_X10.setEnabled(true);
					jcb_X11.setEnabled(true);
					jcb_X12.setEnabled(true);
					jcb_X20.setEnabled(true);
					jcb_X21.setEnabled(true);
					jcb_X22.setEnabled(true);
				}
			});
		}
		return jcb_StartNew;
	}

	/**
	 * This method initializes jcb_BeginPC	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJcb_BeginPC() {
		if (jcb_BeginPC == null) {
			jcb_BeginPC = new JButton();
			jcb_BeginPC.setBounds(new Rectangle(210, 75, 121, 46));
			jcb_BeginPC.setEnabled(false);
			jcb_BeginPC.setText("PC beginnt");
			jcb_BeginPC.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					jcb_BeginPC.setEnabled(false);
					jcb_X00.setEnabled(false);
					jcb_X01.setEnabled(false);
					jcb_X02.setEnabled(false);
					jcb_X10.setEnabled(false);
					jcb_X11.setEnabled(false);
					jcb_X12.setEnabled(false);
					jcb_X20.setEnabled(false);
					jcb_X21.setEnabled(false);
					jcb_X22.setEnabled(false);
					whosDran="o";
					clickedKI(tttKI.play(tttField));
				}
			});
		}
		return jcb_BeginPC;
	}

	private void clickedX(int x, int y){
		jcb_BeginPC.setEnabled(false);
		if(whosDran=="x"){
			jcb_X00.setEnabled(false);
			jcb_X01.setEnabled(false);
			jcb_X02.setEnabled(false);
			jcb_X10.setEnabled(false);
			jcb_X11.setEnabled(false);
			jcb_X12.setEnabled(false);
			jcb_X20.setEnabled(false);
			jcb_X21.setEnabled(false);
			jcb_X22.setEnabled(false);
			whosDran="o";
			switch(x){
			case 0:
				switch(y){
				case 0:
					jcb_X00.setText("x");
					tttField.setField(0,0,"x");
					break;
				case 1:
					jcb_X01.setText("x");
					tttField.setField(0,1,"x");
					break;
				case 2:
					jcb_X02.setText("x");
					tttField.setField(0,2,"x");
				}
				break;
			case 1:
				switch(y){
				case 0:
					jcb_X10.setText("x");
					tttField.setField(1,0,"x");
					break;
				case 1:
					jcb_X11.setText("x");
					tttField.setField(1,1,"x");
					break;
				case 2:
					jcb_X12.setText("x");
					tttField.setField(1,2,"x");
				}
				break;
			case 2:
				switch(y){
				case 0:
					jcb_X20.setText("x");
					tttField.setField(2,0,"x");
					break;
				case 1:
					jcb_X21.setText("x");
					tttField.setField(2,1,"x");
					break;
				case 2:
					jcb_X22.setText("x");
					tttField.setField(2,2,"x");
				}
			}
			checkWinner();
			clickedKI(tttKI.play(tttField));	
		}
	}

	private void clickedKI(int[] koord){
		if(whosDran=="o"){
			whosDran="x";
			switch(koord[0]){
			case 0:
				switch(koord[1]){
				case 0:
					jcb_X00.setText("o");
					tttField.setField(0,0,"o");
					break;
				case 1:
					jcb_X01.setText("o");
					tttField.setField(0,1,"o");
					break;
				case 2:
					jcb_X02.setText("o");
					tttField.setField(0,2,"o");
				}
				break;
			case 1:
				switch(koord[1]){
				case 0:
					jcb_X10.setText("o");
					tttField.setField(1,0,"o");
					break;
				case 1:
					jcb_X11.setText("o");
					tttField.setField(1,1,"o");
					break;
				case 2:
					jcb_X12.setText("o");
					tttField.setField(1,2,"o");
				}
				break;
			case 2:
				switch(koord[1]){
				case 0:
					jcb_X20.setText("o");
					tttField.setField(2,0,"o");
					break;
				case 1:
					jcb_X21.setText("o");
					tttField.setField(2,1,"o");
					break;
				case 2:
					jcb_X22.setText("o");
					tttField.setField(2,2,"o");
				}
			}
			if(jcb_X00.getText()=="" || cheat){
				jcb_X00.setEnabled(true);
			}
			if(jcb_X01.getText()=="" || cheat){
				jcb_X01.setEnabled(true);
			}
			if(jcb_X02.getText()=="" || cheat){
				jcb_X02.setEnabled(true);
			}
			if(jcb_X10.getText()=="" || cheat){
				jcb_X10.setEnabled(true);
			}
			if(jcb_X11.getText()=="" || cheat){
				jcb_X11.setEnabled(true);
			}
			if(jcb_X12.getText()=="" || cheat){
				jcb_X12.setEnabled(true);
			}
			if(jcb_X20.getText()=="" || cheat){
				jcb_X20.setEnabled(true);
			}
			if(jcb_X21.getText()=="" || cheat){
				jcb_X21.setEnabled(true);
			}
			if(jcb_X22.getText()=="" || cheat){
				jcb_X22.setEnabled(true);
			}
			checkWinner();
		}
	}

	private void checkWinner(){
		String winner=tttField.getWinner();

		if(winner=="u"){
			System.out.println("u"); // DEBUG
			jlb_Output.setText("Unentschieden");
		} else if(winner=="x"){
			System.out.println("x"); // DEBUG
			jlb_Output.setText("Spieler 1 gewinnt");
		} else if(winner=="o"){
			System.out.println("o"); // DEBUG
			jlb_Output.setText("Spieler 2 gewinnt");
		}
		if(winner!=""){
			jcb_X00.setEnabled(false);
			jcb_X01.setEnabled(false);
			jcb_X02.setEnabled(false);
			jcb_X10.setEnabled(false);
			jcb_X11.setEnabled(false);
			jcb_X12.setEnabled(false);
			jcb_X20.setEnabled(false);
			jcb_X21.setEnabled(false);
			jcb_X22.setEnabled(false);
			jcb_StartNew.setEnabled(true);
		}
	}
}