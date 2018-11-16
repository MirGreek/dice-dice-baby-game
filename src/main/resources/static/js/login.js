'use strict';

const login = () => {
    const startForm = document.getElementById('start-game');

    const getCheckboxes = (evt) => {
        console.log(evt);
        evt.preventDefault();
        const checkBoxes = startForm.querySelectorAll('input[type=checkbox]');
        const values = [];
        checkBoxes.forEach(checkbox => {
            if (checkbox.checked) {
                values.push(checkbox.id);
            }
        });
        console.log(values);
    };

    startForm.addEventListener('submit', (evt) => {
        getCheckboxes(evt);
    });
};
