function solution(n, m) {
    var answer = [];
    let min = 0;
    let max = 0;
    let num = n > m ? n : m;
    
    for(let i = 1; i<num; i++){
        if(n % i == 0 && m % i == 0){
            min = i;
        }
    }
     max = m * n / min
    answer.push(min,max)
    return answer;
}
