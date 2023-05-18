function solution(s){
    var answer = true;
    let arr =[...s];
    let p = [];
    let y = [];
    
    arr.forEach((i)=>{
        if(i==='p' || i==='P'){
            p.push(i)
        } else if (i==='y' || i==='Y'){
            y.push(i)
        } 
    })
    
    if(p.length == y.length){
        return answer;
    } else {
        return !answer;
    }
    
}