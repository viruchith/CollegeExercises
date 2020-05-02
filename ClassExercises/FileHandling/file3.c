#include <stdio.h>
#include <string.h>
void main(){
FILE *fp;
char s[10],in[10];
char c;
int i=0,occurence=0;
fp=fopen("/Users/ganesankoundappan/Desktop/C-Exercises/ClassExercises/fireworks.txt","r");
printf("Enter word to find : ");
gets(in);
printf("\n");
while((c=fgetc(fp))!=EOF){
    if(c!=' '&&c!='\n'&&c!='\n'&&c!='\''&&c!=','){
        s[i]=c;
        i++;
    }else{
    s[i+1]='\0';
    if(strcmp(s,in)==0){
        occurence++;
    }
    i=0;
    strcpy(s,"n");
    }
printf("%c",c);
}
fclose(fp);
printf("\n\nOccurences : %d",occurence);
}
/*
Output:

Enter word to find : you

Do you know that there's still a chance for you
'Cause there's a spark in you
You just gotta ignite the light
And let it shine
Just own the night
Like the Fourth of July
Cause baby you're a firework
Come on show 'em what your worth
Make 'em go "Oh, oh, oh!"- Katy Perry

Occurences : 2

*/
