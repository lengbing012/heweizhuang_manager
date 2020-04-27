$(function(){
    $("").click(function () {

    });
});

//编写一个对象
let user = {
    name: "冷冰",
    age: 18,
    sex: "男"
}

//输出一下这个对象
//console.log(user);  //{name: "冷冰", age: 18, sex: "男"}

//将 js 对象转换为 json 字符串
let str = JSON.stringify(user);
//console.log(str);   //{"name":"冷冰","age":18,"sex":"男"}

//将 json 对象转换为 js 字符串
let obj = JSON.parse(str);
//console.log(obj);   //{name: "冷冰", age: 18, sex: "男"}


