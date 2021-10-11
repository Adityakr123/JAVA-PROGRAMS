#include<stdio.h>
#include<string.h>
int main()
{
    char ch[]="Hhwlkq$d$vxuyfxxvh$儛wxfmifx儜$ws#wwsui#xki#hhxdmow#si$wlh$vyenhgw$omni#wxfmifx#rdqh$drg$vyenhgw$fsgi1$Xwlrj$vxuyfxxvh$sslrwiu$dposfewi#qhqrv|$isu$wlh$vxuyfxxvh$g}qepmfeop|$vs#ev$ws#sexdmq$giwelpv$rj#惜q惝#wxfmifxv$xwlrj$isu$osrt1";
    for(int i=0;i<strlen(ch);i++){
        if(i%2==0){
            ch[i]=ch[i]-4;
        }
        else {
            ch[i]=ch[i]-3;
        }
    }
    printf("%s",ch);
}



