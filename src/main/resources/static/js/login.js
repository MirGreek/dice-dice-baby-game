'use strict';

const login = () => {
    const startForm = document.getElementById('start-game');
    const url = 'localhost:8080/game';
    const myAjax = ajax();

    const getCheckboxes = (evt) => {
        const checkBoxes = startForm.querySelectorAll('input[type=checkbox]');
        const values = [];
        checkBoxes.forEach(checkbox => {
            if (checkbox.checked) {
                values.push(checkbox.id);
            }
        });
        const reqBody = {
            "players": values
        }
        myAjax.xml('POST', url, null, reqBody);
    };

    startForm.addEventListener('click', (evt) => {
        getCheckboxes(evt);
    });
};
