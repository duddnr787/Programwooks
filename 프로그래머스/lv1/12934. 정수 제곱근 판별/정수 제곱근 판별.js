function solution(n) {
    var answer = 0;
    if(n % Math.pow(n, 0.5) === 0){
        let a = Math.pow((Math.pow(n, 0.5) + 1), 2)
        answer = a
    } else {
        answer -= 1; 
    }
    return answer;
    
}