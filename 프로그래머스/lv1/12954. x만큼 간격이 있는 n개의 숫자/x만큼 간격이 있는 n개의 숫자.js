function solution(x, n) {
    var answer = [];
    for(let i = 0; i<n; i++){
        answer[i] = x * i + x;
    }
    return answer;
}