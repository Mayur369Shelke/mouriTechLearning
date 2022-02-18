let employeeNames = new Map([
    [123,'Rama'],
    [124,'Krishna'],
    [125,'Ravi'],
]);
console.log(typeof (employees));
console.log(employeeNames.get(123));
for (const emp of employeeNames.values()){
    console.log(emp)
}
for (const emp of employeeNames.entries()){
    console.log(`${emp[0]} := ${emp[1]}`);
}
let emp = {eid : 1234,ename : 'rama'};
let emp1 = {eid : 1244,ename : 'rama1'};
let emp2 = {eid : 1223,ename : 'rama2'};
let emp3 = {eid : 1123,ename : 'rama3'};
let employeeDesignation = new Map([
    [emp,'CEO'],
    [emp1,'CFO'],
    [emp2,'CTO'],
    [emp3,'MD'],
]);
employeeDesignation.forEach((employeeDesignation,emp) => console.log (`${emp.ename} := ${employeeDesignation}`))