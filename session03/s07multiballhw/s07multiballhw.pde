float[] x = new float[1000];

, y, dx, dy;

void setup() {
  size(800, 600);
  x[ ] = random(25,width-25);
  y[ ] = random(height);
  dx[ ] = random(-3,3);
  dy[ ] = random(-3,3);
}

// every time you click, add one more ball
int n = 1;
final float d = 50;
void draw() {
//  background(0);
fill (0,0,0, 10);
rect(0,0, width, height);
  stroke(0, 255,0);
  fill(255, 255, 0);
  ellipse(x, y, d, d);
  ellipse(x2, y2, d, d);
  x = x + dx;
  y = y + dy;
  x2 += dx2;
  y2 += dy2;
  
  if (x >= width - 1) {
    dx = -dx;
  }
  if (x < 0) {
    dx = -dx;
  }
  if (y < 0 || y >= height - 1) {
    dy = -dy;
  }
  if (x2 < 0 || x2 >= width - 1) {
    dx2 = -dx2;
  }
  if (y2 < 0 || y2 >= height - 1) {
    dy2 = -dy2;
  }

}