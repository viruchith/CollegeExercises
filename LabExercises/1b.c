#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
#include <float.h>
int main(){
printf("Int has range %d to %d\n",INT_MIN,INT_MAX);
printf("Short has range %d to %d\n",SHRT_MIN,SHRT_MAX);
printf("Long has range %d to %d\n",LONG_MIN,LONG_MAX);
printf("Char has range %d to %d\n",CHAR_MIN,CHAR_MAX);
printf("Double has range %d to %d\n",DBL_MIN,DBL_MAX);
printf("Float has range %d to %d",FLT_MIN,FLT_MAX);
return 0;
}
/*
Output:
Int has range -2147483648 to 2147483647
Short has range -32768 to 32767
Long has range 0 to -1
Char has range -128 to 127
Double has range 1024 to 1027*/
