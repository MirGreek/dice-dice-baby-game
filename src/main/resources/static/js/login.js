'use strict';

const login = () => {
    const startButton = document.getElementById('start-game');

    const getCheckboxes = () => {
        const checkBoxes = document.querySelectorAll('input[type=checkbox]');
        const values = [];
        checkBoxes.forEach(checkbox => {
            if (checkbox.checked) {
                values.push(checkbox.id);
            }
        });
        console.log(values);
    };

    startButton.addEventListener('click', getCheckboxes);
};
