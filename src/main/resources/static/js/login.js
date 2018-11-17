'use strict';

const login = () => {
    const startButton = document.getElementById('start-game');
    const url = 'localhost:8080/api/game';
    const myAjax = ajax();

    const getCheckboxes = (evt) => {
        const checkBoxes = startButton.querySelectorAll('input[type=checkbox]');
        const values = [];
        checkBoxes.forEach(checkbox => {
            if (checkbox.checked) {
                values.push(checkbox.id);
            }
        });
        const reqBody = {
            "players": values
        };
        myAjax.xml('POST', url, null, reqBody);
    };

    startButton.addEventListener('click', (evt) => {
        getCheckboxes(evt);
    });
};
