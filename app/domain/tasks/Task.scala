package domain.tasks

/**
  * Date: 25.03.2018
  *
  * @author Kuptsov Nikolay (nkuptsov@gmail.com) 
  */
case class Task(id: Long, label: String, who: String, mytime: String, ready: Short)

object Task {
  def all(): List[Task] = Nil

  def create(label: String, who: String, time: String) {}

  def delete(id: Long) {}

  def complete(id: Long) {}
}


