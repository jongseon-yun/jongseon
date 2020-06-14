#include<stdio.h>
#include <math.h>

struct point{
	int x;
	int y;
};


int main (void){
	
	struct point p1,p2;
	int xDiff, yDiff;
	double distance;
	printf("1번 점의 좌표를 입려하겟요:"); 
	scanf("%d %d", &p1.x,&p1.y);
	printf("2번 점의 좌표를 입려하겟요:"); 
	scanf("%d %d", &p2.x,&p2.y);
	
	xDiff = p1.x - p2.x;
	yDiff = p1.y - p2.y;
	
	distance = sqrt(xDiff*xDiff + yDiff* yDiff);// 제곱근 구하는 함수. 
	printf("두점사이의 거리 :%.1f\n",distance);
	
	return 0;
}
