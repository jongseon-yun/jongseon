#include<stdio.h>

int main(void){
	int x=50;
	float y=12345.12345;
	double z=1234512334512345.12345;
	printf("x=%d\n",x);
	printf("y=%.2f\n",y); //소수점 2까지
	printf("z=%.2f\n",z);
	return 0;
}
