#include<stdio.h>
#include<limits.h>//자료형의 크기의 한계를 나타냄.. 

int main(void){
	int x = INT_MAX;
	printf("int형의 최댓값 x는 %d입니다.\n",x);
	printf("x+1는 %d입니다.",x+1);
	return 0; 
}
