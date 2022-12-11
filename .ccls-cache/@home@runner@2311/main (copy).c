#include <stdio.h>

typedef enum {
    DIAMONDS,
    HEARTS,
    SPADES,
    CLUBS
} suit;

typedef enum {
    TWO = 2,
    THEE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING,
    ACE
} rank;


const char* suitUnicode[] = {"\u2660", "\u2661", "\u2662", "\u2663"};

typedef struct {
    suit suit;
    rank rank;
    int value;
} card;

int main(void) {
    //printf(suitUnicode[DIAMONDS]);

    int a = 11;
    // int flag = 0;
    // if (a > 10) {
    //     flag = 1;
    // } else {
    //     flag = 0;
    // }

    int flag = (a > 10) ? 1 : 0;
    printf("%d", flag);
    card desk[52];
    // for (int i = 0; i < 4; i++) {
    //     for (int j = 2; j < 15; j++) {
            
    //     }
    // }
    
    return 0;
  
}