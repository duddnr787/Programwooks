function solution(array, commands) {
    var answer = [];
    for(let i = 0; i<commands.length; i++){
        let a = Number(array.slice(commands[i][0]-1,commands[i][1]).sort((a,b)=> a-b).splice(commands[i][2]-1, 1))
        answer.push(a);
    }
    return answer;
}