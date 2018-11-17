'use strict';
const ajax = function (){
    const playerRequest = new XMLHttpRequest();

    const xml = (method, url, callback, content = null) => {
        playerRequest.open(method, url, true);
        playerRequest.setRequestHeader('accept', 'application/json');
        playerRequest.setRequestHeader('content-type', 'application/json');
        if (method !== 'GET'){
            content = JSON.stringify(content);
        }
        console.log(content);
        playerRequest.onload = function(){
            let list = JSON.parse(playerRequest.response);
            callback(list);
        };
        playerRequest.send(content);
    }

    return {
        xml
    };
};