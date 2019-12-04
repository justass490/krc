const ul = document.querySelector('ul');
const task = document.querySelector('.darbas');
const btn = document.querySelector('.pridekDarba');
const btnDelete = document.querySelector('.removeData');

btn.addEventListener('click', addTask);
btnDelete.addEventListener('click', removeTask);

function addTask() {
        let li = document.createElement('li');
        li.textContent = task.value;
        ul.appendChild(li);
}

function removeTask() {
    const lastTask = document.querySelector('li:last-child');
    ul.removeChild(lastTask);

}