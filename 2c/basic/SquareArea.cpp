#include<stdio.h>
#include <math.h>
struct point{
	int x;
	int y;
	
}; 

struct rect {
	struct point p1;
	struct point p2;
	
};
int main ( void){
	struct rect r;
	int w , h , area , peri;
	
	printf("첫번 째의 좌표를 입력하세요:");
	scanf("%d %d",&r.p1.x,&r.p1.y); 
	
	printf("두번 째의 좌표를 입력하세요:");
	scanf("%d %d",&r.p2.x,&r.p2.y);
	
	w =abs(r.p2.x-r.p1.x);
	h=abs(r.p2.y-r.p1.y);
	
	area = w*h;
	peri = 2*w+2*h;
	
	printf("사각형의 넓이는: %d\n",area);
	printf("사각형의 둘레는: %d\n",peri);
	
	return 0;
}
