// recursive function: calls itself
// and it must have an exit condition

// n! = n * (n-1)!
// 0! = 1
// 2! = 2*1!  1! = 1*0!  0! = 0*-1! ... must terminate
double fact(int n) {
  if (n <= 0)
    return 1;
  return n * fact(n-1);
}

void setup() {
  for (int i = 0; i < 25; i++)
    println(fact(i));
  exit(); 
}