function solution(phone_number) {
    var answer = '';
    
    let star = phone_number.slice(0,-4);
    let number = phone_number.slice(-4);
    
    star = star.replace(/[0-9]/g,'*')
    answer = star + number
    
    return answer;
}