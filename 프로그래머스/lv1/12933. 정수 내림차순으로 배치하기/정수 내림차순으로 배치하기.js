function solution(n) {
    var answer = 0;
    let arr = String(n).split("").sort().reverse().join("")
    arr = Number(arr)
    return arr;
}