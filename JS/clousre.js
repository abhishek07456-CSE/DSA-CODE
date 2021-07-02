/*

-lexical environment call stack created for very function call , it track all local variable and track of it parent closure

-closure remembers’ the environment in which it was created.

*/
function grandparent(){
    debugger
    let name = "grandparent";
    parent();
    function parent(){
        let name = "parent";
        child(); // Hoisting created all function variable are defined in top of scope
        function child(){
            let ak = 2;
            // let name = "child"; // if this not find then check in parent closure if also not find in parent then check in grandparent then main
            console.log(name);
        }
    }
}
let name = "main";
grandparent();