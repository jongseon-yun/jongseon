#include <stdio.h>

int main(){
	
	int i, j, x, y = 0;
	scanf("%d", &i);
	printf("%d",i);
	printf("\n");
	
	for(x=0; x<i; x++){
		y = x + 1;
		for(j = 0; j<i; j++){
			printf("%d", y);
			y += 4;
		}
		printf("\n");
	}
	
	return 0;	
}
