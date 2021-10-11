#include<stdio.h>
#include<string.h>
int main()
{
    char ch[]="Write a code to add the values of two arrays entered by user and  print the new array .";
    for(int i=0;i<strlen(ch);i++){
        if(i%3==0){
            ch[i]=ch[i]+6;
        }
        else {
            ch[i]=ch[i]+;
        }
    }
    printf("%s",ch);
}