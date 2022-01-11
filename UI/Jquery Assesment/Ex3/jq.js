let btnGet = document.querySelector('button');
let myTable = document.querySelector('#table');
let employees = [
    { EmpId:001,Empname: 'Surendar', Salary:25000, Department: 'IT' },
    { EmpId:002,Empname: 'Vignesh', Salary:35000, Department: 'IT' },
    { EmpId:003,Empname: 'Kishore', Salary:45000, Department: 'IT' },
    { EmpId:004,Empname: 'Jagan', Salary:35000, Department: 'IT' },
    { EmpId:005,Empname: 'Vinoth', Salary:25000, Department: 'IT' },
    { EmpId:006,Empname: 'Hemnath', Salary:20000, Department: 'HR' }
]
let headers = ['EmpId', 'Empname','Salary', 'Department'];
btnGet.addEventListener('click', () => {
    let table = document.createElement('table');
    let headerRow = document.createElement('tr');
    headers.forEach(headerText => {
        let header = document.createElement('th');
        let textNode = document.createTextNode(headerText);
        header.appendChild(textNode);
        headerRow.appendChild(header);
    });
    table.appendChild(headerRow);
    employees.forEach(emp => {
        let row = document.createElement('tr');
        Object.values(emp).forEach(text => {
            let cell = document.createElement('td');
            let textNode = document.createTextNode(text);
            cell.appendChild(textNode);
            row.appendChild(cell);
        })
        table.appendChild(row);
    });
    myTable.appendChild(table);
});