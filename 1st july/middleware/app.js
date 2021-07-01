const path = require('path');
const bodyParser=require('body-parser');;
const express = require('express');
const app = express();
app.use(bodyParser.urlencoded({extended: false}))


app.get('/home',(req,res,next)=>{
    res.sendFile(path.join(__dirname,'soccer','home.html'));
  

});

app.get('/add-league',(req,res,next)=>{
    res.sendFile(path.join(__dirname,'soccer','add-league.html'));
  

});

app.post('/add-league',(req,res,next)=>{
    console.log(req.body);
    res.redirect('/home');

});


app.get('/display-league',(req,res,next)=>{
    res.sendFile(path.join(__dirname,'soccer','display-league.html'));
  

});



/* ///this is for all files in views folder 
app.get('/add-product',(req,res,next)=>{
    res.sendFile(path.join(__dirname,'views','add-product.html'));
  

});

app.post('/add-product',(req,res,next)=>{
    console.log(req.body);
    res.redirect('/');

});


app.get('/',(req,res,next)=>{

    res.sendFile(path.join(__dirname,'views','shop.html'));
});

//app.use((req,res,next)=>{
//res.status(400).send('<h1> page not found</h1>');

//})

app.get('/404',(req,res,next)=>{

    res.sendFile(path.join(__dirname,'views','404.html'));
});
  //////end of views folder
*/
app.listen(3000);