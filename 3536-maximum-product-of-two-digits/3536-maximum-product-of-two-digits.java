class Solution {
    public int maxProduct(int n) {
        Integer first = 0;
        Integer second = 0;

    while(n>0){
        Integer digit = n%10;
        if(digit>=first){
            second = first;
            first = digit;
        }
        else if(digit>second){
            second = digit;
        }
        n/=10;
    }
     return first*second;   
    }
}