#include <stdio.h>
void filePrint(){
FILE *fp;
char c;
fp=fopen("/Users/ganesankoundappan/Desktop/C-Exercises/ClassExercises/fireworks.txt","r");
while((c=fgetc(fp))!=EOF){
    printf("%c",c);
}
fclose(fp);
}
void main(){
FILE *fp;
char *s,c;
printf("Before Appending :\n");
filePrint();
fp=fopen("/Users/ganesankoundappan/Desktop/C-Exercises/ClassExercises/fireworks.txt","a");
printf("\nEnter text to append : ");
gets(s);
fputs(s,fp);
fclose(fp);
printf("\nAfter Appending:\n");
filePrint();
}
/*
Output:
Before Appending :

Do you know that there's still a chance for you
'Cause there's a spark in you
You just gotta ignite the light
And let it shine
Just own the night
Like the Fourth of July
Cause baby you're a firework
Come on show 'em what your worth
Make 'em go "Oh, oh, oh!"
warning: this program uses gets(), which is unsafe.

Enter text to append : - Katy Perry

After Appending:

Do you know that there's still a chance for you
'Cause there's a spark in you
You just gotta ignite the light
And let it shine
Just own the night
Like the Fourth of July
Cause baby you're a firework
Come on show 'em what your worth
Make 'em go "Oh, oh, oh!"- Katy Perry
*/
