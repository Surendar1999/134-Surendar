import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
class App extends React.Component{

  constructor(props){
    super(props);  
    this.a="10"
    this.b="20"
    this.add = this.add.bind(this);
    this.sub = this.sub.bind(this);
    this.mul = this.mul.bind(this);
    this.div = this.div.bind(this);
    
  }

  add(){
    var result = this.a + this.b;
    return(
      <h1>Addition of {this.props.a} , {this.props.b} is {result}</h1>
    );
  }
  sub(){
    var result = this.a - this.b;
    return(
      <h1>subtracttion of {this.props.a} , {this.props.b} is {result}</h1>
    );
  }
  mul(){
    var result = this.a * this.b;
    return(
      <h1>multiplication of {this.props.a} , {this.props.b} is {result}</h1>
    );
  }
  div(){
    var result = this.a / this.b;
    return(
      <h1>division of {this.props.a} , {this.props.b} is {result}</h1>
    );
  }

  
}

ReactDOM.add(<App onClick={this.add} /> ,<button>Add</button>, document.getElementById('root'));

ReactDOM.sub(<App onClick={this.sub}/> ,<button>Sub</button>, document.getElementById('root'));

ReactDOM.mul(<App onClick={this.mul} /> ,<button>Mul</button>, document.getElementById('root'));

ReactDOM.div(<App onClick={this.div} /> ,<button>Div</button>, document.getElementById('root'));
