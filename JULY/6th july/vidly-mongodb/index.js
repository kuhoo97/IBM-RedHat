//crud operations for customers and genres for creating database in mongodb
const mongoose = require('mongoose');
const genres = require('./routes/genres');
const customers = require('./routes/customers');
const movies = require('./routes/movies');
const express = require('express');
const app = express();


mongoose.connect('mongodb://localhost/vidly-mongodb')
  .then(() => console.log('Connected to MongoDB...'))
  .catch(err => console.error('Could not connect to MongoDB...'));

app.use(express.json());
app.use('/api/genres', genres);
app.use('/api/customers', customers);
app.use('/api/movies', movies);




app.listen(3000);
//app.listen(port, () => console.log("server started"));