#include <stdio.h>
int main()
{
    int n,redprice,blueprice;
    int sum=0;
    printf("enter number of childrens ");
    scanf("%d",&n);
    printf("enter price  of red baloons ");
    scanf("%d",&redprice);
    printf("enter price of blue baloons");
    scanf("%d",&blueprice);
   
    for(int i=1;i<=n;i++)
    {
        if(i%2==0){
            sum=sum+blueprice;
        }
        else {
            sum=sum+redprice;
           
        }
    }
    
    printf("total price of ballons given to people is:  %d",sum);

}
