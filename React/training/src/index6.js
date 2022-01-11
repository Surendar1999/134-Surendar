import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
class CurrencyCalc extends React.Component
{
  constructor(props)
  {
    super(props);
    this.state = {
      a : parseInt(props.a),
      c : "",
      result:0
    };
    this.rupeeHandler = this.rupeeHandler.bind(this);
    this.yenHandler = this. yenHandler.bind(this);
   
  }

  rupeeHandler()
  {
    this.setState(
      {c: " Indian Rupees"}
    );
    this.setState(i =>(
      {result:i.a*75.52}
    ));
    

  }
  yenHandler()
  {
    this.setState(
      {c: " Japanese Yen"}
    );
    this.setState(i =>(
      {result : i.a*120.81}
    ));
    
    
  }

  render()
  {
    return(<div>
     <h1>{this.state.a} Dollar is {this.state.result}{this.state.c}</h1>
      <button onClick={this.rupeeHandler}>Rupees</button><br></br>
    <button onClick={this.yenHandler}>Yen</button> <br></br>
     </div>
    );
  }
}

ReactDOM.render(
  <CurrencyCalc a="10"/>,
  document.getElementById("root")
);
