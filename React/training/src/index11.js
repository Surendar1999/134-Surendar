import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
function MyBorder(props){
  return(
    <div className={'MyBorder MyBorder-'+ props.color}>
      {props.children}
    </div>
  );
}

function MouseOver(event) {
  event.target.style.background = 'magenta';
}
function MouseOut(event){
  event.target.style.background="";
}

function MyDialogBox(){
  return(
    <div  onMouseOver={MouseOver} onMouseOut={MouseOut}>
     
      <MyBorder color="green">
        <h1 className='MyDialog-title'>Welcome to First Dialog Box.</h1>
        <p className='MyDialog-message'>This is content from First Dialog Box.</p>
      </MyBorder>
      
      <MyBorder color="red">
      
        <h1 className='MyDialog-title'>Welcome to First Dialog Box.</h1>
        <p className='MyDialog-message'>This is content from First Dialog Box.</p>
        
      </MyBorder>
      <MyBorder color="blue">
      
        <h1 className='MyDialog-title'>Welcome to First Dialog Box.</h1>
        <p className='MyDialog-message'>This is content from First Dialog Box.</p>
        
      </MyBorder>
    </div>
  );
}


ReactDOM.render(  
  <MyDialogBox /> ,
document.getElementById('root')
);