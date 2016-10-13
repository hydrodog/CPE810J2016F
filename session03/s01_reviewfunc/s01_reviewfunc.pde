int f(int x) {
  return x*x; 
}

void hello() {
  println("hello");
}

int fact(int n) {
  int product = 1;
  for (int i = 1; i <= n; i++)  
    product = product * i; // product *= i;
  return product;
}

void setup() {
  println(f(3)); // f(x) = x^2
  hello(); // print "hello"
  println(fact(5)); // 120  5*4*3*2*1
  exit(); 
}