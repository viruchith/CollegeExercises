#include <stdio.h>
struct Covid19{
char name[20];
int recovered;
int deaths;
int infected;
};
void main(){
struct Covid19 *usa={"United States of America",678210,57844,34641};
struct Covid19 *spain={"Spain",184948,74797,19315};
struct Covid19 *italy={"Italy",168941,40164,22170};
struct Covid19 *france={"France",165027,32812,17920};
struct Covid19 *germany={"Germany",138135,81800,4093};

printf("\tMost Affected countries by COVID19 - 17/04/2020");

printf("\n\n\t1 - USA\nInfected : %d\nRecovered : %d\nDeaths : %d\n\n",usa->infected,usa->recovered,usa->deaths);
printf("\t2 - Spain\nInfected : %d\nRecovered : %d\nDeaths : %d\n\n",spain->infected,spain->recovered,spain->deaths);
printf("\t3 - Italy\nInfected : %d\nRecovered : %d\nDeaths : %d\n\n",italy->infected,italy->recovered,italy->deaths);
printf("\t4 - France\nInfected : %d\nRecovered : %d\nDeaths : %d\n\n",france->infected,france->recovered,france->deaths);
printf("\t5 - Germany\nInfected : %d\nRecovered : %d\nDeaths : %d\n\n",germany->infected,germany->recovered,germany->deaths);

}
/*
	Most Affected countries by COVID19 - 17/04/2020

	1 - USA
Infected : 1224765033
Recovered : 1633905010
Deaths : 1634751232

	2 - Spain
Infected : 1953722189
Recovered : 1634562661
Deaths : 151026030

	3 - Italy
Infected : 1667589734
Recovered : 1867319552
Deaths : 1092646003

	4 - France
Infected : 1868767332
Recovered : 1717977376
Deaths : 1702126437

	5 - Germany
Infected : 1936025970
Recovered : 1663067237
Deaths : 1953396079


*/
