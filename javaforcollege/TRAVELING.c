#include<stdio.h>
int main(){
    int m=0,sum=0,min=0;
    int arr[4];
    int a[4][4]={{0,5,3,2},{5,0,12,10},{4,2,0,8},{12,15,16,0}};
    for(int i=0;i<4;i++)
    {
        int x=a[i][1];
        for(int j=1;j<3;j++){
            // printf("%d\n",x);
            // if (i==1){
            //     x=a[i][j+1];
            //     min=a[i][j+1];
            //     m=j+1;
            // }
            
            if(i==0){
                x=a[i][j+1];
                min=a[i][j+1];
                m=j+1;
                printf("\n%d\n",m);
            }
            // if (i==1){
            //     x=a[i][j+1];
            //     min=a[i][j+1];
            //     m=j+1;
            // }
            
            if(a[i][j+1]<x && a[i][j+1]!=0)
            {
                if(i==0){

                }
                
                else{
                    x=a[i][j+1];
                    min=a[i][j+1];
                    m=j+1;
                    printf("\n%d\n",m);
                }
            }
            
           
            // else  {
            //     x=a[i][j];
            //     m=j;
            // }
            
            
            
        }
        sum=sum+x;
        printf("%d\n",x);
        printf("--------------\n");
        //    arr[i]=m;
        a[0][m]=0;
        a[1][m]=0;
        a[2][m]=0;
        a[3][m]=0;

       
    }
    printf("%d",sum);
    int a=arr[0];
    int b=arr[a];
    int c=arr[b];
    int d=arr[c];

}