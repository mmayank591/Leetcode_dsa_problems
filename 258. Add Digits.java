https://leetcode.com/problems/add-digits/description/

class Solution {
    public int addDigits(int num) {
        
//int sum=0;
while(num/10!=0){
int sum=0;
while(num>0){
    int d=num%10;
    sum+=d;
    num=num/10;
}
num=sum;
}
return num;
    }
}
