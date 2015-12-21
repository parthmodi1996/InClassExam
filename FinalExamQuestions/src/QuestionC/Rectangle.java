package QuestionC;

public class Rectangle extends Shape {

	public Rectangle(int newx, int newy) {
		super(newx, newy);
	}

	@Override
	void draw() {
	}

	@Override
	public int ComputeArea() throws IllegalRectangle {
		int answer;
		int x = this.getX();
		int y = this.getY();
		if (this.getX() > 0 && this.getY() > 0){
			answer = x*y;
		} else {
			if (x <= 0){
				x = (-1)*this.getX();
			}
			if (y <= 0){
				y = (-1)*this.getY();
			}
			answer = x*y;
			System.out.println("Rectangle cannor have negative values");
			throw new IllegalRectangle(x, y);
		}
		return answer;
	}
}
