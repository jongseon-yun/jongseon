#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct book{
	int page;
	char title[];
}; 


//void showBook(struct Book *p, int n){
//	int i;
//	for(i=0;i<n; i ++){
//		printf("��ȣ%d�� %s\n",(p+i)->number,(p+i)->title);
//	}
//}

void showbook (struct book *p, int n){
	int i ;
	for (i=0; i<n; i++){
		printf("��ȣ%d : %s\n",(p+i)->page,(p+i)->title);	
	}
}


int main(void){
	struct book *p;
	
	p = (struct book *)malloc(2*sizeof(struct book));
	
	if(p==0){
		printf("�����޸� �Ҵ翡 ����\n");
		exit(1);
	}
	
	p->page = 1;//����ü�� ������ ��� ���. 
	
	strcpy(p->title,"C programming");
	
	(p+1)->page = 2;
	strcpy((p+1)->title,"data structure");
	
	showbook(p,2);
	free(p);
	
	return 0;
}
