#include "difference_of_squares.h"

unsigned int sum_of_squares(unsigned int number)
{
   unsigned int sum = 0;
   for (unsigned int a = 1;a <= number;a++) {
      sum += a * a;
   }

   return sum;
}

unsigned int square_of_sum(unsigned int number)
{
   unsigned int sum = 0;
   for (unsigned int a = 1;a <= number;a++) {
      sum += a;
   }

   return sum * sum;
}

unsigned int difference_of_squares(unsigned int number)
{
   return square_of_sum(number) - sum_of_squares(number);
}
