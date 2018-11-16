'use strict';

const myAjax = ajax();

let helloButton = document.querySelector('.helloworld')

helloButton.addEventListener('click', () => {
  myAjax.xml('GET', 'hello', helloka);
})

function helloka (res) {
  let hellokaSpan = document.querySelector('.helloka')

  hellokaSpan.textContent += res
}