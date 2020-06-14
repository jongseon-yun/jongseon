#include <stdio.h>
#include <limits.h> 
#define NUMBER 5


int main(void){
	int i, max, min,  index;
	int array[NUMBER];
	for(i = 0; i<NUMBER; i++){
		scanf("%d",&array[i]);
		if(max<array[i]){
			max = array[i];
			index = i;
		}
	}
	printf("가장큰 값은 %d입니다. 그리고 %d번째에 있습니다.\n",max,index +1);
	min = INT_MAX;
	for(i = 0; i<NUMBER; i++){
		scanf("%d",&array[i]);
		if(min>array[i]){
			min = array[i];
			index = i;
		}
	}
	printf("가장작은 값은 %d입니다. 그리고 %d번째에 있습니다.\n",min,index +1);
	return 0;
}
