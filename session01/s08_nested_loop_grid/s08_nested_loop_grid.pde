void setup() {
  for (int x = 1; x <= 3; x++) {
    print (x);
  }
  for (int y = 1; y <= 4; y++) {
    print (y);
  }
  println();
  for (int x = 1; x <= 3; x++) {
    for (int y = 1; y <= 4; y++) {
      println (x,y);
    }
  }
  
  exit();
}