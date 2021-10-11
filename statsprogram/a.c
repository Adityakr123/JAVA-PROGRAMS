#include<stdio.h>
int main()
{
    int a[100];
    int n;
 
    printf("enter lenth of array\n");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(int i=0;i<n-1;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(a[i]==a[j])
            {
                   int x=a[j];
                for (int k=0;k<n;k++)
                {
                    
                    while(a[k]==x)
                    {
                        x++;
                    }
                   
                }
                a[j]=x;
            }
        }
    }
    for(int i=0;i<n;i++)
    {
        printf("%d",a[i]);
    }
}