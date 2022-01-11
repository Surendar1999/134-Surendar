import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
function Calc(props){
 
  let avg = props.avg;
  if (avg>90){
  return <h1>  A grade </h1>
} else if (avg>80){
  return <h1> B grade </h1>
} else if (avg>70){
  return <h1> c grade </h1>
} else{ 
  return <h1> Fail </h1> }
}
class GradeCalc extends React.Component{
  constructor(props)
  {
    super(props);
    this.state = {
     value1:"", value2:"", value3:"",      
     avg:"0"
    };  
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
    this.gradeHandler = this.gradeHandler.bind(this);
  }
  
  handleChange(event){
    this.setState({value1: event.target.value1})
    this.setState({value2: event.target.value2})
    this.setState({value3: event.target.value3})
   
   console.log(this.state.value1)
  }
  gradeHandler(event){
    this.setState({avg: this.state.value1})
   console.log(this.state.avg)
  }
  handleSubmit(event){
    
    event.preventDefault();
   
  }
render()
{ const val1 = this.state.value1;
  const val2 = this.state.value2;
  const val3 = this.state.value3;
  const avg = this.state.avg;
  const result = Calc(avg)
  return(  <>
    <form onSubmit={this.handleSubmit}>
      <lable>  Enter The 1st Subject Marks <br></br>
      <input type="text" value1={val1} onChange={this.handleChange} /> <br></br>
        Enter The 2nd Subject Marks <br></br>
      <input type="text" value2={val2} onChange={this.handleChange} />  <br></br>
      Enter The 3rd Subject Marks <br></br>
      <input type="text" value3={val3} onChange={this.handleChange} /> <br></br>
      </lable>
      <button type="submit" onClick={this.gradeHandler}>Grade</button>
 
   </form>
   <div>{result}</div></> 
  );
}}
ReactDOM.render(<GradeCalc />  , document.getElementById('root'));