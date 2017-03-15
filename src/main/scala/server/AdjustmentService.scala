package server
import adjustment.TestDataGenerator
import org.http4s._
import org.http4s.dsl._
/**
  * Created by salim on 3/8/2017.
  */

object AdjustmentService {

  val adjustmentService = HttpService {
    case GET -> Root =>

      val result = adjustment.AdjustmentCodecJson.encode(TestDataGenerator.td()).toString()

      Ok(result)
  }

}
