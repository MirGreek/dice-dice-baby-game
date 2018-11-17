'use strict';

const login = () => {
    const startButton = document.getElementById('start-game');
    const url = '/api/game';
    const myAjax = ajax();

    const redirect = () => {
        window.location.replace('http://localhost:8080/game');
        console.log('yeah');
    };

    const getCheckboxes = (evt) => {
        const checkBoxes = document.querySelectorAll('input[type=checkbox]');
        const values = [];
        checkBoxes.forEach(checkbox => {
            if (checkbox.checked) {
                values.push(parseInt(checkbox.id));
            }
        });
        const reqBody = {
            "players": values
        };
        console.log(reqBody);
        myAjax.xml('POST', url, redirect, reqBody);
    };

    startButton.addEventListener('click', (evt) => {
        getCheckboxes(evt);
    });
};
