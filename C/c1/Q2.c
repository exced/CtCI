#include <stdlib.h>
#include <stdio.h>
#include <string.h>

/*
* Implement a function void reverse(char* str) in C or C++ which reverses a null-termi-nated string.
*/
void reverse(char * str) {
    if (str == NULL)
        return ;

    int i = 0;
    int length = 0;        
    /* get length */
    while (str[i] != '\0') {
        length++;
        i++;
    }   
    char * tmp = malloc(length*sizeof(char));    
    for (i = 0; i < length; i++) {
        tmp[i] = str[length-i-1];
    } 
    strncpy(str, tmp, length);
}


int main() {

    char * str0 = NULL;
    char str1[10] = "hello";
    char str2[10] = "a";
    char str3[20] = "testtesttest";
    reverse(str0);
    reverse(str1);
    reverse(str2);
    reverse(str3);
    printf("reverse NULL is %s \n", str0);
    printf("reverse hello is %s \n", str1);
    printf("reverse a is %s \n", str2);
    printf("reverse testtesttest is %s \n", str3);

    return 0;
}