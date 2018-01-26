package Garage

abstract class Person(var _name: String, var _age: Int) {


  def name = _name
  def name_= (aName:String): Unit = _name = aName

  def age = _age
  def age_= (aAge: Int) = _age = aAge

}
