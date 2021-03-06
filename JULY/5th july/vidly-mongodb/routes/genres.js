const {Genre, validate} = require('../models/genres'); 
const mongoose = require('mongoose');
const express = require('express');
const router = express.Router();

router.get('/', async (req, res) => {
  const genres = await Genre.find().sort('name');
  res.send(genres);
});

router.post('/', async (req, res) => {
  const { error } = validate(req.body); 
  if (error) return res.status(400).send(error.details[0].message);

  let genre = new Genre({ name: req.body.name });
  genre = await genre.save();
  
  res.send(genre);
});
router.get('/:id', async (req, res) => {
  const genre = await Genre.findById(req.params.id).catch((err)=>{
    res.status(404).send('The genre with the given ID was not found.');

  });

  if (!genre) 
    return res.status(404).send('The genre with the given ID was not found.');

  res.send(genre);
});

router.delete('/:id', async (req, res) => {
  const genre = await Genre.findByIdAndRemove(req.params.id).catch((err)=>{
    res.status(404).send('The genre with the given ID was not found.');
  });

  if (!genre) 
    return res.status(404).send('The genre with the given ID was not found.');

  res.send(genre);
});
module.exports = router; 