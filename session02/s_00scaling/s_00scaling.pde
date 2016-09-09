void setup() {
  size(800, 800);
}

void draw() {
  translate(width/2, height/2);
  scale(width/2,height/2); 
  strokeWeight(0);
  rect(0,0, 1, 1);
  line(0,0, 1,1);
}