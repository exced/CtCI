#include <stdlib.h>
#include <stdio.h>
#include <string.h>

/*
* Naive approach
* Time : O(n^2)
* Memory : O(1)
*/ 
int hasAllUniqueChars1(const char * str) {
    if (str == NULL)
        return 0;
    int i, j;        
    size_t str_length = strlen(str);
    for (i = 0; i < str_length; i++) {
        for (j = i + 1; j <str_length; j++) {
            if (str[j] == str[i])
                return 0;
        }
    }
    return 1;
}

/*
* ASCII has 256 characters, word longer cannot have all unique chars
* Time : O(n^2)
* Memory : O(1)
*/
int hasAllUniqueChars2(const char * str) {
    if (str == NULL)
        return 0;
    int i, j;        
    size_t str_length = strlen(str);
    if (str_length > 256)
        return 0;
    for (i = 0; i < str_length; i++) {
        for (j = i + 1; j <str_length; j++) {
            if (str[j] == str[i])
                return 0;
        }
    }
    return 1;
}


/*
* Time : O(n)
* Memory : O(1)
*/
int hasAllUniqueChars3(const char * str) {
    if (str == NULL)
        return 0;
    int i;        
    size_t str_length = strlen(str);
    if (str_length > 256)
        return 0;
    int bool_set[256] = {[0 ... 255] = 0};
    for (i = 0; i < str_length; i++) {
        if (bool_set[str[i]])
            return 0;
        bool_set[str[i]] = 1;               
    }
    return 1;
}


const char * str[] = {
    "",
    "abcdef",
    "aabbcc",
};

#define str_l (sizeof (str) / sizeof (const char *))

int main() {
    int i;
    for (i = 0; i < str_l; i++) {
        printf("word %s has all uniques ? : %d %d %d \n", str[i], hasAllUniqueChars1(str[i]), hasAllUniqueChars2(str[i]), hasAllUniqueChars3(str[i]));
    }

    return 0;
}