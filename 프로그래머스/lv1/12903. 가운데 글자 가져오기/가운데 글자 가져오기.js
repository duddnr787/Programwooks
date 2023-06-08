function solution(s) {
    var answer = '';
    let arr = Math.floor(s.length/2);
    if(s.length % 2 == 0){
        answer += s[arr-1] + s[arr];
    } else {
        answer += s[arr]
    }
    return answer;
}