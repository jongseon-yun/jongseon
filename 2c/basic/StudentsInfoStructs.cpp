#include <stdio.h>
#include <stdlib.h> 

struct student{
	int number;
	char name[15];
	double grade;
};

int main(void){
	struct student s;
	
	printf("�й��� �Է��ϼ���:") ;
	scanf("%d", &s.number); 
	printf("�̸��� �Է��ϼ���:") ;
	scanf("%s",s.name);
	printf("������ �Է��ϼ���:") ;
	scanf("%lf",&s.grade);
	
//	s.number = 20131178;
//	strcpy(s.name, "������");
//	s.grade=4.5; 
	printf("�й�:%d\n",s.number);
	printf("�̸�:%s\n",s.name);
	printf("����:%.1f\n",s.grade);
	return 0;
}


