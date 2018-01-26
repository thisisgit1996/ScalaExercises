package Garage

class Customer(_name: String,_age: Int, var _numOfCars: Int) extends Person(_name, _age){

  def numOfCars = _numOfCars
  def numOfCars_= (aNumber: Int) = _numOfCars = aNumber
}
