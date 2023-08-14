#include<stdio.h>
#include<ctype.h>
#include<malloc.h>
#include<string.h>
#include<math.h>
void main()
{
int i=0,j,x,n,flag;
void *p,*add[5];
char ch,srch,b[15],d[15],c;
printf("Expression terminated by $:");
while((c=getchar())!='$')
{
b[i]=c;
}
n=i+1;
printf("Given Expression:");
while(i<=n)
{
printf("%c",b[i]);
i++;
}
printf("\n Symbol table \n");
printf("Symbol \t addres \t Type");
while(j<=n)
{
c=b[j];
if(isalpha(toascii(c)))
{
if(j==n)
{
p=malloc(c);
add[x]=p;
d[x]=c;
printf("%c \t %p \t identifier \n",c,p);
}
else 
{
ch=b[j+1];
if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
{
p=malloc(c);
add[x]=p;
d[x]=c;
printf("\n %c \t %p \t identifier \n",c,p);
x++;
}
}
}
j++;
}
printf("\n The symbol is to be searched:");
for(i=0;i<=x;i++)
{
if(srch==d[i])
{
printf("\n Symbol found");
printf("\n %c %s %p \n",srch,"@address",add[i]);
flag=1;
}
}
if(flag==0)
printf("\n Symbol not found");
}

