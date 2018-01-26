package Garage

abstract class Vehicle(var _colour: String, var _numOfWheels: Int) {
  def colour = _colour
  def colour_= (aColour: String) = _colour = aColour


  def numOfWheels_ = _numOfWheels
  def numOfWheels_= (aNum: Int) = _numOfWheels = aNum


}
