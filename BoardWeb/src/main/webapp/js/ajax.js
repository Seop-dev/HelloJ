/*
 * ajax.js
 * Asynchronous Javascript And Xml
 */

// 비동기 vs 동기 방식
/* setTimeout(function(){
	console.log("1");
}, 2000); // 1초를 기다렸다가 해당 함수를 실행

setTimeout(function(){
	console.log("2");
}, 1000);

setTimeout(function(){
	console.log("start");
}, 1500);
*/

// {"id: 1, "first_name": "Hong"} => json객체
// -> {id: 1, first_name: "Hong"} => javascript객체

// 객체 XMLHttpRequest
console.log("start");
let xhtp = new XMLHttpRequest();
xhtp.open('get', 'boardList.do'); // 페이지 요청
xhtp.send(); // 페이지 요청
xhtp.onload = function(){
	console.log(xhtp.responseText);
	document.querySelector('#show').innerHTML = xhtp.responseText;
}

function memberList() {
	//console.log("1");
	//console.log(xhtp.responseText); // parsing
	let data = JSON.parse(xhtp.responseText);
	//console.log(data);
	let str = "<ul>";
	data.forEach(function(item, idx, arr) {
		console.log(item);
		str += "<li>" + item.id + "." + item.first_name + "</li>";
	});
	str += "</ul>";
	document.querySelector('#show').innerHTML = str;
}
console.log("end");

// fetch('data/sample.json')