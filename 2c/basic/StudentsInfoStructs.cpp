#include <stdio.h>
#include <stdlib.h> 

struct student{
	int number;
	char name[15];
	double grade;
};

int main(void){
	struct student s;
	
	printf("학번을 입력하세요:") ;
	scanf("%d", &s.number); 
	printf("이름을 입력하세요:") ;
	scanf("%s",s.name);
	printf("학점을 입력하세요:") ;
	scanf("%lf",&s.grade);
	
//	s.number = 20131178;
//	strcpy(s.name, "윤종선");
//	s.grade=4.5; 
	printf("학번:%d\n",s.number);
	printf("이름:%s\n",s.name);
	printf("학점:%.1f\n",s.grade);
	return 0;
}


