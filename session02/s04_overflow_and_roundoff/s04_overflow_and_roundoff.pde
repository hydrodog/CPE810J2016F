/*
000 = 0
001 = 1
010 = 2
011 = 3
100 = -4
101 = -3
110 = -2
111 = -1


*/

void setup() {
  int secondsPerDay = 24 * 60 * 60;
  println(secondsPerDay);
  int secondsPerYear = 365 * secondsPerDay;
  println(secondsPerYear);
  long age = 69;
  long ageInSeconds = age * secondsPerYear;
  println(ageInSeconds);
  
  // NEVER TRUST NUMBERS FROM A COMPUTER
  exit();
}