void setup() {
  size(700,700);
}

void draw() {
  for (int x = 0; x < width; x = x + 100) {
    line(x,0, x,height-1);
  }
  for (int y = 0; y < height; y = y + 100) {
    line(0,y, width-1, y);
  }
  
}