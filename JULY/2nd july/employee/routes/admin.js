const Joi = require('joi');
const express = require('express');
const app=express();
const router = express.Router();

const employee= [
    {id: 1 , firstName: 'John' , lastName: 'Dogy' , email:'john@email.com'},
    {id: 2 , firstName: 'Mary' , lastName: 'Lane' , email:'mary@email.com'},

];

router.get('/api/employee',(req,res)=>{

    res.send(employee);
});

router.get('/api/employee/:id',(req,res)=>{
 const emp = employee.find(e=>e.id === parseInt(req.id));
 if(!emp)
  return res.status(404).send('The employee with the given ID was not found.');
  res.send(emp);

});

router.post('/api/employee',(req,res,next)=>{
    const { error } = validateEmp(req.body); 
    if (error)
     return res.status(400).send(error.details[0].message);
      const emp={
          id: employee.length+1,
          firstName:req.body.firstName,
          lastName:req.body.lastName,
         email:req.body.email
         
      };
      employee.push(emp);
      res.status(200).send(emp);
  
  });

  router.put('/api/employee/:id', (req, res) => {
    const emp = employee.find(e => e.id === parseInt(req.params.id));
    if (!emp)
       return res.status(404).send('The employee with the given ID was not found.');
  
    const { error } = validateEmp(req.body); 
    if (error) 
      return res.status(400).send(error.details[0].message);
    
    
    emp.firstName = req.body.firstName;
    emp.lastName=req.body.lastName;
    emp.email=req.body.email;
    res.send(emp);
  });

  router.delete('/api/employee/:id', (req, res) => {
    const emp = employee.find(e => e.id === parseInt(req.params.id));
    if (!emp)
       return res.status(404).send('The employee with the given ID was not found.');
  
    const index = employee.indexOf(emp);
    employee.splice(index, 1);
  
    res.send(emp);
  });

  function validateEmp(emp)
{
  const schema=
  {
    firstName:Joi.string().min(3).required(),
    lastName:Joi.string().min(3).required(),
    email: Joi.string().email().lowercase().required()
  };
  return Joi.validate(emp,schema);
}

module.exports=router;