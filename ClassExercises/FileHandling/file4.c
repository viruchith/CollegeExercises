#include <stdio.h>
void fappend(char *path){
FILE *fp1,*fp2;
char c;
fp1=fopen(path,"r");
fp2=fopen("/Users/ganesankoundappan/Desktop/C-Exercises/ClassExercises/file3.txt","a");
while((c=fgetc(fp1))!=EOF){
    fputc(c,fp2);
}
fclose(fp1);
fclose(fp2);
}
void main(){
FILE *fp;
char c;
fappend("/Users/ganesankoundappan/Desktop/C-Exercises/ClassExercises/file1.txt");
fappend("/Users/ganesankoundappan/Desktop/C-Exercises/ClassExercises/file2.txt");
fp=fopen("/Users/ganesankoundappan/Desktop/C-Exercises/ClassExercises/file3.txt","r");
printf("Content of File3.txt :\n\n");
while((c=fgetc(fp))!=EOF){
    printf("%c",c);
}
fclose(fp);
}
/*
Output :

Content of File3.txt :

This a piece of text from file1.txt
This is a piece of text from file2.txt

*/
