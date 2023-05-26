function solution(a, b) {
    var answer = 0;
    if(a.length > b.length){
        for(let i = 0; i<a.length; i++){
          answer += a[i] * b[i];
        } 
    } else {
        for(let i = 0; i<b.length; i++){
          answer += a[i] * b[i];
        } 
    }
    
    return answer;
}