import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
class Calculator extends React.Component
{
  constructor()
  {
    super();
    this.handler = this.handler.bind(this);
    this.state={
      x:0,
      y:0,
      operator:'',
      result:0,
    }
  }
  handler(operator)
  {
    var result;
    var x= document.getElementById("x").value;
    var y=document.getElementById("y").value;
    x=parseInt(x);
    y=parseInt(y);
    switch(operator)
    {
      case "+":result=x+y;
              break;
      case "-":result=x-y;
              break;
      case "*":result=x*y;
                break;
      case "/":result=x/y;
                break;
    }
   this.setState(({
      x:x,
      y:y,
      result:result,
      operator:operator
   }));
  }  

  render()
  {
    return(
    <>
   <table>
     <tr>
   <h1>{this.state.x} {this.state.operator} {this.state.y} = {this.state.result} </h1>
   </tr>
   <tr> <input  id="x" type="text" defaultValue={this.state.x}/></tr>
   <tr> <input  id="y" type="text" defaultValue={this.state.y}/></tr>
   </table>
   <button id="Add" onClick={()=>this.handler("+")} >Add</button>
   <button id="Sub" onClick={()=>this.handler("-")} >Sub</button>
   <button id="Mul" onClick={()=>this.handler("*")} >Mul</button>
   <button id="Div" onClick={()=>this.handler("/")}  >Div</button>
    </>
    );
  }
}

ReactDOM.render(
  <Calculator />,
  document.getElementById("root")
);