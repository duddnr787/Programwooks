function solution(a, b) {
    let sum = 0;
    if(a<b){
        for(let i = 0; i<=b-a; i++){
            sum += a+i
        }
    } else if (b<a) {
        for(let i = 0; i<=a-b; i++){
            sum += b+i
        }
    } else return a
    return sum
}