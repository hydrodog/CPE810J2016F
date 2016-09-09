/*
  In decimal 1/10 = 0.1 "nice"
  1/2 = 0.5 "nice"
  1/3 = .33333333
  
   computer floating point is binary
   1/2  1/4   1/8  1/16 ...

1.95
 .00858
 .00997
-------

1.95
 .00858
-------
1.95
 .00997
-------
1.95

 .00858
 .00997
-------
  .0185
 1.95
 ------
 1.96

a + b = b + a  commutative
a + b + c = a + (b + c)  associative

70.0000xxxx

70.0001xxxx
-------
 0.00010


  (x - 1.000001)(x - 1.0)

  x^2 - 2.000001x + 1.000001
  
*/

void setup() {
  float sum1, sum2;
  
  sum1 = 0; // 1/1 + 1/2 + 1/3 + ... + 1/100    == 5.18
  
  sum2 = 0; // 1/100 + 1/99 + 1/98 + ... + 1/1
  
  print(sum1 - sum2);
  
  // float 1.234567
  // sum the following 1/1^2 + 1/2^2 + 1/3^2 + ... infinity
  // 1/1 + 1/4 + 1/9 + 1/16 + ...
  // 1 + .25 + .111111 + ...       == 1.6...
  
  //print(sqrt(6*s))
  
  // then try printing it backwards....
  
  
  
  exit();
}