#include <stdio.h>
int main() {
  double x, y;
  x = 0;
  x = x;
  printf("%g\n", (double)(1.0 + 2.0));
  x = 1.0 + 2.0;
  ;
  printf("%g\n", (double)(x + 3.0));
  y = x + 3.0;
  ;
  return 0;
}