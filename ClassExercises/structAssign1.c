#include <stdio.h>
struct Covid19{
char *name;
int recovered;
int deaths;
int infected;
}usa,spain,italy,france,germany,uk,china;
void main(){
usa.name="United States of America";
usa.infected=678210;
usa.recovered=57844;
usa.deaths=34641;

spain.name="Spain";
spain.infected=184948;
spain.recovered=74797;
spain.deaths=19315;

italy.name="Italy";
italy.infected=168941;
italy.recovered=40164;
italy.deaths=22170;

france.name="France";
france.infected=165027;
france.recovered=32812;
france.deaths=17920 ;

germany.name="Germany";
germany.infected=138135;
germany.recovered=81800;
germany.deaths=4093;

uk.name="United Kingdom";
uk.infected=103093;
uk.recovered=0;
uk.deaths=13729;

china.name="China";
china.infected=82692;
china.recovered=77944;
china.deaths=4632;
printf("\tMost Affected countries by COVID19 - 17/04/2020");

printf("\n\n\t1 - USA\nInfected : %d\nRecovered : %d\nDeaths : %d\n\n",usa.infected,usa.recovered,usa.deaths);
printf("\t2 - Spain\nInfected : %d\nRecovered : %d\nDeaths : %d\n\n",spain.infected,spain.recovered,spain.deaths);
printf("\t3 - Italy\nInfected : %d\nRecovered : %d\nDeaths : %d\n\n",italy.infected,italy.recovered,italy.deaths);
printf("\t4 - France\nInfected : %d\nRecovered : %d\nDeaths : %d\n\n",france.infected,france.recovered,france.deaths);
printf("\t5 - Germany\nInfected : %d\nRecovered : %d\nDeaths : %d\n\n",germany.infected,germany.recovered,germany.deaths);
printf("\t6 - United Kingdom\nInfected : %d\nRecovered : %d\nDeaths : %d\n\n",uk.infected,uk.recovered,uk.deaths);
printf("\t7 - China\nInfected : %d\nRecovered : %d\nDeaths : %d\n\n",china.infected,china.recovered,china.deaths);

}
/*
	Most Affected countries by COVID19 - 17/04/2020

	1 - USA
Infected : 678210
Recovered : 57844
Deaths : 34641

	2 - Spain
Infected : 184948
Recovered : 74797
Deaths : 19315

	3 - Italy
Infected : 168941
Recovered : 40164
Deaths : 22170

	4 - France
Infected : 165027
Recovered : 32812
Deaths : 17920

	5 - Germany
Infected : 138135
Recovered : 81800
Deaths : 4093

	6 - United Kingdom
Infected : 103093
Recovered : 0
Deaths : 13729

	7 - China
Infected : 82692
Recovered : 77944
Deaths : 4632


*/
