function solution(price, money, count) {
    var answer = 0;
    var sumPrice = 0;
     
    for(let i = 1; i<=count; i++){
        sumPrice += price * i
    }
    
    answer = money - sumPrice;
    return answer < 0 ? answer * (-1) : 0
}