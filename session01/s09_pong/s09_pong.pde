void setup() {
  size(700,700);
}

int n = 5;
void draw() {
  float r = 300;
  float theta = 0;
  for (int i = 0; i < n; i++) {
    float x = r*cos(theta);
    float y = r*sin(theta);
    ellipse(width/2+x, width/2+y, 20, 20);
    line(width/2, height/2, width/2+x, width/2+y);
    theta += 2*PI/n;
  }
  
}