'use strict';

const login = () => {
    const startButton = document.getElementById('start-game');
    const url = 'localhost:8080/api/game';
    const myAjax = ajax();

    const getCheckboxes = (evt) => {
        const checkBoxes = document.querySelectorAll('input[type=checkbox]');
        const values = [];
        checkBoxes.forEach(checkbox => {
            if (checkbox.checked) {
                values.push(checkbox.id);
            }
        });
        const reqBody = {
            "players": values
        };
        console.log(checkBoxes, values);
        // myAjax.xml('POST', url, null, reqBody);
    };

    startButton.addEventListener('click', (evt) => {
        console.log('FASSSSSSSSSSSSSSSSSSSSSSSZ')
        getCheckboxes(evt);
    });
};
