#include <stdio.h>
struct Covid19{
char *name;
int recovered;
int deaths;
int infected;
}usa,spain,italy,france,germany,uk,china;
void main(){
int i=0;
struct Covid19 country[7];
country[0].name="United States of America";
country[0].infected=678210;
country[0].recovered=57844;
country[0].deaths=34641;

country[1].name="Spain";
country[1].infected=184948;
country[1].recovered=74797;
country[1].deaths=19315;

country[2].name="Italy";
country[2].infected=168941;
country[2].recovered=40164;
country[2].deaths=22170;

country[3].name="France";
country[3].infected=165027;
country[3].recovered=32812;
country[3].deaths=17920 ;

country[4].name="Germany";
country[4].infected=138135;
country[4].recovered=81800;
country[4].deaths=4093;

country[5].name="United Kingdom";
country[5].infected=103093;
country[5].recovered=0;
country[5].deaths=13729;

country[6].name="China";
country[6].infected=82692;
country[6].recovered=77944;
country[6].deaths=4632;

printf("Enter num : ");
scanf("%d",&i);
i-=1;
printf("\n\t %s\nInfected : %d\nRecovered : %d\nDeaths : %d\n",country[i].name,country[i].infected,country[i].recovered,country[i].deaths);
}
/*
Enter num : 1

	 United States of America
Infected : 678210
Recovered : 57844
Deaths : 34641

*/
