package l4.ncc.ddoocp.t9;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Topic9Task1 {
	
	public static void main(String[] args) {
		Topic9Task1 t9T1 = new Topic9Task1();
		t9T1.go();
	}
	
	private void go() {
		try {
			GUIT9T1 gT9T1 = new GUIT9T1();
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "In go: " + e.toString());
		}
	}
	
	private class GUIT9T1 extends JFrame {
		private JLabel lblHeading;
		private JLabel lblPrompt;
		private JTextField txtNoOfThrows;
		private JButton btnOk;
		private JComboBox cboDisplayResults;
		private ActionButton myActionButton = new ActionButton();
		
		private GUIT9T1() {
			this.setSize(800, 400);
			this.setLocation(100, 100);
			this.setTitle("GUI Topic9 Task1");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(null);
			Font f1 = new Font("Monospaced", Font.BOLD, 32);
			Font f2 = new Font("Dialog", Font.BOLD, 24);
			lblHeading = new JLabel("Die Simulation");
			lblHeading.setBounds(10, 10, 300, 50);
			lblHeading.setFont(f2);
			this.add(lblHeading);
			lblPrompt = new JLabel("Enter number of throws");
			lblPrompt.setBounds(50, 70, 300, 50);
			lblPrompt.setFont(f2);
			this.add(lblPrompt);
			txtNoOfThrows = new JTextField();
			txtNoOfThrows.setBounds(50, 120, 300, 50);
			txtNoOfThrows.setFont(f2);
			this.add(txtNoOfThrows);
			btnOk = new JButton();
			btnOk.setBounds(50, 170, 300, 50);
			btnOk.setFont(f2);
			btnOk.setText("Ok");
			btnOk.addActionListener(myActionButton);
			this.add(btnOk);
			cboDisplayResults = new JComboBox();
			cboDisplayResults.setBounds(400, 120, 300, 50);
			cboDisplayResults.setBackground(Color.PINK);
			cboDisplayResults.setFont(f1);
			cboDisplayResults.setEditable(true);
			this.add(cboDisplayResults);
			this.setVisible(true);
		}
		
		private class ActionButton implements ActionListener {
			private Validate validate = new Validate();
			private DieSimulation dieSimulation = new DieSimulation();
			private ActionButton() {
				//
			}
			
			public void actionPerformed(ActionEvent ae) {
				try {
					int k = 0;
					int noOfThrows;
					String strNoOfThrows;
					dieSimulation.emptyCups();
					cboDisplayResults.removeAllItems();
					strNoOfThrows = txtNoOfThrows.getText();
					if(validate.isInteger(strNoOfThrows)) {
						noOfThrows = Integer.parseInt(strNoOfThrows);
						if(noOfThrows>0) {
							dieSimulation.noOfThrows = noOfThrows;
							dieSimulation.throwDie();
							for(k=1; k<=6; k=k+1) {
								cboDisplayResults.addItem(dieSimulation.cup[k]);
							}
						}
						else {
							txtNoOfThrows.setText("Need positive whole number");
						}
					}
					else {
						txtNoOfThrows.setText("Need whole number");
					}
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, "In ActionButton: " + e.toString());
				}
			}
			
			private class DieSimulation {
				private int[] cup = new int[7];
				private int noOfThrows = 0;
				
				private DieSimulation() {
					//
				}
				
				private void emptyCups() {
					try {
						int k = 1;
						for(k=1; k<=6; k=k+1) {
							cup[k] = 0;
						}
					}
					catch(Exception e) {
						JOptionPane.showMessageDialog(null, "In DieSimulation.emptyCups: " + e.toString());
					}
				}
				
				private void throwDie() {
					try {
						int k = 1;
						int thrown = 0;
						for(k=1; k<=noOfThrows; k=k+1) {
							thrown = 1 + (int)(6*Math.random());
							cup[thrown] = cup[thrown] + 1;
						}
					}
					catch(Exception e) {
						JOptionPane.showMessageDialog(null, "In DieSimulation.throwDie: " + e.toString());
					}
				}
			}
		}
	}
}