import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

function Calc(props){
  let a=parseInt(props.chem);
  let b=parseInt(props.phy);
  let c=parseInt(props.mat);
  let result = (a + b + c)/3;
  if (result>90){
  return <h1> marks scored {props.chem}, {props.phy} and  {props.mat} - A grade </h1>
} else if (result>80){
  return <h1> marks scored {props.chem}, {props.phy} and  {props.mat} - B grade </h1>
} else if (result>70){
  return <h1> marks scored {props.chem}, {props.phy} and  {props.mat} - c grade </h1>
} else{ 
  return <h1> marks scored {props.chem}, {props.phy} and  {props.mat} - Fail </h1> }
}
ReactDOM.render(<Calc chem="75" phy="80" mat="85"/>  , document.getElementById('root'));

