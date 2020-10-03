let promises1 = new Promise((resolve,reject)=>{
     a = 1;
     if(a===1)
     resolve("hye working");
     else
     reject("huh !! failed");
});

promises1.then((message)=>{
    console.log(message);
}).catch((message)=>{
    console.log(message);
});