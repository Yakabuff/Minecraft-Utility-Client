package utils;

import org.lwjgl.opengl.GL11;

import net.minecraft.src.GuiScreen;

public class GradientRect extends GuiScreen {
	
	 public void drawBorderedRect(int i, int j, int k, int l, int i1, int j1)
	    {
	        GL11.glScalef(0.5F, 0.5F, 0.5F);
	        drawBaseRect(i * 2, j * 2, k * 2, l * 2, i1, j1);
	        GL11.glScalef(2.0F, 2.0F, 2.0F);
	    }

	    public void drawBaseGradientRect(int i, int j, int k, int l, int i1, int j1, int k1)
	    {
	        drawGradientRect(i + 2, j + 2, k - 2, l, i1, j1);
	        drawHorizontalLine(i + 2, k - 3, j + 1, k1);
	        drawVerticalLine(i + 1, j + 1, l, k1);
	        drawVerticalLine(k - 2, j + 1, l, k1);
	        drawHorizontalLine(i + 2, k - 3, l, k1);
	    }

	    public void drawGradientBorderedRect(int i, int j, int k, int l, int i1, int j1, int k1)
	    {
	        GL11.glPushMatrix();
	        GL11.glScalef(0.5F, 0.5F, 0.5F);
	        drawBaseGradientRect(i * 2, j * 2, k * 2, l * 2, i1, j1, k1);
	        GL11.glPopMatrix();
	    }
	    
	    public void drawBaseRect(int i, int j, int k, int l, int i1, int j1)
	    {

	            drawRect(i + 2, j + 2, k - 1, l - 1, i1);
	            drawHorizontalLine(i + 2, k - 2, j + 1, j1);
	            drawVerticalLine(i + 1, j + 1, l - 1, j1);
	            drawVerticalLine(k - 1, j + 1, l - 1, j1);
	            drawHorizontalLine(i + 2, k - 2, l - 1, j1);
	        
	    }
	
}
