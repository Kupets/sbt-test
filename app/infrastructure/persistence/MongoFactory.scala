import org.mongodb.scala.MongoClient

/**
  * Date: 23.03.2018
  *
  * @author Kuptsov Nikolay (nkuptsov@gmail.com)
  */
object MongoFactory {
  private val USER          = "sbt"
  private val PASSWORD      = "sbt"
  private val REPLICA_NAME  = "sbt-test-shard-0"
  private val SERVER0       = REPLICA_NAME + "0-00-mkhml.mongodb.net"
  private val SERVER1       = REPLICA_NAME + "0-01-mkhml.mongodb.net"
  private val SERVER2       = REPLICA_NAME + "0-02-mkhml.mongodb.net"
  private val PORT          = 27017
  private val DATABASE      = "test"
//  private val COLLECTION = "stocks"

  val client = MongoClient(s"mongodb://$USER:$PASSWORD@$SERVER0:$PORT,$SERVER1:$PORT,$SERVER2:$PORT/?" +
                              s"ssl=true&streamType=netty&replicaSet=$REPLICA_NAME&authSource=admin")
  val database = client.getDatabase(DATABASE)
}