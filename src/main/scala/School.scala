class School {
  var database = Map[Int, List[String]]()

  def sorted = Map()

  def grade(i: Int) = Seq()

  def add(s: String, i: Int) = {
    database = database.updated(i, List(s))
  }

  def db = database

}
