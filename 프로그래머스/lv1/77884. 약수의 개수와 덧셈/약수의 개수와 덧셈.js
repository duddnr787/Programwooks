function division(a){
    let count = 0;
    
    for(let i = 1; i <= a; i++){
        if( a % i === 0 ) {
            count++;
        }
    }
    return count;
}

function solution(left, right) {
    let answer = 0;
    
    for(let i = left; i <= right; i++){
        let count = division(i);
        if(count % 2 === 0){
            answer += i
        } else {
            answer -= i
        }
    }
    
    return answer;
}

