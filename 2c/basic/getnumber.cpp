#include <stdio.h>

int main(void){
	char input[1001];
	gets(input);
	int count = 0;
	while(input[count]!='\0')//null
	{
		count ++;
	}
	printf("�Է��� ������ ���̴� %d�Դϴ�.\n",count);
	printf("�Է��� ���ڿ�:%s",input); 
	return 0;
}
