import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
class ToggleImg extends React.Component
{
  constructor()
  {
    super();
    this.toggleHandler = this.toggleHandler.bind(this);
    this.a=true;
  }

  toggleHandler()
  {
    this.a=!this.a;
    console.log(this.a)
    if(this.a)
    {
      document.getElementById("image").innerHTML="<img src='/static/media/imgL1.tr.jpg'></img>"
      console.log(this.image)
    }else{
      document.getElementById("image").innerHTML="<img src='/static/media/imgL2.SS.jpg'></img>"
      console.log(this.image)
    }
    
   
  }  

  render()
  {
    return(
    <>
   <div id="image">

   </div>
   <div>
   <button onClick={this.toggleHandler}>button</button>
   </div>
    </>
    );
  }
}

ReactDOM.render(
  <ToggleImg />,
  document.getElementById("root")
);
