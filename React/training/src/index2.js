import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
function Calculation(props)
{
  let result =parseInt(props.a)+parseInt(props.b);
  let result1 =parseInt(props.a)-parseInt(props.b);
  let result2 =parseInt(props.a)*parseInt(props.b);
  let result3 =parseInt(props.a)/parseInt(props.b);
  return <h1>Calculation of {props.a} and {props.b}  add = {result} sub ={result1} mul = {result2} div = {result3}</h1>
}

ReactDOM.render(
  <React.StrictMode>
    <Calculation a="10" b="20" />
  </React.StrictMode>,
  document.getElementById('root')
);
