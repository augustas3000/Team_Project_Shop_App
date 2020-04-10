import React, {Component} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
// import NavBar from '../Navbar.js';
import Request from "../helpers/request";


class ShopContainer extends Component{
  constructor(props){
    super(props);
    this.state = {
      sneakers:[],
      customers: [],
      orders: []
    }

  }

  componentDidMount(){
    const request = new Request();
    const sneakersPromise = request.get('/api/sneakers')
    const customersPromise = request.get("/api/customers")
    const ordersPromise = request.get("/api/customers")

    Promise.all([sneakersPromise, customersPromise,ordersPromise])
    .then((data)=>{
      this.setState({
        sneakers: data[0],
        customers: data[1],
        orders: data[2]
      })
    })

  }





  render(){


    return(
      <Router>

      <Switch>

      </Switch>

      </Router>
    )
  }
}

export default ShopContainer;
