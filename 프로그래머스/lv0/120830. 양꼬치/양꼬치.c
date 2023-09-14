#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int k) {
    int answer = 0;
    int serviceDrink = n / 10; 
    int drink = k - serviceDrink;
    answer = n * 12000 + drink * 2000;
    return answer;
}