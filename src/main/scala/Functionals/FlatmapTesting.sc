var list = List(List(List(1,2,3,4,5), List(6,7,8,9,10)),
  List(List(11,12,13,14,15), List(16,17,18,19,20)))

list.flatMap(_.toList).flatMap(_.toList)

list.flatten.flatten

val nums = 1 :: (2 :: (3 :: (4 :: Nil)))