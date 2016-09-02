void setup() {
  int x = 0;
  while (x < 10) {
    print(x);
    x = x + 1;
  }

  for (int i = 0; i < 10; i++) {
    print(i);
  }

  println();
  for (int i = 1; i < 20; i = i + 3) {
    print(i);
  }
  println();
  for (int i = 10; i > 0; i = i - 2) {
    print(i);
  }
  println();
  for (int i = 10; i < 0; i--) {
    print(i);
  }
  println();

  for (int i = 1; i < 1024; i = i * 2) {
    print(i);
  }
  println();
/*
  for (int i = 0; i < 16; i = i * 2) {
    print(i);
  }
  */
  println();
  for (int i = 100; i > 0; i = i / 3) {// 100 33 11 3 1
    print(i);
  }
  println();

  
  
  
  
  
  
  
  
  
  
  exit();
}