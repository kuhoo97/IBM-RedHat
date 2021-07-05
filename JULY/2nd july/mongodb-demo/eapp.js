const mongoose = require('mongoose');
 
mongoose.connect('mongodb://localhost/company')
  .then(() => console.log('Connected to MongoDB...'))
  .catch(err => console.error('Could not connect to MongoDB...', err));
 
const Employee = mongoose.model('Employee', new mongoose.Schema({
  name: String,
  department: String,
  email: String
}));
 
async function createAuthor(name, department, email) { 
  const employee = new Employee({
    name, 
    department, 
    email
  });
 
  const result = await employee.save();
  console.log(result);
}
async function displayEmployees(){
    return await Employee.find();
    
}
 
async function listEmployees() { 
    const employees = await Employee
      .find()
      // if you want to display only name
      //.select('name');
       console.log(employees);
  }



 // to add a new employee to database

//createAuthor('E-3', 'DEPT-3', 'email-emp3@mail.com');
 
// createCourse('Node Course', 'authorId')
 
// listCourses();
listEmployees();