#include<stdio.h>

int main(void){
	FILE *fp = NULL;
	fp = fopen("output.txt","w");
	//w ������ r �б���
	if(fp ==NULL){
		printf("���� ���⿡ �����߽��ϴ�.\n");
	} else{
		printf("���� ���⿡ �����߽��ϴ�.\n");
	}
	fputc('H',fp);
	fputc('e',fp);
	fputc('l',fp);
	fputc('l',fp);
	fputc('o',fp);
	fclose(fp) ;
	return 0;
}
