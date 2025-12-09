#include "grains.h"
#include <math.h>

uint64_t square(uint8_t index)
{
   if (index == 0 || index > 64) {
      return 0;
   }

   return pow(2, index - 1);
}

uint64_t total(void)
{
   const uint8_t SQUARES = 64;
   uint64_t sum = 0;

   for (uint8_t a = 1;a <= SQUARES;a++) {
      sum += square(a);
   }

   return sum;
}
