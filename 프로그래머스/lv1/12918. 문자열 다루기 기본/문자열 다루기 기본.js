function solution(s) {
    var answer = true;
    if((s.length === 4 || s.length === 6) && s == parseInt(s)){
        answer = true
    } else {
        answer = false
    }
    return answer
}