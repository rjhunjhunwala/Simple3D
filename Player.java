/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framed;

/**
 *
 * @author rohan
 */
public class Player {
	public double yXAngle = 0;
	public double zXAngle = 0;
	public double x=GamePanel.SCALE*5,y=GamePanel.SCALE*5,z=Map.threeD?GamePanel.SCALE*5:0;
}
