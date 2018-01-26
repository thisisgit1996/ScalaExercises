package Garage

class Employee(_name: String,_age: Int, var _yearsWithGarage: Int) extends Person(_name, _age) {

  def yearsWithGarage = _yearsWithGarage
  def yearsWithGarage_= (aTime: Int) = _yearsWithGarage = aTime

}
