package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Fish {
	// Every fish has a x which is an int
	int x;
	int y;
	Color color;
	boolean isLittle;
	boolean facingLeft;
	int destX;
	int destY;
	// eventually use random method from the guessing game

	public Fish(Color c, int startX, int startY, boolean isLittle, boolean facingLeft) {
		this.color = c;
		this.x = startX;
		this.y = startY;
		this.isLittle = isLittle;
		this.facingLeft = facingLeft;
		this.destX = 400;
		this.destY = 400;
	}
	
	public void swim() {
		if (this.y < this.destY && this.x < this.destX) {
			this.y += 1;
			this.x += 1;
		}
		
	}

	public void draw(Graphics2D g) {
		this.swim();
		if (this.facingLeft == true && this.isLittle == true) {
			DrawFish.smallFacingLeft(g, this.color, this.x, this.y);
		} else if (this.facingLeft == true && this.isLittle == false) {
			DrawFish.facingLeft(g, this.color, this.x, this.y);
		} else if (this.facingLeft == false && this.isLittle == true) {
			DrawFish.smallFacingRight(g, this.color, this.x, this.y);
		} else {
			DrawFish.facingRight(g, this.color, this.x, this.y);
		}
	}
}
