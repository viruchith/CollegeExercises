#include <stdio.h>
#include <string.h>
#include <stdlib.h>
struct Covid19{
char *name;
int recovered;
int deaths;
int infected;
}usa,spain,italy,france,germany,uk,china;
void display(struct Covid19 c){
printf("\n\t%s\nRecovered : %d\nDeaths : %d\nInfected : %d\n",c.name,c.recovered,c.deaths,c.infected);
}
void main(){
char opt[10];
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
printf("\nEnter country name : ");
gets(opt);
if(strcmp("USA",opt)==0){
    display(usa);
}else if(strcmp("Spain",opt)==0){
    display(spain);
}else if(strcmp("Italy",opt)==0){
    display(italy);
}else if(strcmp("France",opt)==0){
    display(france);
}else if(strcmp("Germany",opt)==0){
    display(germany);
}else if(strcmp("UK",opt)==0){
    display(uk);
}
}
/*
	Most Affected countries by COVID19 - 17/04/2020

Enter country name : Spain

	Spain
Recovered : 74797
Deaths : 19315
Infected : 184948

*/
