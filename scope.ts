// we can declare variables in Three different ways
// var
// let
// const, Each has different behaviours in terms of scope, value assignment, re-declaration, re
// assignment, and hoisting.
function printmessage(){
    if(true){
        var msg = "hello world"
     // let msg1 = "hello world"
     // const msg2 = "hello world"
    }
    console.log(msg) // can access outside the block
    // console.log(msg)  --> can not access outside the block
    //  console.log(msg) --> can not access outside the block
}

printmessage()