void setup() {
  size(800, 800);
}

float ang = 0;
void draw() {
  background(255,0,0);
  translate(width/2, height/2);
  scale(1,-1);
  strokeWeight(4);
  rotate(ang);
  line(0,0, 400,0);
  ang += .01;
}