package _04_Snake;

public class Location {
private int x;
private int y;

public Location(int xx, int yy) {
	x=xx;
	y=yy;
}
public boolean equals(int ex, int ey) {
	if (ex==x && ey == y) {
	return true;
	}
	else {
	return false;
	}
}
public int getX() {
	
	return x;
}
public int getY() {
	
	return y;
}
}
