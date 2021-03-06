const {Todo , validate} = require('../models/todo');
const mongoose = require('mongoose');
const express = require('express');
const router = express.Router();

router.get('/',async(req,res)=>{
   const todos = await Todo.find().sort('description');
   res.send(todos);

});

router.post('/',async(req,res)=>{
  const{error}= validate(req.body);
  if (error) return res.status(400).send(error.details[0].message);

  let todo = new Todo({
     description: req.body.description,
     isCompleted: req.body.isCompleted

  });
   todo = await todo.save();

   res.send(todo);

});

router.get('/:id', async(req,res)=>{

    const todo = await Todo.findById(req.params.id)
    .catch((err)=>{
        res.status(404).send('Todo with the given ID was not found.');

    });
    if(!todo)
    return res.status(404).send('Todo with the given ID was not found.');

  res.send(todo);
});

router.delete('/:id', async (req, res) => {
    const todo = await Todo.findByIdAndRemove(req.params.id).catch((err)=>{

        res.status(404).send('Todo with the given ID was not found.');

    });

    if(!todo)
      return  res.status(404).send('Todo with the given ID was not found.');

      res.send(todo);
    });

    router.put('/:id', async (req, res) => {
        const { error } = validate(req.body); 
        if (error) return res.status(400).send(error.details[0].message);

        const todo = await Todo.findByIdAndUpdate(req.params.id,
            
            {
                description: req.body.description,
                isCompleted:req.body.isCompleted
            }, {new:true});
           
            if (!todo) return res.status(404).send('Todo with the given ID was not found.');
  
              res.send(todo);
           });
            
           module.exports = router;
            