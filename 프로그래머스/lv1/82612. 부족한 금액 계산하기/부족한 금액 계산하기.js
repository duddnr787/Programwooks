function solution(price, money, count) {
    var answer = 0;
    var sumPrice = 0;
     for(let i = 1; i<=count; i++){
         sumPrice += price * i
     } 
    if(sumPrice < money) {
        return 0;
    } else {
        return sumPrice - money 
    }
}