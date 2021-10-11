#include<stdio.h>
int main(){
    int n;
    int count=1;
    printf("enter value of n\n");
    scanf("%d",&n);
    int mcountvaccie[n],mcountperson[n];
    for(int i=0;i<n;i++)
    {
        printf("enter Mcount of vaccine %d",n+1);
        scanf("%d",&mcountvaccie);
    }
    for(int i=0;i<n;i++)
    {
        printf("enter Mcount of person %d",n+1);
        scanf("%d",&mcountvaccie);
    }
    for(int i=0;i<n;i++)
    {
        if(mcountvaccie[i]<mcountperson[i])
        {
            count++;
        }
        else{
                printf("NO");
        }
    }
    if (count>n){
        printf("yes");
    }

}