void setup() {
  size(800,800);
}

float x = 0, y = 0;
float dx = 1.9, dy = 1;
float g = -1.2;
void draw() {
  rect(x, y, 100,100); 
  x += dx; y += dy;
  if (x < 0 || x >= width)
    dx = -dx;
  if (y < 0 || y >= height)
    dy = -dy;
  dy = dy - g;
}