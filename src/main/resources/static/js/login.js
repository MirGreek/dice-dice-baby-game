'use strict';

const login = () => {
    const startButton = document.getElementById('start-game');
    const url = '/api/game';
    const myAjax = ajax();

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
        myAjax.xml('POST', url, () => {console.log('yeah')}, reqBody);
    };

    startButton.addEventListener('click', (evt) => {
        getCheckboxes(evt);
    });
};
