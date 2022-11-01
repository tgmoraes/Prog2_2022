package parte10.interfaces;

import java.awt.Graphics;

public interface Desenhavel {
	public abstract void desenha(Graphics g, int x, int y);
	public abstract int getLargura();
}
