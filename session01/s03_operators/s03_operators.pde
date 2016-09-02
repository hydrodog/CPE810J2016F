void setup() {
  size(800, 600);
}

int x = 0, y = 0, dx = 2, dy = 0;
void draw() {
  background(0);
  stroke(0, 255,0);
  fill(255, 255, 0);
  final int RECT_WIDTH = 200;
  rect(x, y, RECT_WIDTH, 100);
  x = x + dx;
  
  if (x < 0 || x >= width - RECT_WIDTH  ) {
    dx = -2*dx;
  }
}