#include "grains.h"

uint64_t square(uint8_t index)
{
   return index;
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
