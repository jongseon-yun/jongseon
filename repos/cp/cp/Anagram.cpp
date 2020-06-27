#include<stdio.h>


int checkAnagram(char [], char[]);

int main() {
	char a[100], b[100];
	printf("Enter a String..");
	gets_s(a);
	
	printf("\nEnter a String..");
	gets_s(b);

	if (checkAnagram(a,b) == 1)
	{
		printf("The Strings are anagrams\n");
	}
	else
	{
		printf("The Strings aren`t anagrams\n");
	}

	return 0;
}

int checkAnagram(char a[], char b[]) {

	int first[26] = { 0 }, second[26] = { 0 }, c = 0;

	//Calculating frequency of characters of first String.
	while (a[c] != '\0')
	{
		first[a[c] - 'a']++;
		c++;
	}

	c = 0;

	while (b[c] != '\0') {
		second[b[c] - 'a']++;
		c++;
	}

	// Compare frequency of characters

	for (c = 0; c < 26; c++)
	{
		if(first[c] != second[c]){
			return 0;
		}
	}
	return 1;
}